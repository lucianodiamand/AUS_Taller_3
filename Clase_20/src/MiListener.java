import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MiListener implements ActionListener {

	private JLabel eti;
	
	
	public MiListener(JLabel eti) {
		this.eti = eti;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Hola");
		eti.setText("Chau mundo!");
	}

}
