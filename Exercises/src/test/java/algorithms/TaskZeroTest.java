package algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TaskZeroTest {

	TaskZero sut;

	@Before
	public void setUp() {
		sut = new TaskZero();
		sut.fillMonthMap();
	}

	@Test
	public void monthConverterTest() {
		assertEquals("Styczeń", sut.mothConverter(1));
		assertEquals("Listopad", sut.mothConverter(11));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void boudaryMonthTest(){
		sut.mothConverter(13);
	}

}
