package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Care5w2h extends JFrame {

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
	private JLabel lblGernciaResposvel;
	private JTextField textField_10;
	private JButton btnAtualizar;
	private JButton btnExcluirAo;
	private JButton btnLimparCampos;
	private JLabel lblNoIniciada;
	private JLabel lblGernciaResposvel_2;
	private JLabel lblGernciaResposvel_3;
	private JLabel lblGernciaResposvel_1;
	private JLabel lblCustoTotal;
	private JLabel lblStatusGeralgrfico;
	private JLabel lblNomeDaAo;
	private JTextField textField_11;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que:");
		lblNewLabel.setToolTipText("Nome da Ação");
		lblNewLabel.setBounds(22, 219, 52, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quem:");
		lblNewLabel_1.setBounds(371, 219, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Início:");
		lblNewLabel_2.setBounds(22, 318, 60, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Como:");
		lblNewLabel_3.setBounds(22, 250, 52, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Onde:");
		lblNewLabel_4.setBounds(22, 281, 43, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Por quê:");
		lblNewLabel_5.setBounds(363, 285, 60, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Urgência:");
		lblNewLabel_6.setBounds(345, 349, 70, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Orçamento:");
		lblNewLabel_7.setBounds(512, 318, 86, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Status:");
		lblNewLabel_8.setBounds(371, 318, 52, 15);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(73, 217, 283, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(424, 219, 272, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(73, 316, 70, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(73, 250, 623, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(73, 285, 283, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(424, 285, 272, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(424, 347, 137, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(603, 316, 93, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(424, 316, 86, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 316, 70, 19);
		contentPane.add(textField_9);
		
		lblNewLabel_9 = new JLabel("Fim:");
		lblNewLabel_9.setBounds(151, 318, 34, 15);
		contentPane.add(lblNewLabel_9);
		
		lblGernciaResposvel = new JLabel("Resposável:");
		lblGernciaResposvel.setToolTipText("Gerência Responsável");
		lblGernciaResposvel.setBounds(22, 188, 93, 15);
		contentPane.add(lblGernciaResposvel);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(110, 186, 147, 19);
		contentPane.add(textField_10);
		
		JButton btnNewButton = new JButton("Cadastrar Ação");
		btnNewButton.setBounds(22, 391, 147, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gerar Relatório");
		btnNewButton_1.setToolTipText("Gera PDF contendo as Ações cadastradas");
		btnNewButton_1.setBounds(371, 415, 145, 25);
		contentPane.add(btnNewButton_1);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(22, 430, 147, 25);
		contentPane.add(btnAtualizar);
		
		btnExcluirAo = new JButton("Excluir Ação");
		btnExcluirAo.setBounds(197, 393, 147, 25);
		contentPane.add(btnExcluirAo);
		
		btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(197, 430, 147, 25);
		contentPane.add(btnLimparCampos);
		
		lblNoIniciada = new JLabel("Não Iniciada:");
		lblNoIniciada.setBounds(304, 104, 93, 15);
		contentPane.add(lblNoIniciada);
		
		lblGernciaResposvel_2 = new JLabel("Atrasada:");
		lblGernciaResposvel_2.setBounds(327, 131, 70, 15);
		contentPane.add(lblGernciaResposvel_2);
		
		lblGernciaResposvel_3 = new JLabel("Em andamento:");
		lblGernciaResposvel_3.setBounds(289, 160, 126, 15);
		contentPane.add(lblGernciaResposvel_3);
		
		lblGernciaResposvel_1 = new JLabel("Concluída:");
		lblGernciaResposvel_1.setBounds(326, 186, 80, 15);
		contentPane.add(lblGernciaResposvel_1);
		
		lblCustoTotal = new JLabel("Custo Total");
		lblCustoTotal.setBounds(468, 104, 93, 15);
		contentPane.add(lblCustoTotal);
		
		lblStatusGeralgrfico = new JLabel("Status Geral (gráfico piza)");
		lblStatusGeralgrfico.setBounds(468, 147, 126, 15);
		contentPane.add(lblStatusGeralgrfico);
		
		lblNomeDaAo = new JLabel("RI");
		lblNomeDaAo.setToolTipText("Nome da Ação");
		lblNomeDaAo.setBounds(62, 160, 43, 15);
		contentPane.add(lblNomeDaAo);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(110, 155, 147, 19);
		contentPane.add(textField_11);
	}
}
