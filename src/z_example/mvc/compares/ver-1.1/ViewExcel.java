package compares;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ViewExcel extends JFrame
{

	//Swing - Attributes / Gloable Varaible
	private   JFrame       frameMain         =   null; //frame
	private   JPanel       panelMain         =   null; //panel
	private   JPanel       panelin           =   null; //panel
	
	private   JLabel       lblTitle          =   null; //Title
	
	private   JLabel       lblFileName1      =   null; //file1
	private   JTextField   txtFileName1      =   null;
	private   JButton      selectFile1       =   null;
	
	private   JLabel       lblFileName2      =   null; //file2
	private   JTextField   txtFileName2      =   null;	
	private   JButton      selectFile2       =   null;	

	private   JScrollPane  scroll            =   null; //output scroll.
	private   JTextArea    txtSubmitResult   =   null; //output
	
	private   JButton      btnSubmit         =   null; //Submit
	private   JButton      btnclean          =   null; //Clean Fields from text/data.
	private   JButton      btnExit           =   null; //exit program
	
	//file1 path
	private   JPanel        panelFileOpen =   null;
	private   String        current_path  =  "$HOME"; //"./"; 
	//private   JFileChooser  fileopen      =   new JFileChooser(current_path);  //FullPath
	FileNameExtensionFilter fs =  new FileNameExtensionFilter("Excel", "xls", "xlsx");

	
	
	private   String        StSourceFileName1  =  null; 
	private   String        StSourceFileName2  =  null;

	private String currentTime = "";
	private String userName = "";
	private String stReport = "" ;   // Report.
	
	private static final String newLine = "\r\n"; //new-line
	

	public void ShowTimeAndMessage(String output)
	{
		frameMain.setTitle("searching...");		
		txtSubmitResult.setText("\n\n\n" + output + "\n" + output);
		frameMain.repaint();
	}

	public void getStReport() {		
		txtSubmitResult.setText("\n" + this.currentTime + "\n" + this.stReport + "\n" + this.currentTime);
		frameMain.setTitle("Excel...");
		frameMain.repaint();
	}
	
	

	public void setStReport(String stReport) {
		this.stReport = stReport;
	}
	
	
	//private OsInformation os = new OsInformation();	
	
	public JTextField getTxtFileName1() {
		return txtFileName1;
	}

	public JTextField getTxtFileName2() {
		return txtFileName2;
	}

	public String getUserName() {
		lblTitle.setText("Welcome Back,  " +this.userName);
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCurrentTime() {
		txtSubmitResult.setText(this.currentTime + "" + newLine + "Welcome Back,  " + this.userName + newLine);
		
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	
	
	//file #1 name
	public String getFileName1() {  
		return txtFileName1.getText();  
	}
	
	
	//file #2 name
	public String getFileName2() {  
		return txtFileName2.getText();  
	}
	
	

	/**
	 * guiExcel - constructor
	 */
	public ViewExcel() 
	{
		//if ther is time - create mvc program.
		//OsInformation os = new OsInformation();
		//setUserName(os.getUserId());
		
		
		//TODO: windows location (x,y)
		frameMain = new JFrame("Excel...");
		frameMain.setResizable(false);
		frameMain.setAlwaysOnTop(false);

		
		panelin = new JPanel();
		frameMain.getRootPane().add(panelin);
		panelin.setLayout(null);


		lblTitle = new JLabel("Welcome Back...");
		lblTitle.setBounds(14, 14, 400, 26);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 22));
		lblTitle.setToolTipText("Welcome title");
		panelin.add(lblTitle);


		// File #1
		lblFileName1 = new JLabel("#1:");
		lblFileName1.setBounds(10, 66, 20, 22);
		lblFileName1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFileName1.setToolTipText("please select the string that you wish to search the file for.");
		panelin.add(lblFileName1);

		
		// SelectFile - user manual Select //
		txtFileName1 = new JTextField("");
		txtFileName1.setBounds(166, 66, 550, 24); //y100
		txtFileName1.setFont(new Font("Dialog", Font.BOLD, 12));
		txtFileName1.setToolTipText("please select a source file, for the processing data job - manually.");
//		txtFileName1.setHorizontalAlignment(0);
		panelin.add(txtFileName1);

		
		// SelectFile - Gui Select //
		selectFile1 = new JButton("select a file");
		selectFile1.setBounds(40, 66, 117, 25);
		selectFile1.setToolTipText("please select a source file, for the processing data job - automatically.");
		panelin.add(selectFile1);
		
		
				
		// File #2
		lblFileName2 = new JLabel("#2:");
		lblFileName2.setBounds(10, 104, 20, 22);
		lblFileName2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFileName2.setToolTipText("please select the string that you wish to search the file for.");
		panelin.add(lblFileName2);

		
		// SelectFile - user manual Select //
		txtFileName2 = new JTextField("");
		txtFileName2.setBounds(166, 104, 550, 24); //y100
		txtFileName2.setFont(new Font("Dialog", Font.BOLD, 12));
		txtFileName2.setToolTipText("please select a source file, for the processing data job - manually.");
		panelin.add(txtFileName2);

		
		// SelectFile - Gui Select //
		selectFile2 = new JButton("select a file");
		selectFile2.setBounds(40, 104, 117, 25);
		selectFile2.setToolTipText("please select a source file, for the processing data job - automatically.");
		panelin.add(selectFile2);
	

		//JTextArea + JScrollPane
		txtSubmitResult = new JTextArea();
		txtSubmitResult.setEditable(true);
		txtSubmitResult.setText("welcome \r\n.\r\n.");
		txtSubmitResult.setBackground(Color.black);
		txtSubmitResult.setForeground(Color.white);
		Font font = new Font("", Font.BOLD, 14);
		txtSubmitResult.setFont(font);
		//txtSubmitResult.setBounds(10, 140, 506, 200);
		//panelin.add(txtSubmitResult);
		
		scroll = new JScrollPane(txtSubmitResult);
		scroll.setBounds(10, 140, 705, 300);
		panelin.add(scroll);
		
		
		
		// Button - btnSubmit //		
		btnSubmit = new JButton(".Submit.");
		btnSubmit.setBounds(10, 456, 117, 25); //399, 260, 117, 25
		btnSubmit.setToolTipText("Exit program, press this button -or- press alt+e.");
		panelin.add(btnSubmit);

		
		
		// Button - btnclean //		
		btnclean = new JButton(".clean.");
		btnclean.setBounds(464, 456, 117, 25); //399, 260, 117, 25
		btnclean.setToolTipText("Clean all field in this window");
		panelin.add(btnclean);		
		
		
		
		// Button - Exit //		
		btnExit = new JButton(".Exit.");
		btnExit.setBounds(598, 456, 117, 25); //399, 260, 117, 25
		btnExit.setToolTipText("Exit program, press this button -or- press alt+e.");
		panelin.add(btnExit);
	
		
		frameMain.getContentPane().add(panelin);
		//x,y
		frameMain.setSize(736, 526); //(536, 316) //800, 572 = full-screen
		frameMain.setVisible(true);
		frameMain.setDefaultCloseOperation(frameMain.DO_NOTHING_ON_CLOSE); // EXIT_ON_CLOSE);



		/***
		 * [hotKeys (Alt + *)]------------------------------------------
		 */
		
		btnExit.setMnemonic(KeyEvent.VK_E); //alt+e = exit		
		
		
		
		/***
		 * [Listener--Frm1BtnExit--(Exit program)--]------------------------------------------ 
		 */
		btnExit.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				ExitProc();
			}
		});
				
			
		
		//
		//[Listener--Frm1SelectFile--(Select File Button)--]------------------------------------------
		//			
		selectFile1.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				JFileChooser  fileopen    =   new JFileChooser(current_path);  //FullPath
				fileopen.addChoosableFileFilter(null);				
				fileopen.addChoosableFileFilter(fs);
				
					
				int ret = fileopen.showDialog(panelFileOpen, "Select a file...");//"Open file"				
   			    
   			

				if (ret == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();

					StSourceFileName1 = file.toString();
					txtFileName1.setText(StSourceFileName1);
				}
			}
		});
		

		
		selectFile2.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				JFileChooser  fileopen      =   new JFileChooser(current_path);  //FullPath
				fileopen.addChoosableFileFilter(null);				
				fileopen.addChoosableFileFilter(fs);

				int ret = fileopen.showDialog(panelFileOpen, "Select a file...");//"Open file"				
					

				if (ret == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();

					StSourceFileName2 = file.toString();
					txtFileName2.setText(StSourceFileName2);
				}
			}
		});
		

		
		btnclean.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				txtFileName1.setText("");
				txtFileName2.setText("");
				txtSubmitResult.setText("");
			}
		});
		
		
	
}	// constructor
	
	
	/*
	 * exit program windows (Are you sure: yes/no)
	 */
	private void ExitProc()
	{
		int n = JOptionPane.showConfirmDialog(
				frameMain ,
			    "EXIT Program  ???",
			    "--Excel--",
			    JOptionPane.YES_NO_OPTION);
		
		//user pressed result.
		switch (n) 
		{
		case 0:  //yes

			frameMain.dispose();
			System.exit(0); // Exit Program
			
			break;
		case 1:  //no
			break;
		}
		
	}

 
	//general listener
	void addCalculateListener (ActionListener listenForCalcButton) 
	{
		btnSubmit.addActionListener(listenForCalcButton); //btnSubmit listener.
	}
} //guiExcel Class

//סוף