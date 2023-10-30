package Generic_Scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class GenericScript_DDT {

	public String Fetch_data(String sheet, int row, int cell)
	{
		String val="";
		try{
			FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh=book.getSheet(sheet);
			Row r=sh.getRow(row);
			Cell ce=r.getCell(cel);
			val=ce.toString();
		}
		catch(Exception e){
			System.out.println("unable to open");
		}
		return val;
	}
}
