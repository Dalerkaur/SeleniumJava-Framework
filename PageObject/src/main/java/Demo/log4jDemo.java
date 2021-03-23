package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {

	
	static Logger logger = LogManager.getLogger(log4jDemo.class);
	
	public static void main (String args[]) {
		System.out.println("Hello World");
		logger.info("This is an information message");
		logger.error("This is a error message");
		logger.trace("This is an trace message");
		logger.fatal("This is a fatal message");
	}
	
}
