package z_example.old.hd;

import java.util.Calendar;



public class time_date 
{

   private int intCurrentPassWord = 0;
   private int intCurrentDate = 0;

   //
   private String StCurrentPassWord = "";
   private String StCurrentDate = "";
   private String StFullDateTime = "";
   private String StFullTime = "";
	   
   //Date DD/MM/YYYY
   private int day = 0;
   private int month =  0;
   private int year = 0;

   // HH:MM
   int intHour = 0;
   int intMinute = 0;
   int intSecond = 0; 

   

   // display current time
   public int getCurrentDate()
   {
	   fnCutrrentDate();
	   
       //print time
       System.out.println(day + "/" + month + "/" + year + "      " + intHour + ":" + intMinute);
	   
	   //System.out.println("" + cal.getTime());  //unsorted - full date and time
       
       return 0;
   }
   

   public int getCalcTime()
   {	   
      fnCutrrentDate();
      System.out.println(this.intHour + ":" + this.intMinute +":" + this.intSecond);
      this.intCurrentDate = this.intHour + this.intMinute + this.intSecond;
      
      return this.intCurrentDate;
   }

   
   public int getCalcDate()
   {
      this.intCurrentDate = this.day + this.month + this.year;
      
      return this.intCurrentDate;
   }

   
   // String
   public String getStCalcDate()
   {
	   
      this.StCurrentDate += this.intCurrentDate;
      
      return this.StCurrentDate;
   }
   
   // String 
   public String getStFullDateTime()
   {
	   fnCutrrentDate();
	   
	   return this.StFullDateTime;
   }
   

   public String getStFullTime()
   {
	   fnCutrrentTime();
	   
	   return this.StFullTime;
   }
   
   
   public int getCalcPassword()
   {
	   this.intCurrentPassWord = this.intCurrentDate + 1234;
	   
	   return this.intCurrentPassWord;
   }
   
   // String
   public String getStCalcPassword()
   {
	   this.intCurrentPassWord = this.intCurrentDate + 1234;
	   this.StCurrentPassWord = "" + this.intCurrentPassWord;
	   
	   return this.StCurrentPassWord;
   }
   
   

   //
   //
   // Current-time
   private void fnCutrrentTime()
   {
	   //time instance;
	   Calendar cal = Calendar.getInstance();
			
/*	   // DD/MM/YYYY
	   this.day = cal.get(Calendar.DATE);
	   this.month = cal.get(Calendar.MONTH) + 1;
	   this.year = cal.get(Calendar.YEAR);*/

	   // HH:MM
	   //this.intHour = (cal.get(Calendar.HOUR_OF_DAY) - 1); //(-1 houre) 
	   this.intHour = (cal.get(Calendar.HOUR_OF_DAY));
	   this.intMinute = cal.get(Calendar.MINUTE);
	   this.intSecond = cal.get(Calendar.SECOND);
	   
	   this.StFullTime = " " + this.intHour + ":" + this.intMinute + ":" + this.intSecond;
   }   
   
   
   
   //
   //
   // Current-time
   private void fnCutrrentDate()
   {
	   //time instance;
	   Calendar cal = Calendar.getInstance();
			
	   // DD/MM/YYYY
	   this.day = cal.get(Calendar.DATE);
	   this.month = cal.get(Calendar.MONTH) + 1;
	   this.year = cal.get(Calendar.YEAR);

	   // HH:MM
	   //this.intHour = (cal.get(Calendar.HOUR_OF_DAY) - 1); //(-1 houre) 
	   this.intHour = (cal.get(Calendar.HOUR_OF_DAY));
	   this.intMinute = cal.get(Calendar.MINUTE);
	   this.intSecond = cal.get(Calendar.SECOND);
	   
	   this.StFullDateTime = "" + this.day + this.month + this.year + "_" + this.intHour + this.intMinute + this.intSecond;
   }   
}
