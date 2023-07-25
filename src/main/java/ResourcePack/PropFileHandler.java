package ResourcePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropFileHandler {

	public static Properties config = new Properties();           //Created an object of type Properties which is from class properties in Selenium
	public static PropertiesConfiguration  write;                 // Object for PropertiesConfiguration = write
	
	static
	{
		try {
			FileInputStream configReader = new FileInputStream("src/main/java/ResourcePack/BookCart.properties");    //Reading from the specified file location
			try {
				config.load(configReader);                      //Loading data onto Properties in selenium class
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//read Property method
		public static String readProperty(String property)       //Created function to read data from property file as mentioned above 
		{
			return config.getProperty(property);                 // When reading data, we just need to mentioned the key which is property in this case
		}
		
		//write Property method
		public static void writeProperty(String property, String value)  //Created function to write data, here we need key and value both to write the data
		{
//			ConfigProperties.writeProperty(property,value);
			try {
				FileInputStream in = new FileInputStream("src/main/java/ResourcePack/BookCart.properties");
				write = new PropertiesConfiguration("src/main/java/ResourcePack/BookCart.properties");  // writing data on this location
				
				
				try {
					config.load(in);                           // File loaded in properties class of selenium
					in.close();                                    // closing file to save the data, which is coming from selenium class named properties
				}catch(IOException e) {
					e.printStackTrace();
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(ConfigurationException e) {
				e.printStackTrace();
			}
		}
	
}
