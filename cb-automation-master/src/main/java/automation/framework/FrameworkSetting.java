package automation.framework;

import java.io.FileInputStream;
import java.util.Properties;

public class FrameworkSetting {
	
	public static String baseDir = System.getProperty("user.dir");
	public static String fileSeparator = System.getProperty("file.separator");
	public static String configFilePath = baseDir + fileSeparator + "config.properties";
			
	public static String browserName = null;
	public static String url = null;

	public static int maxTimeout;

	public static Properties prop;
	
	public static void initProperties() {
		
		try {
			
			prop = new Properties();
			prop.load(new FileInputStream(configFilePath));
			browserName = getProperty("browser");
			url = getProperty("url");
			maxTimeout = Integer.parseInt(getProperty("maxWaitInSeconds").trim()); //Converts String "60" to integer 60
					
		} catch (Exception FrameowrkInitationException) {
			// Enter log information
		}
		
	}
	
	public static String getProperty(String propertyName) {
		
		String propertyValue = prop.getProperty(propertyName);
		
		return propertyValue.trim();
		
	}

}