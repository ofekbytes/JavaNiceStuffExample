/***
 * view - GUI - Graphic User Interface
 */


package z_example_mvc_calc;

import java.awt.Font;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.omg.CORBA.PUBLIC_MEMBER;


public class CalculatorView extends JFrame{

	private JFrame calcFrame = null;        //frame
	private JPanel calcPanel = null;        //Panel
	
	
	private JTextField TextFirstNumber  = null; 
	private JLabel LabelMathSign = null;
	private JTextField TextSecondNumber = null;
	private JButton ButtonCalculate = null;
	private JTextField TextCalcSolution = null;
	
	
	//constructor
	public CalculatorView() {
		
		//new frame
		calcFrame = new JFrame("---");
		calcFrame.setTitle("CalculatorView");
		
		//new panel
		calcPanel = new JPanel();
		
		//set panel type
		calcFrame.getRootPane().add(calcPanel);
		calcPanel.setLayout(null);
	
		//panel contant
		TextFirstNumber = new JTextField();
		TextFirstNumber.setText("");
		TextFirstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		TextFirstNumber.setBounds(10, 20, 50, 20); //x, y, width, height
		TextFirstNumber.setFont(new Font("Dialog", Font.BOLD, 12));
		TextFirstNumber.setToolTipText("Enter First Number");
		
		
		LabelMathSign = new JLabel();
		LabelMathSign.setText("+");
		LabelMathSign.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMathSign.setBounds(64, 20, 16, 20);
		LabelMathSign.setFont(new Font("dialog",Font.BOLD,12));
		
		
		TextSecondNumber = new JTextField();
		TextSecondNumber.setText("");
		TextSecondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		TextSecondNumber.setBounds(84,20,50,20);
		TextSecondNumber.setFont(new Font("dialog",Font.BOLD,12));
		
		
		ButtonCalculate = new JButton();
		ButtonCalculate.setText("Calculate");
		ButtonCalculate.setHorizontalAlignment(SwingConstants.CENTER);
		ButtonCalculate.setBounds(150,20,110,20);
		ButtonCalculate.setFont(new Font("dialog",Font.BOLD,12));
		
		
		TextCalcSolution = new JTextField();
		TextCalcSolution.setText("");
		TextCalcSolution.setHorizontalAlignment(SwingConstants.CENTER);
		TextCalcSolution.setBounds(276,20,90,20);
		TextCalcSolution.setFont(new Font("dialog",Font.BOLD,12));
			
		
		//
		//add components
		//
		//add to panel.
		
			
		calcPanel.add(TextFirstNumber);
		calcPanel.add(LabelMathSign);	
		calcPanel.add(TextSecondNumber);
		calcPanel.add(ButtonCalculate);
		calcPanel.add(TextCalcSolution);

	
		//add to frame.
		calcFrame.getContentPane().add(calcPanel);
		
		
		//frame size ,location, visble 
		calcFrame.setSize(400, 200);
		calcFrame.setLocation(50, 50);
		calcFrame.setVisible(true);
		
		//exit screen
		calcFrame.setDefaultCloseOperation(calcFrame.EXIT_ON_CLOSE);
				
	}



	// Get/Set for fields.
	public int getTextFirstNumber() {  
//		if (Integer.parseInt(TextFirstNumber.getText() == null))
//			return 0;
//		else
//			return Integer.parseInt(TextFirstNumber.getText());
		return 0;
	}
	public int getTextSecondNumber() {  return Integer.parseInt(TextSecondNumber.getText());  }
	
	public int getTextCalcSolution() {  return Integer.parseInt(TextCalcSolution.getText());  }
	
	public void setTextCalcSolution(int solution)  {  TextCalcSolution.setText(Integer.toString(solution));  }
	
	
	
	// Main()
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CalculatorView c = new CalculatorView();
	}

}
