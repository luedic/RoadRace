import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	Menu menu;
	Car car;
	ChooseCar chooseCar;
	
	public ButtonListener(Menu m) {
		menu = m;
	}
	public ButtonListener(ChooseCar c) {
		chooseCar = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Starte")) {
			menu.dispose();
			ChooseCar choose = new ChooseCar();
		}
		if (e.getActionCommand().equals(" ")){
			Game game = new Game();
			game.getC().setCarLink(chooseCar.getCars().get(0));
			Thread t = new Thread(game);
			t.start();
			
		}
		if (e.getActionCommand().equals("  ")){
			
			Game game = new Game();
			game.getC().setCarLink(chooseCar.getCars().get(1));
			Thread t = new Thread(game);
			t.start();
		}
	}
}