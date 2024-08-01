import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	JButton button; // global declaration
//	JTextField textField;
	
//	MyFrame() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(new FlowLayout());
//		
//		JButton button = new JButton("Submit");
//		button.addActionListener(this);
//		
//		JTextField textField = new JTextField();
//		textField.setPreferredSize(new Dimension(250, 40));
//		textField.setFont(new Font("Consolas", Font.PLAIN, 35));
//		textField.setForeground(new Color(0x00FF00));
//		textField.setBackground(Color.black);
//		textField.setCaretColor(Color.white);
//		textField.setText("UserName");
////		textField.setEditable(false);
//		
//		this.add(button);
//		this.add(textField);
//		this.pack();
//		this.setVisible(true); this seys the extfield visible
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource() == button) {
//			System.out.println("Welcome " + textField.getText());
//			button.setEnabled(false);
//			textField.setEditable(false);
//		}
//		
//	}
	
//	JButton button;
//	JLabel label;
//	MyFrame() {
		
//		this.setTitle("First");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the this
//		this.setResizable(false); 
//		this.setSize(420, 420); // x-dimension and y-dimension of the this
//		this.setVisible(true); // make this visible
//		
//		ImageIcon image = new ImageIcon("icon.png");
//		this.setIconImage(image.getImage());
//		this.getContentPane().setBackground(new Color(255, 255, 255));
		
//		ImageIcon icon = new ImageIcon("camera.jpeg");
//		ImageIcon icon1 = new ImageIcon("icon.png");
//		
//		label = new JLabel();
//		label.setIcon(icon1);
//		label.setBounds(150, 150, 150, 150);
//		label.setVisible(false);
//		
//		
//		JButton button = new JButton();
//		button.setBounds(200, 100, 170, 80);
//		button.addActionListener(this);
//		button.setText("I'm a button!!");
//		button.setFocusable(false);// gets rid of the box around the text
//		button.setIcon(icon);
//		button.setHorizontalTextPosition(JButton.CENTER);
//		button.setVerticalTextPosition(JButton.BOTTOM);
//		button.setFont(new Font("Comic sans", Font.BOLD, 25));
//		button.setIconTextGap(-15);
//		button.setForeground(Color.cyan);
//		button.setBackground(Color.gray);
//		button.setBorder(BorderFactory.createEtchedBorder());
//		
//		
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);
//		this.setSize(500, 500);
//		this.setVisible(true);
//		this.add(button);
//		this.add(label);
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == button) {
//			System.out.println("pooo");
////			button.setEnabled(false); // can click only once
//			label.setVisible(true);
//			
//		}
//		
//	}
	
//	JButton button;
//	JCheckBox checkBox;
//	ImageIcon xIcon;
//	ImageIcon checkIcon;
//	
//	MyFrame() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(new FlowLayout());
//		
//		xIcon = new ImageIcon("icon.png");
//		checkIcon = new ImageIcon("icon.png");
//		
//		JButton button = new JButton();
//		button.setText("submit");
//		button.addActionListener(this);
//		
//		JCheckBox checkBox = new JCheckBox();
//		checkBox.setText("I'm not a robot");
//		checkBox.setFocusable(false);
//		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
//		checkBox.setIcon(xIcon);
//		checkBox.setSelectedIcon(checkIcon);
//		
//		this.add(button);
//		this.add(checkBox);
//		this.pack();
//		this.setVisible(true);
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == button) {
//			System.out.println(checkBox.isSelected());
//		}
//
//	}
	
	// JRadioButtons = one or more buttons in a grouping in which 
	
//	JRadioButton pizzaButton;
//	JRadioButton hamburgerButton;
//	JRadioButton hotdogButton;
//	JComboBox combobox;
////
//	MyFrame() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(new FlowLayout());
//		
//		pizzaButton = new JRadioButton("pizza");
//		hamburgerButton = new JRadioButton("hamburger");
//		hotdogButton = new JRadioButton("hotdog");
//		
//		ButtonGroup group = new ButtonGroup();
//		group.add(pizzaButton);
//		group.add(hamburgerButton);
//		group.add(hotdogButton);
		
//		pizzaButton.addActionListener(this);
//		hamburgerButton.addActionListener(this);
//		hotdogButton.addActionListener(this);
		
//		this.add(pizzaButton);
//		this.add(hamburgerButton);
//		this.add(hotdogButton);
		
//		String[] animals = {"dog", "cat", "bird"};
//		
//		combobox = new JComboBox(animals);
//		combobox.addActionListener(this);
		
//		combobox.setEditable(true); // can edit inside the box
//		System.out.println(combobox.getItemCount());
//		combobox.addItem("pig");
//		combobox.insertItemAt("horse", 0);
//		combobox.setSelectedIndex(0);
//		combobox.removeItem("cat");
//		combobox.removeItemAt(0);
//		combobox.removeAllItems();
//		
//		this.add(combobox);
//		this.pack();
//		this.setVisible(true);
//	}
////
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
////		if(e.getSource() == pizzaButton) {
////			System.out.println("You selected pizza!!!");
////		}
////		else if(e.getSource() == hamburgerButton) {
////			System.out.println("you ordered a hamburger!!!");
////		}
////		else if(e.getSource() == hotdogButton){
////			System.out.println("you ordered a hotdog");
////		}
//		if (e.getSource() == combobox) {
////			System.out.println(combobox.getSelectedItem());
//			System.out.println(combobox.getSelectedIndex());
//		}
//		
//	}
	
}
