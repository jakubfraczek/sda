package algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest {

	Numbers sut;

	@Before
	public void setUp() throws Exception {
		sut = new Numbers();
	}

	@Test
	public void evenTest() {
		assertTrue(sut.isEven(2));
	}

	@Test
	public void oddTest() {
		assertFalse(sut.isEven(3));
	}

	@Test
	public void positiveAbsoluteNumberTest() {
		assertEquals(2.5, sut.absoluteNumber(2.5), 0);
	}

	@Test
	public void negativeAbsoluteNumberTest() {
		assertEquals(2.5, sut.absoluteNumber(-2.5), 0);
	}
}
