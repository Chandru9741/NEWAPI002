package datadrivenstring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ModifypropertiesFile {

	public static void main(String[] args) throws IOException {
		
FileInputStream fis = new FileInputStream("./TestResources/data.properties");
Properties p= new Properties();
p.load(fis);

p.put("user2","trainee");
p.put("pwd2","trainee");
FileOutputStream fos = new FileOutputStream("./TestResources/data.properties");
p.store(fos,"Updated successfully");

	}

}
