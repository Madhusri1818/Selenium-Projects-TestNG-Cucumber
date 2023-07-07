package AppHooks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readexcel {
	
	
	public  String  dataexcel(int rownum, int cellnum) throws Exception, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\MadhusriChoppa\\eclipse-workspace\\Ecllipse_oxygen\\HybridFramework_POM\\TestData\\login.xlsx");
		Workbook wb1=WorkbookFactory.create(fis);
		Sheet sheet=wb1.getSheet("LoginData");
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(cellnum);
		System.out.println(cell.getStringCellValue());
		return cell.getStringCellValue();
	}
	
	
	public static void main(String[] args) throws Exception, IOException {
		//readexcel obj=new readexcel();
		//System.out.println(obj.dataexcel(0, 1));
		/*FileInputStream fis=new FileInputStream("C:\\Users\\MadhusriChoppa\\eclipse-workspace\\Ecllipse_oxygen\\HybridFramework_POM\\TestData\\login.xlsx");
		Workbook wb1=WorkbookFactory.create(fis);
		Sheet sheet=wb1.getSheet("LoginData");
		int i=sheet.getLastRowNum();
		for (Row row : sheet) {
			int r=row.getLastCellNum();
			for (Cell cell : row) {
				System.out.println(cell.getStringCellValue());
			}
		}
	}
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());*/
	}
}



