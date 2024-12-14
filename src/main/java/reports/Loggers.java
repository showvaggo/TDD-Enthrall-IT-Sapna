package reports;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class Loggers {
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
public static void logTheTest(String msg) {
	logger.log(Level.INFO, msg);//it helps to print the console
	Reporter.log(msg +"<br>");//for testing report as index.html
	TestManager.getTest().log(Status.INFO, msg);
}

}
