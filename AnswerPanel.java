import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnswerPanel extends JPanel{
	private JTextField zero1;
	private JTextField zero2;
	private JLabel prompt1;
	private JLabel prompt2;

	public AnswerPanel() {
		// TODO Auto-generated constructor stub
		//initialize variables
		zero1 = new JTextField(2);
		prompt1 = new JLabel("is one zero");
		zero2 = new JTextField(2);
		prompt2 = new JLabel("is another zero");
		
		// set TextFields to un-editable
		zero1.setEditable(false);
		zero2.setEditable(false);
		
		//add components to panel
		this.add(zero1);
		this.add(prompt1);
		this.add(zero2);
		this.add(prompt2);
		
		this.setVisible(true);
	}

}
