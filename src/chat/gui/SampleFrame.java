package chat.gui;

import java.awt.image.SampleModel;
import javax.swing.JFrame;

public class SampleFrame<GUIController> extends JFrame
{
	private GUIController appController;
	private SampleModel appPanel;
	
	public SampleFrame(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);;
		this.setTitle("MY GUI App!");
		this.setSize(1000, 500);
		this.setResizable(false);;
		this.setVisible(true);
	}

	private void setContentPane(SampleModel appPanel2) {
		// TODO Auto-generated method stub
		
	}

}
