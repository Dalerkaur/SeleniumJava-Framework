package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilDemo {

	  static String excel_path = System.getProperty("user.dir");
	  
	  @Test(dataProvider = "testData")
	  public void Test1(String username, String password) {
		  System.out.println(username + " | "+ password);
		  
	  }
	
	@DataProvider(name="testData")
	public static Object[][] getData() {
		Object data[][] = testData(excel_path+"/Data/user_data.xlsx","Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int row_Count = ExcelUtils.getRowCount();
		int col_Count = ExcelUtils.getColCount();
		//excel.getCellDataNumber(1, 1);
		//excel.getCellDataString(0, 0);
		
		Object data[][] = new Object[row_Count-1][col_Count];
		for (int i=1;i<row_Count;i++)
		{
			
			for (int j=0;j<col_Count;j++)
			{
				String cellData = ExcelUtils.getCellDataString(i, j);
				//System.out.print(cellData + " | ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}
}
