package z_example.old.hd;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;



public class helps //extends JFrame 
{
	private   JFrame        frame        =   null;
	private   JTextPane     pane         =   null;
	private   JScrollPane   scroll       =   null;
	private   String        StLine       =   "";

	//
	//set man page line
	private void setText(String StText)
	{
		this.StLine = this.StLine + StText;
	}


	//
	//get man page
	private String getText()
	{
		return StLine;
	}


	private void SetManPages()
	{
		
		//check if man_page exist --else-- prisent this.
		String nr = "\r\n";
		setText(nr + " ==[ H E L P ]== " + nr + "" + nr);
		setText("1. Select a file." + nr);
		setText("2. Select a String to find in file." + nr);	    
		setText("3. Select a type of search." + nr);
		setText("4. Press submit button -  to start string seeking process in file." + nr);
		setText("5. Click the properties button to view search result." + nr);
		setText("    You can locate the result files in the  nof  local folder." + nr);
		setText("    Every search has his own result file." + nr);
		setText("" + nr);		
		setText("Note: when exit the nof program all the temp files will be erased." + nr);
		setText("" + nr);
		setText("" + nr);
		setText("" + nr);
	}



	public helps() 
	{	
		//read manual
		SetManPages();

		frame = new JFrame("..Help...");
		frame.setResizable(true);		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(nof.class.getResource("/icons/yamon.jpg")));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//.EXIT_ON_CLOSE););

//multi pane with GridLayout (matrix) Example	
		//JPanel p=new JPanel(new GridLayout(2,1));		
		//window 1
		//pane.setText(" 1. Select a file. \r\n 2. select a String to find in file. \r\n 3. select a type of search. \r\n 4. press submit button -  to start string seeking process in file. \r\n 5. click the properties button to view search result. \r\n \r\n you can locate the result files in the  nof  local folder. \r\n every search has his own result file. \r\n \r\n note: when exit the nof program all the temp files will be erased.");
		//		p.add(scroll);

		
		pane   = new JTextPane();
		pane.setText(getText());
		pane.setEditable(false);		
		scroll = new JScrollPane(pane);
		
		frame.getContentPane().add(scroll);  //.add(scrool);  //.add(scrool2);		
			
		//
		//frame listener (main-Frame)
		//		
		frame.addWindowListener(new WindowAdapter()
		{
			//Exit(0)
			public void windowClosing(WindowEvent w)
			{
				frame.dispose();
				//	log l = new log("event","menu-bar","Exit - have been pressed");
				//	erase del = new erase(StStr);
				//System.exit(0); // Exit Program
			}
		});

		
// Final form step.	
		//max size 800x600 = (800, 572)
		frame.setSize(800, 572); //MIN(546, 326)  //MAX(800, 572)
		frame.setVisible(true);
//		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	public static void main (String args [])
	{
		helps h = new helps();
	}	
}	
