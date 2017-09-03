package z_nof_old;

//
// hd.java
//

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;


public class Action 
{

   private int intCurrentTry = 1;
   private int intMaxNumberOfTry = 4; 
   //private int intResult = 0;
   private String stResult = "";
   private boolean blResult = true;
   
   
   //Action Center
   public boolean blFolderCreationStatus;  // Status
   public String stFolderName;      // Source
   public String stFolderNewName;   // Target


   //nothing
   public Action()
   {
   }  
   
   //
   //Password (Enable/Disable)
   public void setEnablePassword(boolean blPasswordYesNo)
   {
      if (blPasswordYesNo == true)
      {
          this.stResult = "";
          this.blResult = true;
      }
      else
      {
         this.stResult = "0";
         this.blResult = false;    	  
      }
   }
   
   public Boolean getEnablePassword()
   {
      return this.blResult;
   }
   //
   // getting password from user
   public void setUserPasswd (String userEnterPassword)
   {
		TimeAndDate tad = new TimeAndDate();
		tad.getCurrentDate();
		
		
		//getting passwd + current date.
		int intCalcDate = tad.getCalcDate();
		int intCalcPassword = tad.getCalcPassword();
		
		//String stCalcDate = tad.getStCalcDate();
		String stCalcPassword = tad.getStCalcPassword();
		
		
		//TODO remark this line (tell the password)
		System.out.println("=====" + stCalcPassword);
		
		//char chrCalcPassword [] = new char[5];
		

	    System.out.println("Enter A PassWord : (999999 = Exit)");
	    Scanner sn = new Scanner (System.in);
	    
	    userEnterPassword = sn.next();
	    
	    //String stUEP = "" + userEnterPassword;
	    /*
	    System.out.println(stUEP);
	    
	    // 
	    if (stUEP.equals(stCalcPassword))
	    {
	       System.out.println("*** OK");
	    }
	    else
	    {
	       System.out.println("*** NOT OK");
	    }
		*/
	    
	    
		while (this.intCurrentTry < this.intMaxNumberOfTry)
		{
		  if ((!(userEnterPassword.equals("999999"))) && (!(userEnterPassword.equals("exit"))))
		  {
		     if (userEnterPassword.equals(stCalcPassword)) 
		     {
                this.stResult = "0";
                intCurrentTry = 4;
		     }
		     else
		     { 
	            System.out.println("Password incurrect");
		        System.out.println("Enter A PassWord :");
		        userEnterPassword = sn.next();
		        this.stResult = "999999";
		        this.intCurrentTry++;
		     }
		  }
		  else
		  {
              this.stResult = "999999";
              intCurrentTry = 4;
		  }
		}
   }
   
   // return action
   public String getUserPasswd()
   {
	   return stResult;
   }

//
//Folder - New folder
 public void SetFolderNew(String stFolderName)
 {
    boolean success;
    do 
    {
       success = (new File(stFolderName)).mkdir();
    }
    while (success); 

    // status variable      
    this.blFolderCreationStatus = !success;
    this.stFolderName = stFolderName;
 }   
 //
 // Folder - Status
 public boolean GetFolderNew()
 {
    System.out.println("Success=" + blFolderCreationStatus + " , Path=" + stFolderName);
    return blFolderCreationStatus;
 }

//  
//
//Folder - Rename folder
//
 public void SetFolderRename(String stFolderName, String stFolderNewName)
 {
    boolean success;
    File file1 = new File (stFolderName);      
    File file2 = new File (stFolderNewName);
    	
    do 
    {
        success = file1.renameTo(file2);	    	  
    }
    while (success);
    
    // status variable
    this.blFolderCreationStatus = !success;
    this.stFolderName = stFolderName;
    this.stFolderNewName = stFolderNewName;   
 }
 
 
 //
 // Folder - Status
 public boolean GetFolderRename()
 {
	  System.out.println("Success=" + blFolderCreationStatus + " , Source_Path=" + stFolderName + " , Target_Path=" + stFolderNewName);      
    return blFolderCreationStatus;
 }
 

//
//
//Folder - erase folder/s and sub folder/s
 public static boolean deleteDir(File dir) 
 {
     if (dir.isDirectory()) 
     {
         String[] children = dir.list();
         for (int i=0; i<children.length; i++) 
         {
             boolean success = deleteDir(new File(dir, children[i]));
             if (!success) 
             {
                 return false;
             }
         }
     }

     // The directory is now empty so delete it
     return dir.delete();
 }
 
 
 //
 // text Write file   
 public void fnTextFile(String StTxtFileName) throws Exception
 {
    //write to a file.
	  File fl = new File(StTxtFileName);
    FileOutputStream fos = new FileOutputStream(fl,true);
    PrintStream p = new PrintStream(fl);
	       
    p.println("");	       

    fos.write(1);	  
    fos.flush();
    fos.close();
 }
 
 
 //
 // property Read file.   
 public void fnReadISRMOBILETextproperties(String StTxtProperties) throws Exception
 {	   
     File fl = new File(StTxtProperties);
     Properties pr = new Properties();
     FileInputStream in = new FileInputStream(fl);


     //get data
     pr.load(in);


     // properies value - get
     System.out.println("Version: " + pr.getProperty("Version"));
     System.out.println("DB2eDriver: " + pr.getProperty("DB2eDriver"));
     System.out.println("DB2eUrl: " + pr.getProperty("DB2eUrl"));		   
     System.out.println("DB2eUser: " + pr.getProperty("DB2eUser"));
     System.out.println("DB2ePassword: " + pr.getProperty("DB2ePassword"));
     System.out.println("LogLevel: " + pr.getProperty("LogLevel"));		   
     System.out.println("DB2eNeedSync: " + pr.getProperty("DB2eNeedSync"));
     System.out.println("DB2eSyncUrl: " + pr.getProperty("DB2eSyncUrl"));
     System.out.println("KeepAliveUrl: " + pr.getProperty("KeepAliveUrl"));		   
     System.out.println("DB2eSyncTimeout: " + pr.getProperty("DB2eSyncTimeout"));
     System.out.println("DB2eSyncMessageSize: " + pr.getProperty("DB2eSyncMessageSize"));
     System.out.println("DB2eSyncEncoding: " + pr.getProperty("DB2eSyncEncoding"));		   
     System.out.println("DB2eSyncTrace: " + pr.getProperty("DB2eSyncTrace"));
     System.out.println("DaysOfMailMsgToKeep: " + pr.getProperty("DaysOfMailMsgToKeep"));
     System.out.println("DB2eSyncPath: " + pr.getProperty("DB2eSyncPath"));		   
     System.out.println("BufferNumToSend: " + pr.getProperty("BufferNumToSend"));
     System.out.println("DB2eSyncDriver: " + pr.getProperty("DB2eSyncDriver"));
     System.out.println("DB2eSyncProtocol: " + pr.getProperty("DB2eSyncProtocol"));		   
     System.out.println("SortColumn: " + pr.getProperty("SortColumn"));
     System.out.println("SortDirection: " + pr.getProperty("SortDirection"));
     System.out.println("StatusFilter: " + pr.getProperty("StatusFilter"));		   
     System.out.println("ScanSourceName: " + pr.getProperty("ScanSourceName"));
     System.out.println("ScanWidth: " + pr.getProperty("ScanWidth"));
     System.out.println("ScanPixelType: " + pr.getProperty("ScanPixelType"));		   
     System.out.println("MessageFilter: " + pr.getProperty("MessageFilter"));
     System.out.println("MQePath: " + pr.getProperty("MQePath"));
     System.out.println("RemoteQMgr: " + pr.getProperty("RemoteQMgr"));		   
     System.out.println("RemoteQMgrIP: " + pr.getProperty("RemoteQMgrIP"));
     System.out.println("RemoteQMgrPort: " + pr.getProperty("RemoteQMgrPort"));
     System.out.println("ListenerPort: " + pr.getProperty("ListenerPort"));		   
     System.out.println("OutboxQ: " + pr.getProperty("OutboxQ"));
     System.out.println("InboxQ: " + pr.getProperty("InboxQ"));
     System.out.println("NewSimulation: " + pr.getProperty("NewSimulation"));  
 }

 

 //
 // property Write file.   
 public void fnWriteISRMOBILETextproperties(String StTxtProperties) throws Exception
 {
    File fl = new File(StTxtProperties);
    Properties pr = new Properties();
    FileOutputStream out = new FileOutputStream(fl);


    // properies value - set.
    pr.setProperty("Version","8.8");	   
    pr.setProperty("DB2eDriver","com.ibm.db2e.jdbc.DB2eDriver");	   
    pr.setProperty("DB2eUrl","jdbc:db2e:%APP_PATH%/DataBase/");
    pr.setProperty("DB2eUser","mobiadm");	   
    pr.setProperty("DB2ePassword","!qazxsw2");	   
    pr.setProperty("LogLevel","INFO");
    pr.setProperty("DB2eNeedSync","N");
    pr.setProperty("DB2eSyncUrl","http://192.168.130.38:8080");	   
    pr.setProperty("KeepAliveUrl","http://192.168.130.38:8082/soap/servlet/rpcrouter");	   
    pr.setProperty("DB2eSyncTimeout","30");
    pr.setProperty("DB2eSyncMessageSize","16384");	   
    pr.setProperty("DB2eSyncEncoding","Cp1255");	   
    pr.setProperty("DB2eSyncTrace","default");
    pr.setProperty("DaysOfMailMsgToKeep","20");	   
    pr.setProperty("DB2eSyncPath","%APP_PATH%/DataBase/");	   
    pr.setProperty("BufferNumToSend","3");
    pr.setProperty("DB2eSyncDriver","com.ibm.mobileservices.isync.db2e.jni.DB2eISyncProvider");	   
    pr.setProperty("DB2eSyncProtocol","isync:db2e:");	   
    pr.setProperty("SortColumn","0");		   
    pr.setProperty("SortDirection","Ascending");	   
    pr.setProperty("StatusFilter","OPEN");	   
    pr.setProperty("ScanSourceName","");
    pr.setProperty("ScanWidth","3.1");	   
    pr.setProperty("ScanPixelType","2");	   
    pr.setProperty("MessageFilter","NOT_READ_MESSAGE");		   		   
    pr.setProperty("MQePath","%APP_PATH%/QMgrs/");	   
    pr.setProperty("RemoteQMgr","QMMAIL");	   
    pr.setProperty("RemoteQMgrIP","{xor}bmZtcW5pZ3FubG9xbGc=");
    pr.setProperty("RemoteQMgrPort","8085");	   
    pr.setProperty("ListenerPort","8085");	   
    pr.setProperty("OutboxQ","OUTBOX.DATAGRAM");		   		   
    pr.setProperty("InboxQ","INBOX.DATAGRAM");	   
    pr.setProperty("NewSimulation","Y");		   

    //set data
    pr.store(out,"FileName: a.properties");	   
 }


 //
 // property Write file.   
 public void fnWriteTestISRMOBILETextproperties(String StTxtProperties) throws Exception
 {
    File fl = new File(StTxtProperties);
    Properties pr = new Properties();
    FileOutputStream out = new FileOutputStream(fl);


    // properies value - set.
    pr.setProperty("Version", "8.8");	   
    pr.setProperty("DB2eDriver", "com.ibm.db2e.jdbc.DB2eDriver");	   
    pr.setProperty("DB2eUrl","jdbc:db2e:%APP_PATH%/DataBase/");
    pr.setProperty("DB2eUser", "mobiadm");	   
    pr.setProperty("DB2ePassword", "!qazxsw2");	   
    pr.setProperty("LogLevel","INFO");
    pr.setProperty("DB2eNeedSync","N");
    pr.setProperty("DB2eSyncUrl", "http://192.168.130.5:8080");	   
    pr.setProperty("KeepAliveUrl", "http://192.168.130.5:8082/soap/servlet/rpcrouter");	   
    pr.setProperty("DB2eSyncTimeout","30");
    pr.setProperty("DB2eSyncMessageSize", "16384");	   
    pr.setProperty("DB2eSyncEncoding", "Cp1255");	   
    pr.setProperty("DB2eSyncTrace","default");
    pr.setProperty("DaysOfMailMsgToKeep", "20");	   
    pr.setProperty("DB2eSyncPath", "%APP_PATH%/DataBase/");	   
    pr.setProperty("BufferNumToSend","3");
    pr.setProperty("DB2eSyncDriver", "com.ibm.mobileservices.isync.db2e.jni.DB2eISyncProvider");	   
    pr.setProperty("DB2eSyncProtocol", "isync:db2e:");	   
    pr.setProperty("SortColumn","0");		   
    pr.setProperty("SortDirection", "Ascending");	   
    pr.setProperty("StatusFilter", "OPEN");	   
    pr.setProperty("ScanSourceName","");
    pr.setProperty("ScanWidth", "3.1");	   
    pr.setProperty("ScanPixelType", "2");	   
    pr.setProperty("MessageFilter","NOT_READ_MESSAGE");		   		   
    pr.setProperty("MQePath", "%APP_PATH%/QMgrs/");	   
    pr.setProperty("RemoteQMgr", "QMMAIL");	   
    pr.setProperty("RemoteQMgrIP","{xor}bmZtcW5pZ3FubG9xbGc=");
    pr.setProperty("RemoteQMgrPort", "8085");	   
    pr.setProperty("ListenerPort", "8085");	   
    pr.setProperty("OutboxQ","OUTBOX.DATAGRAM");		   		   
    pr.setProperty("InboxQ", "INBOX.DATAGRAM");	   
    pr.setProperty("NewSimulation","Y");		   

    //set data
    pr.store(out,"FileName: a.properties");	   
 }

 
   public void ping()
   {
      //Pinger tp = new Pinger();
      //tp.setPinger("192.168.0.211");
      //tp.getPinger();

      Pinger tp = new Pinger();
	  int i = 0;
	  
      System.out.println("please wait");
	  
      
      //todo: make another method with Thread;
	  for (i = 1; i <= 40;i++)
	  {
	     tp.setWinPinger("172.16.0." + i);
	     tp.getWinPinger();
	     
	   
	  }
	  tp.getPingResult();
   }

  
} //Action./
