import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * IDCardFrame is an extension of JFrame and is a JFrame object with 6 JLabel fields,
 * one of which is an image. 
 * @author Tanner Yilmaz
 */
public class IDCardFrame extends JFrame {
	
	public JLabel image, name, programmer, height, weight, eyeColor;
	public Font font;
		
	public IDCardFrame(String title) {
		
		setTitle(title);
		
		GridBagConstraints layoutConst;
		
		image = new JLabel(new ImageIcon("C:\\Users\\Tanner Yilmaz\\eclipse-workspace\\Lab_3\\src\\image.png"));
		name = new JLabel("Name: Tanner");
		height = new JLabel("Height: 2' 8\"");
		weight = new JLabel("Weight: 400 lbs");
		eyeColor = new JLabel("Eye color: Green");
		
		programmer = new JLabel("Java Programmer", SwingConstants.CENTER);
		font = new Font("Courier", Font.BOLD, 18);
		programmer.setFont(font);
		
		setLayout(new GridBagLayout());
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;		
		add(name, layoutConst);
		
		layoutConst = new GridBagConstraints();
		add(image, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 5;
		layoutConst.gridy = 4;
		add(programmer, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		add(height, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = GridBagConstraints.RELATIVE;
		add(weight, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.gridx = 0;
		layoutConst.gridy = GridBagConstraints.RELATIVE;
		add(eyeColor, layoutConst);
		
		setSize(1000, 600);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
}
