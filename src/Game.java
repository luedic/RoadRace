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
	public JFrame jf;
	KeyInput ki = new KeyInput(this);
	
	private boolean up = false;
	private boolean down = false;
	private boolean right = false;
	private boolean left = false;
	
	public Game() {
		jf = new JFrame("RoadRace");
		new Window((int)width+1, (int)height+1,"RoadRace", jf);
		jf.addKeyListener(ki);
		jf.setFocusable(true);
		jf.setVisible(true);
	}
	
	public void run() {
//		JFrame jaf = new JFrame();
//		jaf.setSize(500, 500);
//		jaf.setVisible(true);
//		jaf.add(c);
		Car c = new Car(960,540);
		Camera cam = new Camera(0,0);
		jf.add(c);
		
		while (true) { //Gameloop
			try {
				float x = c.getLocX();
				float y = c.getLocY();
				int t = c.getTurn();
				float value = 0;
				if (this.isUp()) {
					if(t <= 90) {
						if(t<0) {
							c.setTurn(360);
						}
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						c.setLocX(x+5-value);
						c.setLocY(y+value);
					}
					if(t <= 180 && t > 90) {
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						value -= 5;
						c.setLocX(x-value);
						c.setLocY(y+5-value);
					}
					if(t <= 270 && t > 180) {
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						value -= 10;
						c.setLocX(x-5+value);
						c.setLocY(y-value);
					}
					if(t > 270) {
						if(t>360) {
							c.setTurn(0);
						}
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						value -= 15;
						c.setLocX(x+value);
						c.setLocY(y-5+value);
						
					}
					
				}
				if (this.isDown()) {
					if(t <= 90) {
						if(t<0) {
							c.setTurn(360);
						}
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						c.setLocX(x-5+value);
						c.setLocY(y-value);
					}
					if(t <= 180 && t > 90) {
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						value -= 5;
						c.setLocX(x+value);
						c.setLocY(y-5+value);
					}
					if(t <= 270 && t > 180) {
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						value -= 10;
						c.setLocX(x+5-value);
						c.setLocY(y+value);
					}
					if(t > 270) {
						if(t>360) {
							c.setTurn(0);
						}
						for (int i = 0; i< t; i++) {
							value += 0.055555555;
						}
						value -= 15;
						c.setLocX(x-value);
						c.setLocY(y+5-value);
					}
				}
				if (this.isRight()) {
					c.setTurn(t+2);
				}
				if (this.isLeft()) {
					c.setTurn(t-2);
				}
				Thread.sleep(10); //100x per second

				cam.setCamera(c,jf);
				jf.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void startGame() {
		this.run();
	}
	
	public static void main(String[] args) {
		Menu m = new Menu(1000,666);
		
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

