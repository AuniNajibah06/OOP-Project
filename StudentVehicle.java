package studentVehicle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class StudentVehicle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentVehicle frame = new StudentVehicle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentVehicle() {
		setTitle("Student Vehicle Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("UTeM Student Vehicle Registration System");
		lblNewLabel.setBounds(85, 12, 337, 21);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Student Credentials");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(10, 44, 135, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(20, 72, 34, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 69, 478, 156);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(92, 0, 385, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_1.setColumns(10);
		textField_1.setBounds(92, 25, 137, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("IC Number:");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(0, 27, 67, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Phone Number:");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(248, 27, 88, 14);

		panel.add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(340, 24, 137, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Matric Number:");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(0, 76, 88, 14);
		panel.add(lblNewLabel_2_1_1_1);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(92, 73, 137, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Year of Study:");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_2.setBounds(248, 75, 88, 14);
		panel.add(lblNewLabel_2_1_1_2);
		
		JSpinner spinner = new JSpinner();

		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setBounds(340, 73, 41, 20);
		panel.add(spinner);
		spinner.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Faculty:");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(0, 101, 88, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_7.setColumns(10);
		textField_7.setBounds(92, 98, 137, 20);
		panel.add(textField_7);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("License Validity:");
		lblNewLabel_2_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_2.setBounds(0, 52, 88, 14);
		panel.add(lblNewLabel_2_1_1_1_2);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(92, 49, 137, 20);
		panel.add(textField_8);

		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Address:");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1.setBounds(0, 128, 88, 14);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(92, 125, 376, 20);
		panel.add(textField_9);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(18, 296, 488, 26);
		contentPane.add(separator);

		JLabel lblNewLabel_1_1 = new JLabel("Vehicle Details");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(17, 308, 135, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 333, 213, 88);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Vehicle Type:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(0, 1, 85, 14);
		panel_1.add(lblNewLabel_3);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Car");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(0, 18, 111, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMotorcycle = new JRadioButton("Motorcycle");
		rdbtnMotorcycle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMotorcycle.setBounds(0, 42, 111, 23);
		panel_1.add(rdbtnMotorcycle);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(228, 1, 1, 98);

		panel_1.add(separator_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(271, 333, 228, 88);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Model Name:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(0, 4, 85, 14);
		panel_1_1.add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setBounds(100, 1, 129, 20);
		panel_1_1.add(textField_4);

		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(100, 29, 129, 20);
		panel_1_1.add(textField_5);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Plate Number:");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(0, 32, 85, 14);
		panel_1_1.add(lblNewLabel_3_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_6.setColumns(10);
		textField_6.setBounds(100, 57, 129, 20);
		panel_1_1.add(textField_6);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Color:");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1_2.setBounds(0, 60, 85, 14);
		panel_1_1.add(lblNewLabel_3_1_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(248, 333, 13, 88);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Register");

		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(154, 432, 204, 34);
		contentPane.add(btnNewButton);
	}
}


