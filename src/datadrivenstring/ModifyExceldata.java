package datadrivenstring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ModifyExceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".\test data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
   Sheet sh = wb.getSheet("Sheet1");
   
   //Creating new row,Column and Providing values to it
   Row r = sh.getRow(4);
   Cell c = r.createCell(0);
   c.setCellValue("channai");
   
   FileOutputStream fos = new FileOutputStream(".\test data.xlsx");
   wb.write(fos);
   wb.close();
   

	}	

}
