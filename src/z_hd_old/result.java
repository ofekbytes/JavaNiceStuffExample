package z_hd_old;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class result 
{

	private   JFrame    frmResult   =   null;
	private   JPanel    panel         =   null;
	private   JLabel    lblgif1       =   null;
	private   JLabel    lblTResult  =   null;


	/*	private   JTable    jtSeekResult  =   null;
	private   String    stHeader []   =   {"subject","value"};
	private   DefaultTableModel model =   null;*/

	private	JPanel		topPanel;
	private	JTable		table;
	private	JScrollPane scrollPane;
	private String dataValues[][]={
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},            
	};

	
	private ArrayList<String> stDataVal = new ArrayList<String>();
	
	private int inDataValue = 40;	
		
	
	
	
	
	//TODO 09.04.2013
//	private   ArrayList<String []>  dataValues = new ArrayList<String []> () ;

/*	private void setArrSize (int size)
	{
		this.stDataVal = new stDataVal [stDataVal.length][stDataVal.length];
	
	}*/
	


	//
	// Set Result Array 	
	public void setResult(String stName, String StValue, int intY)
	{
		System.out.println(stName + " " + StValue);
		this.dataValues[intY][0]=stName;
		this.dataValues[intY][1]=StValue;
		//dataValues.add(new String [] {stName,StValue});
		stDataVal.add(stName);
		stDataVal.add(StValue);
		
	}

	
	//right pad with a char
	private String rpad(String in, int length, char pad) {
		StringBuffer out   = new StringBuffer(length);
		int          least = in.length();
		if (least > length) 
			least = length;
		out.append(in.substring(0, least));
		int          fill  = length - out.length();
		for (int i=0;i < fill;i++) 
		{//pad in the end of line 
			out.append(pad);
		}
		return out.toString();
	}

	
	//left pad with a char
	private String lpad(String in, int length, char pad) {
		StringBuffer out   = new StringBuffer(length);
		int          least = in.length();
		if (least > length) 
			least = length;
		out.append(in.substring(0, least));
		int          fill  = length - out.length();
		for (int i=0;i < fill;i++) 
		{ //pad in the beginning of line
			out.insert(0, pad);
		}
		return out.toString();
	}



	//
	// Get Result Array
	public void getResult()
	{
		int i;

		String cbo;

		cbo = "";

		cbo = cbo + "\n" + "Result:";

		clipboard cb = new clipboard();



		//for (i=0 ; i< this.dataValues[i].length ; i++)
		for (i=0 ; i < inDataValue ; i++) //40/(0-39)		
		{
			if ((this.dataValues[i][0].equalsIgnoreCase("")) || (this.dataValues[i][0].equalsIgnoreCase(null)) )
			{
				continue;
			}
			if ((this.dataValues[i][1].equalsIgnoreCase("")) || (this.dataValues[i][1].equalsIgnoreCase(null)) )
			{
				continue;
			}		   

			//***report**
			//cbo = cbo + "\n" + this.dataValues[i][0].replaceAll("\\s"," ")+ "  "  + "" + this.dataValues[i][1].replaceAll("\\s"," ");
			//
			cbo = cbo + "\n" + (this.rpad(this.dataValues[i][0],50,'.')) + (this.rpad(this.dataValues[i][1],50,' '));

		}

		cbo = cbo + "\n";

		cb.setClipBoard(cbo);
		
		for (int idx=0; idx < stDataVal.size(); idx++)
		{
			System.out.println(stDataVal.get(idx));
		}
		
	}


	public result()
	{
		//create form
		frmResult = new JFrame("NOF...Result");
		frmResult.setIconImage(Toolkit.getDefaultToolkit().getImage(about.class.getResource("/icons/star.jpg")));
		frmResult.setResizable(false);

		//create panel
		panel = new JPanel();
		panel.setForeground(Color.BLACK);

		//create bound/s
		panel.setLayout(null);
		frmResult.getContentPane().add(panel);


		lblgif1 = new JLabel("");
		lblgif1.setIcon(new ImageIcon(nof.class.getResource("/icons/star.jpg")));
		lblgif1.setBounds(10, 10, 30, 30);
		panel.add(lblgif1);


		lblTResult = new JLabel("");
		lblTResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTResult.setText("Result :");
		lblTResult.setBounds(50, 10, 100, 30);
		panel.add(lblTResult);


		// Create columns names
		//String columnNames[] = { "Column 1", "Column 2", "Column 3" };
		String columnNames[] = { "Name", "Value"};


		//TODO array.
		// Create some data
		/*		String dataValues[][] =
		{
			{ "12", "234", "67" },
			{ "-123", "43", "853" },
			{ "93", "89.2", "109" },
			{ "279", "9033", "3092" },

			{ "12", "234", "67" },
			{ "-123", "43", "853" },
			{ "93", "89.2", "109" },
			{ "279", "9033", "3092" },

			{ "12", "234", "67" },
			{ "-123", "43", "853" },
			{ "93", "89.2", "109" },
			{ "279", "9033", "3092" }			
		};
		 */

		// Create a new table instance
		table = new JTable( dataValues, columnNames );
		
		//
		//TODO make ArrayList stDataVal --> String[][]
		//table = new JTable( stDataVal.toString(), columnNames );
		
		// Add the table to a scrolling pane
		scrollPane = new JScrollPane( table );
		scrollPane.setLocation(10, 51);
		scrollPane.setSize(454, 193);

		//topPanel.add( scrollPane, BorderLayout.CENTER );
		panel.add(scrollPane);


		//frmResult.getContentPane().add(panel);

		frmResult.setSize(480, 280);
		frmResult.setVisible(true);

		frmResult.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


		frmResult.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				frmResult.dispose();
				System.out.println("Exit Current Window.");
				//System.exit(0); // Exit Program
			}
		});

	}	

	public static void main(String [] args)
	{
		result pr = new result();
	}
}
