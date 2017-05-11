package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField tFRecogeDNI;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Inserte nuevo DNI:");
		contentPane.add(lblNewLabel);
		
		tFRecogeDNI = new JTextField();
		tFRecogeDNI.setText("");
		contentPane.add(tFRecogeDNI);
		tFRecogeDNI.setColumns(10);
		
		JLabel lblLetra = new JLabel("Letra DNI Calculada:");
		contentPane.add(lblLetra);
		
		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.add(btnCalcular);
	}

}
