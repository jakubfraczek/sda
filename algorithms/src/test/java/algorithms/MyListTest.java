package algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import myList.MyList;

public class MyListTest {

	MyList myList1, myList2;

	@Before
	public void setUp() throws Exception {
		myList1 = new MyList();
		for (int i = 21; i <= 23; i++) {
			myList1.add(i);
		}
	}

	@Test
	public void lastElementTest() {
		assertEquals(23, myList1.getValue(myList1.last()));
	}

	@Test
	public void getValueTest() {
		assertEquals(21, myList1.getValue(0));
	}

	@Test
	public void lengthTest() {
		assertEquals(3, myList1.length());
	}

	@Test
	public void addElementAtEndTest() {
		myList1.add(24);
		assertEquals(4, myList1.length());
		assertEquals(24, myList1.getValue(myList1.last()));
	}

	@Test
	public void addElementAtFrontTest() {
		myList1.addAtFront(20);
		assertEquals(4, myList1.length());
		assertEquals(20, myList1.getValue(myList1.begin()));
	}

	@Test
	public void addElementAtIndexTest() {
		myList1.addAtIndex(2, 24);
		assertEquals(4, myList1.length());
		assertEquals(24, myList1.getValue(myList1.last()));
	}

	@Test
	public void removeLastElementByIndexTest() {
		myList1.remove(2);
		assertEquals(2, myList1.length());
	}

	@Test
	public void removeLastElementByNodeTest() {

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toBigIndextest() {
		myList1.remove(3);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void toSmallIndexTest() {
		myList1.remove(-2);
	}

	@Test
	public void clearTest() {
		myList1.clear();
		assertEquals(null, myList1.getValue(0));
		assertEquals(0, myList1.length());
	}

	@Test
	public void sortTest() {
		fail("Not yet implemented");
	}

	@Test
	public void findByFistElementByValueTest() {
		fail("Not yet implemented");
	}

	@Test
	public void findAllElementsByValueTest() {
		fail("Not yet implemented");
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
