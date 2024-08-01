

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class AdminDashboard {

	private JFrame frmAdminDashboard;
	private CardLayout cl_cardPanel = new CardLayout(0, 0);
	private JPanel cardPanel;
	private JTable teacherJtable;
	private static DefaultTableModel teacherDefaultTableModel = new DefaultTableModel(
			new Object[][] { { null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null }, },
			new String[] { "Id", "Name", "MobileNumber", "Address", "Gender", "ModuleAssigned", "DateOfBirth",
					"IsPartTime" });

	public JFrame getFrmAdminDashboard() {
		return frmAdminDashboard;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
					window.frmAdminDashboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public AdminDashboard() {
		initialize();
	}

	public static void showDataInTableFromDb() {
		Statement statement = DbUtil.getStatement();

		String selectQuery = "SELECT * FROM `teacher`";

		ResultSet resultSet;
		try {
			resultSet = statement.executeQuery(selectQuery);
			teacherDefaultTableModel.setRowCount(0);
			while (resultSet.next()) {
				int idFromDb = resultSet.getInt("Id");
				// varchar getString()
				// bigint getBigDecimal()
				// date getDate()
				String nameFromDb = resultSet.getString("Name");
				BigDecimal mobileNoFromDb = resultSet.getBigDecimal("MobileNumber");
				String addressFromDb = resultSet.getString("Address");
				String genderFromDb = resultSet.getString("Gender");
				String moduleAssignedFromDb = resultSet.getString("ModuleAssigned");
				Date dateFromDb = resultSet.getDate("DateOfBirth");
				String isPartTimeFromDb = resultSet.getString("IsPartTime");

				teacherDefaultTableModel.addRow(new Object[] { idFromDb, nameFromDb, mobileNoFromDb, addressFromDb,
						genderFromDb, moduleAssignedFromDb, dateFromDb, isPartTimeFromDb });

//				System.out.println(idFromDb);
//				System.out.println(nameFromDb);
//				System.out.println(addressFromDb);
//				System.out.println(genderFromDb);
//				System.out.println(moduleAssignedFromDb);
//				System.out.println(dateFromDb);
//				System.out.println(isPartTimeFromDb);
//				System.out.println("----------------------------------");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws SQLException
	 */
	private void initialize() {
		frmAdminDashboard = new JFrame();

		frmAdminDashboard.setTitle("Admin Dashboard\r\n");
		frmAdminDashboard.setBounds(100, 100, 870, 448);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(0);
		frmAdminDashboard.setContentPane(splitPane);

		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);

		JLabel lblNewLabel = new JLabel("Welcome Admin");

		JButton btnNewButton = new JButton("Teacher");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel, "name_77231035427800");
			}
		});

		JButton btnNewButton_1 = new JButton("Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel, "name_77250554168900");
			}
		});

		JButton btnNewButton_2 = new JButton("Logout\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE).addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel.createSequentialGroup().addGap(33)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup().addComponent(btnNewButton_2)
												.addContainerGap())
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addComponent(btnNewButton_1)
														.addContainerGap())
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGap(43))))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(btnNewButton).addGap(33).addComponent(btnNewButton_1).addGap(37)
						.addComponent(btnNewButton_2).addContainerGap(161, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setDividerSize(0);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_1);

		JPanel panel_1 = new JPanel();
		splitPane_1.setLeftComponent(panel_1);

		JLabel lblTenants = new JLabel("10 tenants");
		lblTenants.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTenants.setOpaque(true);
		lblTenants.setBackground(new Color(255, 128, 64));
		panel_1.add(lblTenants);

		JLabel lblNewLabel_1 = new JLabel("10 Landlords\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(255, 128, 255));
		panel_1.add(lblNewLabel_1);

		cardPanel = new JPanel();
		splitPane_1.setRightComponent(cardPanel);
		cardPanel.setLayout(cl_cardPanel);

		JPanel teacherCardPanel = new JPanel();
		cardPanel.add(teacherCardPanel, "name_77231035427800");

		JLabel lblNewLabel_2 = new JLabel("Teacher CRUD View");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JButton btnNewButton_3 = new JButton("Add Teacher");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Teacher button clicked!!");
				TeacherForm teacherForm = new TeacherForm();
				teacherForm.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_teacherCardPanel = new GroupLayout(teacherCardPanel);
		gl_teacherCardPanel.setHorizontalGroup(gl_teacherCardPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_teacherCardPanel.createSequentialGroup().addContainerGap(75, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2).addGap(206))
				.addGroup(gl_teacherCardPanel.createSequentialGroup().addContainerGap(239, Short.MAX_VALUE)
						.addComponent(btnNewButton_3).addGap(199))
				.addGroup(Alignment.LEADING, gl_teacherCardPanel.createSequentialGroup().addGap(43)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE).addContainerGap()));
		gl_teacherCardPanel.setVerticalGroup(gl_teacherCardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_teacherCardPanel.createSequentialGroup().addGap(38).addComponent(lblNewLabel_2).addGap(31)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE).addGap(18)
						.addComponent(btnNewButton_3)));

		teacherJtable = new JTable();
		teacherJtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(teacherJtable.getSelectedRow());

				Object[] options = { "Update", "Delete" };
				int n = JOptionPane.showOptionDialog(null, "Do you want to update or delete?",
						"Update or Delete Teacher", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
						options, options[0]);
				if (n == 0) {// update

					TeacherForm updateTeacherForm = new TeacherForm();
					updateTeacherForm.setVisible(true);
					updateTeacherForm.setTitle("Update Teacher Form");

					JButton updateButton = updateTeacherForm.getSubmitButton();
					updateButton.setText("Update");

					String name = "";
					String mobileNumber = "";
					String address = "";
					String gender = "";
					String isPartTime = "";
					String dateOfBirth = "";
					String selectedModuleFromComboxBox = "";
					int selectedRowNo = teacherJtable.getSelectedRow();
					for (int columnIndex = 1; columnIndex < teacherJtable.getColumnCount(); columnIndex++) {
						if (name.isEmpty()) {
							name = teacherJtable.getValueAt(teacherJtable.getSelectedRow(), columnIndex).toString();
						} else if (mobileNumber.isEmpty()) {
							mobileNumber = teacherJtable.getValueAt(teacherJtable.getSelectedRow(), columnIndex)
									.toString();
						} else if (address.isEmpty()) {
							address = teacherJtable.getValueAt(teacherJtable.getSelectedRow(), columnIndex).toString();
						} else if (gender.isEmpty()) {
							gender = teacherJtable.getValueAt(teacherJtable.getSelectedRow(), columnIndex).toString();
						} else if (selectedModuleFromComboxBox.isEmpty()) {
							selectedModuleFromComboxBox = teacherJtable
									.getValueAt(teacherJtable.getSelectedRow(), columnIndex).toString();
						} else if (dateOfBirth.isEmpty()) {
							dateOfBirth = teacherJtable.getValueAt(teacherJtable.getSelectedRow(), columnIndex)
									.toString();
						} else if (isPartTime.isEmpty()) {
							isPartTime = teacherJtable.getValueAt(teacherJtable.getSelectedRow(), columnIndex)
									.toString();
						}
					}

					System.out.println("Name" + name);
					System.out.println("Mobile No" + mobileNumber);
					System.out.println("Address " + address);
					System.out.println("Gender " + gender);
					System.out.println("Module " + selectedModuleFromComboxBox);
					System.out.println("DOB " + dateOfBirth);
					System.out.println("Parttime? " + isPartTime);

					updateTeacherForm.getFullNametextField().setText(name);
					updateTeacherForm.getMobileNoTextField().setText(mobileNumber.toString());
					updateTeacherForm.getAddressTextField().setText(address);
					ButtonGroup buttonGroup = updateTeacherForm.getButtonGroup();

					for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
						AbstractButton button = buttons.nextElement();
						if (gender.equals(button.getText())) {
							button.setSelected(true);
						}
					}

					updateTeacherForm.getDateOfBirthTextField().setText(dateOfBirth);

					JCheckBox isPartTimeCheckBox = updateTeacherForm.getIsPartTimeCheckBox();

					if (isPartTime.equals("YES")) {
						isPartTimeCheckBox.setSelected(true);
					} else if (isPartTime.equals("NO")) {
						isPartTimeCheckBox.setSelected(false);
					}

					JComboBox assignedModulecomboBox = updateTeacherForm.getAssignedModulecomboBox();
					ComboBoxModel model = assignedModulecomboBox.getModel();

					for (int i = 1; i <= 3; i++) {
						if (model.getElementAt(i).equals(selectedModuleFromComboxBox)) {
							model.setSelectedItem(model.getElementAt(i));
							break;
						}

					}

					updateButton.setActionCommand("Update");
					updateButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							if (e.getActionCommand().equals("Update")) {
//								
								JTextField fullNametextField = updateTeacherForm.getFullNametextField();
								JTextField addressTextField = updateTeacherForm.getAddressTextField();
								JTextField mobileNoTextField = updateTeacherForm.getMobileNoTextField();
								JComboBox assignedModulecomboBox2 = updateTeacherForm.getAssignedModulecomboBox();
								JCheckBox isPartTimeCheckBox2 = updateTeacherForm.getIsPartTimeCheckBox();

								BigDecimal oldMobileNumber = (BigDecimal) teacherJtable
										.getValueAt(teacherJtable.getSelectedRow(), 2);

								String updatedName = fullNametextField.getText().trim();
								String updatedMobileNo = mobileNoTextField.getText().trim();
								String updatedAddress = addressTextField.getText().trim();
								String updatedIsPartTime = "NO";
								String updatedSelectedModule = "";

								ComboBoxModel comboBoxModel = assignedModulecomboBox.getModel();
								Object selectedItem = comboBoxModel.getSelectedItem();
								updatedSelectedModule = selectedItem.toString();

								if (isPartTimeCheckBox.isSelected()) {
									updatedIsPartTime = "YES";
								} else {
									updatedIsPartTime = "NO";
								}

								String updateQuery = "UPDATE `teacher` SET " + "`Name` = '" + updatedName + "', "
										+ "`MobileNumber` = '" + updatedMobileNo + "', " + "`Address` = '"
										+ updatedAddress + "', " + "`ModuleAssigned` = '" + updatedSelectedModule
										+ "', " + "`IsPartTime` = '" + updatedIsPartTime + "' "
										+ "WHERE `teacher`.`MobileNumber` =" + oldMobileNumber + " ";

								Statement statement = DbUtil.getStatement();
								try {
									int updateSuccess = statement.executeUpdate(updateQuery);
									if (updateSuccess == 1) {
										JOptionPane.showMessageDialog(scrollPane, "Data is updated!!");
									} else {
										JOptionPane.showMessageDialog(scrollPane,
												"Something went wrong in update operation!!");

									}

								} catch (SQLException e1) {
									e1.printStackTrace();
								}

								AdminDashboard.showDataInTableFromDb();

								System.out.println("Update is working....");
							}
						}
					});

				} else { // delete

					BigDecimal deleteMobileNumber = (BigDecimal) teacherJtable
							.getValueAt(teacherJtable.getSelectedRow(), 2);

					Statement statement = DbUtil.getStatement();

					String deleteQuery = "DELETE FROM teacher WHERE `teacher`.`MobileNumber` = " + deleteMobileNumber
							+ "";

					try {
						int deleteSuccess = statement.executeUpdate(deleteQuery);
						if (deleteSuccess == 1) {
							JOptionPane.showMessageDialog(scrollPane, "Data is deleted!!");
						} else {
							JOptionPane.showMessageDialog(scrollPane, "Something went wrong in delete operation!!");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					AdminDashboard.showDataInTableFromDb();

				}
			}
		});
		teacherJtable.setDefaultEditor(Object.class, null);

		teacherJtable.setModel(teacherDefaultTableModel);
		teacherJtable.getColumnModel().getColumn(1).setPreferredWidth(58);
		teacherJtable.getColumnModel().getColumn(2).setPreferredWidth(88);
		teacherJtable.getColumnModel().getColumn(4).setPreferredWidth(64);
		teacherJtable.getColumnModel().getColumn(5).setPreferredWidth(98);
		scrollPane.setViewportView(teacherJtable);
		teacherCardPanel.setLayout(gl_teacherCardPanel);

		JPanel studentCardPanel = new JPanel();
		cardPanel.add(studentCardPanel, "name_77250554168900");
		splitPane.setDividerLocation(150);

		AdminDashboard.showDataInTableFromDb();

		frmAdminDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminDashboard.setVisible(true);
	}
}