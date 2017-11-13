package compares;

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
import javax.swing.JTextField;

import temp.OsInformation;

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
	
	private   JButton      btnSubmit         =   null; //Submit
	private   JButton      btnclean          =   null; //Clean Fields from text/data.
	private   JButton      btnExit           =   null; //exit program
	
	//file1 path
	private   JPanel        panelFileOpen =   null;
	private   String        current_path  =  "$HOME"; //"./"; 
	private   JFileChooser  fileopen      =   new JFileChooser(current_path);  //FullPath

	private   String        StSourceFileName1  =  null; 
	private   String        StSourceFileName2  =  null;
	
	private String userName = "";
	
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
		frameMain.setAlwaysOnTop(true);

		
		panelin = new JPanel();
		frameMain.getRootPane().add(panelin);
		panelin.setLayout(null);


		lblTitle = new JLabel("--");
		lblTitle.setBounds(18, 20, 400, 22);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 22));
		lblTitle.setToolTipText("Welcome title");
		panelin.add(lblTitle);


		// File #1
		lblFileName1 = new JLabel("#1:");
		lblFileName1.setBounds(10, 108, 20, 22);
		lblFileName1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFileName1.setToolTipText("please select the string that you wish to search the file for.");
		panelin.add(lblFileName1);

		
		// SelectFile - user manual Select //
		txtFileName1 = new JTextField("");
		txtFileName1.setBounds(166, 110, 350, 22); //y100
		txtFileName1.setFont(new Font("Dialog", Font.BOLD, 12));
		txtFileName1.setToolTipText("please select a source file, for the processing data job - manually.");
		panelin.add(txtFileName1);

		
		// SelectFile - Gui Select //
		selectFile1 = new JButton("select a file");
		selectFile1.setBounds(40, 108, 117, 25);
		selectFile1.setToolTipText("please select a source file, for the processing data job - automatically.");
		panelin.add(selectFile1);
		
		
				
		// File #2
		lblFileName2 = new JLabel("#2:");
		lblFileName2.setBounds(10, 168, 20, 22);
		lblFileName2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFileName2.setToolTipText("please select the string that you wish to search the file for.");
		panelin.add(lblFileName2);

		
		// SelectFile - user manual Select //
		txtFileName2 = new JTextField("");
		txtFileName2.setBounds(166, 170, 350, 22); //y100
		txtFileName2.setFont(new Font("Dialog", Font.BOLD, 12));
		txtFileName2.setToolTipText("please select a source file, for the processing data job - manually.");
		panelin.add(txtFileName2);

		
		// SelectFile - Gui Select //
		selectFile2 = new JButton("select a file");
		selectFile2.setBounds(40, 168, 117, 25);
		selectFile2.setToolTipText("please select a source file, for the processing data job - automatically.");
		panelin.add(selectFile2);
	
		
		// Button - btnSubmit //		
		btnSubmit = new JButton(".Submit.");
		btnSubmit.setBounds(199, 256, 117, 25); //399, 260, 117, 25
		btnSubmit.setToolTipText("Exit program, press this button -or- press alt+e.");
		panelin.add(btnSubmit);
		
		
		// Button - Exit //		
		btnExit = new JButton(".Exit.");
		btnExit.setBounds(399, 256, 117, 25); //399, 260, 117, 25
		btnExit.setToolTipText("Exit program, press this button -or- press alt+e.");
		panelin.add(btnExit);
	
		
		frameMain.getContentPane().add(panelin);

		frameMain.setSize(536, 326); //(536, 316) //800, 572 = full-screen
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
				int ret = fileopen.showDialog(panelFileOpen, "Select a file...");//"Open file"				


				if (ret == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();

					StSourceFileName2 = file.toString();
					txtFileName2.setText(StSourceFileName2);
				}
			}
		});
		

		
	

//		btnSubmit.addActionListener(new ActionListener( )
//		{
//		public void actionPerformed(ActionEvent ev)
//		{
//			System.out.println("");
//
//		}
//		});
		
	
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
	

	/**
	 *  main
	 */
	public static void main(String[] args) 
	{
//		viewExcel ge = new viewExcel();
//		OsInformation os = new OsInformation();		
	} //main



	

} //guiExcel Class
