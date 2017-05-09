
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.font.CreatedFontTracker;

import java.io.File;

public class learningtextBOXES implements ActionListener {
	private static JPanel Panel;
	public static void main(String[] args) {
 Panel = new JPanel();
 JFrame frame = new JFrame();
 frame.add(Panel);
 JButton firstbutton = new JButton("the president has created WW III");
	frame.setVisible(true);
	frame.setTitle("NEWS FLASH");
	Panel.add(firstbutton);
	firstbutton.addActionListener((e)->{
		JPanel boi= new JPanel();
	});
	}
}
