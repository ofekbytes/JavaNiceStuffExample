package z_hd_old;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;



public class msg
{
	final static int interval = 100;
	int i;
	Timer timer;

	JFrame       frame   = null;
	JPanel       jpfrm1  = null;
	JLabel       label   = null; 
	JProgressBar pb      = null ;

	//JButton button;
	public int pbMin;
	public int pbMax;
	public int pbCurr;


	public void setCalcMode(boolean blOnOff)
	{
		if (blOnOff == true)
		{
		  pb.setIndeterminate(true);
		}
		else
		{
		  pb.setIndeterminate(false);
          frame.dispose();
		}
	}


	public void setCurValue(int curr)
	{
		this.pbCurr = curr;
		pb.setValue(curr);		
		//System.out.println("setCurValue ---> this.pbCurr " + this.pbCurr + " curr " + curr);
	}


	public void setStatus(int min,int max, int curr)
	{
		this.pbMin  = min  ;
		this.pbMax  = max  ;
		this.pbCurr = curr ;

		i = 0;
	}



	public void pbStart()
	{
		i = 0;
		pb.setMinimum(this.pbMin);
		pb.setMaximum(this.pbMax);


		for (int i=0; i< 30; i++)
			System.out.println("pbstart ---> " + this.pbMin + " " + this.pbMax);

		String str = "<html>" + "<font color=\"#008000\">" + "<b>" + 
		"Reading file" + "</b>" + "</font>" + "</html>";
		label.setText(str);
		timer.start();
	}


	public msg() 
	{
		frame = new JFrame("...Please Wait...");
		frame.setResizable(false);

		jpfrm1 = new JPanel();
		jpfrm1.setBorder(null);



		pb = new JProgressBar(this.pbMin,this.pbMax);
		pb.setBounds(10, 20, 426, 23);
		pb.setValue(0);
		pb.setStringPainted(true);
		jpfrm1.setLayout(null);


		label = new JLabel("");
		label.setBounds(12, 45, 426, 23);
		jpfrm1.add(label);
		jpfrm1.add(pb);		


		frame.getContentPane().add(jpfrm1);
		frame.setSize(450, 110); //536, 146
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //JFrame.EXIT_ON_CLOSE

		//Create a timer.
		timer = new Timer(interval, new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				if (i == pbMax)
				{
					Toolkit.getDefaultToolkit().beep();
					timer.stop();
					//button.setEnabled(true);
					pb.setValue(0);
					String str = "<html>" + "<font color=\"#FF0000\">" + "<b>" + 
					"Done..." + "</b>" + "</font>" + "</html>";
					label.setText(str);

					frame.dispose();
				}
				//i = i + 1;
				i = pbCurr;
				pb.setValue(i);
				//System.out.println(" i= " + i + " " + pbCurr);
			}
		});
	}


	public static void main(String[] args) 
	{
	    
		time_date td = new time_date();
		System.out.println(td.getStFullTime());
		
		pbar spb = new pbar();

		spb.setStatus(0, 100, 0);

		spb.pbStart();

		//start value.
		spb.setCurValue(0);
		
		//for (int a = 0; a <= 100000; a++)
		//{
		//	spb.setCurValue(0);
		//System.out.println(a);	
		//}
			
		//cur=readtime
	    int a;
		for (a = 0; a < 10000; a++)
		{
		   spb.label.setText(td.getStFullTime());
		   
			//System.out.println(td.getStFullTime());
		   
		   //time = read time/if time > cur then cur = time refresh time
		   int curTime = td.getCalcTime();
		   
		   if (curTime+2 == td.getCalcTime())
		   {
		      spb.frame.update(spb.frame.getGraphics());
		   }
		}
		
		
		//close window (end value)
		if (a == 10000)
		{
			System.out.println(td.getStFullTime());
			spb.setCurValue(100);
		}
		
	}

}
