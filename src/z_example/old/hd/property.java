package z_example.old.hd;

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



public class property 
{

	private   JFrame    frmProperty   =   null;
	private   JPanel    panel         =   null;
	private   JLabel    lblgif1       =   null;
	private   JLabel    lblTProperty  =   null;


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
	private int inDataValue = 40;
	
	
	//TODO 09.04.2013
//	private   ArrayList<String []>  dataValues = new ArrayList<String []> () ;


	//
	// Set Result Array 	
	public void setResult(String stName, String StValue, int intY)
	{
		System.out.println(stName + " " + StValue);
		this.dataValues[intY][0]=stName;
		this.dataValues[intY][1]=StValue;
		//dataValues.add(new String [] {stName,StValue});
		
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

		cbo = cbo + "\n" + "Property:";

		clipboard cb = new clipboard();



		//for (i=0 ; i <= this.dataValues[i].length + 1 ; i++) --40/
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
	}


	public property()
	{
		//create form
		frmProperty = new JFrame("NOF...Property");
		frmProperty.setIconImage(Toolkit.getDefaultToolkit().getImage(about.class.getResource("/icons/star.jpg")));
		frmProperty.setResizable(false);

		//create panel
		panel = new JPanel();
		panel.setForeground(Color.BLACK);

		//create bound/s
		panel.setLayout(null);
		frmProperty.getContentPane().add(panel);


		lblgif1 = new JLabel("");
		lblgif1.setIcon(new ImageIcon(nof.class.getResource("/icons/star.jpg")));
		lblgif1.setBounds(10, 10, 30, 30);
		panel.add(lblgif1);


		lblTProperty = new JLabel("");
		lblTProperty.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTProperty.setText("Property :");
		lblTProperty.setBounds(50, 10, 100, 30);
		panel.add(lblTProperty);


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

		// Add the table to a scrolling pane
		scrollPane = new JScrollPane( table );
		scrollPane.setLocation(10, 51);
		scrollPane.setSize(454, 193);

		//topPanel.add( scrollPane, BorderLayout.CENTER );
		panel.add(scrollPane);


		//frmProperty.getContentPane().add(panel);

		frmProperty.setSize(480, 280);
		frmProperty.setVisible(true);

		frmProperty.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


		frmProperty.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				frmProperty.dispose();
				System.out.println("Exit Current Window.");
				//System.exit(0); // Exit Program
			}
		});

	}	

	public static void main(String [] args)
	{
		property pr = new property();
	}
}
