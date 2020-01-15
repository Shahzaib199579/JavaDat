package app;

//import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author downey
 *
 */
public class MyArrayListTest {

	protected List<Integer> mylist;
	protected List<Integer> list;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		mylist = new MyArrayList<Integer>();
		mylist.addAll(list);
	}

	/**
	 * Test method for {@link MyArrayList#MyArrayList()}.
	 */
	@Test
	public void testMyList() {
		assertEquals(3, (long) mylist.size());
	}

	/**
	 * Test method for {@link MyArrayList#add(Object)}.
	 */
	@Test
	public void testAddT() {
		for (int i = 4; i < 20; i++) {
			mylist.add(i);
		}
		// System.out.println(Arrays.toString(mal.toArray()));
		assertEquals(Integer.valueOf(19), mylist.get(18));
	}

	/**
	 * Test method for {@link MyArrayList#add(int, Object)}.
	 */
	@Test
	public void testAddIntT() {
		mylist.add(1, 5);
		// System.out.println(Arrays.toString(mal.toArray()));
		// assertThat(mylist.get(1), is(new Integer(5)));
		assertEquals(Integer.valueOf(5), mylist.get(1));
		// assertThat(mylist.size(), is(4));
		assertEquals(4, (long) mylist.size());

		try {
			mylist.set(-1, 0);
			fail();
		} catch (IndexOutOfBoundsException e) {
		} // good

		try {
			mylist.set(4, 0);
			fail();
		} catch (IndexOutOfBoundsException e) {
		} // good

		mylist.add(0, 6);
		// System.out.println(Arrays.toString(mal.toArray()));
		// assertThat(mylist.get(0), is(6));
		assertEquals(Integer.valueOf(6), mylist.get(0));

		mylist.add(5, 7);
		// System.out.println(Arrays.toString(mal.toArray()));
		// assertThat(mylist.get(5), is(new Integer(7)));
		assertEquals(Integer.valueOf(7), mylist.get(5));
	}

	/**
	 * Test method for {@link MyArrayList#addAll(java.util.Collection)}.
	 */
	@Test
	public void testAddAllCollectionOfQextendsT() {
		mylist.addAll(list);
		mylist.addAll(list);
		mylist.addAll(list);
		// assertThat(mylist.size(), is(12));
		assertEquals((long) mylist.size(), 12);
		// assertThat(mylist.get(5), is(new Integer(3)));

		assertEquals(Integer.valueOf(3), mylist.get(5));
	}

	/**
	 * Test method for {@link MyArrayList#indexOf(Object)}.
	 */
	@Test
	public void testIndexOf() {
		//assertThat(mylist.indexOf(1), is(0));
		assertEquals(0, (long) mylist.indexOf(1));
		//assertThat(mylist.indexOf(2), is(1));
		assertEquals(1,(long) mylist.indexOf(2));
		//assertThat(mylist.indexOf(3), is(2));
		assertEquals(2,(long) mylist.indexOf(3));
		//assertThat(mylist.indexOf(4), is(-1));
		assertEquals(-1,(long) mylist.indexOf(4));
	}

	/**
	 * Test method for {@link MyArrayList#indexOf(Object)}.
	 */
	@Test
	public void testIndexOfNull() {
		//assertThat(mylist.indexOf(null), is(-1));
		assertEquals(-1,(long) mylist.indexOf(null));
		mylist.add(null);
		//assertThat(mylist.indexOf(null), is(3));
		assertEquals(3,(long) mylist.indexOf(null));
	}

	/**
	 * Test method for {@link MyArrayList#remove(int)}.
	 */
	@Test
	public void testRemoveInt() {
		Integer val = mylist.remove(1);
		//assertThat(val, is(new Integer(2)));
		assertEquals(val, (Integer.valueOf(2)));
		//assertThat(mylist.size(), is(2));
		assertEquals(2, (long) mylist.size());
		//assertThat(mylist.get(1), is(new Integer(3)));
		assertEquals((Integer.valueOf(3)), (Integer.valueOf(mylist.get(1))));
	}

	// /**
	//  * Test method for {@link MyArrayList#set(int, Object)}.
	//  */
	// @Test
	// public void testSet() {
	// 	Integer val = mylist.set(1, 5);
	// 	assertThat(val, is(new Integer(2)));

	// 	val = mylist.set(0, 6);
	// 	assertThat(val, is(new Integer(1)));

	// 	val = mylist.set(2, 7);
	// 	assertThat(val, is(new Integer(3)));

	// 	// return value should be 2
	// 	// list should be [6, 5, 7]
	// 	assertThat(mylist.get(0), is(new Integer(6)));
	// 	assertThat(mylist.get(1), is(new Integer(5)));
	// 	assertThat(mylist.get(2), is(new Integer(7)));
	// 	// System.out.println(Arrays.toString(mal.toArray()));

	// 	try {
	// 		mylist.set(-1, 0);
	// 		fail();
	// 	} catch (IndexOutOfBoundsException e) {
	// 	} // good

	// 	try {
	// 		mylist.set(4, 0);
	// 		fail();
	// 	} catch (IndexOutOfBoundsException e) {
	// 	} // good
	// }
}
