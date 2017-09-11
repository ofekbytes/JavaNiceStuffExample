package z_example.old.hd;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;



public class view //extends JFrame 
{
	private   JFrame        frame        =   null ;
	private   JToolBar      bar          =   null ;	
    private   JTextArea     ta           =   null ;
	private   JPanel        jpfrm1       =   null ;
	private   String        StLine       =   ""   ;
	private   BorderLayout  bord         =   null ; 
	private   JScrollPane   scroll       =   null ;
	
	
	private   JButton      viewButtonPageTop   =   null ;	
	private   JButton      viewButtonPageMid   =   null ;
	private   JButton      viewButtonPageBot   =   null ;	
	
	private   JButton      viewButtonPageUp    =   null ;
	private   JButton      viewButtonPageDown  =   null ;	
	
	//private   ImageIcon    image1            =   null ;
	//private   ImageIcon    image2            =   null ;
	//private   ImageIcon    image3            =   null ;
	//private   ImageIcon    image4            =   null ;	
	
	//TODO more button:  search, file read from line + buffer 
	private   JButton      viewButtonClose    =   null ;	
	
	private   log       l    = null; //log	

	
	//get/set element
	private   String     StSourceFileName  =  null ;
	private   long       lng_cur_min       =  0    ; //buffer from
	private   long       lng_cur_max       =  0    ; //buffer to
	private   long       lng_Buffer_size   =  0    ; //== user (from -> to)
	private   long       lng_file_min      =  0    ; //== 1
	private   long       lng_file_mid      =  0    ; //== lng_file_max / 2
	private   long       lng_file_max      =  0    ; //== eof	
	
	//check min/max value.
	private void fn_check_value()
	{
		//if cur_min < file_min then cur_min = file_min;
		//if cur_max > file_max then cur_max = file_max;		
	}
	
	
	//set file parameters.
	private void setParameters()
	{
		//file_name + path
		//cur_min = 0 
		//cur_max = 0
		//Buffer_size = 500
		//file_min = 1 (bof/default)
		//file_mid = file_max / 2
		//file_max = eof
		System.out.println("parameters");
	}

	
	//[setText], Add line to text "this.StLine"------------------------------------------
	// 
	private void setText(String StText)
	{
		this.StLine = this.StLine + StText;
	}
	

	//[getText], Add line from text "this.StLine"------------------------------------------
	// 
	private String getText()
	{
		return StLine;
	}
	

	//[SetManPages], Fixed Man Pages (del.me)------------------------------------------
	//
	private void SetManPages()
	{	
		//check if man_page exist --else-- prisent this.
		String nr = "\r\n";
		setText(nr + " ==[ H E L P ** ]== " + nr + "" + nr);
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

	//[view], Exit view window------------------------------------------
	//	
	private void Exit_View()
	{
		l = new log("event","view","view window is now closed");
		frame.dispose();		
	}
	
	//[view], GUI MAIN MENU + Listner------------------------------------------
	//
	public view() 
	{	
		//read manual
		SetManPages();

		frame = new JFrame("..view...");
		frame.setResizable(true);		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(nof.class.getResource("/icons/yamon.jpg")));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//.EXIT_ON_CLOSE);

		jpfrm1 = new JPanel();
		frame.getRootPane().add(jpfrm1);
		jpfrm1.setLayout(null);

		
       //image1 = new ImageIcon("pgup.jpg");  
       //viewButtonPageTop = new JButton(" head ",image1);
       //viewButtonPageTop = new JButton(" head ",new ImageIcon(view.class.getResource("/icons/pgup.jpg")));
       viewButtonPageTop = new JButton("TOP");
       viewButtonPageTop.setToolTipText("read from Top file");

       
       //image2 = new ImageIcon("icons/pgdown.jpg"); 
       viewButtonPageMid = new JButton("MID");
       viewButtonPageMid.setToolTipText("read from MID file");       

       
      // image3 = new ImageIcon("icons/nof.jpg");
       viewButtonPageBot = new JButton("BOT");
       viewButtonPageMid.setToolTipText("read from BOT file");       

       
       viewButtonPageUp = new  JButton("PgUp");
       viewButtonPageUp.setToolTipText("Page Up - read buffer line up");
       
       
       viewButtonPageDown = new  JButton("PgUp");
       viewButtonPageDown.setToolTipText("Page Up - read buffer line up");
       
       
       
      // image4 = new ImageIcon("icons/go.jpg");
       viewButtonClose = new JButton("Close");
       viewButtonPageMid.setToolTipText("Exit Current Window");       
       	         
       bar = new JToolBar();        
       bar.setToolTipText("Tool Bar");
       
       
       bar.add(viewButtonPageTop);
       bar.add(viewButtonPageMid);
       bar.add(viewButtonPageBot);
       bar.add(viewButtonPageUp);
       bar.add(viewButtonPageDown);       
       bar.add(viewButtonClose);
       
       
       //text erea with scrollpane
       ta = new JTextArea(8,40);
       scroll = new JScrollPane(ta);
       
       //border - add 2 windows to 1
       bord = new BorderLayout();
       jpfrm1.setLayout(bord);
       
	   //toolbar + text erea
	   jpfrm1.add("North",bar); //ta
	   jpfrm1.add("Center",scroll);				
		
	   ta.setText(getText());
		

		//
		//[hotKeys (Alt + *)]------------------------------------------
		//	
		viewButtonClose.setMnemonic(KeyEvent.VK_C);   //close 
		viewButtonPageTop.setMnemonic(KeyEvent.VK_T); //top
		viewButtonPageMid.setMnemonic(KeyEvent.VK_M); //mid
		viewButtonPageBot.setMnemonic(KeyEvent.VK_B); //bot
		
		

		//
		//[listers]------------------------------------------
		//
	
		
		//
		//[Listener--viewButtonClose--(Close Current Window)--]------------------------------------------
		//			
		viewButtonClose.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				Exit_View();
				
				//l = new log("event","view","view window is now closed");
				//frame.dispose();
				//log l = new log("event","menu-bar","Exit - have been pressed"); //exit Frame view (current-window)			
				//System.exit(0); // Exit Program
			}
		});
		

		//
		//frame listener (view)
		//		
		frame.addWindowListener(new WindowAdapter()
		{
			//Exit(0)
			public void windowClosing(WindowEvent w)
			{				
				Exit_View();
				
				//l = new log("event","view","view window is now closed");
				//frame.dispose();				
				//	log l = new log("event","menu-bar","Exit - have been pressed");
				//	erase del = new erase(StStr);
				//System.exit(0); // Exit Program
			}
		});
		
		
// Final form step.
		frame.getContentPane().add(jpfrm1);
		
		//frame.setSize(546, 326); //540, 390
		frame.setSize(800, 572); //MIN(546, 326)  //MAX(800, 572)		
		frame.setVisible(true);
//		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	
/*	public static void main (String args [])
	{
		//System.out.println(System.getProperty("user.dir")); 
		view h = new view();
	}
*/	
	
}	


/*

(BOF)==(0)-------(500)-------(1000)-------(1500)==(EOF)

0..500 
cur_min = 0 
cur_max = 0
Buffer_size = 500

file_min = 0
file_mid = max / 2 
file_max = eof 


fn_read_file(long min, long max)
{
   if min = 0 then 
      continue();
   else
   
   loop until cur_min. 
}
  read file


fn_check_file_limit() -->
if cur_min < file_min then cur_min = file_min
if cur_max > file_max then cur_max = file_max

[PgUp] -->
cur_min = cur_min - Buffer_size
cur_max = cur_min + Buffer_size

[PgDown] -->
cur_min = cur_min + buf_size
cur_max = cur_min + buf_size

[fn_set_parameters]
st_file_name = filename
cur_min = 0 
cur_max = 0
Buffer_size = buff_size;

file_min = 0
file_mid = max / 2 
file_max = file_max_line;

[fn_view_start] --->
nof().button --> view(filename, file_max_line, buff_size)
fn_set_parameters
fn_read_file 
  
[Top] -->
[Mid] -->
[Bot] -->
*/

