package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String project_path = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
		getProperties();

	}

	public static  void getProperties() throws IOException {



		InputStream input = new FileInputStream(project_path + "/src/test/java/config/config.properties");
		prop.load(input);
		String Browser = prop.getProperty("browser");
		System.out.println("Browser is"+ Browser);
	}
	public static  void setProperties() {
		try {
			OutputStream output = new FileOutputStream(project_path + "/src/test/java/config/config.properties");
			prop.setProperty("browser", "firefox");

			prop.store(output, "changed the browser name");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
