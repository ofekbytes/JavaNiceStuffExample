package z_example.old.hd;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class snr 
{

	private String StSourceFileName = null;
	private String StTargetFileName = null;
	private String StSourceString = null;
	private String StTargetString = null;

	private String     str          = null;
	private String     StrNew       = null;
	private String[]   StStrSplit   = null;
	private int        index            = 0;
	private int        intTotalMatches  = 0;
	private int        intTotalLines    = 0;


	//file choser
//	private   JFileChooser   fileopen   =   new JFileChooser();


	//Gui - Variable
	private   JFrame       frmSnr          =   null;   //frame
//	private   JPanel       panel                =   null;
	private   JPanel       jpfrm1               =   null;

//	private   JButton      Frm1SelectFile       =   null;
	
	
	private   JLabel       frm1lblSourceFile   =   null;
	private   JTextField   frm1txtsourceFile   =   null;
	
	private   JLabel       frm1lblDestFile   =   null;
	private   JTextField   frm1txtDestFile   =   null;
	
//	private   JLabel       frm1lblSelectFile   =   null;	
//	private   JTextField   frm1txtSelectFile    =   null;
	
	private   JLabel       frm1lblStringSeek   =   null;
	private   JTextField   frm1txtStringSeek   =   null;

	private   JLabel       frm1lblStringReplace   =   null;
	private   JTextField   frm1txtStringReplace   =   null;


	
	private   log       l    = null; //log
	
	
	//
	//exit NOF software (yes/no)
	private void ExitProc()
	{
/*		int n = JOptionPane.showConfirmDialog(
				frmSnr ,
				"EXIT  SNR  FreeWare  ???",
				"--SNR--",
				JOptionPane.YES_NO_OPTION);

		//user pressed result.
		switch (n) 
		{
		case 0:  //yes

			frmSnr.dispose();
			l = new log("snr","Close Snr","Exit Pressed - snr closed.");
			//System.exit(0); // Exit Program

			break;
		case 1:  //no
			break;
		}*/

		frmSnr.dispose();
		l = new log("snr","Close Snr","Exit Pressed - snr closed.");
	}

	public snr()
	{
		frmSnr = new JFrame("SNR...");
		//frmSnr.setResizable(false);
		frmSnr.setIconImage(Toolkit.getDefaultToolkit().getImage(nof.class.getResource("/icons/star.jpg")));


		jpfrm1 = new JPanel();
		frmSnr.getRootPane().add(jpfrm1);
		jpfrm1.setLayout(null);
		
	/*	JPanel jpfrm1 = new JPanel(); //****
		JScrollPane scroll3 = new JScrollPane(jpfrm1); //****
		jpfrm1.add(scroll3); //****
		*/


		// SelectFile - Gui Select //
/*		Frm1SelectFile = new JButton("select a file");
		Frm1SelectFile.setBounds(12, 20, 117, 25);
		Frm1SelectFile.setToolTipText("please select a source file, for the processing data job - automatically.");
		jpfrm1.add(Frm1SelectFile);
*/
		
		// Display - StringSeek //
		frm1lblSourceFile = new JLabel("Source File Name : ");
		frm1lblSourceFile.setBounds(18, 20, 110, 22);
		frm1lblSourceFile.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1lblSourceFile.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1lblSourceFile);	

		// SelectFile - user manual Select //
		frm1txtsourceFile = new JTextField("");
		frm1txtsourceFile.setBounds(150, 20, 366, 22); //y100
		frm1txtsourceFile.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtsourceFile.setToolTipText("please select a source file, for the processing data job - manually.");
		jpfrm1.add(frm1txtsourceFile);


		// Display - StringSeek //
		frm1lblDestFile = new JLabel("Dest File Name : ");
		frm1lblDestFile.setBounds(18, 60, 110, 22);
		frm1lblDestFile.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1lblDestFile.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1lblDestFile);

		
		// StringSeek - user manual Select //
		frm1txtDestFile = new JTextField();
		frm1txtDestFile.setBounds(150, 60, 366, 22);
		frm1txtDestFile.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtDestFile.setText(null);
		frm1txtDestFile.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1txtDestFile);
		
		
		// Display - StringSeek //
		frm1lblStringSeek = new JLabel("Seek a String : ");
		frm1lblStringSeek.setBounds(18, 100, 110, 22);
		frm1lblStringSeek.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1lblStringSeek.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1lblStringSeek);

		
		// StringSeek - user manual Select //
		frm1txtStringSeek = new JTextField();
		frm1txtStringSeek.setBounds(150, 100, 366, 22);
		frm1txtStringSeek.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtStringSeek.setText(null);
		frm1txtStringSeek.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1txtStringSeek);
		
		
		// Display - StringReplace //
		frm1lblStringReplace = new JLabel("Seek a String : ");
		frm1lblStringReplace.setBounds(18, 140, 110, 22);
		frm1lblStringReplace.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1lblStringReplace.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1lblStringReplace);

		
		// StringSeek - user manual Select //
		frm1txtStringReplace = new JTextField();
		frm1txtStringReplace.setBounds(150, 140, 366, 22);
		frm1txtStringReplace.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtStringReplace.setText(null);
		frm1txtStringReplace.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1txtStringReplace);
		
				

		//
		//[hotKeys (Alt + *)]------------------------------------------
		//

		/*		rbfull.setMnemonic(KeyEvent.VK_1);
		rbFromTo.setMnemonic(KeyEvent.VK_2);
		rbFromToEndOfSeekString.setMnemonic(KeyEvent.VK_3);
		rbfromToEnd.setMnemonic(KeyEvent.VK_4);


		Frm1Butclean.setMnemonic(KeyEvent.VK_C);
		Frm1Butsubmit.setMnemonic(KeyEvent.VK_S);
		Frm1BtProperties.setMnemonic(KeyEvent.VK_P);
		Frm1BtnExit.setMnemonic(KeyEvent.VK_E);
		 */
		//Frm1SelectFile.setMnemonic(KeyEvent.VK_F);	



		//
		//[Listener--frmSnr--(main-Frame)+(erase * out.file) + (Exit(0))--]------------------------------------------
		//
		frmSnr.addWindowListener(new WindowAdapter()
		{
			//Exit(0)
			public void windowClosing(WindowEvent w)
			{
				/*
				frmSnr.dispose();
				l = new log("event","menu-bar","Exit - have been pressed");
				erase del = new erase(StStr);
				System.exit(0); // Exit Program
				 */
				ExitProc();
			}
		});


		//
		//[Listener--Frm1BtnExit--(Exit program)--]------------------------------------------
		//	
		/*		Frm1BtnExit.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{

				frmSnr.dispose();
				l = new log("event","menu-bar","Exit - have been pressed");
				erase del = new erase(StStr);
				System.exit(0); // Exit Program

				ExitProc();
			}
		});
		 */

		//
		//[frmSnr--adding--(mbar,jpfrm1) + size + visible + order-by--]------------------------------------------
		//	

		frmSnr.getContentPane().add(jpfrm1);

		frmSnr.setSize(536, 316); //800, 572 = full-screen
		frmSnr.setVisible(true);
		frmSnr.setDefaultCloseOperation(frmSnr.DO_NOTHING_ON_CLOSE); // EXIT_ON_CLOSE);
		//
		//Order By Tab/s.Tab
		//frmSnr.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Frm1SelectFile, frm1txtSelectFile, frm1txtStringSeek1, rbfull, rbFromTo, rbFromToEndOfSeekString, rbfromToEnd, frm1txtfromchar, frm1txttochar, Frm1Butsubmit, Frm1Butclean, Frm1BtProperties, Frm1BtnExit}));




	}

	//
	//	
	private void TragetFile(String NewLineToAdd)
	{
		//	String StTargetFileName = "./FileTmp_" + Search + ".nof";

		//	l = new log("data","<"+Search+">","<"+StTargetFileName+">"+ "~~~>   " + NewLineToAdd);

		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(StTargetFileName, true));

			//TODO 'switch-case' instead of 'if'
			//		if (os == 0)
			//		{
			//out.write("\n\r" + NewLineToAdd + "\n\r"); //"\n\r"
			out.write(NewLineToAdd + "\r"); //"\r\n"
			//System.out.println("=nof=os-"+os);
			//		}

			//		if (os == 1)
			//		{
			//			out.write(NewLineToAdd + "\n");
			//			//System.out.println("=nof=os-"+os);
			//		}

			out.close();
		}
		catch (IOException e)
		{
			//TODO
			//			JOptionPane.showMessageDialog(frmSnr ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);			
			//			l = new log("warning","File","<"+StSourceFileName+">"+ " Not Exist, Please Select Another File. " + e); //info
			System.out.println("Error" + e.getMessage());

		}	
	}

	//
	//
	private void SourceFile()
	{

		try
		{
			this.str    = null;
			this.StrNew = null;

			BufferedReader in = new BufferedReader(new FileReader(this.StSourceFileName));
			while ((this.str = in.readLine()) != null)
			{
				if (str.toLowerCase().matches(".*"+this.StSourceString+".*") == true)
				{
					System.out.println(this.str);
					intTotalMatches++;	

					this.StrNew = str.toLowerCase().replaceAll(this.StSourceString, this.StTargetString);
					//System.out.println(this.StrNew);
				}
				else
				{
					this.StrNew = this.str;					
				}

				TragetFile(this.StrNew);

				intTotalLines++;
				/*				for(index=0; index < StStrSplit.length ; index++)
				{
					if (str.toLowerCase().matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
					{
						System.out.println(this.str);
			//			intTotalMatches++;
			//			intToatalperSearch[index] = intToatalperSearch[index] + 1;
			//			fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
					}	
				}*/
			}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());	

		}
	}

	
	public void setParametersGui()
	{
		frm1txtsourceFile.setText(this.StSourceFileName);
		frm1txtDestFile.setText(this.StTargetFileName);
		frm1txtStringSeek.setText(this.StSourceString);
		frm1txtStringReplace.setText(this.StTargetString);
	}
	
	//
	//	
	public void setParameters(String StSourceFN, String StSS)
	{
		this.intTotalMatches = 0;
		this.intTotalLines = 0;	

		this.StSourceFileName = StSourceFN;              //"c:\\PM18.20130430.161400_01.txt"; //   "c:\\temp1.txt";
		this.StTargetFileName = StSourceFN + ".txt" ;   //"c:\\temp1_out.csv";

		this.StSourceString = StSS; //";";
		this.StTargetString = null;

		this.str    = null;
		this.StrNew = null;
	}

	//
	//	
	public void getparameters()
	{
		System.out.println("");
		System.out.println("--[Result]-- ");
		System.out.println("");
		System.out.println("File Name Source: " + this.StSourceFileName);
		System.out.println("File Name Target: " + this.StTargetFileName);
		System.out.println("String Source   : " + this.str);
		System.out.println("String Traget   : " + this.StrNew);		
		System.out.println("Total    Matches: " + this.intTotalMatches);
		System.out.println("Total      Lines: " +  this.intTotalLines);
	}

	//
	//
	private void Help()
	{
		System.out.println("");
		System.out.println("---[Help]---");
		System.out.println("");		
		System.out.println("<snr>  <source_file>  <traget_file>  <source_replace>  <target_replace>");
		System.out.println("");
	}


	private void JobStart(String[] args)
	{
		/*		System.out.println("Read parameters");
		if (args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
			   System.out.println(args[i]);				   
			}
		}
		else
		{
			Help();
		}*/

		
		
		//setParameters();
		getparameters();

	//	SourceFile();

//		getparameters();		
	}

	//
	//
	public static void main(String[] args) 
	{

		snr s = new snr();

//		s.JobStart(args);
		//s.Gui();
	}
}

