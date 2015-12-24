import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class InputPanel extends JPanel{
	private JLabel xSquared;
	private JLabel plus;
	private JLabel x;
	private JLabel secondPlus;
	private JTextField firstNumber;
	private JTextField secondNumber;
	private JTextField thirdNumber;
	
	public InputPanel() {
		// TODO Auto-generated constructor stub
		// initialize variables
		firstNumber = new JTextField(2); // \u00b2 is subscript 2
		xSquared = new JLabel("x\u00b2");
		plus = new JLabel("+");
		secondNumber = new JTextField(2);
		x = new JLabel("x");
		secondPlus = new JLabel("+");
		thirdNumber = new JTextField(2);
		
		
		// add components to panel
		this.add(firstNumber);
		this.add(xSquared);
		this.add(plus);
		this.add(secondNumber);
		this.add(x);
		this.add(secondPlus);
		this.add(thirdNumber);
		
		// set panel visible
		this.setVisible(true);
	}

}