import java.awt.GridLayout;

import javax.swing.JFrame;
public class Frame extends JFrame{
	InputPanel ip;
	AnswerPanel ap;
	StatusPanel sp;

	public Frame() {
		// TODO Auto-generated constructor stub
		//set properties of frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Quadratic Formula Helper");
		this.setLayout(new GridLayout(0, 1));
		
		//initialize panels
		ip = new InputPanel();
		ap = new AnswerPanel();
		sp = new StatusPanel();
		// add input panel to frame
		this.getContentPane().add(ip);
		this.getContentPane().add(ap);
		this.getContentPane().add(sp);
		
		this.pack();
		this.setVisible(true);
	}

}
