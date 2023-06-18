package Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//Scripit how to read the data from property file.
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rayan\\Documents\\javapractice\\TestNGFramework\\data.properties");
		
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		//Scripit to write data into the Properties
		prop.setProperty("firstname", "shoaib");
		prop.setProperty("lastname", "Shoaib");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\rayan\\Documents\\javapractice\\TestNGFramework\\data.properties");
		prop.store(fos, "savingfile");
		
	}

}
