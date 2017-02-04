package algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import myList.MyList;

public class MyListTest {

	MyList myIntList, myStringList, myIntList2;

	@Before
	public void setUp() throws Exception {
		myIntList = new MyList();
		for (int i = 21; i <= 23; i++) {
			myIntList.add(i);
		}
		myStringList = new MyList();
		for (int i = 0; i < 8; i++) {
			myStringList.add("Kuba");
			myStringList.add("huba");
		}
		myIntList2 = new MyList();
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				myIntList2.add(i);
			}
		}
	}

	@Test
	public void lastElementTest() {
		assertEquals(23, myIntList.getValue(myIntList.last()));
	}

	@Test
	public void getIntValueTest() {
		assertEquals(21, myIntList.getValue(0));
	}

	@Test
	public void getStringValueTest() {
		assertEquals("Kuba", myStringList.getValue(0));
	}

	@Test
	public void lengthTest() {
		assertEquals(3, myIntList.length());
	}

	@Test
	public void addElementAtEndTest() {
		myIntList.add(24);
		assertEquals(4, myIntList.length());
		assertEquals(24, myIntList.getValue(myIntList.last()));
	}

	@Test
	public void addElementAtFrontTest() {
		myIntList.addAtFront(20);
		assertEquals(4, myIntList.length());
		assertEquals(20, myIntList.getValue(myIntList.begin()));
	}

	@Test
	public void addElementAtIndexTest() {
		myIntList.addAtIndex(2, 24);
		assertEquals(4, myIntList.length());
		assertEquals(24, myIntList.getValue(myIntList.last()));
	}

	@Test
	public void removeLastElementByIndexTest() {
		myIntList.remove(2);
		assertEquals(2, myIntList.length());
	}

	@Test
	public void removeLastElementByNodeTest() {

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toBigIndextest() {
		myIntList.remove(3);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toSmallIndexTest() {
		myIntList.remove(-2);
	}

	@Test
	public void clearTest() {
		myIntList.clear();
		assertEquals(null, myIntList.getValue(0));
		assertEquals(0, myIntList.length());
	}

	@Test
	public void swapTest() {
		fail("Not yet implemented");
	}

	@Test
	public void sortTest() {
		fail("Not yet implemented");
	}

	@Test
	public void findByFistElementByValueTest() {
		assertEquals(2, myIntList.getIndex(23));
	}

	@Test 
	public void findByFistElementByValueBoundaryTest() {
		assertEquals(-1, myIntList.getIndex("e"));
	}

	@Test
	public void findAllElementsByValueTest() {
		assertEquals(myIntList2, myStringList.getAllIndexes("Kuba"));

	}

	@Test
	public void removeAllByValueTest() {
		fail("Not yet implemented");
	}

	@Test
	public void removeDuplicatedTest() {
		fail("Not yet implemented");
	}

}
