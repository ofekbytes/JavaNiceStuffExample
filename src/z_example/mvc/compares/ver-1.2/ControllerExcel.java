package compares;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class ControllerExcel 
{

	private ModelExcel cModel;
	private ViewExcel cView;

	final static int interval = 100;
	int i;
	Timer timer;
	
	
	//set the view + model.
	public ControllerExcel (ModelExcel model, ViewExcel view) {
		
		//pointer
		this.cModel = model;
		this.cView = view;
		
		osUtil osUtil = new osUtil();
		osUtil.setInformation();

		
		//get/set cview.lblTitle
		view.setUserName(osUtil.getUserId());
		view.getUserName();
		
	
		
		this.cView.addCalculateListener(new SubmitListener());	
	}
	

	
	/****
	 * 
	 * SubmitListener >> actionPerformed >> 
	 *
	 */
	class SubmitListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent e) 
		{
			
			//TODO change icons.
			cView.ShowTimeAndMessage("...P L E A S E ..... W A I T .....");
			
			cModel.Submit(cView.getFileName1(), cView.getFileName2());
			cView.setStReport(cModel.getStReport());
			cView.getStReport();
		
		}
	}
	
	
}
//סוף