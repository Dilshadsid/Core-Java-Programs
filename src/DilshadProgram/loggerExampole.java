package DilshadProgram;

import java.util.logging.Logger;

 public class loggerExampole {
	 private static final Logger logger = Logger.getLogger(loggerExampole.class.getName());

	    public static void main(String[] args) {
	        logger.info("Application started");
	        logger.warning("This is a warning");
	        logger.severe("An error occurred");
	    }
}
