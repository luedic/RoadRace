import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	Menu menu;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Starte")) {
			Game g = new Game();
			System.out.println("testlol");
			g.run();
		}
	}
	
}
