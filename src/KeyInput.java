import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	Game game;
	
	public KeyInput(Game g) {
		game = g;
	}
	
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_UP) {
			game.setUp(true);
		}
		else if (key == KeyEvent.VK_DOWN) {
			game.setDown(true);
		}
		if (key == KeyEvent.VK_RIGHT) {
			game.setRight(true);
		}
		if (key == KeyEvent.VK_LEFT) {
			game.setLeft(true);
		}
		if (key == KeyEvent.VK_SHIFT) {
			game.setShift(true);
		}
		if (key == KeyEvent.VK_R) {
			game.setR(true);
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_UP) {
			game.setUp(false);
		}
		if (key == KeyEvent.VK_DOWN) {
			game.setDown(false);
		}
		if (key == KeyEvent.VK_RIGHT) {
			game.setRight(false);
		}
		if (key == KeyEvent.VK_LEFT) {
			game.setLeft(false);
		}
		if (key == KeyEvent.VK_SHIFT) {
			game.setShift(false);
		}
		if (key == KeyEvent.VK_R) {
			game.setR(false);
		}
	}
}
