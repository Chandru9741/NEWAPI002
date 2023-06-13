package datadrivenstring;

import java.io.FileInputStream;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1 : convert physical file into java readable object
		FileInputStream fis = new FileInputStream(".\test data.xlsx");
		
				
				//Step 2 ; Open Workbook
				//workbookFactory.create(fis);throws EncryptedDocumentExceptin
				Workbook wb = WorkbookFactory.create(fis);
		
		//step 3;  Get Control over sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Step 4 : Get control over row
		Row r = sh.getrow();
		
		// step5  Get control over cell
		Cell c = r.getCell(1);
		
		//Step 6 Fetch  data from cell
		
		System.out.println(c.getStringcellvalue());
		
		// Step 7 close excel
		wb.close();
		

	}

}
