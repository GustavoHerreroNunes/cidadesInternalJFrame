package br.com.geogo;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class frmDesenvolvedor extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDesenvolvedor frame = new frmDesenvolvedor();
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
	public frmDesenvolvedor() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().setBackground(SystemColor.controlHighlight);
		setTitle("Cr\u00E9ditos");
		setBounds(0, 42, 724, 529);
		getContentPane().setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(571, 454, 89, 25);
		getContentPane().add(btnVoltar);
		
		JLabel lblTitulo = new JLabel("Cr\u00E9ditos");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(311, 11, 98, 25);
		getContentPane().add(lblTitulo);
		
		JLabel lblCreditos = new JLabel("<html>\r\n\t<center>\r\n\tEste projeto foi desenvolvido por <i>Gustavo Herrero Nunes</i>,<br>\r\n\tatual (2020) estudande de Desenvolvimento de Sistemas pela<br>\r\n\tEtec Zona Leste.\r\n\t</center>\r\n</html>");
		lblCreditos.setFont(new Font("Arial", Font.PLAIN, 22));
		lblCreditos.setBounds(61, 144, 599, 250);
		getContentPane().add(lblCreditos);
		
		JLabel lblProgramador = new JLabel("");
		lblProgramador.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\programador.png"));
		lblProgramador.setBounds(296, 71, 128, 128);
		getContentPane().add(lblProgramador);

	}
}
