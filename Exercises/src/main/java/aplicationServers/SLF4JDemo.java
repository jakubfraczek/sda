package aplicationServers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(SLF4JDemo.class);
	
	public static void main(String[] args) {
		try{
			double test = 1 / 0;
		} catch (Exception e){
			LOGGER.error("Error: ", e);;
		}
	}

}
