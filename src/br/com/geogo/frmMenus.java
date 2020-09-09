package br.com.geogo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Toolkit;

import br.com.geogo.cities.*;

public class frmMenus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenus frame = new frmMenus();
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
	public frmMenus() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\logo\\globo2.png"));
		setForeground(Color.WHITE);
		setTitle("Geo Go");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 730, 620);
		setLocationRelativeTo(null);
				
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 724, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(SystemColor.controlHighlight);
		setJMenuBar(menuBar);
		
		JMenu mnAmerica = new JMenu("America");
		mnAmerica.setForeground(Color.DARK_GRAY);
		mnAmerica.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnAmerica);
		
		JMenuItem mntmAmericaBrasilia = new JMenuItem("Bras\u00EDlia");
		mntmAmericaBrasilia.setBackground(SystemColor.control);
		mntmAmericaBrasilia.setFont(new Font("Arial", Font.BOLD, 12));
		mntmAmericaBrasilia.setForeground(Color.GRAY);
		mntmAmericaBrasilia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmBrasilia frmP = new br.com.geogo.cities.frmBrasilia();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		mnAmerica.add(mntmAmericaBrasilia);
		
		JMenuItem mntmAmericaWashin = new JMenuItem("Washington D.C.");
		mntmAmericaWashin.setForeground(Color.GRAY);
		mntmAmericaWashin.setFont(new Font("Arial", Font.BOLD, 12));
		mntmAmericaWashin.setBackground(SystemColor.control);
		mntmAmericaWashin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmWashington frmD = new br.com.geogo.cities.frmWashington();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnAmerica.add(mntmAmericaWashin);
		
		JMenu mnAfrica = new JMenu("\u00C1frica");
		mnAfrica.setForeground(Color.DARK_GRAY);
		mnAfrica.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnAfrica);
		
		JMenuItem mntmAfricaLuanda = new JMenuItem("Luanda");
		mntmAfricaLuanda.setForeground(Color.GRAY);
		mntmAfricaLuanda.setFont(new Font("Arial", Font.BOLD, 12));
		mntmAfricaLuanda.setBackground(SystemColor.menu);
		mntmAfricaLuanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmLuanda frmD = new br.com.geogo.cities.frmLuanda();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnAfrica.add(mntmAfricaLuanda);
		
		JMenuItem mntmAfricaCairo = new JMenuItem("Cairo");
		mntmAfricaCairo.setForeground(Color.GRAY);
		mntmAfricaCairo.setFont(new Font("Arial", Font.BOLD, 12));
		mntmAfricaCairo.setBackground(SystemColor.menu);
		mntmAfricaCairo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmCairo frmD = new br.com.geogo.cities.frmCairo();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnAfrica.add(mntmAfricaCairo);
		
		JMenu mnEuropa = new JMenu("Europa");
		mnEuropa.setBackground(Color.LIGHT_GRAY);
		mnEuropa.setForeground(Color.DARK_GRAY);
		mnEuropa.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnEuropa);
		
		JMenuItem mntmEuropaLondres = new JMenuItem("Londres");
		mntmEuropaLondres.setForeground(Color.GRAY);
		mntmEuropaLondres.setBackground(SystemColor.control);
		mntmEuropaLondres.setFont(new Font("Arial", Font.BOLD, 12));
		mntmEuropaLondres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmLondres frmP = new br.com.geogo.cities.frmLondres();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		mnEuropa.add(mntmEuropaLondres);
		
		JMenuItem mntmEuropaRoma = new JMenuItem("Roma");
		mntmEuropaRoma.setBackground(SystemColor.control);
		mntmEuropaRoma.setFont(new Font("Arial", Font.BOLD, 12));
		mntmEuropaRoma.setForeground(Color.GRAY);
		mntmEuropaRoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmRoma frmD = new br.com.geogo.cities.frmRoma();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnEuropa.add(mntmEuropaRoma);
		
		JMenu mnAsia = new JMenu("\u00C1sia");
		mnAsia.setForeground(Color.DARK_GRAY);
		mnAsia.setFont(new Font("Arial", Font.BOLD, 12));
		mnAsia.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnAsia);
		
		JMenuItem mntmAsiaPequim = new JMenuItem("Pequim");
		mntmAsiaPequim.setForeground(Color.GRAY);
		mntmAsiaPequim.setFont(new Font("Arial", Font.BOLD, 12));
		mntmAsiaPequim.setBackground(SystemColor.menu);
		mntmAsiaPequim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmPequim frmD = new br.com.geogo.cities.frmPequim();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnAsia.add(mntmAsiaPequim);
		
		JMenuItem mntmAsiaNova = new JMenuItem("Nova Deli");
		mntmAsiaNova.setForeground(Color.GRAY);
		mntmAsiaNova.setFont(new Font("Arial", Font.BOLD, 12));
		mntmAsiaNova.setBackground(SystemColor.menu);
		mntmAsiaNova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmNovaDeli frmD = new br.com.geogo.cities.frmNovaDeli();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnAsia.add(mntmAsiaNova);
		
		JMenu mnOceania = new JMenu("Oceania");
		mnOceania.setForeground(Color.DARK_GRAY);
		mnOceania.setFont(new Font("Arial", Font.BOLD, 12));
		mnOceania.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnOceania);
		
		JMenuItem mntmOceaniaCamb = new JMenuItem("Camberra");
		mntmOceaniaCamb.setForeground(Color.GRAY);
		mntmOceaniaCamb.setFont(new Font("Arial", Font.BOLD, 12));
		mntmOceaniaCamb.setBackground(SystemColor.menu);
		mntmOceaniaCamb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmCamberra frmD = new br.com.geogo.cities.frmCamberra();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnOceania.add(mntmOceaniaCamb);
		
		JMenuItem mntmOceaniaPort = new JMenuItem("Port Moresby");
		mntmOceaniaPort.setForeground(Color.GRAY);
		mntmOceaniaPort.setFont(new Font("Arial", Font.BOLD, 12));
		mntmOceaniaPort.setBackground(SystemColor.menu);
		mntmOceaniaPort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmPortMoresby frmD = new br.com.geogo.cities.frmPortMoresby();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnOceania.add(mntmOceaniaPort);
		
		JMenu mnDesenvolvedor = new JMenu("Desenvolvedor");
		mnDesenvolvedor.setForeground(Color.DARK_GRAY);
		mnDesenvolvedor.setFont(new Font("Arial", Font.BOLD, 12));
		mnDesenvolvedor.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnDesenvolvedor);
		
		JMenuItem mntmDesenvolvedorCreditos = new JMenuItem("Cr\u00E9ditos");
		mntmDesenvolvedorCreditos.setForeground(Color.GRAY);
		mntmDesenvolvedorCreditos.setFont(new Font("Arial", Font.BOLD, 12));
		mntmDesenvolvedorCreditos.setBackground(SystemColor.menu);
		mntmDesenvolvedorCreditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDesenvolvedor frmD = new frmDesenvolvedor();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		mnDesenvolvedor.add(mntmDesenvolvedorCreditos);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setBackground(Color.LIGHT_GRAY);
		mnSair.setFont(new Font("Arial", Font.BOLD, 12));
		mnSair.setForeground(Color.DARK_GRAY);
		menuBar.add(mnSair);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setForeground(Color.GRAY);
		mntmSair.setFont(new Font("Arial", Font.BOLD, 12));
		mntmSair.setBackground(SystemColor.control);
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSair.add(mntmSair);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setEnabled(false);
		toolBar.setBackground(SystemColor.scrollbar);
		toolBar.setBounds(0, 0, 724, 41);
		panel.add(toolBar);
		
		JButton btnBrasilia = new JButton("");
		btnBrasilia.setBackground(SystemColor.scrollbar);
		btnBrasilia.setBorder(null);
		btnBrasilia.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\brasil.png"));
		btnBrasilia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmBrasilia frmP = new br.com.geogo.cities.frmBrasilia();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut);
		toolBar.add(btnBrasilia);
		
		JButton btnWashington = new JButton("");
		btnWashington.setBackground(SystemColor.scrollbar);
		btnWashington.setBorder(null);
		btnWashington.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\eua.png"));
		btnWashington.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmWashington frmD = new br.com.geogo.cities.frmWashington();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_1);
		toolBar.add(btnWashington);
		
		JButton btnLuanda = new JButton("");
		btnLuanda.setBackground(SystemColor.scrollbar);
		btnLuanda.setBorder(null);
		btnLuanda.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\angola.png"));
		btnLuanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmLuanda frmP = new br.com.geogo.cities.frmLuanda();
				frmP.setVisible(true);
				panel.add(frmP);
			}
		});
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_2);
		
		toolBar.add(btnLuanda);
		
		JButton btnCairo = new JButton("");
		btnCairo.setBackground(SystemColor.scrollbar);
		btnCairo.setBorder(null);
		btnCairo.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\egito.png"));
		btnCairo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmCairo frmD = new br.com.geogo.cities.frmCairo();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_3);
		toolBar.add(btnCairo);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_4);
		
		JButton btnLondres = new JButton("");
		btnLondres.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\reino_unido.png"));
		btnLondres.setBorder(null);
		btnLondres.setBackground(SystemColor.scrollbar);
		btnLondres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmLondres frmD = new br.com.geogo.cities.frmLondres();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		toolBar.add(btnLondres);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_5);
		
		JButton btnRoma = new JButton("");
		btnRoma.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\italia.png"));
		btnRoma.setBorder(null);
		btnRoma.setBackground(SystemColor.scrollbar);
		btnRoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmRoma frmD = new br.com.geogo.cities.frmRoma();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		toolBar.add(btnRoma);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_6);
		
		JButton btnPequim = new JButton("");
		btnPequim.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\china.png"));
		btnPequim.setBorder(null);
		btnPequim.setBackground(SystemColor.scrollbar);
		btnPequim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmPequim frmD = new br.com.geogo.cities.frmPequim();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		toolBar.add(btnPequim);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_7);
		
		JButton btnNovaDeli = new JButton("");
		btnNovaDeli.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\india.png"));
		btnNovaDeli.setBorder(null);
		btnNovaDeli.setBackground(SystemColor.scrollbar);
		btnNovaDeli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmNovaDeli frmD = new br.com.geogo.cities.frmNovaDeli();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		toolBar.add(btnNovaDeli);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_8);
		
		JButton btnCamberra = new JButton("");
		btnCamberra.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\australia.png"));
		btnCamberra.setBorder(null);
		btnCamberra.setBackground(SystemColor.scrollbar);
		btnCamberra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmCamberra frmD = new br.com.geogo.cities.frmCamberra();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		toolBar.add(btnCamberra);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		toolBar.add(horizontalStrut_9);
		
		JButton btnPortMoresby = new JButton("");
		btnPortMoresby.setIcon(new ImageIcon("C:\\Users\\pclgf\\Desktop\\Arquivos\\Java_Programns\\cidadesJInternalFrame\\assets\\img\\icons\\countries\\papua-nova_guine.png"));
		btnPortMoresby.setBorder(null);
		btnPortMoresby.setBackground(SystemColor.scrollbar);
		btnPortMoresby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				br.com.geogo.cities.frmPortMoresby frmD = new br.com.geogo.cities.frmPortMoresby();
				frmD.setVisible(true);
				panel.add(frmD);
			}
		});
		toolBar.add(btnPortMoresby);
	}
}
