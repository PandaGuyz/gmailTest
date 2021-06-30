package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelData {
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFRow rw;
	static XSSFCell cl;
	
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream fi = new FileInputStream("D:\\shwetha\\selenium\\excelDataPractical.xlsx");
		
		 wb = new XSSFWorkbook(fi);
		 sh = wb.getSheet("script");
		 rw = sh.getRow(2);
		 cl = rw.getCell(2);
		 cl.setCellValue("Pankaj");
		 fi.close();
		//String val = cl.getStringCellValue();
		FileOutputStream fi1 = new FileOutputStream("D:\\shwetha\\selenium\\excelDataPractical.xlsx");
		wb.write(fi1);
		wb.close();
		fi1.close();
		
		
			/*String val = getData(2,2);
		System.out.println(val);
		
		val = setData(2,2,"Pankaj");
		System.out.println(val);*/
	}
	
	/*public static String getData(int row,int col) throws IOException
	{
		fi = new FileInputStream("D:\\shwetha\\selenium\\excelDataPractical.xlsx");
		 wb = new XSSFWorkbook(fi);
		 sh = wb.getSheet("script");
		 rw = sh.getRow(row);
		 cl = rw.getCell(col);
		String val = cl.getStringCellValue();
		//wb.close();
		fi.close();
		return val;
		//wb.close();
		
	}*/
	
	/*public static String setData(int row,int col,String value) throws IOException
	{
		fi = new FileInputStream("D:\\shwetha\\selenium\\excelDataPractical.xlsx");
		fi1 = new FileOutputStream("D:\\shwetha\\selenium\\excelDataPractical.xlsx");
		 wb = new XSSFWorkbook(fi);
		 sh = wb.getSheet("script");
		 rw = sh.getRow(row);
		 cl = rw.getCell(col);
		 cl.setCellValue(value);
		String val = cl.getStringCellValue();
		wb.write(fi1);
		fi1.close();
		fi.close();
		
		return val;
		//wb.close();
		
	}*/
	

}
