import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Game extends Canvas implements Runnable{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	
	
	public Game() {
		new Window((int)width+1, (int)height+1,"lol", this);
	}
	
	
	public void run() {
	
	}
	
	public static void main(String[] args) {
		new Game();
	}

	
}
