package algorithms;

public class TimeConverter {

	public int daysHoursMinutesSecondsTosSeonds(int days, int hours, int minuts, int seconds) {
		return ((days * 24 + hours) * 60 + minuts) * 60 + seconds;
	}

	public int daysHoursMinutesSecondsTosSeonds(int hour, int minuts, int seconds) {
		return (hour * 60 + minuts) * 60 + seconds;
	}

	public int daysHoursMinutesSecondsTosSeonds(int minuts, int seconds) {
		return minuts * 60 + seconds;
	}

	public String seondsToDaysHoursMinutesSeconds(int i) {
		int days, hours, minuts, seconds;

		days = hoursToDays(minutsToHours(secondsToMinuts(i)));
		hours = (i / 60) / 60 - days * 24;
		minuts = i / 60 - ((days * 24) + hours) * 60;
		seconds = i - ((days * 24 + hours) * 60 + minuts) * 60;
		return days + "d, " + hours + "h, " + minuts + "m, " + seconds + "s";
	}
	
	private int secondsToMinuts(int i) {
		return i / 60;
	}
	
	private int minutsToHours(int i) {
		return i / 60;
	}
	
	private int hoursToDays(int i) {
		return i / 24;
	}
	
}
