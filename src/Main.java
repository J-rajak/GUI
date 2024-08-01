import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.FlowLayout;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JFrame = a GUI window to add components to
//		JFrame frame = new JFrame();
//		frame.setTitle("First");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the frame
//		frame.setResizable(false); 
//		frame.setSize(420, 420); // x-dimension and y-dimension of the frame
//		frame.setVisible(true); // make frame visible
//		
//		ImageIcon image = new ImageIcon("icon.png");
//		frame.setIconImage(image.getImage());
//		frame.getContentPane().setBackground(new Color(50, 60, 255));
		
//		MyFrame myFrame = new MyFrame();
		
		
//		ImageIcon img = new ImageIcon("Icon.png");
//		Border border = BorderFactory.createLineBorder(Color.green, 3);
//		
//		JLabel label = new JLabel();
//		label.setText("Bro, are you okay?");
//		label.setIcon(img);
//		label.setHorizontalTextPosition(JLabel.CENTER); // SET text left, center, right
//		label.setVerticalTextPosition(JLabel.BOTTOM); // SET text position to top, bottom or center of image icon
//		
//		label.setForeground(new Color(34, 56, 255));
//		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
//		label.setIconTextGap(-5); // set gap of text to image
//		label.setBackground(Color.black);
//		label.setOpaque(true);
//		label.setBorder(border);
//		label.setVerticalAlignment(JLabel.CENTER);
//		label.setHorizontalAlignment(JLabel.CENTER);
////		label.setBounds(100, 100, 350, 350);// set x and y positions in the frame as well as width and height
//		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(420, 420);
////		frame.setLayout(null);
//		frame.setVisible(true);
//		frame.add(label);
//		frame.pack(); // add all of your components and then add
		
//		ImageIcon icon = new ImageIcon("icon.png");
//		
//		JLabel label = new JLabel();
//		label.setText("Hi!!");
//		label.setIcon(icon);
////		label.setVerticalAlignment(JLabel.BOTTOM);
////		label.setHorizontalAlignment(JLabel.RIGHT);
//		label.setBounds(100, 100, 75, 75);
//		
//		JPanel redPanel = new JPanel(); 
//		redPanel.setBackground(Color.red);
//		redPanel.setBounds(0, 0, 250, 250);
//		redPanel.setLayout(null);
//		
//		JPanel bluePanel = new JPanel();
//		bluePanel.setBackground(Color.blue);
//		bluePanel.setBounds(250, 0, 250, 250);
//		bluePanel.setLayout(null);
//		
//		JPanel greenPanel = new JPanel();
//		greenPanel.setBackground(Color.green);
//		greenPanel.setBounds(500, 0, 500, 500);
//		greenPanel.setLayout(new BorderLayout());
//		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLayout(null);
//		frame.setSize(750, 750);
//		frame.setVisible(true);
//		
//		greenPanel.add(label);
//		frame.add(redPanel);
//		frame.add(bluePanel);
//		frame.add(greenPanel);
		
//		new MyFrame();
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLayout(new BorderLayout(10, 10));
//		frame.setVisible(true);
//		
//		JPanel panel1 = new JPanel();
//		JPanel panel2 = new JPanel();
//		JPanel panel3 = new JPanel();
//		JPanel panel4 = new JPanel();
//		JPanel panel5 = new JPanel();
//		
//		panel1.setBackground(Color.red);
//		panel2.setBackground(Color.green);
//		panel3.setBackground(Color.blue);
//		panel4.setBackground(Color.yellow);
//		panel5.setBackground(Color.gray);
//
//		panel1.setPreferredSize(new Dimension(100, 100));
//		panel2.setPreferredSize(new Dimension(100, 100));
//		panel3.setPreferredSize(new Dimension(100, 100));
//		panel4.setPreferredSize(new Dimension(100, 100));
//		panel5.setPreferredSize(new Dimension(100, 100));
//		
//		//-------------sub panel---------------------
//		JPanel panel6 = new JPanel();
//		JPanel panel7 = new JPanel();
//		JPanel panel8 = new JPanel();
//		JPanel panel9 = new JPanel();
//		JPanel panel10 = new JPanel();
//		
//		panel6.setBackground(Color.black);
//		panel7.setBackground(Color.darkGray);
//		panel8.setBackground(Color.gray);
//		panel9.setBackground(Color.LIGHT_GRAY);
//		panel10.setBackground(Color.white);
//		
//		panel5.setLayout(new BorderLayout());
//
//		panel6.setPreferredSize(new Dimension(50, 50));
//		panel7.setPreferredSize(new Dimension(50, 50));
//		panel8.setPreferredSize(new Dimension(50, 50));
//		panel9.setPreferredSize(new Dimension(50, 50));
//		panel10.setPreferredSize(new Dimension(50, 50));
//		
//		panel5.add(panel6, BorderLayout.NORTH);
//		panel5.add(panel7, BorderLayout.SOUTH);
//		panel5.add(panel8, BorderLayout.WEST);
//		panel5.add(panel9, BorderLayout.EAST);
//		panel5.add(panel10, BorderLayout.CENTER);
//		
//		frame.add(panel1, BorderLayout.NORTH);
//		frame.add(panel2, BorderLayout.WEST);
//		frame.add(panel3, BorderLayout.EAST);
//		frame.add(panel4, BorderLayout.SOUTH);
//		frame.add(panel5, BorderLayout.CENTER);
		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//		
//		JPanel panel = new JPanel();
//		panel.setPreferredSize(new Dimension(250, 250));
//		panel.setBackground(Color.LIGHT_GRAY);
//		panel.setLayout(new FlowLayout());
//		
//		panel.add(new JButton("1"));
//		panel.add(new JButton("2"));
//		panel.add(new JButton("3"));
//		panel.add(new JButton("4"));
//		panel.add(new JButton("5"));
//		panel.add(new JButton("6"));
//		panel.add(new JButton("7"));
//		panel.add(new JButton("8"));
//		panel.add(new JButton("9"));
//		
//		frame.add(panel);
//		frame.setVisible(true);
		
		// Grid Layout Manager = defines the natural layout for the components within a computer
		
		// GridLayout = places components in a grid of cells
		// Each component takes all the available space within its cell
		// and each cell is the same size
		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLayout(new GridLayout(3, 3, 10, 10)); // GridLayout(no of rows, no of columns, vertical space between each component, horizontal space between each component)
//		
////		JButton button1 = new JButton("1");
////		frame.add(button1);
//		// short cut to write this 
//		frame.add(new JButton("1"));
//		frame.add(new JButton("2"));
//		frame.add(new JButton("3"));
//		frame.add(new JButton("4"));
//		frame.add(new JButton("5"));
//		frame.add(new JButton("6"));
//		frame.add(new JButton("7"));
//		frame.add(new JButton("8"));
//		frame.add(new JButton("9"));
//		frame.add(new JButton("10"));
//		
//		frame.setVisible(true);
//		
		
		// JLayeredPane = swing container that provides a third dimenion for positioning component x, y z index
		
//		JLabel label1 = new JLabel();
//		label1.setOpaque(true);
//		label1.setBackground(Color.RED);
//		label1.setBounds(50, 50, 200, 200);
//		
//		JLabel label2 = new JLabel();
//		label2.setOpaque(true);
//		label2.setBackground(Color.GREEN);
//		label2.setBounds(100, 100, 200, 200);
//		
//		JLabel label3 = new JLabel();
//		label3.setOpaque(true);
//		label3.setBackground(Color.BLUE);
//		label3.setBounds(150, 150, 200, 200);
//		
//		JLayeredPane layeredPane = new JLayeredPane();
//		layeredPane.setBounds(0, 0, 500, 500);
//		
//		layeredPane.add(label1, Integer.valueOf(0));
//		layeredPane.add(label2, Integer.valueOf(2));
//		layeredPane.add(label3, Integer.valueOf(1));
//		
//		JFrame frame = new JFrame("JLayeredPane");
//		frame.add(layeredPane);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(new Dimension(500, 500));
//		frame.setLayout(null);
//		frame.setVisible(true);
		
//		MyFrame frame = new MyFrame();
		
//		
		
		new MyFrame();
	}

}
