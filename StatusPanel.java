import javax.swing.JPanel;
import javax.swing.JTextField;
public class StatusPanel extends JPanel{
	private JTextField status;
	
	public StatusPanel() {
		// TODO Auto-generated constructor stub
		//initialize variables
		status = new JTextField(20);
		
		//set TestField to un-editable
		status.setEditable(false);
		
		//add to panel
		this.add(status);
	}

}
