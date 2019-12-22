package wee5.day2.classroomtestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./TestData/SampleData.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rowNum = wsheet.getLastRowNum();
		System.out.println("Row counut is:" + rowNum);

		short cellNum = wsheet.getRow(0).getLastCellNum();
		System.out.println("The column count is:" + cellNum);
//create an object after the rows and columns count
		
		for (int i = 0; i <= rowNum; i++) {
			XSSFRow row = wsheet.getRow(i);
			// to get the data from each row values
			for (int j = 0; j < rowNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);

			}
		}

		wbook.close();
	}

}
