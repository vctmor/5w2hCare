package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Care5w2h extends JFrame {
	
	DAO dao = new DAO();
	
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	

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
	private JLabel lblNewLabel_9;
	private JButton btnAtualizar;
	private JButton btnExcluirAo;
	private JButton btnLimparCampos;
	private JLabel lblNoIniciada;
	private JLabel lblGernciaResposvel_2;
	private JLabel lblGernciaResposvel_3;
	private JLabel lblGernciaResposvel_1;
	private JLabel lblCustoTotal;
	private JLabel lblStatusGeralgrfico;
	private JTextField textField_10;
	private JPanel panel;

	private JLabel lblDate;
	private JLabel lblState;

	private JTextField textField_11;
	private JLabel lblDescri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Care5w2h frame = new Care5w2h();
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
	public Care5w2h() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {

				statusConnection();
				//setarData();
				
				setLocationRelativeTo(null);
			}
		});
		
		setTitle("5w2hCare");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que (nome da ação):");
		lblNewLabel.setToolTipText("Nome da Ação");
		lblNewLabel.setBounds(13, 12, 177, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quem:");

		lblNewLabel_1.setBounds(13, 163, 52, 15);

		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Início:");
		lblNewLabel_2.setBounds(21, 449, 43, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Como:");
		lblNewLabel_3.setBounds(11, 205, 52, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Onde:");
		lblNewLabel_4.setBounds(110, 388, 43, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Justificativa:");
		lblNewLabel_5.setBounds(12, 300, 100, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Urgência:");
		lblNewLabel_6.setBounds(13, 124, 70, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Orçamento:");
		lblNewLabel_7.setBounds(12, 392, 86, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Status:");
		lblNewLabel_8.setBounds(12, 476, 52, 15);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();

		textField.setBounds(12, 33, 282, 19);

		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_1.setBounds(13, 181, 281, 19);

		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(67, 447, 86, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 224, 283, 64);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(107, 416, 187, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 326, 282, 64);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);

		textField_6.setBounds(13, 143, 135, 19);

		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(12, 416, 86, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(67, 476, 86, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(214, 445, 80, 19);
		contentPane.add(textField_9);
		
		lblNewLabel_9 = new JLabel("Fim:");
		lblNewLabel_9.setBounds(181, 447, 34, 15);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Cadastrar Ação");
		btnNewButton.setBounds(12, 507, 147, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gerar Relatório");
		btnNewButton_1.setToolTipText("Gera PDF contendo as Ações cadastradas");
		btnNewButton_1.setBounds(181, 544, 145, 25);
		contentPane.add(btnNewButton_1);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(12, 544, 147, 25);
		contentPane.add(btnAtualizar);
		
		btnExcluirAo = new JButton("Excluir Ação");
		btnExcluirAo.setBounds(181, 505, 147, 25);
		contentPane.add(btnExcluirAo);
		
		btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(181, 470, 147, 25);
		contentPane.add(btnLimparCampos);
		
		lblNoIniciada = new JLabel("Não Iniciada:");
		lblNoIniciada.setBounds(334, 195, 93, 15);
		contentPane.add(lblNoIniciada);
		
		lblGernciaResposvel_2 = new JLabel("Atrasada:");
		lblGernciaResposvel_2.setBounds(357, 222, 70, 15);
		contentPane.add(lblGernciaResposvel_2);
		
		lblGernciaResposvel_3 = new JLabel("Em andamento:");
		lblGernciaResposvel_3.setBounds(334, 313, 126, 15);
		contentPane.add(lblGernciaResposvel_3);
		
		lblGernciaResposvel_1 = new JLabel("Concluída:");
		lblGernciaResposvel_1.setBounds(371, 339, 80, 15);
		contentPane.add(lblGernciaResposvel_1);
		
		lblCustoTotal = new JLabel("Custo Total");
		lblCustoTotal.setBounds(498, 195, 93, 15);
		contentPane.add(lblCustoTotal);
		
		lblStatusGeralgrfico = new JLabel("Status Geral (gráfico piza)");
		lblStatusGeralgrfico.setBounds(513, 300, 177, 15);
		contentPane.add(lblStatusGeralgrfico);
		
		JLabel lblNewLabel_9_1 = new JLabel("RI:");
		lblNewLabel_9_1.setBounds(151, 160, 24, 15);
		contentPane.add(lblNewLabel_9_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(179, 156, 80, 19);
		contentPane.add(textField_10);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(12, 573, 699, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(13, 72, 281, 52);

		lblDate = new JLabel("");
		lblDate.setBounds(10, 16, 245, 15);
		panel.add(lblDate);
		
		lblState = new JLabel("");
		lblState.setIcon(new ImageIcon(Care5w2h.class.getResource("/img/dboff.png")));
		lblState.setBounds(626, 5, 32, 32);
		panel.add(lblState);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(11, 72, 283, 52);
		contentPane.add(textField_11);
		
		lblDescri = new JLabel("Descrição:");
		lblDescri.setToolTipText("Nome da Ação");

		lblDescri.setBounds(11, 55, 80, 15);

		contentPane.add(lblDescri);
	} // fim construtor
	
	private void statusConnection() {
		
		try {
			
			con = dao.connect();

			if (con == null) {
			 
				lblState.setIcon(new ImageIcon(Care5w2h.class.getResource("/img/dboff.png")));

			} else {
				 
				lblState.setIcon(new ImageIcon(Care5w2h.class.getResource("/img/dbon.png")));
			}
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
