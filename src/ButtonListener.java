import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	Menu menu;
	Car car;
	
	public ButtonListener(Menu m) {
		menu = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Starte")) {
			menu.dispose();
			Game game = new Game();
			Thread t = new Thread(game);
			t.start();
		}
		if (e.getActionCommand().equals("0")){
//			car.setCarLink();
			
		}
		if (e.getActionCommand().equals("1")){
			
		}
	}
}