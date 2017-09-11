package z_example.old.nof;

//
// Pinger.java
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pinger 
{
   public String StHostIp="";
   private ArrayList<String> ArrPingResult = new ArrayList<>();
   

   
   //
   // Windows
   //      
   //set ip address (Windows)
   public void setWinPinger(String host)
   {
      StHostIp = host;
   }

   //ping 1/one ip (Windows)
   public String getWinPinger()
   {
      String host = StHostIp;
      try 
      {
   	     Process ping = Runtime.getRuntime().exec("ping -w 1 -n 1 " + host); //-t 3
         BufferedReader br = new BufferedReader(new InputStreamReader(ping.getInputStream()));
           
         StringBuilder sb = new StringBuilder();
         String line;
           
         boolean tfResult = false;
               
         while ((line = br.readLine()) != null) 
         {
        	 if (line.toString().matches(".*100% loss.*") == true)
            {
               tfResult = true; //NOT-OK
            }             
         }
           
//         //show Result
//         if (tfResult == true)
//         {
//            System.out.println(host + " [NOT-OK]");
//         }
//         else
//            System.out.println(host + " [OK]");
         
         
       if (tfResult != true)
       {
       //   System.out.println(host + " >>> [OK]");   	   
          ArrPingResult.add(host);
       }
       
	   System.out.print(".");
         
         
      } //try
      catch (IOException e) 
      {
         e.printStackTrace();
      }

       return "Ok";
   }

   //
   // Linux
   //   
   //set ip address (Linux)
   public void setLinPinger(String host)
   {
      StHostIp = host;
   }

   //ping 1/one ip (Linux)
   public String getLinPinger()
   {
      String host = StHostIp;
      try 
      {
         Process ping = Runtime.getRuntime().exec("ping -c 1 -t 1 " + host); //-t 3    	  
         BufferedReader br = new BufferedReader(new InputStreamReader(ping.getInputStream()));
           
         StringBuilder sb = new StringBuilder();
         String line;
           
         boolean tfResult = false;
           
         while ((line = br.readLine()) != null) 
         {
            if (line.toString().matches(".*100% packet loss.*") == true)
            {
               tfResult = true; //NOT-OK
            }             
         }
           
         //show Result
         if (tfResult == true)
         {
            System.out.println(host + " [NOT-OK]");
         }
         else
            System.out.println(host + " [OK]");                        
      } //try
      catch (IOException e) 
      {
         e.printStackTrace();
      }

       return "Ok";
   }
   
   
   public void getPingResult()
   {
	   int index = 0;
	   
	   System.out.println("\n \r \n \r**[Output]** \n**-------** \n");
	   
	   for (String value : ArrPingResult) {
		   index++;
		   System.out.println(index + " " + value);
	   }
   }
   
}

