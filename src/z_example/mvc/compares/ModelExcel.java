/**
 * 
 * ((( Excel )))
 *  
 *  components:
 *  Apache POI 3.17 - open source library - to read and write Microsoft Office XLS and XLSX file format,
 * 
 */



package compares;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.examples.ExcelComparator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ModelExcel 
{
	//attributes
    private String stReport = "" ;   // Report.
    private String [ ] stFileName ;  // Files.

    
    private static class Locator {
        Workbook workbook;
        Sheet sheet;
        Row row;
        Cell cell;
    }
    

    
    List<String> listOfDifferences = new ArrayList<>();
    
    
    
    /****
     * 
     * *** nice to have - 
     * *** check if count of sheet in excel #1 is equal to the count of sheet in excel #2
     * @param wb1
     * @param wb2
     */
    private void getNumberOfSheet(Workbook wb1, Workbook wb2)
    {
    	int workbook1 = wb1.getNumberOfSheets();
    	int workbook2 = wb2.getNumberOfSheets();
    	
    	if (workbook1 != workbook2)
    		System.out.println("workbook1 = " + workbook1 + "workbook2" + workbook2);
    	
    	else
    		System.out.println("workbook1 and workbook2 are equal to " + workbook1);
    }
    
    
    
     /**
      * apache - compare method between 2 excel files.
      * @param FileName1
      * @param FileName2
      */
	 private void excelCompare(String FileName1, String FileName2)
	 {
		 
		 Locator loc1 = new Locator();
		 Locator loc2 = new Locator();
       
		 Workbook wb1;
		 Workbook wb2;
	    
		 try {
			wb1 = WorkbookFactory.create(new File(FileName1));
		    wb2 = WorkbookFactory.create(new File(FileName2));	    
		    
		     for (String d : ExcelComparator.compare(wb1, wb2)) {
		    	 stReport = stReport + d;
		    	 System.out.println(d);
		     }
 	        
		     wb2.close();
		     wb1.close();

		 } catch (EncryptedDocumentException e) {
			 // TODO Auto-generated catch block
			 System.out.println("\n<<< Attention >>>  " + e.getMessage());
			 e.printStackTrace();
		 } catch (InvalidFormatException e) {
			 // TODO Auto-generated catch block
			 System.out.println("\n<<< Attention >>>  " + e.getMessage());
			 e.printStackTrace();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 System.out.println("\n<<< Attention >>>  " + e.getMessage());
			 e.printStackTrace();
		 }
	     
	 }


	
	/***
	 * if file exist (true/false)
	 * @param StFileName
	 * @return true/false
	 */
	private boolean IsfileExist(String StFileName) {
		
		Path file = Paths.get(StFileName);
		boolean isRegularExecutableFile = Files.isRegularFile(file) &
		         Files.isReadable(file) & Files.isExecutable(file);
		
		if (isRegularExecutableFile == true)
		{
			System.out.println(StFileName + " >>>  File Exist >>> OK");
		}
		else
		{
			System.out.println(StFileName + " >>> File Not-Exist >>> NOT-OK");
		}
		
		return isRegularExecutableFile;
	}    

	

	/***
	 * 
	 * Submit Button pressed.
	 * @param FileName1
	 * @param FileName2
	 * 
	 */
	public void Submit(String FileName1, String FileName2) 
	{
		
		//TODO print start time to console/gui
		
		Boolean file1 = IsfileExist(FileName1);
		Boolean file2 = IsfileExist(FileName2);
		
		if ((file1 == true) || (file2 == true))
		{
			excelCompare(FileName1, FileName2); //compare array[2]			
		}
		else
		{
			System.out.println("\n<<< Attention >>>  nProgram Ended !!! \n because one of the excel file is missing. \n check the ''file name'' and the ''file path'' \n and try again");
		}	
	
		//TODO print end time to console/gui
		
	}//Submit
	
	
	
	//constructor
	public ModelExcel() {		
	}
	

} //class
	