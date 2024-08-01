import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class FirstPage {

	private JFrame frmFirstPage;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
					window.frmFirstPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFirstPage = new JFrame();
		frmFirstPage.setTitle("FIrst Page");
		frmFirstPage.setBounds(100, 100, 643, 439);
		frmFirstPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frmFirstPage.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

}
