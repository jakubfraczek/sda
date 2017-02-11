package algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import myList.MyList;

public class MyListTest {

	MyList myIntList, myIntList2, myStringList, myStringList2;

	@Before
	public void setUp() throws Exception {
		myIntList = new MyList();
		for (int i = 21; i <= 24; i++) {
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
		myStringList2 = new MyList();
	}

	@Test
	public void lastElementTest() {
		assertEquals(24, myIntList.getValue(myIntList.last()));
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
		assertEquals(4, myIntList.length());
	}

	@Test
	public void addElementAtEndTest() {
		myIntList.add(25);
		assertEquals(5, myIntList.length());
		assertEquals(25, myIntList.getValue(myIntList.last()));
	}

	@Test
	public void addElementAtFrontTest() {
		myIntList.addAtFront(20);
		assertEquals(5, myIntList.length());
		assertEquals(20, myIntList.getValue(0));
		assertEquals(21, myIntList.getValue(1));
	}

	@Test
	public void addToEmptyListTest() {
		myStringList2.add("Justyna");
		assertEquals(1, myStringList2.length());
		assertEquals("Justyna", myStringList2.getValue(0));
	}

	@Test
	public void addElementAtIndexTest() {
		myIntList.addAtIndex(2, 25);
		assertEquals(5, myIntList.length());
		assertEquals(25, myIntList.getValue(2));
	}

	@Test
	public void removeElementByIndexTest() {
		myIntList.remove(1);
		assertEquals(3, myIntList.length());
		assertEquals(23, myIntList.getValue(1));
	}

	@Test
	public void removeElementByIndexBoundTest() {
		myIntList.remove(0);
		assertEquals(3, myIntList.length());
		assertEquals(22, myIntList.getValue(0));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void removeElementByIndexBoundTest2() {
		myIntList.remove(4);
	}

	@Test
	public void removeElementByValueTest() {
		myIntList.removeValue(22);
		assertEquals(3, myIntList.length());
		assertEquals(23, myIntList.getValue(1));
	}

	@Test
	public void removeElementByStringValueTest() {
		myStringList.removeValue("Kuba");
		assertEquals(16, myStringList.length());
		assertEquals("Jakub", myStringList.getValue(0));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toBigIndextest() {
		myIntList.getValue(4);
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
		myIntList.swap(1, 2);

		assertEquals(21, myIntList.getValue(0));
		assertEquals(23, myIntList.getValue(1));
		assertEquals(22, myIntList.getValue(2));
		assertEquals(24, myIntList.getValue(3));
	}
	
	@Test
	public void swapSameTest() {
		Object temp = myIntList.getValue(1);
		myIntList.swap(1, 1);
		assertEquals(temp, myIntList.getValue(1));
	}
	
	@Test
	public void swapIndexZeroTest() {
		myIntList.swap(2, 0);
		assertEquals(23, myIntList.getValue(0));
		assertEquals(22, myIntList.getValue(1));
		assertEquals(21, myIntList.getValue(2));
		assertEquals(24, myIntList.getValue(3));
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void swapBoundTest() {
		myIntList.swap(-1, 0);
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
	public void findFistElementByValueBoundTest() {
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
		assertEquals(9, myStringList.length());
		for (int i = 0; i < myStringList.length(); i++) {
			assertEquals("Jakub", myStringList.getValue(i));
		}
	}

	@Test
	public void removeDuplicatedTest() {
		myStringList.removeDuplicated();
		assertEquals(2, myStringList.length());
		assertEquals("Kuba", myStringList.getValue(0));
		assertEquals("Jakub", myStringList.getValue(1));
//		fail("Not yet implemented");
	}

}
