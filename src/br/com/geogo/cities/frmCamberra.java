package br.com.geogo.cities;

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

public class frmCamberra extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCamberra frame = new frmCamberra();
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
	public frmCamberra() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().setBackground(SystemColor.controlHighlight);
		setTitle("Camberra");
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
		
		JLabel lblBrasilia = new JLabel("");
		lblBrasilia.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\cities\\camberra.jpg"));
		lblBrasilia.setBounds(51, 69, 618, 250);
		getContentPane().add(lblBrasilia);
		
		JLabel lblCidade = new JLabel("Camberra");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 24));
		lblCidade.setBounds(305, 11, 110, 25);
		getContentPane().add(lblCidade);
		
		JLabel lblPais = new JLabel("Austr\u00E1lia");
		lblPais.setFont(new Font("Arial", Font.ITALIC, 18));
		lblPais.setBounds(324, 36, 72, 25);
		getContentPane().add(lblPais);
		
		JLabel lblPopulacao = new JLabel("Popula\u00E7\u00E3o:");
		lblPopulacao.setFont(new Font("Arial", Font.BOLD, 18));
		lblPopulacao.setBounds(42, 354, 98, 25);
		getContentPane().add(lblPopulacao);
		
		JLabel lblPopulacaoResp = new JLabel("395 790 hab (2016)");
		lblPopulacaoResp.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPopulacaoResp.setBounds(152, 354, 223, 25);
		getContentPane().add(lblPopulacaoResp);
		
		JLabel lblDensidade = new JLabel("Densidade Demog:");
		lblDensidade.setFont(new Font("Arial", Font.BOLD, 18));
		lblDensidade.setBounds(385, 354, 168, 25);
		getContentPane().add(lblDensidade);
		
		JLabel lblDensidadeResp = new JLabel(" 442,6 hab/km\u00B2");
		lblDensidadeResp.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDensidadeResp.setBounds(564, 354, 129, 25);
		getContentPane().add(lblDensidadeResp);
		
		JLabel lblArea = new JLabel("\u00C1rea:");
		lblArea.setFont(new Font("Arial", Font.BOLD, 18));
		lblArea.setBounds(42, 406, 50, 25);
		getContentPane().add(lblArea);
		
		JLabel lblAreaResp = new JLabel("814,2 km\u00B2");
		lblAreaResp.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAreaResp.setBounds(102, 406, 150, 25);
		getContentPane().add(lblAreaResp);
		
		JLabel lblLocalizacao = new JLabel("Localiza\u00E7\u00E3o:");
		lblLocalizacao.setFont(new Font("Arial", Font.BOLD, 18));
		lblLocalizacao.setBounds(340, 406, 109, 25);
		getContentPane().add(lblLocalizacao);
		
		JLabel lblLocalizacaoResp = new JLabel("35\u00B0 17' 35\" S 149\u00B0 07' 37\" E");
		lblLocalizacaoResp.setFont(new Font("Arial", Font.PLAIN, 18));
		lblLocalizacaoResp.setBounds(459, 406, 225, 25);
		getContentPane().add(lblLocalizacaoResp);

	}
}
