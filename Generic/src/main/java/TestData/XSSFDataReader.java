package TestData;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XSSFDataReader {
    private XSSFSheet ExcelWSheet;
    private XSSFWorkbook ExcelWBook;
    private XSSFCell Cell;

    //This method is to set the File path and to open the Excel file
    //Pass Excel Path and SheetName as Arguments to this method
    public void setExcelFile(String Path,String SheetName) throws Exception {
        FileInputStream ExcelFile = new FileInputStream(Path);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
    }

    //This method is to read the test data from the Excel cell
    //In this we are passing parameters/arguments as Row Num and Col Num
    public String getCellData(int RowNum, int ColNum) throws Exception{
        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
        String CellData = Cell.getStringCellValue();
        return CellData;
    }
}
