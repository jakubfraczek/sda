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
			myStringList.add("Jakub");
		}
		myStringList.add("Jakub");
		myIntList2 = new MyList();
		for (int i = 0; i < 16; i++) {
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
		assertEquals(24, myIntList.getValue(2));
	}

	@Test
	public void removeElementByIndexTest() {
		myIntList.remove(1);
		assertEquals(2, myIntList.length());
		assertEquals(23, myIntList.getValue(1));
	}

	@Test
	public void removeElementByValueTest() {
		myIntList.removeValue(22);
		assertEquals(2, myIntList.length());
		assertEquals(23, myIntList.getValue(1));
	}

	@Test
	public void removeElementByNodeTest() {
		fail("Not yet implemented");
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toBigIndextest() {
		myIntList.getValue(3);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toSmallIndexTest() {
		myIntList.remove(-2);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void clearIndexTest() {
		myIntList.clear();
		myIntList.getValue(0);
	}

	@Test
	public void clearLengthTest() {
		myIntList.clear();
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
		assertEquals(2, myIntList.getIndexOf(23));
	}

	@Test
	public void findByFistElementByValueBoundTest() {
		assertEquals(-1, myIntList.getIndexOf("e"));
	}

	@Test
	public void findAllElementsByValueTest() {
		MyList allIndexesOf = myStringList.getAllIndexesOf("Kuba");
		int length = allIndexesOf.length();

		assertEquals(8, length);
		for (int i = 0; i < length; i++) {
			assertEquals(myIntList2.getValue(i), allIndexesOf.getValue(i));
		}
	}

	@Test
	public void removeAllByValueTest() {
		myStringList.removeAllOf("Kuba");
		fail("Not yet implemented");
	}

	@Test
	public void removeDuplicatedTest() {
		fail("Not yet implemented");
	}

}
