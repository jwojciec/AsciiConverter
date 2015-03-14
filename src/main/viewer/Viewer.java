package main.viewer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;

public class Viewer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAscii;
	private JTextField textFieldHexa;
	private JTextField textFieldDecimal;
	private JTextField textFieldBinary;
	private JButton btnAscii;
	private JButton btnHexa;
	private JButton btnDecimal;
	private JButton btnBinary;

	/**
	 * Create the frame.
	 */
	public void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAscii = new JLabel("Ascii:");
		lblAscii.setBounds(10, 11, 46, 14);
		contentPane.add(lblAscii);

		JLabel lblHexa = new JLabel("Hexa:");
		lblHexa.setBounds(10, 67, 46, 14);
		contentPane.add(lblHexa);

		JLabel lblDecimal = new JLabel("Decimal:");
		lblDecimal.setBounds(10, 123, 59, 14);
		contentPane.add(lblDecimal);

		JLabel lblBinary = new JLabel("Binary:");
		lblBinary.setBounds(10, 179, 46, 14);
		contentPane.add(lblBinary);

		textFieldAscii = new JTextField();
		textFieldAscii.setBounds(10, 36, 321, 20);
		contentPane.add(textFieldAscii);
		textFieldAscii.setColumns(10);

		textFieldHexa = new JTextField();
		textFieldHexa.setBounds(10, 92, 321, 20);
		contentPane.add(textFieldHexa);
		textFieldHexa.setColumns(10);

		textFieldDecimal = new JTextField();
		textFieldDecimal.setBounds(10, 148, 321, 20);
		contentPane.add(textFieldDecimal);
		textFieldDecimal.setColumns(10);

		textFieldBinary = new JTextField();
		textFieldBinary.setBounds(10, 204, 321, 20);
		contentPane.add(textFieldBinary);
		textFieldBinary.setColumns(10);

		btnAscii = new JButton("Convert");
		btnAscii.setBounds(357, 35, 89, 23);
		contentPane.add(btnAscii);

		btnHexa = new JButton("Convert");
		btnHexa.setBounds(357, 91, 89, 23);
		contentPane.add(btnHexa);

		btnDecimal = new JButton("Convert");
		btnDecimal.setBounds(357, 147, 89, 23);
		contentPane.add(btnDecimal);

		btnBinary = new JButton("Convert");
		btnBinary.setBounds(357, 203, 89, 23);
		contentPane.add(btnBinary);
	}

	public void addAsciiListener(ActionListener asciiActionListener) {
		btnAscii.addActionListener(asciiActionListener);
	}

	public void addHexaListener(ActionListener hexaActionListener) {
		btnHexa.addActionListener(hexaActionListener);
	}

	public void addDecimalListener(ActionListener decimalActionListener) {
		btnDecimal.addActionListener(decimalActionListener);
	}

	public void addBinaryListener(ActionListener binaryActionListener) {
		btnBinary.addActionListener(binaryActionListener);
	}

	public void setAsciiText(String asciiValue) {
		textFieldAscii.setText(asciiValue);
	}

	public void setBinaryext(String binaryValue) {
		textFieldBinary.setText(binaryValue);
	}

	public void setDecimalText(String decimalValue) {
		textFieldDecimal.setText(decimalValue);
	}

	public void setHexaText(String hexaValue) {
		textFieldHexa.setText(hexaValue);
	}

	public String getAsciiText() {
		return textFieldAscii.getText();
	}

	public String getBinaryText() {
		return textFieldBinary.getText();
	}

	public String getDecimalText() {
		return textFieldDecimal.getText();
	}

	public String getHexaText() {
		return textFieldHexa.getText();
	}

	public void displayErrorMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg, "Error",
				JOptionPane.ERROR_MESSAGE);
	}
}
