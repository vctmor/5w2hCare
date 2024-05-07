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
		setBounds(100, 100, 725, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que (nome da ação):");
		lblNewLabel.setToolTipText("Nome da Ação");
		lblNewLabel.setBounds(12, 22, 177, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quem:");
		lblNewLabel_1.setBounds(12, 124, 52, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Início:");
		lblNewLabel_2.setBounds(21, 421, 43, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Como:");
		lblNewLabel_3.setBounds(13, 178, 52, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Onde:");
		lblNewLabel_4.setBounds(110, 360, 43, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Justificativa:");
		lblNewLabel_5.setBounds(12, 273, 100, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Urgência:");
		lblNewLabel_6.setBounds(11, 75, 70, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Orçamento:");
		lblNewLabel_7.setBounds(12, 364, 86, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Status:");
		lblNewLabel_8.setBounds(12, 448, 52, 15);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(11, 45, 283, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 147, 282, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(67, 419, 86, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 197, 283, 64);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(107, 388, 187, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 300, 282, 64);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(11, 93, 137, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(12, 388, 86, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(67, 448, 86, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(214, 417, 80, 19);
		contentPane.add(textField_9);
		
		lblNewLabel_9 = new JLabel("Fim:");
		lblNewLabel_9.setBounds(181, 419, 34, 15);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Cadastrar Ação");
		btnNewButton.setBounds(12, 488, 147, 25);
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
		lblNewLabel_9_1.setBounds(148, 124, 24, 15);
		contentPane.add(lblNewLabel_9_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(181, 122, 80, 19);
		contentPane.add(textField_10);
	}
}
