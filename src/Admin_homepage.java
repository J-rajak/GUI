
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin_homepage {

	private JFrame frame;
	private JPanel rightPanel;
	private CardLayout card= new CardLayout(0, 0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_homepage window = new Admin_homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(0);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
		);
		
		JPanel leftPanel = new JPanel();
		splitPane.setLeftComponent(leftPanel);
		
		JLabel lblNewLabel = new JLabel("welcome ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_4 = new JButton("Public result");
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNewLabel))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_4)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_leftPanel.setVerticalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel)
					.addGap(40)
					.addComponent(btnNewButton)
					.addGap(27)
					.addComponent(btnNewButton_4)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		leftPanel.setLayout(gl_leftPanel);
		
		rightPanel = new JPanel();
		splitPane.setRightComponent(rightPanel);
		rightPanel.setLayout(card);
		
		JPanel panel = new JPanel();
		rightPanel.add(panel, "name_133444838561799");
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		       card.show(rightPanel,"name_133532063662500");
			}
		});
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(rightPanel,"name_133747314355100");
			}
		});
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(rightPanel,"name_133894847185700");
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addComponent(btnNewButton_1)
					.addGap(27)
					.addComponent(btnNewButton_2)
					.addGap(32)
					.addComponent(btnNewButton_3)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_2))
					.addContainerGap(266, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel Student = new JPanel();
		rightPanel.add(Student, "name_133532063662500");
		
		JLabel lblNewLabel_1 = new JLabel("Student");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GroupLayout gl_Student = new GroupLayout(Student);
		gl_Student.setHorizontalGroup(
			gl_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student.createSequentialGroup()
					.addGap(183)
					.addComponent(lblNewLabel_1))
		);
		gl_Student.setVerticalGroup(
			gl_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1))
		);
		Student.setLayout(gl_Student);
		
		JPanel Teacher = new JPanel();
		rightPanel.add(Teacher, "name_133747314355100");
		
		JLabel lblNewLabel_2 = new JLabel("Teacher");
		GroupLayout gl_Teacher = new GroupLayout(Teacher);
		gl_Teacher.setHorizontalGroup(
			gl_Teacher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Teacher.createSequentialGroup()
					.addGap(161)
					.addComponent(lblNewLabel_2)
					.addContainerGap(207, Short.MAX_VALUE))
		);
		gl_Teacher.setVerticalGroup(
			gl_Teacher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Teacher.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addContainerGap(310, Short.MAX_VALUE))
		);
		Teacher.setLayout(gl_Teacher);
		
		JPanel Courses = new JPanel();
		rightPanel.add(Courses, "name_133894847185700");
		
		JLabel lblNewLabel_3 = new JLabel("Courses");
		GroupLayout gl_Courses = new GroupLayout(Courses);
		gl_Courses.setHorizontalGroup(
			gl_Courses.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Courses.createSequentialGroup()
					.addGap(150)
					.addComponent(lblNewLabel_3)
					.addContainerGap(218, Short.MAX_VALUE))
		);
		gl_Courses.setVerticalGroup(
			gl_Courses.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Courses.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel_3)
					.addContainerGap(298, Short.MAX_VALUE))
		);
		Courses.setLayout(gl_Courses);
		splitPane.setDividerLocation(120);
		frame.getContentPane().setLayout(groupLayout);
	}
}
