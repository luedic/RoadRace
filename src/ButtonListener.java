import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	Menu menu;
	Game game;
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Starte")) {
			System.out.println("testlol");
			game.startGame();
		}
	}
	
}