
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.awt.event.ItemEvent;

public class TeacherForm extends JDialog {
	private JPanel formPanel;
	private JLabel lblNewLabel_1;
	private JTextField mobileNoTextField;
	private JTextField addressTextField;
	private JLabel lblNewLabel_3;
	private JTextField fullNametextField;
	private JLabel lblNewLabel_4;
	private JTextField dateOfBirthTextField;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_6;
	private JButton submitButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox isPartTimeCheckBox;
	private JComboBox assignedModulecomboBox;
	private String name = "";
	private String mobileNumber = "";
	private String address = "";
	private String gender = "";
	private String isPartTime = "NO";
	private String selectedModuleFromComboxBox = "";
	private String dateOfBirth = "";

	public JTextField getMobileNoTextField() {
		return mobileNoTextField;
	}

	public JTextField getAddressTextField() {
		return addressTextField;
	}

	public JTextField getFullNametextField() {
		return fullNametextField;
	}

	public JTextField getDateOfBirthTextField() {
		return dateOfBirthTextField;
	}

	public JButton getSubmitButton() {
		return submitButton;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public JCheckBox getIsPartTimeCheckBox() {
		return isPartTimeCheckBox;
	}

	public JComboBox getAssignedModulecomboBox() {
		return assignedModulecomboBox;
	}

	/**
	 * Create the dialog.
	 */
	public TeacherForm() {
		setTitle("Add Teacher Form");
		setBounds(100, 100, 606, 463);
		formPanel = new JPanel();
		setContentPane(formPanel);

		JLabel lblNewLabel = new JLabel("FullName\r\n");

		fullNametextField = new JTextField();
		fullNametextField.setColumns(10);

		submitButton = new JButton("Add");
		submitButton.setActionCommand("Submit");
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getActionCommand().equals("Submit")) {

					if (fullNametextField.getText().isEmpty()) {
						lblNewLabel_6.setVisible(true);
					} else {
						lblNewLabel_6.setVisible(false);
					}

					name = fullNametextField.getText().trim(); // Ram
					address = addressTextField.getText().trim();
					mobileNumber = mobileNoTextField.getText().trim();
					dateOfBirth = dateOfBirthTextField.getText().trim();

					for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
						AbstractButton button = buttons.nextElement();

						if (button.isSelected()) {
							gender = button.getText(); // female
						}
					}

					if (isPartTimeCheckBox.isSelected()) {
						isPartTime = "YES";
					} else {
						isPartTime = "NO";

					}

					Statement statement = DbUtil.getStatement();

//						'"+   +"'
					String insertQuery = "INSERT INTO `teacher` (`Id`, `Name`, `MobileNumber`, `Address`, `Gender`, `ModuleAssigned`, `DateOfBirth`, `IsPartTime`)"
							+ " VALUES (NULL, '" + name + "', '" + mobileNumber + "', '" + address + "', '" + gender
							+ "', '" + selectedModuleFromComboxBox + "', '" + dateOfBirth + "', '" + isPartTime + "')";

					try {
						int insertSuccess = statement.executeUpdate(insertQuery);
						if (insertSuccess == 1) {
							JOptionPane.showMessageDialog(formPanel, "Saved into database!");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					AdminDashboard.showDataInTableFromDb();
				}

			}

		});

		lblNewLabel_1 = new JLabel("Mobile No\r\n");

		mobileNoTextField = new JTextField();
		mobileNoTextField.setColumns(10);

		addressTextField = new JTextField();
		addressTextField.setColumns(10);

		lblNewLabel_3 = new JLabel("Address\r\n");

		lblNewLabel_4 = new JLabel("Date of Birth\r\n\r\n");

		dateOfBirthTextField = new JTextField();
		dateOfBirthTextField.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);

		lblNewLabel_7 = new JLabel("Sex");
		SpringLayout sl_formPanel = new SpringLayout();
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 262, SpringLayout.NORTH, formPanel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, dateOfBirthTextField, -3, SpringLayout.NORTH, lblNewLabel_4);
		sl_formPanel.putConstraint(SpringLayout.WEST, dateOfBirthTextField, 6, SpringLayout.EAST, lblNewLabel_4);
		sl_formPanel.putConstraint(SpringLayout.EAST, dateOfBirthTextField, -35, SpringLayout.EAST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_formPanel.putConstraint(SpringLayout.EAST, lblNewLabel_4, -392, SpringLayout.EAST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, addressTextField, 25, SpringLayout.SOUTH, mobileNoTextField);
		sl_formPanel.putConstraint(SpringLayout.SOUTH, addressTextField, -23, SpringLayout.NORTH, rdbtnNewRadioButton);
		sl_formPanel.putConstraint(SpringLayout.WEST, mobileNoTextField, 146, SpringLayout.WEST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.SOUTH, mobileNoTextField, 20, SpringLayout.NORTH, lblNewLabel_1);
		sl_formPanel.putConstraint(SpringLayout.EAST, mobileNoTextField, 0, SpringLayout.EAST, addressTextField);
		sl_formPanel.putConstraint(SpringLayout.SOUTH, submitButton, -26, SpringLayout.SOUTH, formPanel);
		sl_formPanel.putConstraint(SpringLayout.EAST, submitButton, -223, SpringLayout.EAST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.WEST, addressTextField, 43, SpringLayout.EAST, lblNewLabel_3);
		sl_formPanel.putConstraint(SpringLayout.EAST, addressTextField, -19, SpringLayout.EAST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 4, SpringLayout.NORTH, addressTextField);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 176, SpringLayout.NORTH, formPanel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, -4, SpringLayout.NORTH, lblNewLabel_7);
		sl_formPanel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1, 35, SpringLayout.EAST,
				rdbtnNewRadioButton);
		sl_formPanel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, -4, SpringLayout.NORTH, lblNewLabel_7);
		sl_formPanel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 0, SpringLayout.WEST, fullNametextField);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel_7, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_formPanel.putConstraint(SpringLayout.EAST, lblNewLabel_7, -16, SpringLayout.EAST, lblNewLabel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, fullNametextField, 0, SpringLayout.NORTH, lblNewLabel);
		sl_formPanel.putConstraint(SpringLayout.WEST, fullNametextField, 146, SpringLayout.WEST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.SOUTH, fullNametextField, 20, SpringLayout.NORTH, lblNewLabel);
		sl_formPanel.putConstraint(SpringLayout.EAST, fullNametextField, -19, SpringLayout.EAST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 33, SpringLayout.NORTH, formPanel);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 64, SpringLayout.WEST, formPanel);
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 81, SpringLayout.NORTH, formPanel);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 64, SpringLayout.WEST, formPanel);
		formPanel.setLayout(sl_formPanel);
		formPanel.add(lblNewLabel_1);
		formPanel.add(lblNewLabel);
		formPanel.add(lblNewLabel_7);
		formPanel.add(lblNewLabel_3);
		formPanel.add(lblNewLabel_4);
		formPanel.add(addressTextField);
		formPanel.add(submitButton);
		formPanel.add(dateOfBirthTextField);
		formPanel.add(rdbtnNewRadioButton);
		formPanel.add(rdbtnNewRadioButton_1);
		formPanel.add(fullNametextField);
		formPanel.add(mobileNoTextField);

		isPartTimeCheckBox = new JCheckBox("PartTime");
		sl_formPanel.putConstraint(SpringLayout.WEST, isPartTimeCheckBox, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_formPanel.putConstraint(SpringLayout.SOUTH, isPartTimeCheckBox, -20, SpringLayout.NORTH, lblNewLabel_4);
		isPartTimeCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		formPanel.add(isPartTimeCheckBox);

		lblNewLabel_6 = new JLabel("Full Name cannnot be empty!");
		sl_formPanel.putConstraint(SpringLayout.NORTH, mobileNoTextField, 6, SpringLayout.SOUTH, lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setVisible(false);
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 6, SpringLayout.SOUTH, fullNametextField);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, fullNametextField);
		formPanel.add(lblNewLabel_6);

		assignedModulecomboBox = new JComboBox();
		assignedModulecomboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					selectedModuleFromComboxBox = (String) e.getItem();
//					System.out.println(e.getItem());
				}
			}
		});

		sl_formPanel.putConstraint(SpringLayout.SOUTH, assignedModulecomboBox, -35, SpringLayout.NORTH, submitButton);
		sl_formPanel.putConstraint(SpringLayout.EAST, assignedModulecomboBox, 0, SpringLayout.EAST, lblNewLabel_6);
		assignedModulecomboBox
				.setModel(new DefaultComboBoxModel(new String[] { "Select Module", "OODP", "NMC", "AI" }));
		formPanel.add(assignedModulecomboBox);

		JLabel lblNewLabel_2 = new JLabel("Assign Module\r\n");
		sl_formPanel.putConstraint(SpringLayout.NORTH, assignedModulecomboBox, -4, SpringLayout.NORTH, lblNewLabel_2);
		sl_formPanel.putConstraint(SpringLayout.WEST, assignedModulecomboBox, 69, SpringLayout.EAST, lblNewLabel_2);
		sl_formPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 44, SpringLayout.SOUTH, lblNewLabel_4);
		sl_formPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 63, SpringLayout.WEST, formPanel);
		formPanel.add(lblNewLabel_2);
	}
}