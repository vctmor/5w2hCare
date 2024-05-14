package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Care5w2h extends JFrame {
	
	DAO dao = new DAO();
	
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNameAction;
	private JTextField textWho;
	private JTextField textStart;
	private JTextField textHow;
	private JTextField textWhereAction;
	private JTextField textJustification;
	private JTextField textUrgency;
	private JTextField textBudget;
	private JTextField textStatus;
	private JTextField textEnd;
	private JLabel lblNewLabel_9;
	private JButton btnAtualize;
	private JButton btnDelAction;
	private JButton btnResetFields;
	private JLabel lblNoIniciada;
	private JLabel lblGernciaResposvel_2;
	private JLabel lblGernciaResposvel_3;
	private JLabel lblGernciaResposvel_1;
	private JLabel lblCustoTotal;
	private JLabel lblStatusGeralgrfico;
	private JTextField textRI;
	private JPanel panel;

	private JLabel lblDate;
	private JLabel lblState;

	private JTextField textField_11;
	private JTextField textDescription;
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
				setDate();
				
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
		
		textNameAction = new JTextField();

		textNameAction.setBounds(12, 33, 282, 19);

		contentPane.add(textNameAction);
		textNameAction.setColumns(10);
		
		textWho = new JTextField();
		textWho.setColumns(10);

		textWho.setBounds(13, 181, 281, 19);

		contentPane.add(textWho);
		
		textStart = new JTextField();
		textStart.setColumns(10);
		textStart.setBounds(67, 447, 86, 19);
		contentPane.add(textStart);
		
		textHow = new JTextField();
		textHow.setColumns(10);
		textHow.setBounds(12, 224, 283, 64);
		contentPane.add(textHow);
		
		textWhereAction = new JTextField();
		textWhereAction.setColumns(10);
		textWhereAction.setBounds(107, 416, 187, 19);
		contentPane.add(textWhereAction);
		
		textJustification = new JTextField();
		textJustification.setColumns(10);
		textJustification.setBounds(12, 326, 282, 64);
		contentPane.add(textJustification);
		
		textUrgency = new JTextField();
		textUrgency.setColumns(10);

		textUrgency.setBounds(13, 143, 135, 19);

		contentPane.add(textUrgency);
		
		textBudget = new JTextField();
		textBudget.setColumns(10);
		textBudget.setBounds(12, 416, 86, 19);
		contentPane.add(textBudget);
		
		textStatus = new JTextField();
		textStatus.setColumns(10);
		textStatus.setBounds(67, 476, 86, 19);
		contentPane.add(textStatus);
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBounds(214, 445, 80, 19);
		contentPane.add(textEnd);
		
		lblNewLabel_9 = new JLabel("Fim:");
		lblNewLabel_9.setBounds(181, 447, 34, 15);
		contentPane.add(lblNewLabel_9);
		
		JButton btnAddAction = new JButton("Cadastrar Ação");
		btnAddAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				addAction();
				
			}
		});
		btnAddAction.setBounds(12, 507, 147, 25);
		contentPane.add(btnAddAction);
		
		JButton btnCreateReport = new JButton("Gerar Relatório");
		btnCreateReport.setToolTipText("Gera PDF contendo as Ações cadastradas");
		btnCreateReport.setBounds(181, 544, 145, 25);
		contentPane.add(btnCreateReport);
		
		btnAtualize = new JButton("Atualizar");
		btnAtualize.setBounds(12, 544, 147, 25);
		contentPane.add(btnAtualize);
		
		btnDelAction = new JButton("Excluir Ação");
		btnDelAction.setBounds(181, 505, 147, 25);
		contentPane.add(btnDelAction);
		
		btnResetFields = new JButton("Limpar Campos");
		btnResetFields.setBounds(181, 470, 147, 25);
		contentPane.add(btnResetFields);
		
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
		
		textRI = new JTextField();
		textRI.setColumns(10);
		textRI.setBounds(179, 156, 80, 19);
		contentPane.add(textRI);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(12, 573, 699, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(13, 72, 281, 52);

		lblDate = new JLabel("");
		lblDate.setForeground(SystemColor.text);
		lblDate.setBounds(18, 14, 308, 17);
		panel.add(lblDate);
		
		lblState = new JLabel("");
		lblState.setIcon(new ImageIcon(Care5w2h.class.getResource("/img/dboff.png")));
		lblState.setBounds(626, 5, 32, 32);
		panel.add(lblState);
		
		textDescription = new JTextField();
		textDescription.setColumns(10);
		textDescription.setBounds(11, 72, 283, 52);
		contentPane.add(textDescription);
		
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
		
	} // fim StatusConnectio
	
	private void setDate() {
		
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblDate.setText(formatador.format(data));
		
	}
	
	private void insertDB() {
		
		
		
		String insert = "insert into action(description, nameAction, "
				+ "urgency, who, how, justification, budget, start, end, status, description, whereAction) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			
			
			con = dao.connect();
			pst = con.prepareStatement(insert);	
			String nameAction = textNameAction.getText();			
			pst.setString(1, nameAction);
		    
		    pst.setString(4, textWho.getText());
		    pst.setString(5, textHow.getText()); 
		    pst.setString(6, textJustification.getText()); 
		    pst.setString(11, textDescription.getText()); 
		    pst.setString(12, textWhereAction.getText()); 
			
			String stringUrgency = textUrgency.getText();
			String stringStatus = textStatus.getText();
			
			if ( !stringStatus.isEmpty() || !stringUrgency.isEmpty() ) {
				
				try {
					
					int urgency = Integer.parseInt(stringUrgency);
				    pst.setInt(3, urgency);
				    int status = Integer.parseInt(stringStatus);
				    pst.setInt(10, status);
				    
				} catch (NumberFormatException e) {
				    System.out.println("Erro ao converter texto para inteiro: " + e.getMessage());
				    e.printStackTrace();
				}
			}else {
				System.err.println("Os campos stringStatus e/ou stringUrgency estão vazios.");
			}
			
			 String stringBudget = textBudget.getText();
			 
			if ( !stringBudget.isEmpty() ) {
				
				try {
					
					double budget = Double.parseDouble(stringBudget);
					 pst.setDouble(7, budget); 
					
				    
				} catch (NumberFormatException e) {
				    System.out.println("Erro ao converter texto para Double: " + e.getMessage());
				    e.printStackTrace();
				}
			}else {
				System.err.println("O campo stringBudget está vazio.");
			}
			

		    String stringStart = textStart.getText();
		    
		    String stringEnd = textEnd.getText();
		   
			
				if ( !stringStart.isEmpty() || !stringEnd.isEmpty() ) {
				
				try {
					java.sql.Date start = java.sql.Date.valueOf(stringStart);
				    pst.setDate(8, start); 
				    java.sql.Date end = java.sql.Date.valueOf(stringEnd);
				    pst.setDate(9, end); ;
				    
				} catch (NumberFormatException e) {
				    System.out.println("Erro ao converter texto para Date: " + e.getMessage());
				    e.printStackTrace();
				}
			}else {
				System.err.println("Um dos campos Início ou Fim estã vazio.");
			}
		   			
			if (!nameAction.isEmpty()) {
				
				int confirm = pst.executeUpdate();
				System.out.println(confirm);
				if (confirm == 1) {

					JOptionPane.showMessageDialog(null, "Ação cadastrada com sucesso!");
					System.out.println("Ação cadastrada com sucesso!");
					//TODO: Fazer método reset();
					//reset();

				} else {

					JOptionPane.showMessageDialog(null, "Erro! Ação não cadastrada");
					System.out.println("Erro! Ação não cadastrada");
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, não esqueça o nome da Ação");
				System.out.println("Por favor, não esqueça o nome da Ação");
			}
		    
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	private void addAction() {
		
		if (textNameAction.getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Preencha o nome da Ação");
			textNameAction.requestFocus();
			
		} else {

			insertDB();

		}
		
	}
	
	
	
	
} // ----------
