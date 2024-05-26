package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Dashboard;
import model.Action;
import model.DAO;
import model.DatabaseManager;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

//import javax.swing.*;
import org.jfree.chart.ChartPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;


public class Care5w2h extends JFrame {
	
	static Dashboard dashB = new Dashboard();
	DAO dao = new DAO();

	static Care5w2h frame;

	static PieChart chart = new PieChart();
		
	
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
	private JButton btnUpdate;
	private JButton btnExcludeAction;
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
	private JScrollPane scrollPaneList;
	private JList listNames;
	private JButton btnCreateReport;
	private JButton btnSearchRI;
	private JButton btnAddAction;

	private JLabel showTotalActions;
	private JLabel showInProgress;
	private JLabel showNotStarted;
	private JLabel showStarted;
	private JLabel showTotalBudget;
	private JLabel showCompleted;
	private JLabel showDelayed;

<<<<<<< HEAD
	
=======
	private JLabel pizza;	
>>>>>>> @{-1}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

<<<<<<< HEAD
		DatabaseManager data = new DatabaseManager();
		List<Action> actions = new DatabaseManager().getAllActions();

		//Todo: fazer um for para contar cada um dos 4 tipos de status e guardar num array
		//int status = (int) actions.stream().filter(a -> a.getStatus() == 0).count();

		System.out.println(dashB.getTotalActions());
		System.out.println(dashB.getTotalCost());
		System.out.println(dashB.getCompleted());
				
=======
>>>>>>> @{-1}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Care5w2h();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});

		//EventQueue.invokeLater(PieChart::run);
	}

	/**
	 * Create the frame.
	 */
	public Care5w2h() {
		;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
			
				statusConnection();
				setDate();
				atualizeDashboard();
<<<<<<< HEAD
				reset();
				
=======
				reset();		
				showPieChart();
>>>>>>> @{-1}
				setLocationRelativeTo(null);
				
			}
		});
		
		setTitle("5w2hCare");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 649);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPaneList = new JScrollPane();
		scrollPaneList.setBorder(null);
		scrollPaneList.setVisible(false);
		scrollPaneList.setBounds(13, 49, 282, 90);
		contentPane.add(scrollPaneList);
		
		listNames = new JList();
		listNames.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				searchName();
			}
		});
		listNames.setBorder(null);
		scrollPaneList.setViewportView(listNames);
		
		lblDescri = new JLabel("Descrição:");
		lblDescri.setToolTipText("Nome da Ação");
		
				lblDescri.setBounds(11, 55, 80, 15);
				
						contentPane.add(lblDescri);
		
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
		textNameAction.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textNameAction.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				listNames();			}
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					scrollPaneList.setVisible(false);
				}
				
			}
		});

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
		
		btnAddAction = new JButton("Cadastrar Ação");
		btnAddAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				addAction();
				atualizeDashboard();
				
			}
		});
		btnAddAction.setBounds(12, 507, 147, 25);
		contentPane.add(btnAddAction);
		
		btnCreateReport = new JButton("Gerar Relatório");
		btnCreateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//createReport();
				
			}
		});
		btnCreateReport.setToolTipText("Gera PDF contendo as Ações cadastradas");
		btnCreateReport.setBounds(181, 544, 145, 25);
		contentPane.add(btnCreateReport);
		
		btnUpdate = new JButton("Atualizar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				update();
			}
		});
		btnUpdate.setBounds(12, 544, 147, 25);
		contentPane.add(btnUpdate);
		
		btnExcludeAction = new JButton("Excluir Ação");
		btnExcludeAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				exclude();
			}
		});
		btnExcludeAction.setBounds(181, 505, 147, 25);
		contentPane.add(btnExcludeAction);
		
		btnResetFields = new JButton("Limpar Campos");
		btnResetFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				reset();
			}
		});
		btnResetFields.setBounds(181, 470, 147, 25);
		contentPane.add(btnResetFields);
		
		lblNoIniciada = new JLabel("Não Iniciada:");
		lblNoIniciada.setBounds(313, 97, 93, 15);
		contentPane.add(lblNoIniciada);
		
		lblGernciaResposvel_2 = new JLabel("Atrasada:");
		lblGernciaResposvel_2.setBounds(313, 124, 70, 15);
		contentPane.add(lblGernciaResposvel_2);
		
		lblGernciaResposvel_3 = new JLabel("Em andamento:");
		lblGernciaResposvel_3.setBounds(313, 55, 114, 15);
		contentPane.add(lblGernciaResposvel_3);
		
		lblGernciaResposvel_1 = new JLabel("Concluídas:");
		lblGernciaResposvel_1.setBounds(313, 145, 93, 15);
		contentPane.add(lblGernciaResposvel_1);
		
		lblCustoTotal = new JLabel("Custo Total");
		lblCustoTotal.setBounds(313, 183, 93, 15);
		contentPane.add(lblCustoTotal);
		
		lblStatusGeralgrfico = new JLabel("Status Geral (gráfico piza)");
		lblStatusGeralgrfico.setBounds(313, 248, 177, 15);
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
		
		btnSearchRI = new JButton("");
		btnSearchRI.setToolTipText("Buscar Ação pelo RI");
		btnSearchRI.setIcon(new ImageIcon(Care5w2h.class.getResource("/img/search.png")));
		btnSearchRI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				searchRI();
			}
		});
		btnSearchRI.setBounds(261, 151, 34, 25);
		contentPane.add(btnSearchRI);
		
		JLabel lblToalAcoes = new JLabel("Toal de Ações:");
		lblToalAcoes.setBounds(313, 35, 103, 15);
		contentPane.add(lblToalAcoes);
		
		showTotalActions = new JLabel("");
		showTotalActions.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showTotalActions.setBackground(UIManager.getColor("Label.disabledForeground"));
		showTotalActions.setBounds(428, 35, 34, 15);
		contentPane.add(showTotalActions);
			
		showInProgress = new JLabel("");
		showInProgress.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showInProgress.setBackground(UIManager.getColor("Button.disabledText"));
		showInProgress.setBounds(428, 55, 34, 15);
		contentPane.add(showInProgress);
		
		showNotStarted = new JLabel("");
		showNotStarted.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showNotStarted.setBackground(UIManager.getColor("Button.disabledText"));
		showNotStarted.setBounds(428, 97, 34, 15);
		contentPane.add(showNotStarted);
		
		showDelayed = new JLabel("");
		showDelayed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showDelayed.setBackground(UIManager.getColor("Button.disabledText"));
		showDelayed.setBounds(428, 124, 34, 15);
		contentPane.add(showDelayed);
		
		showTotalBudget = new JLabel("");
		showTotalBudget.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showTotalBudget.setBackground(UIManager.getColor("Button.disabledText"));
		showTotalBudget.setBounds(428, 181, 80, 15);
		contentPane.add(showTotalBudget);
		
		showCompleted = new JLabel("");
		showCompleted.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		showCompleted.setBackground(UIManager.getColor("Button.disabledText"));
		showCompleted.setBounds(428, 145, 34, 15);
		contentPane.add(showCompleted);

		
		pizza = new JLabel("");
		pizza.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pizza.setBackground(UIManager.getColor("Button.disabledText"));
		pizza.setBounds(313, 290, 200, 150);
		contentPane.add(pizza);
		//pizza.add();
		


	} // fim construtor

	public void showPieChart(){

		ChartPanel chartPanel = new ChartPanel(chart.pieChart());
		chartPanel.setMouseWheelEnabled(true);
		Dimension size = new Dimension(300, 300);
		chartPanel.setPreferredSize(size);
		
		pizza.setLayout(new BorderLayout());
		pizza.add(chartPanel, BorderLayout.CENTER);

		pack();
		repaint();
		//frame.setVisible(true);
	}

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
		
		
		
		String insert = "insert into action(nameAction, urgency, who, how, justification, budget, start, end, status, description, whereAction) values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {	
			
			con = dao.connect();
			pst = con.prepareStatement(insert);	
			
			String nameAction = textNameAction.getText();			
			pst.setString(1, nameAction);
			
			//pst.setString(2, textDescription.getText());
		    pst.setString(3, textWho.getText());
		    pst.setString(4, textHow.getText()); 
		    pst.setString(5, textJustification.getText()); 
		    
		    pst.setString(10, textDescription.getText()); 
		    pst.setString(11, textWhereAction.getText()); 
			
			String stringUrgency = textUrgency.getText();
			String stringStatus = textStatus.getText();
			
			if ( !stringStatus.isEmpty() || !stringUrgency.isEmpty() ) {
				
				try {
					
					int urgency = Integer.parseInt(stringUrgency);
				    pst.setInt(2, urgency);
				    int status = Integer.parseInt(stringStatus);
				    pst.setInt(9, status);
				    
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
					 pst.setDouble(6, budget); 
					
				    
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
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
					java.util.Date parsedDate = dateFormat.parse(stringStart);
					java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
					pst.setDate(7, sqlDate);
					
					java.util.Date parsedEnd = dateFormat.parse(stringEnd);
					java.sql.Date sqlEnd = new java.sql.Date(parsedEnd.getTime());
					pst.setDate(8, sqlEnd);
				    
				} catch (ParseException e) {
				    System.err.println("Erro ao converter texto para Date: Formato de data inválido");
				    e.printStackTrace();
				} catch (IllegalArgumentException e) {
				    System.err.println("Erro ao converter texto para Date: Data inválida");
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
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
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
	
	private void searchRI() {
		
		if (textRI.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o RI");
			textRI.requestFocus();
			
		} else {
			
			String readRI = "select * from action where ri = ?";
			
			try {
				
				con = dao.connect();
				pst = con.prepareStatement(readRI);
				pst.setString(1, textRI.getText());
				rs = pst.executeQuery();
				
				if (rs.next()) {
					
					textRI.setText(rs.getString(1));
					textNameAction.setText(rs.getString(2));
					textUrgency.setText(rs.getString(3));
					textWho.setText(rs.getString(4));
					textHow.setText(rs.getString(5));
					textJustification.setText(rs.getString(6));
					textBudget.setText(rs.getString(7));
					textStart.setText(rs.getString(8));
					textEnd.setText(rs.getString(9));
					textStatus.setText(rs.getString(10));
					textDescription.setText(rs.getString(11));
					textWhereAction.setText(rs.getString(12));					
					
					textRI.setEditable(false);
					btnSearchRI.setEnabled(false);
					btnUpdate.setEnabled(true);
					btnExcludeAction.setEnabled(true);  	
					btnCreateReport.setEnabled(false);
					btnAddAction.setEnabled(false);
					
				} else {
					
					int confirm = JOptionPane.showConfirmDialog(null, "Ação não cadastrada.\nDeseja iniciar um novo cadastro?", "Aviso", JOptionPane.YES_OPTION);
					
					if (confirm == JOptionPane.YES_OPTION) {
						
						textRI.setEditable(false);
						textRI.setText(null);
						btnSearchRI.setEnabled(false);
						textNameAction.setText(null);
						textNameAction.requestFocus();						
						btnAddAction.setEnabled(true);
						btnUpdate.setEnabled(false);
						btnExcludeAction.setEnabled(false);  	
						btnCreateReport.setEnabled(false);
						
				} else {
					btnAddAction.setEnabled(true);
						
					reset();
				}					
					
			}
				
			} catch (Exception e) {
				
				System.out.println(e);
			}

		}
	}
	
	private void listNames() {
		DefaultListModel<String> model = new DefaultListModel<>();
		listNames.setModel(model);//
		
		String readList = "select * from action where nameAction like '"
				+ textNameAction.getText() + "%'" + "order by nameAction";
		
		try {
			con = dao.connect();
			pst = con.prepareStatement(readList);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				
				scrollPaneList.setVisible(true);
				model.addElement(rs.getString(2));
				// se o campo estiver vazio, esconde a lista
				if (textNameAction.getText().isEmpty()) {
						scrollPaneList.setVisible(false);
				}
			}
			con.close();
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	private void searchName() {
		
		int index = listNames.getSelectedIndex();
		
		if (index >=0) {
			
			String readNameAction = "select * from action where nameAction like '" + textNameAction.getText() + "%'"
					+ "order by nameAction limit " + (index) + ", 1";
			try {
				
				con = dao.connect();
				pst = con.prepareStatement(readNameAction);
				rs = pst.executeQuery();
				
				while (rs.next()) {
					
					scrollPaneList.setVisible(false);
					textRI.setText(rs.getString(1));
					textNameAction.setText(rs.getString(2));
					textUrgency.setText(rs.getString(3));
					textWho.setText(rs.getString(4));
					textHow.setText(rs.getString(5));
					textJustification.setText(rs.getString(6));
					textBudget.setText(rs.getString(7));
					textStart.setText(rs.getString(8));
					textEnd.setText(rs.getString(9));
					textStatus.setText(rs.getString(10));
					textDescription.setText(rs.getString(11));
					textWhereAction.setText(rs.getString(12));
				}
				
				con.close();
				
			} catch (Exception e) {
				
				System.out.println(e);
			}			
			
		} else { scrollPaneList.setVisible(false); }
		
	}
	
	private void update() {
		
		if (textNameAction.getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Preencha o nome da Ação");
			textNameAction.requestFocus();
			
		} else {

			String update = "update action set nameAction=?, urgency=?, who=?, how=?, justification=?, budget=?, start=?, end=?, status=?, description=?, whereAction=? where ri=?";
			
			try {	
				
				con = dao.connect();
				pst = con.prepareStatement(update);	
				
				String nameAction = textNameAction.getText();			
				pst.setString(1, nameAction);
				
				//pst.setString(2, textDescription.getText());
			    pst.setString(3, textWho.getText());
			    pst.setString(4, textHow.getText()); 
			    pst.setString(5, textJustification.getText()); 
			    
			    pst.setString(10, textDescription.getText()); 
			    pst.setString(11, textWhereAction.getText()); 
			    pst.setString(12, textRI.getText());
				
				String stringUrgency = textUrgency.getText();
				String stringStatus = textStatus.getText();
				
				if ( !stringStatus.isEmpty() || !stringUrgency.isEmpty() ) {
					
					try {
						
						int urgency = Integer.parseInt(stringUrgency);
					    pst.setInt(2, urgency);
					    int status = Integer.parseInt(stringStatus);
					    pst.setInt(9, status);
					    
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
						 pst.setDouble(6, budget); 
						
					    
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
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
						java.util.Date parsedDate = dateFormat.parse(stringStart);
						java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
						pst.setDate(7, sqlDate);
						
						java.util.Date parsedEnd = dateFormat.parse(stringEnd);
						java.sql.Date sqlEnd = new java.sql.Date(parsedEnd.getTime());
						pst.setDate(8, sqlEnd);
					    
					} catch (ParseException e) {
					    System.err.println("Erro ao converter texto para Date: Formato de data inválido");
					    e.printStackTrace();
					} catch (IllegalArgumentException e) {
					    System.err.println("Erro ao converter texto para Date: Data inválida");
					    e.printStackTrace();
					}
				}else {
					System.err.println("Um dos campos Início ou Fim estã vazio.");
				}
			   			
				if (!nameAction.isEmpty()) {
					
					int confirm = pst.executeUpdate();
					System.out.println(confirm);
					if (confirm == 1) {

						JOptionPane.showMessageDialog(null, "Ação atualizada com sucesso!");					} else {

						JOptionPane.showMessageDialog(null, "Erro! Ação não atualizada");
						System.out.println("Erro! Ação não atualizada");
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, não esqueça o nome da Ação");
					System.out.println("Por favor, não esqueça o nome da Ação");
				}
				con.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}
		}
	}
	
	private void exclude() {
		
		int confirmExclude = JOptionPane.showConfirmDialog(null, "Confirma a exclusão desta Ação?", "Atenção!",
				JOptionPane.YES_NO_OPTION);
		
		if (confirmExclude == JOptionPane.YES_OPTION) {
			
			String exclude = "delete from action where ri=?";
			
			try {
				
				con = dao.connect();
				pst = con.prepareStatement(exclude);
				pst.setString(1, textRI.getText());
				
				int confirm = pst.executeUpdate();
				
				if (confirm == 1) {

					reset();
					JOptionPane.showMessageDialog(null, "Ação removida com sucesso");
				}

				con.close();
				
			} catch (Exception e) {
				
				System.out.println(e);
			}
		}
	}
	
	private void atualizeDashboard(){		

		int totalActions = dashB.getTotalActions();
		String totalActionsStr = String.valueOf(totalActions);
		showTotalActions.setText(totalActionsStr);

		int notStarted = dashB.getnotStarted();
		String notStartedStr = String.valueOf(notStarted);
		showNotStarted.setText(notStartedStr);

		int inProgres = dashB.getongoingActions();
		String inProgresStr = String.valueOf(inProgres);
		showInProgress.setText(inProgresStr);

<<<<<<< HEAD
		int completed = dashB.getongoingActions();
		String completedStr = String.valueOf(completed);
		showCompleted.setText(completedStr);

		int delayed = dashB.getongoingActions();
=======
		int completed = dashB.getCompleted();
		String completedStr = String.valueOf(completed);
		showCompleted.setText(completedStr);

		int delayed = dashB.getDelayed();
>>>>>>> @{-1}
		String delayedStr = String.valueOf(delayed);
		showDelayed.setText(delayedStr);

		double totalCoast = dashB.getTotalCost();
		String totalCoastStr = String.valueOf(totalCoast);
		
		showTotalBudget.setText(totalCoastStr);
	}
	
	private void reset() {

		atualizeDashboard();

		scrollPaneList.setVisible(false);
		textRI.setText(null);
		textNameAction.setText(null);
		textNameAction.requestFocus();
		
		textUrgency.setText(null);
		textWho.setText(null);
		textHow.setText(null);
		textJustification.setText(null);
		textBudget.setText(null);
		textStart.setText(null);
		textEnd.setText(null);
		textStatus.setText(null);
		textDescription.setText(null);
		textWhereAction.setText(null);		
		
		textRI.setEnabled(true);
		textRI.setEditable(true);
		
		btnSearchRI.setEnabled(true);		
		btnAddAction.setEnabled(true);
		btnUpdate.setEnabled(false);
		btnExcludeAction.setEnabled(false);
		btnCreateReport.setEnabled(true);
	}
} // ----------
