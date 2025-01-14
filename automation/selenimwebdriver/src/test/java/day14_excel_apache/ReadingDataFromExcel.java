package day14_excel_apache;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//Excel File--->Workbook--->Sheets--->Rows----Cells


public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		//open file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		//capture workbook and extract workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//capture sheet, multiple sheets extract particular sheet
		XSSFSheet  sheet=workbook.getSheet("Sheet1");  //	XSSFSheet  sheet=workbook.getSheetAt(0);
		
		//this getLastRowNum returns last row number
		int totalRows=sheet.getLastRowNum();
		//this getLastCellNum returns last column number
		//select particular row and find no. of cells
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of rows:"+ totalRows); //5
		System.out.println("number of cells:"+ totalCells);  //3
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r); //current row
						
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c); //current column
				System.out.print(cell.toString()+"\t");
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
	}

}