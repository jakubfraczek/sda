package aplicationServers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JULDemo {

	private static final Logger LOGGER = Logger.getLogger(JULDemo.class.getCanonicalName());

	public static void main(String[] args) {
		LOGGER.setLevel(Level.WARNING);

		LOGGER.info("hello logger");
		try {
			double test = 1 / 0;
		} catch (ArithmeticException e) {
			LOGGER.warning(e.toString());
		}

	}

}
