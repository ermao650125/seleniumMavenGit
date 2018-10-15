package Log4jPractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jConfigExample {
	
	// Defining the static logger variable
	   static Logger logger = Logger.getLogger(Log4jConfigExample.class);
	   
	   public void testMethod() {
		     logger.debug("Hello... In test method!");
		   }

	   public static void main(String[] args) {

	     // Set up a simple configuration that logs on the console.
	     BasicConfigurator.configure();

	     logger.info("Logging started application.");
	     Log4jConfigExample example = new Log4jConfigExample();
	     example.testMethod();
	     logger.info("Close application.");
	   }
}
