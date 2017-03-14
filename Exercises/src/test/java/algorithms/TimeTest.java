package algorithms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {

	TimeConverter sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new TimeConverter();
	}

	@Test
	public void daysHoursMinutesSecondsTosSeondsTest() {
		assertEquals(273961, sut.daysHoursMinutesSecondsTosSeonds(3, 4, 6, 1));
		assertEquals(273601, sut.daysHoursMinutesSecondsTosSeonds(3, 4, 0, 1));
		assertEquals(14761, sut.daysHoursMinutesSecondsTosSeonds(4, 6, 1));
		assertEquals(361, sut.daysHoursMinutesSecondsTosSeonds(6, 1));
	}
	
	@Test
	public void seondsToDaysHoursMinutesSecondsTest() {
		assertEquals("3d, 4h, 6m, 1s", sut.seondsToDaysHoursMinutesSeconds(273961));
	}

}
