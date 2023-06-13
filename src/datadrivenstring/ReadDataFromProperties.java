package datadrivenstring;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//to convert physical file into javareadble object
		// new FileInputStrem(); throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./TestResources/data.properties");
	
		//step 2; create an instance of properties class
		//properties class should be imported from java.util package
		Properties property = new Properties();
		// Step3 : Load all key pairs to properties object from fis
		//property.load(fis); throws IO Exception
		property.load(fis);
		
		
		//step 4: Read data using Properties object
		System.out.println(property.getProperty("url"));
	}

}
