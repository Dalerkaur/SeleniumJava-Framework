package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	public static XSSFWorkbook workbook;
	public static String excel_path;
	public static XSSFSheet sheet;

	
	public ExcelUtils(String excelPath, String sheetName) {
		
		
			try {
				workbook = new XSSFWorkbook(excelPath);
				sheet = workbook.getSheet(sheetName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		
	}
	public static void main(String args[]) {
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {

		
			int row_count = sheet.getPhysicalNumberOfRows();
			System.out.println("The no. of rows are " + row_count);
			return row_count;

		
	}
	
	public static int getColCount() {

		
		int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The no. of columns are " + col_count);
		return col_count;

	
}

	public static String getCellDataString(int rowNum, int colNum) {

		
			String cell_data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cell_data);
			return cell_data;
			

	}
	
	public static void getCellDataNumber(int row_num, int col_num) {

		
			double cell_data1 = sheet.getRow(row_num).getCell(row_num).getNumericCellValue();
			System.out.println(cell_data1);
			

	}
}
