package algorithms;

import org.junit.Before;
import org.junit.Test;

import myList.MyList;

public class MyListTest {
	
	MyList myList1, myList2;

	@Before
	public void setUp() throws Exception {
		myList1 = new MyList();
		myList1.add(21);
		myList1.add(22);
		myList1.add(23);
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void toBigIndextest() {
		myList1.remove(3);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void toSmallIndexTest() {
		myList1.remove(-2);
	}

}
