import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Game implements Runnable{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	public JFrame jf = new JFrame();
	
	
	public Game() {
		new Window((int)width+1, (int)height+1,"lol", jf);
	}
	
	
	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(20); //50x per second 
				System.out.println(i);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		Car c = new Car(100,100);
		c.loadImage();
		g.getJf().add(c);
		g.run();
		
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

	
}
