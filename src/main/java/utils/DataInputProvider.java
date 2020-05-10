package utils;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

	public static String[][] getSheet(String dataSheetName) {

		String[][] data = null;
		String strKey = "";
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		try {
			FileInputStream fis = new FileInputStream(
					new File("./src/test/resources/TestData/" + dataSheetName + ".xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);

			// get the number of rows
			int rowCount = sheet.getLastRowNum();

			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];

			// loop through the rows
			for (int i = 1; i < rowCount + 1; i++) {
				try {
					XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < columnCount; j++) { // loop through the columns
						try {
							String cellValue = "";
							try {
								cellValue = row.getCell(j).getStringCellValue();
							} catch (NullPointerException e) {

							}

							data[i][j] = cellValue; // add to the data array

						} catch (Exception e) {
							e.printStackTrace();
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			fis.close();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;

	}

	public static Object[][] getDataFromExcel(String dataSheetName) {

		Object[][] testData = new Object[][] { {} };
		Map<String, String[]> testMap = null;
		try {
			FileInputStream fis = new FileInputStream(
					new File("./src/test/resources/TestData/" + dataSheetName + ".xlsx"));
			DataFormatter formatter = new DataFormatter();
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			int scenarios = workbook.getNumberOfSheets();
			testData = new Object[scenarios][];
			for (int i = 0; i < scenarios; i++) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// get the number of rows
				int rowCount = sheet.getPhysicalNumberOfRows();
				testMap = new HashMap<String, String[]>();
				Iterator<Row> rowIterator = sheet.iterator();

				// loop through the rows
				while (rowIterator.hasNext()) {
					// get the number of columns
					int columnCount = sheet.getRow(0).getLastCellNum();

					String strKey = null;
					Row row = rowIterator.next();
					String[] data = (row.getPhysicalNumberOfCells() >= 1)
							? new String[row.getPhysicalNumberOfCells() - 1]
							: null;

					int cellNo = 0;
					for (Cell cell : row) {
						String cellValue = null;

						if (cell.getColumnIndex() == 0) {
							strKey = (formatter.formatCellValue(cell) == null) ? null : formatter.formatCellValue(cell);

							if (strKey == null) {
								break;
							}
							continue;
						}

						cellValue = (formatter.formatCellValue(cell) == null) ? null : formatter.formatCellValue(cell);

						if (cellNo < row.getPhysicalNumberOfCells() - 1)
							data[cellNo++] = cellValue;

					}
					if (strKey != null) {
						testMap.put(strKey, data);
						System.out.println(strKey + ":" + Arrays.toString(data));
					}
				}
				testData[i] = new Object[] { testMap };
				testMap = null;
			}

			fis.close();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testData;

	}

	public static void printMapValues(HashMap<String, String[]> map) {

		try {
			for (Map.Entry<String, String[]> str : map.entrySet()) {
				if (str.getKey().equalsIgnoreCase("Username")) {
					String[] value = str.getValue();
					for (String each : value) {
						System.out.println("Username " + each);

					}

				}
				if (str.getKey().equalsIgnoreCase("Password")) {
					String[] value = str.getValue();
					for (String each : value) {
						System.out.println("Password " + each);

					}

				}
				if (str.getKey().equalsIgnoreCase("TestMethod")) {
					String[] value = str.getValue();
					for (String each : value) {
						System.out.println("TestMethod " + each);

					}

				}

			}
		} catch (Exception e) {
		}
	}
}
