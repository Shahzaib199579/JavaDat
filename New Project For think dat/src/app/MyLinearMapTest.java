package app;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * @author downey
 *
 */
public class MyLinearMapTest {

	protected Map<String, Integer> map;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		map = new MyLinearMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put(null, 0);
	}


	@Test
	public void testContainsKey() {
		//assertThat(map.containsKey("Three"), is(true));
		assertEquals(true, map.containsKey("Three"));
		//assertThat(map.containsKey(null), is(true));
		assertEquals(true, map.containsKey(null));
		//assertThat(map.containsKey("Four"), is(false));
		assertEquals(false, map.containsKey("Four"));
	}

	// /**
	//  * Test method for {@link MyLinearMap#containsValue(java.lang.Object)}.
	//  */
	// @Test
	// public void testContainsValue() {
	// 	assertThat(map.containsValue(3), is(true));
	// 	assertThat(map.containsValue(0), is(true));
	// 	assertThat(map.containsValue(4), is(false));
	// }

	/**
	 * Test method for {@link MyLinearMap#get(java.lang.Object)}.
	 */
	@Test
	public void testGet() {
		//assertThat(map.get("Three"), is(3));
		assertEquals(3, map.containsKey("Three"));
		//assertThat(map.get(null), is(0));
		assertEquals(0, map.containsKey(null));
		//assertThat(map.get("Four"), nullValue());
		assertEquals(null, map.containsKey("Four"));
	}

	// /**
	//  * Test method for {@link MyLinearMap#isEmpty()}.
	//  */
	// @Test
	// public void testIsEmpty() {
	// 	assertThat(map.isEmpty(), is(false));
	// 	map.clear();
	// 	assertThat(map.isEmpty(), is(true));
	// }

	// /**
	//  * Test method for {@link MyLinearMap#keySet()}.
	//  */
	// @Test
	// public void testKeySet() {
	// 	final Set<String> keySet = map.keySet();
	// 	assertThat(keySet.size(), is(4));
	// 	assertThat(keySet.contains("Three"), is(true));
	// 	assertThat(keySet.contains(null), is(true));
	// 	assertThat(keySet.contains("Four"), is(false));
	// }

	/**
	 * Test method for {@link MyLinearMap#put(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public void testPut() {
		map.put("One", 11);
		// assertThat(map.size(), is(4));
		assertEquals(4, map.size());
		//assertThat(map.get("One"), is(11));
		assertEquals(11, (long) map.get("One"));
		
		map.put("Five", 5);
		//assertThat(map.size(), is(5));
		assertEquals(5, map.size());
		assertEquals(5, (long) map.get("Five"));
	}

	/**
	 * Test method for {@link MyLinearMap#putAll(java.util.Map)}.
	 */
	@Test
	public void testPutAll() {
		final Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Six", 6);
		m.put("Seven", 7);
		m.put("Eight", 8);
		map.putAll(m);
		//assertThat(map.size(), is(7));
		assertEquals(7, map.size());
	}

	/**
	 * Test method for {@link MyLinearMap#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemove() {
		map.remove("One");
		//assertThat(map.size(), is(3));
		assertEquals(3, map.size());
		//assertThat(map.get("One"), nullValue());
		assertEquals(null, map.get("One"));
	}

	/**
	 * Test method for {@link MyLinearMap#size()}.
	 */
	@Test
	public void testSize() {
		//assertThat(map.size(), is(4));
		assertEquals(4, map.size());
	}

	/**
	 * Test method for {@link MyLinearMap#values()}.
	 */
	@Test
	public void testValues() {
		final Collection<Integer> keySet = map.values();
		//assertThat(keySet.size(), is(4));
		assertEquals(4, map.size());
		//assertThat(keySet.contains(3), is(true));
		assertEquals(true, keySet.contains(3));
		//assertThat(keySet.contains(0), is(true));
		assertEquals(true, keySet.contains(0));
		//assertThat(keySet.contains(4), is(false));
		assertEquals(false, keySet.contains(4));
	}
}
