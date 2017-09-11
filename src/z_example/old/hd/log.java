package z_example.old.hd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class log
{
	public static  int    os    =   0;  //0=windows;1=linux;
	
	public void setOS (int os)
	{
		this.os = os;
	}
	
	public void getOS ()
	{
		System.out.println("os ==> " + this.os);
	}
	
	//write log. (nof_log.txt);
	public log(String msg_type, String subject, String description)
	{
		//current-date-time.
		//[dd-mm-yyy--hh:mm:ss]--[msg-type]--[subject]--[description] + " . "

		Date     dNow        =   new Date( );
		String   StLogData   =   null;
		String   StLogFileName = "./nof.log";


		SimpleDateFormat ft =  new SimpleDateFormat ("[dd/MM/yyy , hh:mm:ss]");  //("[dd/MM/yyy , E , hh:mm:ss]"); //("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		StLogData = ft.format(dNow) + "--[" + msg_type + "]-" + "-[" + subject + ": " + description + "]-- .";
		System.out.println(StLogData);


		//write to log file.
		if ( (!msg_type.equalsIgnoreCase("data")) &&  (!msg_type.equalsIgnoreCase("event")))
		{
			try
			{
				BufferedWriter out = new BufferedWriter(new FileWriter(StLogFileName, true));


				if (this.os == 0)
				{
				   //out.write("\n\r" + StLogData + "\n\r"); //"\n\r"
				   out.write(StLogData + "\r\n"); // "\n\r"				   
				}
				
				if (this.os == 1)
				{
	               out.write(StLogData + "\n");
				}

				//out.write("\n\r" + StLogData + "\n\r");

				out.close();
			}
			catch (IOException e)
			{
				//TODO
				//l = new log("info","File","<"+StSourceFileName+">"+ " Not Exist, Please Select Another File. " + e);
				System.out.println("IOException = " + e);

			}

		}

	}


}
