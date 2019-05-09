package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janelapessoafisica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janelapessoafisica frame = new Janelapessoafisica();
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
	public Janelapessoafisica() {
		setTitle("Pessoa Fisica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 11, 22, 14);
		contentPane.add(lblId);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 37, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 63, 54, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 88, 48, 14);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(62, 8, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 34, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(62, 62, 119, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(62, 85, 119, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(26, 113, 32, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(33, 138, 25, 14);
		contentPane.add(lblCpf);
		
		textField_4 = new JTextField();
		textField_4.setBounds(62, 110, 233, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(62, 135, 119, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(36, 163, 22, 14);
		contentPane.add(lblRg);
		
		textField_6 = new JTextField();
		textField_6.setBounds(62, 160, 119, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(256, 151, 119, 55);
		contentPane.add(btnNewButton);
	}
	

}
