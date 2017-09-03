package z_nof_old;

//
// hd.java
//

import java.util.*;
import java.io.*;
//import java.lang.*;


public class hd 
{	
   int os = 0; // 0=windows  ; 1=linux
	
   public hd()
   {
   }

   public static void main(String[] args) throws Exception
   {
      String stResult = "";
      
      hd hd1 = new hd();

	  //msg class 
	  msg message = new msg();
	  //
	  // W E C O M E _ M E S S A G E - first.
	  //
	
	  message.getMsg(3);
      message.getMsg(3);  // \n
	  message.getMsg(4);  // time
	  message.getMsg(1);  // msg.Welcome
		
		
      //User Interaction
	  Scanner sn = new Scanner (System.in);

		
	  //Action- 
	  Action ac = new Action();
		

	  //Action.Password
	  //true=with password check
	  //false = without password check
	  ac.setEnablePassword(true);
	  if(ac.getEnablePassword() == false)
	  {
	     ac.setUserPasswd(""); //Generate password
	     stResult = ac.getUserPasswd(); // Check password-(return 0 = OK)
	  }	
		
	  //DateTime-
	  TimeAndDate tad = new TimeAndDate();
	  String StDateTime = ""; 
			    
	
	  //path;
	  String StBaseSource = "";
	  String StRenameSource = "";
      String StDelTarget = "";
	  String stTxtReadISRMobile =  "";
      String stTxtWriteISRMobile = "";
      String StRenameTarget = "";
      
      //System.out.println(hd1.os);
      
	  //OS: 0=win;1=lin     
	  switch (hd1.os)
	  {
	     case 0: //windows
	       StBaseSource = "C:\\Program Files\\ISRMobile";
		   StRenameSource = "C:\\Program Files\\ISRMobile\\DataBase";
           StDelTarget = "C:\\Program Files\\ISRMobile\\QMgrs";
    	   stTxtReadISRMobile =  "C:\\Program Files\\ISRMobile\\ISRMobile.ini";
	       stTxtWriteISRMobile = "C:\\Program Files\\ISRMobile\\ISRMobile.ini";
	       break;
	     case 1: //linux 	       
		   StBaseSource = "/$HOME/ISRMobile";
		   StRenameSource = "/$HOME/ISRMobile/DataBase";
           StDelTarget = "/$HOME/ISRMobile/QMgrs";
    	   stTxtReadISRMobile =  "/$HOME/ISRMobile/ISRMobile.ini";
	       stTxtWriteISRMobile = "/$HOME/ISRMobile/ISRMobile.ini";
	       break;
	  }	       
	       
	  ////TODO in windows full path folder creation - for each sub folder this 2 commands (C:\program files\...)
	       
      ////Action.Folder.StBaseSource
      ac.SetFolderNew(StBaseSource);
      ac.GetFolderNew();		

      //EndLess Loop Until Exit/999999
      while ((!(stResult.equals("999999"))) && (!(stResult.equals("exit"))))
      {         
    	 // path, Path, PAth, PATh, PATH
    	 StDateTime = "" + tad.getStFullDateTime();
    	 
   	     switch (hd1.os)
	     {
	        case 0: //windows
    	       StRenameTarget = "C:\\Program Files\\ISRMobile\\DataBase_" + StDateTime + ".old";
    	       break;
	        case 1: //linux 	       
	           StRenameTarget = "/home/yaron/ISRMobile/DataBase_" + StDateTime + ".old";
	           break;
	     }	       
               
		 message.getMsg(3);  // \n ***
		 message.getMsg(4);  // time ***
			   
         //message.getMsg(6);  // main menu ***
		
		 //input.
		 //System.out.println("Enter a number: ");
		 stResult = sn.next();
		       
		 //TODO: del.me
		 //System.out.println("111 = " + stResult);

		 if ((stResult.equals("100000")) || (stResult.equals("menu")))
		 {
		    message.getMsg(6);
		 }
		 
		 if ((stResult.equals("100001")) || (stResult.equals("property")))
         {
	        //DELME
	    	//ac.SetFolderNew(StBaseSource);
	        //ac.GetFolderNew();
	        //System.out.println("D.M: path was create" + StBaseSource);
	        //.
			 
			//read & write the proprerty
			//Version, DB2eSyncUrl,KeepAliveUrl
		    	   
		    //Write to property file
		    System.out.println("\n");		    	   
		    System.out.println("Writing to Property File: ");
		    System.out.println("");
		    ac.fnWriteISRMOBILETextproperties(stTxtWriteISRMobile);
		    System.out.println("\n...Done...");

		    	   
		    //Read (changed) property file.
		    System.out.println("\n");		    	   
		    System.out.println("Reading Property File: ");
		    System.out.println("[ " + stTxtReadISRMobile + " ]");
		    System.out.println("");
		    ac.fnReadISRMOBILETextproperties(stTxtWriteISRMobile);
		    System.out.println("\n...End of File...");    
         }	       

         if ((stResult.equals("100010")) || (stResult.equals("deldb")))
		 {
		    // folder - create
		    ac.SetFolderNew(StBaseSource);
		    ac.GetFolderNew();			

		    // folder - create
		    ac.SetFolderNew(StRenameSource);
		    ac.GetFolderNew();
		          
		    // folder - rename (rename_source, rename_Target)
		    ac.SetFolderRename(StRenameSource,StRenameTarget);
		    ac.GetFolderRename();

		          
		    //TODO: delete this code group when done.
		    // folder - create
		    ac.SetFolderNew(StRenameSource);
		    ac.GetFolderNew();      
		 }
		       
		       if ((stResult.equals("100011")) || (stResult.equals("mailq")))
		       {
	               //DELME
	    		   ac.SetFolderNew(StBaseSource);
	               ac.GetFolderNew();
	               System.out.println("D.M: path was create" + StBaseSource);
	               //.
	               
		    	  System.out.println("MailQ"); 
		       }   
		    	        
		       
		       if ((stResult.equals("ver")) || (stResult.equals("Version")))
		       {
			       message.getMsg(3);  // \n
				   message.getMsg(4);  // time
				   message.getMsg(1);  // Welcome message		    	   
		       }
		       
		       if ((stResult.equals("propertytest")) || (stResult.equals("ptest")))
		       {
	               //DELME
	    		   ac.SetFolderNew(StBaseSource);
	               ac.GetFolderNew();
	               System.out.println("D.M: path was create" + StBaseSource);
	               //.
	               
			       //message.getMsg(3);  // \n
				   //message.getMsg(4);  // time
	               
		    	   //Write to property file
		    	   System.out.println("\n");		    	   
		    	   System.out.println("Writing to Property File: ");
		    	   System.out.println("");
		    	   ac.fnWriteTestISRMOBILETextproperties(stTxtWriteISRMobile);
		    	   System.out.println("\n...Done...");

		    	   
		    	   //Read (changed) property file.
		    	   System.out.println("\n");		    	   
		    	   System.out.println("Reading Property File: ");
		    	   System.out.println("[ " + stTxtReadISRMobile + " ]");
		    	   System.out.println("");
		    	   ac.fnReadISRMOBILETextproperties(stTxtWriteISRMobile);
		    	   System.out.println("\n...End of File...");    

		       }
               
		       if ((stResult.equals("copyright")) || (stResult.equals("(c)")))
		       {
		    	   System.out.println("CopyRight 2010");
		       }
		       
		       if ((stResult.equals("more")) || (stResult.equals("MORE")))
		       {
		    	   //System.out.println("more commands");
			       message.getMsg(3);  // \n ***
				   message.getMsg(4);  // time ***
				   
	               message.getMsg(7);  // main menu ***
		       }
		       
		       // cls - clear
		       if ((stResult.equals("clear")) || (stResult.equals("cls")))
		       {
		    	   //System.out.println("more commands");
		    	   for (int index = 0 ; index < 20; index++)
		    	   {
			          message.getMsg(3);  // \n ***
		    	   }
		       }
		       // ping
		       if ((stResult.equals("ping")) || (stResult.equals("Ping")))
		       {
		          ac.ping();
		       }
		       
		       // os
		       if ((stResult.equals("os")) || (stResult.equals("OS")))
		       {
		          if (hd1.os == 0)
		    	  {
		             System.out.println("Windows");
		    	  }
		    	  else
		    	  {
		             System.out.println("Linux");
		    	  }
		       }
		       
		       	       
		   }
		   		
		   message.getMsg(2);  // bye bye message
		   message.getMsg(4);  // time
				
	   }
	    	
} //The End//

//
// T00B3 - Notes
/*
//property file (RW)
//text file (RW)
String stTxtReadISRMobile =  "C:\\Program Files\\ISRMobile\\ISRMobileO.ini";
String stTxtWriteISRMobile = "C:\\Program Files\\ISRMobile\\ISRMobileO.ini";

//
//property file - read
txtPropertiesFile tpf = new txtPropertiesFile();

//create an empty init file
tpf.fnTextFile(stTxtWriteISRMobile);
//read
tpf.fnReadISRMOBILETextproperties(stTxtReadISRMobile);
//write
tpf.fnWriteISRMOBILETextproperties(stTxtWriteISRMobile);


//(T00B3) too be  continue
//*!1* convert (any String) from uppercase to lowercase (just in case)
//*!2* split path with the "/" linux char -or- "\" widnows char
//    for full path creation
//    example: \ home \ user \ program 
//    if exist - propmpt
//    if not exist - create (written + prompt, write error permission + prompt)
//
//
//
//
//
//
// df (disk free --> total,used, free, used% free%)
// mem (memory --> total,used, free, used% free%)
//
//
//
//
//
//
		          
*/
