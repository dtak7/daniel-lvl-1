import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	public static void main(String[] args) {
		new SlotMachine();
	}

	public SlotMachine() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		frame.setSize(700, 700);

		for (int i = 0; i < 3; i++) {
			int ran = new Random().nextInt(2);

			if (ran == 0) {
				String bananaImage = "banana.png";
				try {
					label = createLabelImage(bananaImage);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					label.setText(null);
				}
			} else if (ran == 1) {
				String cherry2Image = "cherry2.jpg";
				try {
					label1 = createLabelImage(cherry2Image);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					label1.setText(null);
				}
			} else {
				String orangeImage = "orange.jpg";
				try {
					label2 = createLabelImage(orangeImage);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					label2.setText(null);
				}
			}
		}
		label.setVisible(true);
		label1.setVisible(true);
		label2.setVisible(true);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		frame.add(panel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
