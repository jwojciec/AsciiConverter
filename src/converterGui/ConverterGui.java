package converterGui;

import conversionTools.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAscii;
	private JTextField textFieldHexa;
	private JTextField textFieldDecimal;
	private JTextField textFieldBinary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());					
					ConverterGui frame = new ConverterGui();
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
	public ConverterGui() {
		final String ASCII = "ASCII";
		final String HEX = "HEX";
		final String DEC = "DEC";
		final String BIN = "BIN";
		
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
		
		JButton btnAscii = new JButton("Convert");
		btnAscii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					ConversionTools convTolls = new ConversionTools(ASCII, textFieldAscii.getText());
					textFieldHexa.setText(convTolls.getHex().toUpperCase());
					textFieldDecimal.setText(convTolls.getDec());
					textFieldBinary.setText(convTolls.getBin());
				} catch(Exception exception){
					System.out.println("Error:" + exception);
				}
			}
		});
		btnAscii.setBounds(357, 35, 89, 23);
		contentPane.add(btnAscii);
		
		JButton btnHexa = new JButton("Convert");
		btnHexa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					ConversionTools convTolls = new ConversionTools(HEX, textFieldHexa.getText());
					textFieldAscii.setText(convTolls.getAscii());
					textFieldDecimal.setText(convTolls.getDec());
					textFieldBinary.setText(convTolls.getBin());
				} catch(Exception exception){
					System.out.println("Error: " + exception);
				}
			}
		});
		btnHexa.setBounds(357, 91, 89, 23);
		contentPane.add(btnHexa);
		
		JButton btnDecimal = new JButton("Convert");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					ConversionTools convTolls = new ConversionTools(DEC, textFieldDecimal.getText());
					textFieldAscii.setText(convTolls.getAscii());
					textFieldHexa.setText(convTolls.getHex().toUpperCase());
					textFieldBinary.setText(convTolls.getBin());
				} catch (Exception exception){
					System.out.println("Error: " + exception);
				}
			}
		});
		btnDecimal.setBounds(357, 147, 89, 23);
		contentPane.add(btnDecimal);
		
		JButton btnBinary = new JButton("Convert");
		btnBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					ConversionTools convTolls = new ConversionTools(BIN, textFieldBinary.getText());
					textFieldAscii.setText(convTolls.getAscii());
					textFieldHexa.setText(convTolls.getHex().toUpperCase());
					textFieldDecimal.setText(convTolls.getDec());
				} catch (Exception exception){
					System.out.println("Error: " + exception);
				}
			}
		});
		btnBinary.setBounds(357, 203, 89, 23);
		contentPane.add(btnBinary);
	}
}
