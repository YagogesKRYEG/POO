package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaExemplo extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JButton btnAcessar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaExemplo frame = new JanelaExemplo();
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
	public JanelaExemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDoCliente = new JLabel("Id do Cliente:");
		lblIdDoCliente.setBounds(10, 11, 77, 14);
		contentPane.add(lblIdDoCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(82, 11, 77, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAcessar.setBounds(82, 36, 104, 23);
		contentPane.add(btnAcessar);
	}
}
