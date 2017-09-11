
package z_example.mvc.contact;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ContactView extends JFrame{

	private JFrame calcFrame = null;        //frame
	private JPanel calcPanel = null;        //Panel
	
	
	private JLabel lblLastName = null;      //Last Name
	private JTextField lastName = null;     //
	
	
	private JLabel lblFirstName = null;     //First Name
	private JTextField firstName  = null;   //

	
//	private JTextField middleName   = null;
//	private JTextField middleFamilyName = null;	

	
	//constructor
	public ContactView() {
		
		//new frame
		calcFrame = new JFrame("---");
		calcFrame.setTitle("CalculatorView");
		
		//new panel
		calcPanel = new JPanel();
		
		//set panel type
		calcFrame.getRootPane().add(calcPanel);
		calcPanel.setLayout(null);
	
		
		//component (text,button)
		lblLastName = new JLabel();
		lastName = new JTextField();
		
		lblFirstName = new JLabel();
		firstName = new JTextField();
		
		
		//
		//component property
		//
		
		
		//
		// First Name
		//
		lblLastName.setText("Last Name: ");
		lblLastName.setBounds(10,14,70,20); //x, y, width, height
		
		
		lastName.setText("");
		lastName.setBounds(86, 14, 120, 20); //x, y, width, height
		lastName.setFont(new Font("Dialog", Font.BOLD, 12));
		lastName.setToolTipText("Tip: Please enter a firstName");
		

		//
		// Last Name
		//
		lblFirstName.setText("First Name: ");
		lblFirstName.setBounds(10,50,70,20);

		
		firstName.setText("");
		firstName.setBounds(86, 50, 120, 20); //x, y, width, height
		firstName.setFont(new Font("Dialog", Font.BOLD, 12));
		firstName.setToolTipText("Tip: Please enter a firstName");

		
		
		//
		//add components
		//
		//add to panel.
		calcPanel.add(lblLastName);
		calcPanel.add(lastName);
		
		calcPanel.add(lblFirstName);
		calcPanel.add(firstName);
		
		//add to frame.
		calcFrame.getContentPane().add(calcPanel);
		
		//frame size ,location, visble 
		calcFrame.setSize(300, 200);
		calcFrame.setLocation(50, 50);
		calcFrame.setVisible(true);
		
		//exit screen
		calcFrame.setDefaultCloseOperation(calcFrame.EXIT_ON_CLOSE);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactView c = new ContactView();
	}

}
