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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hsmf.datatypes.StoragePropertiesChunk;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.examples.ExcelComparator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ModelExcel 
{
	//attributes
    private String stReport = "" ;   // Report.
    private String [ ] stFileName ;  // Files.
    private String space = "  ";

    
	public String getStReport() {
		return stReport;
	}

	public void setStReport(String stReport) {
		this.stReport = this.stReport + stReport;
	}
    
    
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
		 int stringLenght = 0;
		 Locator loc1 = new Locator();
		 Locator loc2 = new Locator();
       
		 Workbook wb1;
		 Workbook wb2;
	    
		 try {
			wb1 = WorkbookFactory.create(new File(FileName1));
		    wb2 = WorkbookFactory.create(new File(FileName2));	    
		    
		    stringLenght = 0;
		    
		     for (String d : ExcelComparator.compare(wb1, wb2)) {
		    	 //stReport = stReport + d;
		    	 setStReport(" " + d);
		    	 System.out.println(" " + d);
		    	 stringLenght = d.length();
		     }
		     
		     if (stringLenght == 0)
		    	 setStReport("  [OK]  The Data Files are equal. "); 	        
		     else
		    	 setStReport("\n\n  [NOT OK]  The Data Files are NOT equal. ");
		     
		     
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
			setStReport("\n " + StFileName + "\n  [OK] - File Exist.\n");
			System.out.println("\n " + StFileName + "\n  [OK] - File Exist.\n");
		}
		else
		{
			setStReport("\n " + StFileName + "\n  [NOT OK] - File Not Exist.\n");
			System.out.println("\n " + StFileName + "\n  [NOT OK] - File Not Exist.\n");
		}
		
		return isRegularExecutableFile;
	}    

	
	/*** 
	 * 
	 * @return curernt Date & time.
	 */
	public String getCurrentDateTime()
	{
		String currentDateTime = "";

		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss.SSS");
	     Date now = new Date();
	     currentDateTime = sdf.format(now);
	     
		return currentDateTime;
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
		this.stReport = "";
		
		setStReport(" <<<<< started At " +  getCurrentDateTime() + " >>>>>\n \n");
		System.out.println(" <<<<< started At " +  getCurrentDateTime() + ">>>>>\n \n");
		
		Boolean file1 = IsfileExist(FileName1);
		Boolean file2 = IsfileExist(FileName2);
		
		if ((file1 == true) || (file2 == true))
		{
			excelCompare(FileName1, FileName2); //compare array[2]			
		}
		else
		{
			System.out.println("\n\n<<< Attention >>>  \n  Excel file is missing. \n  check the ''file name''  and the  ''file path'' \n and try again");
			setStReport("\n\n <<< Attention >>>  \n  Excel file is missing. \n  check the ''file name''  and the  ''file path'' \n and try again");
		}	
	
		System.out.println("\n \n <<<<< ended At " +  getCurrentDateTime() + " >>>>>\n");
		setStReport("\n \n <<<<< ended At " +  getCurrentDateTime() + " >>>>>\n");
		
	}//Submit
	
	
	
	//constructor
	public ModelExcel() {		
	}
	

} //class

//סוף