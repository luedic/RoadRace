
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChooseCar {
	private List<String> cars = new ArrayList<>();
	
	
	public ChooseCar() {
		int a = 0; 
		int loc = 0;
		cars.add("images/Bugatti.png");
		cars.add("images/Mercedes.png");

		JFrame f = new JFrame();
		f.setSize(1000,666);
		f.setLocationRelativeTo(null);
		f.setVisible(true);	
//		f.setLayout(new FlowLayout());
		
		for (String car:cars) {
			ImageIcon i = new ImageIcon(car);
			JButton j = new JButton(""+a,i);
			a++;
			j.setSize(f.getWidth()/2, f.getHeight()/2);
			j.setLocation(loc, 0);
			loc += 333;
//			j.setOpaque(false);
//			j.setContentAreaFilled(false);
//			j.setBorderPainted(false);
			f.add(j);
		}
		
	}

}
