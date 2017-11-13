package compares;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerExcel 
{

	private ModelExcel cModel;
	private ViewExcel cView;
//	private osUtil osUtil;
	
	public ControllerExcel() {
		
	}
	
	
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
//			System.out.println("Listener - submit button pressed");
//			System.out.println("file-name #1 "+ cView.getFileName1() );
//			System.out.println("file-name #2 "+ cView.getFileName2() );			
			cModel.Submit(cView.getFileName1(), cView.getFileName2());
		}
	}
	
	
}
