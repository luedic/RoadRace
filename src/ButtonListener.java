import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
	Menu menu;
	Car car;
	ChooseCar chooseCar;
	FinishScreen finishScreen;
	JFrame frame;
	
	public ButtonListener(Menu m) {
		menu = m;
	}
	public ButtonListener(ChooseCar c,JFrame f) {
		chooseCar = c;
		frame = f;
	}
	public ButtonListener(FinishScreen fs) {
		finishScreen = fs;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Starte")) {
			ChooseCar choose = new ChooseCar();
			menu.dispose();
		}
		if (e.getActionCommand().equals("Nochmal Spielen")) {
			ChooseCar choose = new ChooseCar();
			System.out.println("test");
			finishScreen.dispose();
		}
		if (e.getActionCommand().equals(" ")){
			Game game = new Game();
			game.getC().setCarLink(chooseCar.getCars().get(0));
			Thread t = new Thread(game);
			t.start();
			
			frame.dispose();
			
		}
		if (e.getActionCommand().equals("  ")){
			Game game = new Game();
			game.getC().setCarLink(chooseCar.getCars().get(1));
			Thread t = new Thread(game);
			t.start();

			frame.dispose();
		}
	}
}