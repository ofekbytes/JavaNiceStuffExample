package z_example.old.hd;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//import org.eclipse.wb.swing.FocusTraversalOnArray;



public class nof 
{
	private   String[ ]    fileItems = new String[ ] { "Help", "About",  "Exit" };

	private   String     StSourceFileName = null;   //(Frm1SelectFile) -- Auto Select File 

	private   String     StStr          = null;     //source
	private   String[]   StStrSplit;                //target - array
	private   String     delimiter      = ",";      //delimiter for breaking the string


	//result
	private   long      intTotalLineNumber   = 0;
	private   long      intTotalCharInFile   = 0;
	private   long      intTotalMatches      = 0;
	private   long []   intToatalperSearch   = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//array (5 + 40).
  private ArrayList<Long> ALngToatalperSearch = new ArrayList();
	
	//fnOsProperty
	//private   long      intFileSize          = 0; //log
	private   long        intFileSize          = 0; //log	
	private   double      intFileSizeKB        = 0;
	private   double      intFileSizeMb        = 0;
	private   double      intFileSizeGB        = 0;
	private   SimpleDateFormat     sdf       = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private   String    strFilelastModified  = "";
	
	
	private   int       intSeekType          = 1; //which radio buttun.	
	
	
	//file choser
	private   String         current_path  =  "$HOME"; //"./"; 
//	private   JFileChooser   fileopen   =   new JFileChooser(current_path);  //FullPath
	private   JFileChooser   fileopen   =   new JFileChooser(current_path);  //FullPath

	//Gui - Variable
	private   JFrame       frame                =   null;
	private   JPanel       panel                =   null;

	private   JMenuBar     mbar                 =   null;
	private   JMenu        fileMenu             =   null;
	private   JMenuItem    item                 =   null;

	private   JPanel       jpfrm1               =   null;

	private   JTextField   frm1txtSelectFile    =   null;
	private   JLabel       frm1lblStringSeek1   =   null;

	private   JButton      Frm1SelectFile       =   null;
	private   JButton      Frm1BtResult         =   null;
	private   JButton      Frm1BtOsProperty     =   null; //TODO
	private   JButton      Frm1BtFileViewer     =   null; //TODO	
	private   JButton      Frm1BtnExit          =   null;
	private   JButton      Frm1Butclean         =   null;

	private   JButton      Frm1ButFind          =   null;
	private   JButton      Frm1ButSNR           =   null;	

	private   JTextField   frm1txtStringSeek1   =   null;


	//Radio Button
	private   JRadioButton   rbfull                    =   null; //full record/line
	private   JRadioButton   rbFromTo                  =   null; //from min_char_number_position -> max_char_number_position
	private   JRadioButton   rbFromToEndOfSeekString   =   null; //from min_char_number_position --> count(seeksting);
	private   JRadioButton   rbfromToEnd               =   null; // from this char_number_position -> till max of the record/line

	private    JLabel        frm1lblfromchar           =   null;
	private    JTextField    frm1txtfromchar           =   null;
	private    JLabel        frm1lbltochar             =   null;
	private    JTextField    frm1txttochar             =   null;


	private   String        StSerachFull               =   "search_all";
	private   String        StrbFromTo                 =   "search_x..y";
	private   String        StFromToEndOfSeekString    =   "search_x..count(y)";
	private   String        StFromToEnd                =   "search_x..eol";
	private   ButtonGroup   grpSearch                  =   null;

	//file read
	private   String   str   =   null;

	//result enable_true/false
	private   boolean  blresult = false;

	//****

	//private   JProgressBar   pbRR;

	static    long   minlf   =   0;  // read file - min line(in file).
	static    long   maxlf   =   0;	 // read file - max line(in file).
	static    long   currif  =   0;  // current record (line number)
	private   long   curper  =   0;  // current pecent (line percent number)
	private   long   preper  =   0;  // preper if priv = curper (if curper > preper then update view).

	static   pbar    spb     =   null;

	//TODO os auto-detect
	public static  int  os   =   0  ;  //0=windows;1=linux;

	private   log       l    = null; //log





	//
	//---[setRadioButtonSelection]---------------------------------
	//			
	private void setRadioButtonSelection(int intCase)
	{
		rbfull.setFont(new Font("Arial", Font.PLAIN, 11));
		rbFromTo.setFont(new Font("Arial", Font.PLAIN, 11));
		rbFromToEndOfSeekString.setFont(new Font("Arial", Font.PLAIN, 11));
		rbfromToEnd.setFont(new Font("Arial", Font.PLAIN, 11));

		switch (intCase)
		{
		case 1:
			rbfull.setFont(new Font("Arial", Font.BOLD, 11));
			break;
		case 2:
			rbFromTo.setFont(new Font("Arial", Font.BOLD, 11));
			break;
		case 3:
			rbFromToEndOfSeekString.setFont(new Font("Arial", Font.BOLD, 11));
			break;
		case 4:
			rbfromToEnd.setFont(new Font("Arial", Font.BOLD, 11));
			break;
		}
	}


	//
	//---[SetVisibleOnOff]---------------------------------
	//		
	private void SetVisibleOnOff(int intValue)
	{
		switch (intValue)
		{
		case 0: //off
			frame.setEnabled(false);
			Frm1SelectFile.setEnabled(false);
			frm1txtSelectFile.setEnabled(false);
			frm1txtStringSeek1.setEnabled(false);
			Frm1ButFind.setEnabled(false);
			Frm1ButSNR.setEnabled(false);
			Frm1BtFileViewer.setEnabled(false);
			Frm1BtOsProperty.setEnabled(false);
			Frm1Butclean.setEnabled(false);
			Frm1BtResult.setEnabled(false);
			Frm1BtnExit.setEnabled(false);
			frm1lblStringSeek1.setEnabled(false);
			rbfull.setEnabled(false);
			rbFromTo.setEnabled(false);
			rbFromToEndOfSeekString.setEnabled(false);
			rbfromToEnd.setEnabled(false);
			frm1lblfromchar.setEnabled(false);
			frm1lbltochar.setEnabled(false);
			frm1txtfromchar.setEnabled(false);
			frm1txttochar.setEnabled(false);
			fileMenu.setEnabled(false);			
			frame.update(frame.getGraphics());
			break;
		case 1: //on
			frame.setEnabled(true);
			Frm1SelectFile.setEnabled(true);
			frm1txtSelectFile.setEnabled(true);
			frm1txtStringSeek1.setEnabled(true);
			Frm1ButFind.setEnabled(true);
			Frm1ButSNR.setEnabled(true);
			Frm1BtFileViewer.setEnabled(true);
			Frm1BtOsProperty.setEnabled(true);			
			Frm1Butclean.setEnabled(true);
			Frm1BtResult.setEnabled(true);
			Frm1BtnExit.setEnabled(true);
			frm1lblStringSeek1.setEnabled(true);
			rbfull.setEnabled(true);
			rbFromTo.setEnabled(true);
			rbFromToEndOfSeekString.setEnabled(true);
			rbfromToEnd.setEnabled(true);
			frm1lblfromchar.setEnabled(true);
			frm1lbltochar.setEnabled(true);
			frm1txtfromchar.setEnabled(true);
			frm1txttochar.setEnabled(true);
			fileMenu.setEnabled(true);
			frame.update(frame.getGraphics());
			break;		
		}		
	}


	//
	//---[SetVisibleAction]---------------------------------
	//	
	private void SetVisibleAction(int intValue)
	{
		switch (intValue)
		{
		case 1:
			frm1lblfromchar.setVisible(false);
			frm1txtfromchar.setVisible(false);
			frm1lbltochar.setVisible(false);
			frm1txttochar.setVisible(false);
			frm1txtfromchar.setText("");
			frm1txttochar.setText("");
			break;
		case 2:
			frm1lblfromchar.setVisible(true);
			frm1txtfromchar.setVisible(true);
			frm1lbltochar.setVisible(true);
			frm1txttochar.setVisible(true);
			frm1txtfromchar.setText("");
			frm1txttochar.setText("");
			break;
		case 3:
		case 4:
			frm1lblfromchar.setVisible(true);
			frm1txtfromchar.setVisible(true);
			frm1lbltochar.setVisible(false);
			frm1txttochar.setVisible(false);
			frm1txtfromchar.setText("");
			frm1txttochar.setText("");
			break;
		}
	}


	//
	//---[check_file_status]---------------------------------
	//	
	// check if file or folder
	public boolean check_file_status(String StTextFileName) throws Exception
	{
		//try
	//	{
			File file = new File(StTextFileName);

			if (file.exists() == false)
			{
			   JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);
  			   l = new log("warning","File","<"+StSourceFileName+">"+ " Not Exist, Please Select Another File ."); //info
  			   return false;
			}
			else
			{
			   l = new log("info","File","<"+StSourceFileName+">" + " Exist");			   
			}
			
			
			if (file.isDirectory() == true)
			{
				JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);			
				l = new log("warning","File","<"+StTextFileName+">"+ " is not a File, Please Select Another File ." );				
				return false;
			}
			else
			{
				//File Exist + is a file.
				return true;
			}

/*			str = null;
			BufferedReader in = new BufferedReader(new FileReader(StTextFileName));
			

			while ((str = in.readLine()) != null)
			{
				intTotalLineNumber++;
				intTotalCharInFile = intTotalCharInFile + str.length();
			}
			in.close();
		}
		catch (IOException e)
		{
			//l = new log("warning","File","<"+StTextFileName+">"+ " is not a File, Please Select Another File " + e + "." );
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);			
			l = new log("warning","File","<"+StTextFileName+">"+ " is not a File, Please Select Another File ." );
			
			return false;
		}
*/
				
//		return true;
	}

	
	//
	//---[fnOsProperty]---------------------------------
	//
	public void fnOsProperty(String StTextFileName) throws Exception
	{
		l = new log("info","OS Calculating", " " + frm1txtSelectFile.getText().toString() + "");

		//set default
		intFileSize          = 0;
		intFileSizeKB        = 0;
		intFileSizeMb        = 0;
		intFileSizeGB        = 0;
		
		// File Size (byte / KB / MB / GB).
		File fs = new File(StTextFileName);
		intFileSize = fs.length();

	//	System.out.println("---+++" + intFileSize + " byte");
	
		
		if (intFileSize > 0) 
		{
		    if ((intFileSize / 1024) > 0)
		    {
		    	intFileSizeKB = (intFileSize   / 1024);   //KB - KiloByte
		    }
		    
		    if (((intFileSize / 1024) / 1024) > 0)
		    {
		    	intFileSizeMb = ((intFileSize / 1024) / 1024);
		    }

		    if ((((intFileSize / 1024) / 1024) / 1024) > 0)
		    {
		    	intFileSizeGB = (((intFileSize / 1024) / 1024) / 1024);
		    }

		    
		    //intFileSizeGB
		}			

		
		//*****del.me---test only
		// DecimalFormat df = new DecimalFormat("#.##");
	    //   System.out.print(df.format(d));

		
/*		// Min File Size Assign    //remark ??
		if (intFileSize == 0)
			intFileSize = 1;
*/

		
		l = new log("info","File size", " <" + intFileSize   + " Byte>  <" 
				                            + intFileSizeKB + " KB>  <"
					                        + intFileSizeMb + " MB>  <"
					                        + intFileSizeGB + " GB> "				                            
				                            + "");
		
	//	System.out.println("++++++" + intFileSize + " Byte");
		
		
		
		// File - Date - Last Modified.		
		strFilelastModified = sdf.format(fs.lastModified());
		l = new log("info","File last modified", " " + strFilelastModified + "");
		
		// DF - 
		
		// File Permission: (rwx)

		
	}
	 
	
	
	//
	//---[fnReadTextFileProperty/ies]---------------------------------
	//
	public int fnReadTextFileProperties(String StTextFileName) throws Exception
	{
		intTotalLineNumber = 0;
		intTotalCharInFile = 0;
		//intFileSize = 0;


		l = new log("info","File Calculating", " " + frm1txtSelectFile.getText().toString() + "");

		pbar spb2 = new pbar();
		spb2.setStatus(0, 100, 0); //min,max,cur
		spb2.pbStart();
		spb2.setCurValue(0);
		spb2.label.setText("Calculating...");
		//spb.pb.setVisible(false);
		spb2.frame.update(spb2.frame.getGraphics());
		frame.update(frame.getGraphics());

		try
		{
			str = null;
			BufferedReader in = new BufferedReader(new FileReader(StTextFileName));

			while ((str = in.readLine()) != null)
			{				
				intTotalLineNumber++;
				intTotalCharInFile = intTotalCharInFile + str.length();
			}
			in.close();
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);
			l = new log("warning","File","<"+StTextFileName+">"+ " Not Exist, Please Select Another File " + e + "." );
			spb2.setCurValue(100);
			spb2.frame.dispose();
			return 1;
		}

		maxlf = intTotalLineNumber;

		spb2.setCurValue(100);
		spb2.frame.dispose();


		//System.out.println(" **********~~~~ " + intTotalLineNumber + " ~~~~ " + intTotalCharInFile + " ~~~~ " + intFileSize);
		return 0;
	}


	//
	//---[fnWriteResultToTextFile]---------------------------------
	//
	private void fnWriteResultToTextFile(long SearchFileIndex, String NewLineToAdd, int Search) throws Exception
	{
		
		String StTargetFileName = "./Tmp_OutPut_" + Search + ".nof";

		l = new log("data","<"+Search+">","<"+StTargetFileName+">"+ "~~~>   " + NewLineToAdd);
		
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(StTargetFileName, true));

			//TODO 'switch-case' instead of 'if'
			if (os == 0)
			{
				//out.write("\n\r" + NewLineToAdd + "\n\r"); //"\n\r"
				out.write(NewLineToAdd + "\r\n"); //"\r\n" (return+new_line)				
				//System.out.println("=nof=os-"+os);
			}

			if (os == 1)
			{
				out.write(NewLineToAdd + "\n");
				//System.out.println("=nof=os-"+os);
			}

			out.close();
		}
		catch (IOException e)
		{
			//TODO
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);			
			l = new log("warning","File","<"+StSourceFileName+">"+ " Not Exist, Please Select Another File. " + e); //info
			
		}
	}


	//
	//---[fnReadTextFile]---------------------------------
	//
	private int fnReadTextFile(String StTextFileName) throws Exception
	{
		int index = 0;
		int idx   = 0;

		intTotalMatches = 0;

		curper = 0; //current record value
		currif = 0; //current record pecent



		spb = new pbar();
		spb.setStatus(0, 100, 0); //min,max,cur
		spb.pbStart();
		spb.setCurValue(0);
		spb.frame.update(spb.frame.getGraphics());
		frame.update(frame.getGraphics());


		l = new log("info","File Reading", " " + frm1txtSelectFile.getText().toString() + "");

		try
		{
			str = null;
			BufferedReader in = new BufferedReader(new FileReader(StTextFileName));

			//reset value =0
			for (index=0; index < intToatalperSearch.length ; index++)
			{
				intToatalperSearch[index] = 0;
			}

	    //	ALngToatalperSearch(long) array size
			for (idx=0; idx < StStrSplit.length; idx++)
			{
			   ALngToatalperSearch.add(idx, (long) 0);
			}

/*			// test
			for (idx=0; idx < StStrSplit.length; idx++)
			{
			   System.out.println("ALngToatalperSearch [ " + idx + " ] = " + ALngToatalperSearch.get(idx));
			}
*/
			
			
			while ((str = in.readLine()) != null)
			{				
				for(index=0; index < StStrSplit.length ; index++)
				{
					switch (intSeekType)
					{
					//full
					case 1:
						if (str.toLowerCase().matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
						{
							intTotalMatches++;
							intToatalperSearch[index] = intToatalperSearch[index] + 1;
							
							ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);
							//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
							fnWriteResultToTextFile(index,str.toLowerCase(), index);
						}
						break;
						//x..y
					case 2:
						if ((!frm1txtfromchar.getText().equals(null)) &&
								(!frm1txtfromchar.getText().equals("")) &&
								(!frm1txttochar.getText().equals(null)) &&
								(!frm1txttochar.getText().equals("")))
						{

							//x,y
							int intfrom = Integer.valueOf(frm1txtfromchar.getText());
							int intto = Integer.valueOf(frm1txttochar.getText());
							int inttmp = 0;

							if ((str.length() > 0) && (intto > 0) && (intfrom > 0))
							{

								if (intfrom > intto)
								{
									inttmp = intfrom;
									intfrom = intto;
									intto = inttmp;
								}

                                //TODO check for bug 
								if (str.length() < intto)
								{
									// //continue;
									intto = str.length();
								}

								//TODO check for bug 
								if (str.length() < intfrom)
								{
									continue;
									//intfrom = 1;
								}

								if (str.toLowerCase().substring(intfrom-1,intto).matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
								{
									intTotalMatches++;
									intToatalperSearch[index] = intToatalperSearch[index] + 1;
									
									ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);

									//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
									fnWriteResultToTextFile(index,str.toLowerCase(), index);
								}
							}
							else
							{
								//=0--> skip/do nothing.
							}


						}
						else  ////***if empty, do like case = 1; (all the line) ****////
						{
							if (str.toLowerCase().matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
							{
								intTotalMatches++;
								intToatalperSearch[index] = intToatalperSearch[index] + 1;

								ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);
								
								//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
								fnWriteResultToTextFile(index,str.toLowerCase(), index);
							}
						}
						break;
					case 3:
						if ((!frm1txtfromchar.getText().equals(null)) &&
								(!frm1txtfromchar.getText().equals("")))
						{
							//x,y
							int intfrom = Integer.valueOf(frm1txtfromchar.getText());
							int intto = Integer.valueOf((StStrSplit[index].length() + intfrom)-1);


							if ((str.length() > 0) && (intto > 0) && (intfrom > 0))
							{
								if (str.length() < intto)
								{
									continue;
									//intto = str.length();
								}


								if (str.length() < intfrom)
								{
									continue;
									//intfrom = 1;
								}


								if (str.toLowerCase().substring(intfrom-1,intto).matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
								{
									intTotalMatches++;
									intToatalperSearch[index] = intToatalperSearch[index] + 1;

									ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);
									
									//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
									fnWriteResultToTextFile(index,str.toLowerCase(), index);
								}
							}
							else
							{
								//=0--> skip/do nothing.
							}
						}
						else  ////***if empty, do like case = 1; (all the line) ****////
						{
							if (str.toLowerCase().matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
							{
								intTotalMatches++;
								intToatalperSearch[index] = intToatalperSearch[index] + 1;
								
								ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);

								//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
								fnWriteResultToTextFile(index,str.toLowerCase(), index);								
							}
						}
						break;
					case 4:
						if ((!frm1txtfromchar.getText().equals(null)) &&
								(!frm1txtfromchar.getText().equals("")))
						{
							//x,y
							int intfrom = Integer.valueOf(frm1txtfromchar.getText());
							int intto = Integer.valueOf(str.length());


							if ((str.length() > 0) && (intto > 0) && (intfrom > 0))
							{
								if (str.length() < intfrom)
								{
									continue;
								}


								if (str.toLowerCase().substring(intfrom-1,intto).matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
								{
									intTotalMatches++;
									intToatalperSearch[index] = intToatalperSearch[index] + 1;
									
									ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);

									//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
									fnWriteResultToTextFile(index,str.toLowerCase(), index);
								}
							}
							else
							{
								//=0--> skip/do nothing.
							}
						}
						else ////***if empty, do like case = 1; (all the line) ****////
						{
							if (str.toLowerCase().matches(".*"+StStrSplit[index].toLowerCase()+".*") == true)
							{
								intTotalMatches++;
								intToatalperSearch[index] = intToatalperSearch[index] + 1;

								ALngToatalperSearch.set(index, ALngToatalperSearch.get(index)+ 1);
								
								//fnWriteResultToTextFile(index,str.toLowerCase(), StStrSplit[index].toLowerCase());
								fnWriteResultToTextFile(index,str.toLowerCase(), index);
							}
						}
						break;
					}

				}

				//
				// (%) percent
				//
				currif++;

				double c =  (double) currif / maxlf;
				curper =  (long) ((double) c * 100);


				spb.setCurValue((int)curper);

				//spb.pb.setValue((int) this.currif);


				if (curper > preper)
				{
					spb.frame.update(spb.frame.getGraphics());
					frame.update(frame.getGraphics());
				}
				

				preper = curper;

                //TODO tmp
				System.out.println(" " + maxlf + "--" + currif + "~~~-> " + curper + "%");


				//intTotalLineNumber++;
				//System.out.println("  " + intTotalLineNumber + "  ");
			}
			in.close();
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);			
			l = new log("warning","File","<"+StTextFileName+">"+ " Not Exist, Please Select Another File " + e + "." );
			return 0;
		}


		//StSourceFileName
		l = new log("output","source","file-name"+ "~~~>   " + "<" + StSourceFileName + ">");
//		l = new log("output","result","Total chars in file "+ "~~~>   " + "<" + intTotalCharInFile + ">");
//		l = new log("output","result","Total lines in file "+ "~~~>   " + "<" + intTotalLineNumber + ">");
//		l = new log("output","result","File Size "+ "~~~>   " + "<" + intFileSize + " kb>");
		l = new log("output","result","Total matches in file "+ "~~~>   " + "<" + intTotalMatches + ">");
		//System.out.println(" **********~~~~ " + intTotalLineNumber + " ~~~~ " + intTotalCharInFile + " ~~~~ " + intFileSize);

		//
		//print result
		for(index=0; index < StStrSplit.length ; index++)
		{
			l = new log("output",StStrSplit[index], "~~~>   " + "<" + intToatalperSearch[index]+ ">");
		}
		
		
		for(index=0; index < StStrSplit.length ; index++)
		{		
		   System.out.println(" >> " + StStrSplit[index] + " >> " + ALngToatalperSearch.get(index) );
		   // .set(index, ALngToatalperSearch.get(index)+ 1);
		}
		return 1;
	}


	//
	//
	//---[check_Gui_Field_value]---------------------------------
	//   (true==with-value, flase==with-no-value
	//
	private boolean check_Gui_Field_value()
	{
		boolean exists = true;

		if ( (frm1txtSelectFile.getText().equals("")) || (frm1txtSelectFile.getText().equals(null)) || (frm1txtStringSeek1.getText().equals(null)) || (frm1txtStringSeek1.getText().equals("")) )
		{
			//TODO procedure For Alert.
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n Data Missing... \n Select: File-Name, Seek String  \n ","WARNING", JOptionPane.WARNING_MESSAGE);
			
			l = new log("Warning","No user interaction","the user did not enter a filename or did not enter a seek string");
			exists = false;
		}
		else
		{
			exists = true;
		}

		return exists;
	}


	//
	//
	//---[check_Gui_Field_value]---------------------------------
	//   (true==with-value, flase==with-no-value
	//
	private boolean check_Gui_File_Field_value()
	{
		boolean exists = true;

		if ( (frm1txtSelectFile.getText().equals("")) || (frm1txtSelectFile.getText().equals(null)) ) 
		{
			//TODO procedure For Alert.
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n Data Missing... \n Select: File-Name.  \n ","WARNING", JOptionPane.WARNING_MESSAGE);
			
			l = new log("Warning","No user interaction","the user did not enter a filename.");
			exists = false;
		}
		else
		{
			exists = true;
		}

		return exists;
	}	
	
	
	

	//
	//---[check_file_existence]---------------------------------
	//
	private boolean check_file_existence (String sfn)
	{
		File file=new File(sfn);
		boolean exists = file.exists();

		if (exists == true)
		{
			l = new log("info","File","<"+StSourceFileName+">" + " Exist");
		}

		if (exists == false)
		{
			JOptionPane.showMessageDialog(frame ,"~~ WARNING ~~ \n \n The selected file is not a valid file... \n Please Select Another File .  \n ","WARNING",JOptionPane.ERROR_MESSAGE); //JOptionPane.WARNING_MESSAGE);
			l = new log("warning","File","<"+StSourceFileName+">"+ " Not Exist, Please Select Another File. "); //info
		}

		return exists; //true = exist;
	}


	////erase old file + split seek
	//---[Split_Seek_value]---------------------------------
	//	
	private void Split_Seek_value()
	{
		if (StStr != null)  //erase old result file.
		{
			erase del = new erase(StStr);
			//del.erase_output(StStr);
		}

		// StStr <-- frm1txtStringSeek1
		StStr = frm1txtStringSeek1.getText();

		//split into String Array. (delimiter= ",")
		StStrSplit = StStr.split(delimiter);
		//l = new log("input","String Seek ",StStr);

		/* print substrings */
		for(int i =0; i < StStrSplit.length ; i++)
		{
			l = new log("input","String Seek",StStrSplit[i]);
		}	  
	}

	
	//
	//---[findJob]---------------------------------
	//			
	private void findJob()
	{
		SetVisibleOnOff(0);

		//**refresh button.
		Frm1ButFind.update(Frm1ButFind.getGraphics());
		frame.update(frame.getGraphics());


		//Text-Field: frm1txtSelectFile || frm1txtStringSeek1 === true==have a value, false==no-value
		if (check_Gui_Field_value() == true)
		{   //file exist yes/no
			if (check_file_existence(frm1txtSelectFile.getText()) == true)
			{						
				StSourceFileName = frm1txtSelectFile.getText();
				
				Split_Seek_value(); //erase old file + split seek

				try
				{
					//check if file/folder/other.
					if (check_file_status(frm1txtSelectFile.getText().toString()) == true)
					{
						
						//os - property
						fnOsProperty(frm1txtSelectFile.getText().toString());
						
						//count min/max
						fnReadTextFileProperties(frm1txtSelectFile.getText().toString());

						//create ReadFileDate.java
						//read file
						fnReadTextFile(frm1txtSelectFile.getText().toString());

						//write to log - end of process.
						l = new log("info","sub process", "have been completed");

						//3.Result -> Result the file (enable)
						blresult = true;
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		//audio
		utils.playSoundFile(nof.class.getResourceAsStream("074.wav"), false);
		
		SetVisibleOnOff(1);
		
	}

	
    //***
	//
	//---[PropertyJob]---------------------------------
	//		
	private void findJobStop()
	{
		System.out.println("findJobStop + flag");
	}


	private void ReplaceJob()
	{
	
/*		//**refresh button.
		Frm1ButFind.update(Frm1ButFind.getGraphics());
		frame.update(frame.getGraphics());
*/

		//Text-Field: frm1txtSelectFile || frm1txtStringSeek1 === true==have a value, false==no-value
		if (check_Gui_Field_value() == true)
		{   //file exist yes/no
			if (check_file_existence(frm1txtSelectFile.getText()) == true)
			{						
				StSourceFileName = frm1txtSelectFile.getText();

				Split_Seek_value();  //erase old file + split seek

				try
				{
					//check if file/folder/other.
					if (check_file_status(frm1txtSelectFile.getText().toString()) == true)
					{												
						//snr s = new snr();
						snr r = new snr();
						
						r.setParameters(StSourceFileName,StStrSplit[0]);
						
						r.getparameters();
						
						r.setParametersGui();
						
						l = new log("info","Replace Button" ,"opened the a Seek and Replace Window");

						}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
	
		
	//
	//---[viewJob]---------------------------------
	//			
	private void viewJob()
	{
		
		l = new log("event","Frm1BtFileViewer", "have been pressed");
		
		SetVisibleOnOff(0);

		//**refresh button.
		//Frm1ButFind.update(Frm1ButFind.getGraphics());
		//frame.update(frame.getGraphics());


		//Text-Field: frm1txtSelectFile || frm1txtStringSeek1 === true==have a value, false==no-value
		if (check_Gui_File_Field_value	() == true)
		{   //file exist yes/no
			if (check_file_existence(frm1txtSelectFile.getText()) == true)
			{						
				StSourceFileName = frm1txtSelectFile.getText();
				
				//Split_Seek_value(); //erase old file + split seek

				try
				{
					//check if file/folder/other.
					if (check_file_status(frm1txtSelectFile.getText().toString()) == true)
					{
						
						//os - property
						fnOsProperty(frm1txtSelectFile.getText().toString());
						
						//count min/max
						fnReadTextFileProperties(frm1txtSelectFile.getText().toString());

						
						//***TODO: Action
                        view v = new view();
                        
						
						//write to log - end of process.
						//l = new log("info","sub process", "have been completed");

						//3.Result -> Result the file (enable)
						//blresult = true;
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}

		SetVisibleOnOff(1);		
	}

		
	private void resultJob()
	{

		
		l = new log("event","Frm1BtResult", "have been pressed");
		
		if (blresult == true) //result
		{
			int     index  =  0;
			result pr = new result();
			pr.setResult(" Source file name"      , "   " + StSourceFileName                   ,0);
//			pr.setResult(" Total lines in file"   , "   " + String.valueOf(intTotalLineNumber) ,1);
//			pr.setResult(" Total char in file"    , "   " + String.valueOf(intTotalCharInFile) ,2);
//			pr.setResult(" Source file Size"      , "   " + String.valueOf(intFileSize)+" kb " ,3);
			pr.setResult(" Total matches in file" , "   " + String.valueOf(intTotalMatches)    ,1);					


			for(index=0; index < StStrSplit.length ; index++)
			{
				pr.setResult(" <<  " + String.valueOf(StStrSplit[index]) + "  >> ", "   " + String.valueOf(intToatalperSearch[index])+ "  match",index+2);
				
				//setResult[index + 2][0] = "Total matches in file";
				//setResult[index + 2][1] = String.valueOf(intTotalMatches);				
			}
						
			pr.getResult();					
			
		}

		
		if (blresult == false) //no result
		{
			JOptionPane.showMessageDialog(frame ,"~~ result ~~ \n \n no Result exist, please submit a search job first \n ","result", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	
	
    //***
	//
	//---[PropertyJob]---------------------------------
	//		
	private void PropertyJob()
	{
		l = new log("event","Frm1BtOsProperty", "have been pressed");

		SetVisibleOnOff(0);

		//**refresh button.
		//Frm1ButFind.update(Frm1ButFind.getGraphics());
		//frame.update(frame.getGraphics());


		//Text-Field: frm1txtSelectFile || frm1txtStringSeek1 === true==have a value, false==no-value
		if (check_Gui_File_Field_value	() == true)
		{   //file exist yes/no
			if (check_file_existence(frm1txtSelectFile.getText()) == true)
			{						
				StSourceFileName = frm1txtSelectFile.getText();
				
				Split_Seek_value(); //erase old file + split seek

				try
				{
					//check if file/folder/other.
					if (check_file_status(frm1txtSelectFile.getText().toString()) == true)
					{
						
						//os - property
						fnOsProperty(frm1txtSelectFile.getText().toString());
						
						//count min/max
						fnReadTextFileProperties(frm1txtSelectFile.getText().toString());

						
						//***TODO: Action
                        property p = new property();
                        p.setResult(" Source file name"      , "   " + StSourceFileName                   ,0);
            			p.setResult(" Total lines in file"   , "   " + String.valueOf(intTotalLineNumber) ,1);
            			p.setResult(" Total char in file"    , "   " + String.valueOf(intTotalCharInFile) ,2);
            			p.setResult(" Source file Size"      , "   " + String.valueOf(intFileSize)+ " Byte " + "   " +  String.valueOf(intFileSizeKB)+" Kb " + "   " + String.valueOf(intFileSizeMb)+" Mb " + "   " + String.valueOf(intFileSizeGB)+" GB ",3);
                         		
            			
            			p.getResult();
						
						//write to log - end of process.
						//l = new log("info","sub process", "have been completed");

						//3.Result -> Result the file (enable)
						//blresult = true;
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}

		SetVisibleOnOff(1);		
	
	}
	
	
	
	//
	//exit NOF software (yes/no)
	private void ExitProc()
	{
		int n = JOptionPane.showConfirmDialog(
			    frame ,
			    "EXIT  NOF  FreeWare  ???",
			    "--NOF--",
			    JOptionPane.YES_NO_OPTION);
		
		//user pressed result.
		switch (n) 
		{
		case 0:  //yes

			frame.dispose();
			l = new log("event","Exit Software","Exit Pressed - Thank you for using NOF Software.");
			erase del = new erase(StStr); //StStr);
			//del.erase_output(StStr);
			System.exit(0); // Exit Program
			
			break;
		case 1:  //no
			l = new log("event","Exit_option","Exit - have been canceled");
			break;
		}
		
	}
	
	
	//
	//---[nof() main-menu]---------------------------------
	//	
	private nof()
	{
		blresult = false;


		frame = new JFrame("NOF...");
		frame.setResizable(false);
		//frame.setLocationRelativeTo(null);  //--center--
		frame.setAlwaysOnTop(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(nof.class.getResource("/icons/star.jpg")));


		//[Frame.Menu-Bar]------------------------------------------
		// menu-bar + pop up result.
		mbar = new JMenuBar();
		fileMenu = new JMenu("Menu");


		//listers
		ActionListener printListener = new ActionListener(  )
		{
			public void actionPerformed(ActionEvent event)
			{
				if (event.getActionCommand().equals("Help"))
				{
					l = new log("event","menu-bar","Help - have been pressed");
					//System.out.println("___HELP___");
					//JOptionPane.showMessageDialog(frame ,"~~ HELP ~~ \n 1. Select a file. \n 2. select a String to find in file. \n 3. select a type of search. \n 4. press submit button -  to start string seeking process in file. ","Help", JOptionPane.INFORMATION_MESSAGE);
					helps h = new helps();
				}

				if (event.getActionCommand().equals("About"))
				{
					l = new log("event","menu-bar","About - have been pressed");
					//System.out.println("___About___");
					//JOptionPane.showMessageDialog(frame ," Name: NOF \n Version: 1.0 \n \n Developed by: Yaron Kessler \n \n Powered by: Java \n License: Free for use","About", JOptionPane.INFORMATION_MESSAGE);
					about nf = new about();
				}

				//Exit(0)
				if (event.getActionCommand().equals("Exit"))
				{
					ExitProc();
				}
			}
		};


		//Create the "File" menu items and add to menu
		for (int i=0; i < fileItems.length; i++)
		{
			item = new JMenuItem(fileItems[i]);
			item.addActionListener(printListener);
			fileMenu.add(item);
		}


		mbar.add(fileMenu);


		jpfrm1 = new JPanel();
		frame.getRootPane().add(jpfrm1);
		jpfrm1.setLayout(null);


		// SelectFile - Gui Select //
		Frm1SelectFile = new JButton("select a file");
		Frm1SelectFile.setBounds(12, 20, 117, 25);
		Frm1SelectFile.setToolTipText("please select a source file, for the processing data job - automatically.");
		jpfrm1.add(Frm1SelectFile);


		// SelectFile - user manual Select //
		frm1txtSelectFile = new JTextField("");
		frm1txtSelectFile.setBounds(150, 20, 366, 22); //y100
		frm1txtSelectFile.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtSelectFile.setToolTipText("please select a source file, for the processing data job - manually.");
		jpfrm1.add(frm1txtSelectFile);


		// Display - StringSeek //
		frm1lblStringSeek1 = new JLabel("Seek a String : ");
		frm1lblStringSeek1.setBounds(18, 60, 110, 22);
		frm1lblStringSeek1.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1lblStringSeek1.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1lblStringSeek1);


		// StringSeek - user manual Select //
		frm1txtStringSeek1 = new JTextField();
		frm1txtStringSeek1.setBounds(150, 60, 366, 22);
		frm1txtStringSeek1.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtStringSeek1.setText(null);
		frm1txtStringSeek1.setToolTipText("please select the string that you wish to search the file for.");
		jpfrm1.add(frm1txtStringSeek1);


		// Button - find //
		Frm1ButFind = new JButton("Find");
		Frm1ButFind.setActionCommand("find");
		Frm1ButFind.setBounds(12, 205, 117, 25);//12,220
		Frm1ButFind.setToolTipText("press find to start process.");
		jpfrm1.add(Frm1ButFind);


		// Button - Clear //
		Frm1Butclean = new JButton("Clear");
		Frm1Butclean.setBounds(141, 205, 117, 25);
		Frm1Butclean.setToolTipText("press clear to clear the search fields.");
		jpfrm1.add(Frm1Butclean);


		// Button - result //
		Frm1BtResult = new JButton("Result");
		Frm1BtResult.setBounds(270, 205, 117, 25); //12, 260, 117, 25
		Frm1BtResult.setToolTipText("press Properties to view the result of the search.");
		jpfrm1.add(Frm1BtResult);


		// Button - Exit //		
		Frm1BtnExit = new JButton(".Exit.");
		Frm1BtnExit.setBounds(399, 205, 117, 25); //399, 260, 117, 25
		Frm1BtnExit.setToolTipText("press exit to terminate this application.");
		jpfrm1.add(Frm1BtnExit);

		
		// Button - Replace //
		Frm1ButSNR = new JButton("Replace");
	//	Frm1ButSNR.setActionCommand("find");
		Frm1ButSNR.setBounds(12, 236, 117, 25);
		Frm1ButSNR.setToolTipText("press SNR to start Seek and Replace.");
		jpfrm1.add(Frm1ButSNR);		

	
		// Button - view //
		Frm1BtFileViewer = new JButton("View");
		Frm1BtFileViewer.setBounds(141, 236, 117, 25);
		Frm1BtFileViewer.setToolTipText("press clear to clear the search fields.");
		jpfrm1.add(Frm1BtFileViewer);
		
		
		// Button - property //
		Frm1BtOsProperty = new JButton("File_Info");
		Frm1BtOsProperty.setBounds(270, 236, 117, 25); //12, 260, 117, 25
		Frm1BtOsProperty.setToolTipText("press Properties to view the result of the search.");
		jpfrm1.add(Frm1BtOsProperty);
		
		
		

		// Display //
		frm1lblfromchar = new JLabel("x: ");
		frm1lblfromchar.setBounds(200, 119, 20, 22);
		frm1lblfromchar.setFont(new Font("Dialog", Font.BOLD, 12));
		jpfrm1.add(frm1lblfromchar);


		// from char - user manual Select //
		frm1txtfromchar = new JTextField(3);
		frm1txtfromchar.setBounds(220, 120, 100, 22);
		frm1txtfromchar.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txtfromchar.setText(null);
		jpfrm1.add(frm1txtfromchar);


		// Display //
		frm1lbltochar = new JLabel("y: ");
		frm1lbltochar.setBounds(200, 149, 20, 22);
		frm1lbltochar.setFont(new Font("Dialog", Font.BOLD, 12));
		jpfrm1.add(frm1lbltochar);


		// to char - user manual Select //
		frm1txttochar = new JTextField(3);
		frm1txttochar.setBounds(220, 150, 100, 22);
		frm1txttochar.setFont(new Font("Dialog", Font.BOLD, 12));
		frm1txttochar.setText(null);
		jpfrm1.add(frm1txttochar);



		//
		// Radio Button - Create the radio buttons. // 
		rbfull = new JRadioButton(StSerachFull);
		rbfull.setFont(new Font("Arial", Font.PLAIN, 11));
		rbfull.setActionCommand(StSerachFull);
		rbfull.setBounds(12, 100, 160, 22);
		rbfull.setSelected(true);
		rbfull.setToolTipText(StSerachFull + " --> search string in the full record/line.");
		jpfrm1.add(rbfull);


		// Radio Button - Create the radio buttons. //
		rbFromTo = new JRadioButton(StrbFromTo);
		rbFromTo.setFont(new Font("Arial", Font.PLAIN, 11));
		rbFromTo.setActionCommand(StrbFromTo);
		rbFromTo.setBounds(12, 120, 160, 22);
		rbFromTo.setSelected(false);
		rbFromTo.setToolTipText(StrbFromTo + " --> search string in record, from x to y.");
		jpfrm1.add(rbFromTo);


		// Radio Button - Create the radio buttons.
		rbFromToEndOfSeekString = new JRadioButton(StFromToEndOfSeekString);
		rbFromToEndOfSeekString.setFont(new Font("Arial", Font.PLAIN, 11));
		rbFromToEndOfSeekString.setActionCommand(StFromToEndOfSeekString);
		rbFromToEndOfSeekString.setBounds(12, 140, 160, 22);
		rbFromToEndOfSeekString.setSelected(false);
		rbFromToEndOfSeekString.setToolTipText(StFromToEndOfSeekString + " --> search string in record, from x to y.");
		jpfrm1.add(rbFromToEndOfSeekString);


		// Radio Button - Create the radio buttons.
		rbfromToEnd = new JRadioButton(StFromToEnd);
		rbfromToEnd.setFont(new Font("Arial", Font.PLAIN, 11));
		rbfromToEnd.setActionCommand(StFromToEnd);
		rbfromToEnd.setBounds(12, 160, 160, 22);
		rbfromToEnd.setSelected(false);
		rbfromToEnd.setToolTipText(StSerachFull + " --> search string in record, from x to end-of-record/line.");
		jpfrm1.add(rbfromToEnd);


		// Radio --> Group.
		grpSearch = new ButtonGroup();
		grpSearch.add(rbfull);
		grpSearch.add(rbFromTo);
		grpSearch.add(rbFromToEndOfSeekString);
		grpSearch.add(rbfromToEnd);


		// Radio --> Group Function |---> default visible		
		SetVisibleAction(1);
		setRadioButtonSelection(1);


		//
		//[hotKeys (Alt + *)]------------------------------------------
		//

		rbfull.setMnemonic(KeyEvent.VK_1);
		rbFromTo.setMnemonic(KeyEvent.VK_2);
		rbFromToEndOfSeekString.setMnemonic(KeyEvent.VK_3);
		rbfromToEnd.setMnemonic(KeyEvent.VK_4);


		Frm1Butclean.setMnemonic(KeyEvent.VK_C);
		Frm1ButFind.setMnemonic(KeyEvent.VK_F);
		Frm1BtResult.setMnemonic(KeyEvent.VK_T);
		Frm1BtnExit.setMnemonic(KeyEvent.VK_E);
		Frm1ButSNR.setMnemonic(KeyEvent.VK_R);
		
		Frm1BtFileViewer.setMnemonic(KeyEvent.VK_V);
		Frm1BtOsProperty.setMnemonic(KeyEvent.VK_I);
		
		Frm1SelectFile.setMnemonic(KeyEvent.VK_A);


		//
		// *** Listener/s ***
		//
		//[Listener/s *]------------------------------------------
		//		
		//


		//
		//[KeyBoard Click Check *]------------------------------------------
		//
		KeyListener keyListener = new KeyListener()
		{
			public void keyPressed(KeyEvent keyEvent)	{ 	}

			public void keyReleased(KeyEvent keyEvent)
			{
				int keyCode = keyEvent.getKeyCode();

				//!(65-90=a-z;48-57=0-9; 32=spacebar;backspace=8;caps=20;num=144;scroll=145;sapce=32;
				if ((keyCode >=65 && keyCode <= 90) || (keyCode == 32))
				{
					//not 0-9 number value
					frm1txttochar.setText("");
					frm1txtfromchar.setText("");
				}
				//TODO : keycode for shift+0 --> shift+9 -->  ! @ # $ % ^ & * ( )
			}
			public void keyTyped(KeyEvent keyEvent)	{ }
		};

		frm1txtfromchar.addKeyListener(keyListener);
		frm1txttochar.addKeyListener(keyListener);

/*		
		public void mousePressed(MouseEvent e) {};
		public void mouseReleased(MouseEvent e) {};
		public void mouseClicked(MouseEvent e) {};
		public void mouseEntered(MouseEvent e) {};
		public void mouseExited(MouseEvent e) {};
		public void mouseMoved(MouseEvent e) {};
		public void mouseDragged(MouseEvent e) {};
*/

		
		//
		//[Listener--frame--(main-Frame)+(erase * out.file) + (Exit(0))--]------------------------------------------
		//
		frame.addWindowListener(new WindowAdapter()
		{
			//Exit(0)
			public void windowClosing(WindowEvent w)
			{
				ExitProc();
			}
		});


		//
		//[Listener--rbfull--(Full Search)--]------------------------------------------
		//
		rbfull.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent e)
			{
				intSeekType = 1;
				setRadioButtonSelection(intSeekType);
				SetVisibleAction(intSeekType);

				l = new log("event","Sorting","rbfull - have been pressed");
			}
		});


		//
		//[Listener--rbFromTo--(From -> To)--]------------------------------------------
		//		
		rbFromTo.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent e)
			{
				intSeekType = 2;
				setRadioButtonSelection(intSeekType);
				SetVisibleAction(intSeekType);

				l = new log("event","Sorting","rbFromTo - have been pressed");
			}
		});


		//
		// Action Listeners --- <rbFromToEndOfSeekString>
		//
		//
		//[Listener--rbFromToEndOfSeekString--(From --> End Of String)--]------------------------------------------
		//				
		rbFromToEndOfSeekString.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent e)
			{
				intSeekType = 3;
				setRadioButtonSelection(intSeekType);
				SetVisibleAction(intSeekType);

				l = new log("event","Sorting","rbFromToEndOfSeekString - have been pressed");
			}
		});


		//
		//[Listener--rbfromToEnd--(From -> To End\End-Of-Line)--]------------------------------------------
		//			
		rbfromToEnd.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent e)
			{
				intSeekType = 4;
				setRadioButtonSelection(intSeekType);
				SetVisibleAction(intSeekType);

				l = new log("event","Sorting","rbfromToEnd - have been pressed");
			}
		});


		//
		//[Listener--Frm1SelectFile--(Select File Button)--]------------------------------------------
		//			
		Frm1SelectFile.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				int ret = fileopen.showDialog(panel, "Select a file...");//"Open file"				


				if (ret == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();

					StSourceFileName = file.toString();
					frm1txtSelectFile.setText(StSourceFileName);
					l = new log("info","File Chooser",file.toString());
				}
			}
		});


		//
		//[Listener--Frm1Butclean--(Clear Field value)--]------------------------------------------
		//			
		Frm1Butclean.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				StSourceFileName = null;
				frm1txtSelectFile.setText("");
				frm1txtStringSeek1.setText(null);
				intSeekType = 1;
				setRadioButtonSelection(intSeekType);
				rbfull.setSelected(true);
				SetVisibleAction(1);
				blresult = false;
			}
		});


		//
		//[Listener--Frm1ButFind--(find All Action)--]------------------------------------------
		//					
		Frm1ButFind.addActionListener(new ActionListener( )
		{

			public void actionPerformed(ActionEvent ev)
			{				
				findJob();
			}
		});


		//
		//[Listener--Frm1BtResult--(Properties/Result of find)--]------------------------------------------
		//	
		Frm1BtResult.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				resultJob();				
			}
		});


		
		//
		//[Listener--Frm1BtnExit--(Exit program)--]------------------------------------------
		//	
		Frm1ButSNR.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
/*				//snr s = new snr();
				snr r = new snr();
				
				r.setParameters(StSourceFileName,);
				//r.getparameters();
*/				
				ReplaceJob();				
 			}
		});


		
		//
		//[Listener--Frm1BtFileViewer--(view File Text)--]------------------------------------------
		//	
		Frm1BtFileViewer.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
/*				//snr s = new snr();
				snr r = new snr();
				
				r.setParameters(StSourceFileName,);
				//r.getparameters();
*/				
				viewJob();				
 			}
		});		
		
	
		//Frm1BtOsProperty
		//
		//[Listener--Frm1BtOsProperty--(OS Property)--]------------------------------------------
		//	
		Frm1BtOsProperty.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				PropertyJob();
/*				//snr s = new snr();
				snr r = new snr();
				
				r.setParameters(StSourceFileName,);
				//r.getparameters();
*/				
			//	System.out.println("Frm1BtOsProperty");
				//viewJob();				
 			}
		});		
		
		
		
		//
		//[Listener--Frm1BtnExit--(Exit program)--]------------------------------------------
		//	
		Frm1BtnExit.addActionListener(new ActionListener( )
		{
			public void actionPerformed(ActionEvent ev)
			{
				ExitProc();
			}
		});
		
		

		//
		//[frame--adding--(mbar,jpfrm1) + size + visible + order-by--]------------------------------------------
		//	
		frame.setJMenuBar(mbar); //adding menu-bar --> frame
		frame.getContentPane().add(jpfrm1);

		frame.setSize(536, 326); //(536, 316) //800, 572 = full-screen
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.DO_NOTHING_ON_CLOSE); // EXIT_ON_CLOSE);
		//
		//Order By Tab/s.Tab
		//frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Frm1SelectFile, frm1txtSelectFile, frm1txtStringSeek1, rbfull, rbFromTo, rbFromToEndOfSeekString, rbfromToEnd, frm1txtfromchar, frm1txttochar, Frm1ButFind, Frm1ButSNR, Frm1Butclean, Frm1BtFileViewer, Frm1BtResult, Frm1BtOsProperty,   Frm1BtnExit}));


	}

	//
	//[main--(args) os + Gui + Tui--]------------------------------------------
	//	
	public static void main(String[] args)  throws PropertyVetoException
	{
		log l = new log("info","Nof Software","nof software has started successfully");
		nof nf = new nof();	

		//***TODO os auto detect
		//***TODO Gui/Tui (Setup.ini)

		if (args.length > 0)
		{
			nf.os = Integer.valueOf(args[0]);

			if ((nf.os == 0) || (nf.os == 1)) //(linux/unix)/win
			{
				l.os = nf.os;
				System.out.println("os = " + nf.os);
			}			

			if ((nf.os != 0) && (nf.os != 1)) //else default (0/win)
			{
				nf.os = 0; 
				l.os = nf.os;
				System.out.println("os = Windows");
			}
		}
		else
		{	
			System.out.println("os = WINdows"); //last default (0/win)
			//OS - 0=win; 1=lin
			nf.os = 0; 
			l.os = nf.os;	
		}
		
		System.out.println("----> " + nf.os);

		//		javax.swing.SwingUtilities.invokeLater(new Runnable()
		//		{
		//			public void run()
		//			{
		//				new nof().start();
		//			}
		//		});
	}
}
