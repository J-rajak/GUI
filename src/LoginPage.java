import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class LoginPage {

	private JFrame frame;
	private JTextField userTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(550, 200, 401, 471); // x coordinate3, y coordinate
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel welcomelabel = new JLabel("Welcome to Herald");
		welcomelabel.setFont(new Font("Serif", Font.BOLD, 13));
		welcomelabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomelabel.setBounds(129, 11, 123, 31);
		frame.getContentPane().add(welcomelabel);
		
		JLabel imageIconLabel = new JLabel("");
		imageIconLabel.setIcon(new ImageIcon("C:\\Users\\Zerone\\Documents\\Programming_basics\\Java\\GUI\\src\\icons8_graduation_cap_96px.png"));
		imageIconLabel.setBounds(140, 53, 94, 71);
		frame.getContentPane().add(imageIconLabel);
		
		JLabel userNameLabel = new JLabel("username");
		userNameLabel.setBounds(60, 152, 71, 14);
		frame.getContentPane().add(userNameLabel);
		
		userTextField = new JTextField();
		userTextField.setBounds(151, 149, 160, 20);
		frame.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		JLabel enterUserNamelabel = new JLabel("Enter your username");
		enterUserNamelabel.setBounds(150, 135, 128, 14);
		frame.getContentPane().add(enterUserNamelabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setBounds(60, 198, 71, 20);
		frame.getContentPane().add(passwordLabel);
		
		JLabel enterPasswordLabel = new JLabel("Enter your password");
		enterPasswordLabel.setBounds(150, 180, 128, 14);
		frame.getContentPane().add(enterPasswordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 198, 160, 20);
		frame.getContentPane().add(passwordField);
		
		JCheckBox passcheckBox = new JCheckBox("show password");
		passcheckBox.setBounds(151, 222, 116, 23);
		frame.getContentPane().add(passcheckBox);
		
		
		
		JLabel selectUserlLbel = new JLabel("Select User");
		selectUserlLbel.setBounds(60, 263, 71, 20);
		frame.getContentPane().add(selectUserlLbel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Student", "Tutor"}));
		comboBox.setBounds(151, 263, 91, 22);
		frame.getContentPane().add(comboBox);
		
		JButton createUserBtn = new JButton("Create");
		createUserBtn.setBounds(61, 381, 89, 23);
		frame.getContentPane().add(createUserBtn);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(242, 381, 89, 23);
		frame.getContentPane().add(loginBtn);
	}
}
