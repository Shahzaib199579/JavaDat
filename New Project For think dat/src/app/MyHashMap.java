package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a HashMap using a collection of MyLinearMap and
 * resizing when there are too many entries.
 *
 * @author downey
 * @param <K>
 * @param <V>
 *
 */
public class MyHashMap<K, V> extends MyBetterMap<K, V> implements Map<K, V> {

	// average number of entries per map before we rehash
	protected static final double FACTOR = 1.0;

	@Override
	public V put(K key, V value) {
		V oldValue = super.put(key, value);

		//System.out.println("Put " + key + " in " + map + " size now " + map.size());

		// check if the number of elements per map exceeds the threshold
		if (size() > maps.size() * FACTOR) {
			rehash();
		}
		return oldValue;
	}

	/**
	 * Doubles the number of maps and rehashes the existing entries.
	 */
	/**
	 *
	 */
	protected void rehash() {
		// TODO: FILL THIS IN!
		int noOfMaps = this.maps.size();
		noOfMaps = noOfMaps * 2;
		MyBetterMap<K, V> copy = new MyBetterMap<K, V>();
		copy.maps = this.maps;

		this.makeMaps(noOfMaps);

		for (MyLinearMap<K, V> map : copy.maps) 
		{
			for (Entry<K, V> ent : map.getEntries())
			{
				MyLinearMap<K, V>  entryInMap = this.chooseMap(ent.getKey());
				V valueInMap = entryInMap.put(ent.getKey(), ent.getValue());
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new MyHashMap<String, Integer>();
		for (int i=0; i<10; i++) {
			map.put(Integer.toString(i), i);
		}
		Integer value = map.get("3");
		System.out.println(value);
	}
}
