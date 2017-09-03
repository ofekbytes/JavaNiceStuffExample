
package z_nof_old;

//
// msg.java
//

import java.util.Calendar;


// message class
public class msg 
{
    int intResult = 0;
    
	public void getMsg(int index)
	{
		
		switch (index)
		{
		    // Welcome message
			case 1:
			System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
			System.out.println("HD  HD  HD  HD  HD  HD  HD  HD  HD  HD  HD  HD  HD  HD");
			System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
			System.out.println("------------------------------------------------------");
			System.out.println("                   _   _      _____  ");
			System.out.println("                  | | | |    |  _  \\");
			System.out.println("                  | |_| |    | | | |");
			System.out.println("                  |  _  |    | | | |");
			System.out.println("                  | | | |    | |_| |");
			System.out.println("                  |_| |_| .. |_____/");
			System.out.println("                    ");
			System.out.println("------------------------------------------------------");
			System.out.println("                       Help-Desk      ");
			System.out.println("                     s u p p o r t    ");    
			System.out.println("                        ver 1.0       ");
			System.out.println("------------------------------------------------------");
			break;
		    // GoodBy message			
			case 2:
			System.out.println("------------------------------------------------------");
			System.out.println(" _____  __    __  _____        _____  __    __  _____ "); 
			System.out.println("|  _  \\ \\ \\  / / | ____|      |  _  \\ \\ \\  / / | ____|"); 
			System.out.println("| |_| |  \\ \\/ /  | |__        | |_| |  \\ \\/ /  | |__  "); 
			System.out.println("|  _  {   \\  /   |  __|       |  _  {   \\  /   |  __| "); 
			System.out.println("| |_| |   / /    | |___       | |_| |   / /    | |___ "); 
			System.out.println("|_____/  /_/     |_____|      |_____/  /_/     |_____|"); 
			System.out.println("------------------------------------------------------");					 				
			break;
		    //new lines 
			case 3:
			System.out.println("\n");
			break;
			// getTime
			case 4:
			TimeAndDate tad = new TimeAndDate();
			tad.getCurrentDate();
			System.out.println("------------------------------------------------------");
			break;
            // (pwd) present working directory
			case 5:
			String stCurDir = System.getProperty("user.dir");
			System.out.println("pwd: " + stCurDir + "\n");
		    break;
		    // main menu
			case 6:
			System.out.println("                      Main - Menu                     ");
			System.out.println("+-----------------------------------------------------");
			System.out.println("| 100001. (Property) -----> Config Masofonim Client");
			System.out.println("| 100010. (DelDB) --------> DB Del ");
			System.out.println("| 100011. (MailQ) --------> mail Fix");
			System.out.println("| ");
			System.out.println("| 999999. (Exit) ---------> Exit H.D SoftWare");
			System.out.println("+-----------------------------------------------------");
			break;
			case 7:
			System.out.println("                      MORE                   ");
			System.out.println("+---------------------+-------------------------------");
			System.out.println("| more, copyright, ver, ptest, ");
			System.out.println("| ");
			System.out.println("| ");
			System.out.println("| ");
			System.out.println("| ");
			System.out.println("+-----------------------------------------------------");
			//abcdefghijklmnopqrstuvwxyz
			break;
			
		    // default/none-pressed message						
			default:
				     System.out.println("");
			break;
		}
	}	
}

