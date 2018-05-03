import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import javafx.scene.input.KeyEvent;

public class Game implements Runnable{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	public JFrame jf = new JFrame();
	KeyInput ki = new KeyInput(this);
	
	private boolean up = false;
	private boolean down = false;
	private boolean right = false;
	private boolean left = false;
	
	public Game() {
		new Window((int)width+1, (int)height+1,"RoadRace", jf);
		jf.addKeyListener(ki);
		jf.setFocusable(true);
	}

	public void run() {
		Car c = new Car(0,0);
		int i = 0; 
		this.getJf().add(c);
		while (true) { //Gameloop
			try {
				int x = c.getLocX();
				int y = c.getLocY();
				int t = c.getTurn();
				
				if (this.isUp()) {
					c.setLocX(x+5);
				}
				if (this.isDown()) {
					c.setLocX(x-5);
				}
				if (this.isRight()) {
					c.setTurn(t+1);
				}
				if (this.isLeft()) {
					c.setTurn(t-1);
				}

				Thread.sleep(20); //50x per second
				jf.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Game g = new Game();
		Menu m = new Menu(1000,666,g);	
	}


	public JFrame getJf() {
		return jf;
	}


	public void setJf(JFrame jf) {
		this.jf = jf;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	public boolean isUp() {
		return up;
	}


	public void setUp(boolean up) {
		this.up = up;
	}


	public boolean isDown() {
		return down;
	}


	public void setDown(boolean down) {
		this.down = down;
	}


	public boolean isRight() {
		return right;
	}


	public void setRight(boolean right) {
		this.right = right;
	}


	public boolean isLeft() {
		return left;
	}


	public void setLeft(boolean left) {
		this.left = left;
	}

	
}
