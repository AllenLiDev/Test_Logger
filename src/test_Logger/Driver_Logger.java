package test_Logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Driver_Logger {
	
	final static Logger logger = Logger.getLogger(Driver_Logger.class);

	public static void main(String args[]) {
		System.out.println("Starting driver logger test");
		logger.info("Entering the Execute Method");
	}
}
