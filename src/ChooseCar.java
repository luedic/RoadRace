
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChooseCar {
	private List<String> cars = new ArrayList<>();
	

	public ChooseCar() { 
		String a = " ";
		cars.add("images/Bugatti.png");
		cars.add("images/Mercedes.png");

		JFrame f = new JFrame();
		f.setSize(1000,666);
		f.setLocationRelativeTo(null);
		f.setVisible(true);	
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BackgroundMenu bm = new BackgroundMenu();
		int z = 400;
		for (String car:cars) {
			ImageIcon i = new ImageIcon(car);
			JButton j = new JButton(a,i);
			j.addActionListener(new ButtonListener(this,f));
			f.add(j);
			j.setSize(100,50);
			j.setLocation(z,308);
			z+=100;
			a = a + " ";
		}
		f.add(bm);
	}
	
	public List<String> getCars() {
		return cars;
	}


	public void setCars(List<String> cars) {
		this.cars = cars;
	}


}
