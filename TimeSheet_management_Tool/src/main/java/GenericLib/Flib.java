package GenericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Flib implements AutoConstant {
	
	
	public String getDataFromPropertyFile(String path , String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(Key);
		return value;
	}
	
	public String getDataFromExcelFile(String Excel_path,String Sheet_name,int rowno,int cellno) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(Excel_Path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(Sheet_name);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		return cell.getStringCellValue();
		
		
	}
	
	
	public int getLastRowNum(String path,String Sheet_Name) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(invalid_Sheet_name);
		int totalrow=sheet.getLastRowNum();//this method is uesd to get the last row number till data is present.
		return totalrow;
	}
	
	
	
 
}
