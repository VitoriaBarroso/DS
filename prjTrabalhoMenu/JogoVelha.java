package prjTrabalhoMenu;

//import javax.swing.JPanel;
// JMenu exten�oes 
import javax.swing.*;


import java.awt.*;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JogoVelha extends JDialog {
	
	private JLabel lbJoga1;
	private JLabel lbJoga2;
	private JLabel lbOpcoes;
    private JButton btoAvance, btoAvance2;
	private JButton btoPronto, btoPronto2;
	private JButton btoRecomecar;
	private JTextField txtJoga1;
	private JTextField txtJoga2;
	private JButton op,op2,op3,op4,op5,op6,op7,op8,op9;
	private JLabel img;	
	
	 // para if and else //
	
	 String tabuleiro[][] = new String[3][3];
	 private String jogadorAtual = "X";
	 
	
	 public void jogoTabuleiro() { // inicio do metodo //
		 
		 	// horizontal //
	 		if((tabuleiro[0][0].equalsIgnoreCase("X") && tabuleiro[0][1].equalsIgnoreCase("X") && tabuleiro[0][2].equalsIgnoreCase("X")) || 
	 					(tabuleiro[0][0].equalsIgnoreCase("O") && tabuleiro[0][1].equalsIgnoreCase("O") && tabuleiro[0][2].equalsIgnoreCase("O"))){ // ignoreCase para determinar de as duas possuem o mesmo conteudo //
	 
	 			
	 		JOptionPane.showMessageDialog(null, tabuleiro[0][0] + "Ganhou! :) ");
	 		
	 		}else if ((tabuleiro[1][0].equalsIgnoreCase("X") && tabuleiro[1][1].equalsIgnoreCase("X") && tabuleiro[1][2].equalsIgnoreCase("X")) || 
	 				(tabuleiro[1][0].equalsIgnoreCase("O") && tabuleiro[1][1].equalsIgnoreCase("O") && tabuleiro[1][2].equalsIgnoreCase("O"))) {
	 			
	 		JOptionPane.showMessageDialog(null, tabuleiro[1][0] + "Ganhou! :) ");
	 		
	 		}else if ((tabuleiro[2][0].equalsIgnoreCase("X ") && tabuleiro[2][1].equalsIgnoreCase("X") && tabuleiro[2][1].equalsIgnoreCase("X")) || 
	 				(tabuleiro[2][0].equalsIgnoreCase("O") && tabuleiro[2][1].equalsIgnoreCase("O") && tabuleiro[2][1].equalsIgnoreCase("O"))){
	 			
	 		JOptionPane.showMessageDialog(null, tabuleiro[2][0] + "Ganhou! :) ");
	 		
	 		// vertical //
	 		}else if ((tabuleiro[0][0].equalsIgnoreCase("X") && tabuleiro[1][0].equalsIgnoreCase("X") && tabuleiro[2][0].equalsIgnoreCase("X")) || 
	 						(tabuleiro[0][0].equalsIgnoreCase("O") && tabuleiro[1][0].equalsIgnoreCase("O") && tabuleiro[2][0].equalsIgnoreCase("O"))){
	 					
	 		JOptionPane.showMessageDialog(null, tabuleiro[0][0] + "Ganhou! :) ");
	 			
	 		}else if ((tabuleiro[0][1].equalsIgnoreCase("X") && tabuleiro[2][1].equalsIgnoreCase("X") && tabuleiro[2][1].equalsIgnoreCase("X")) || 
	 						(tabuleiro[0][1].equalsIgnoreCase("O") && tabuleiro[2][1].equalsIgnoreCase("O") && tabuleiro[2][1].equalsIgnoreCase("O"))){
	 					
	 		JOptionPane.showMessageDialog(null, tabuleiro[0][1] + "Ganhou! :) ");
	 			
	 		}else if ((tabuleiro[0][2].equalsIgnoreCase("X") && tabuleiro[1][2].equalsIgnoreCase("X") && tabuleiro[2][2].equalsIgnoreCase("X")) || 
	 						(tabuleiro[0][2].equalsIgnoreCase("O") && tabuleiro[1][2].equalsIgnoreCase("O") && tabuleiro[2][2].equalsIgnoreCase("O"))){
	 					
	 		JOptionPane.showMessageDialog(null, tabuleiro[0][2] + "Ganhou! :) ");
	 				
	 		
	 		 // diagonal //
	 		}else if ((tabuleiro[0][0].equalsIgnoreCase("X") && tabuleiro[1][1].equalsIgnoreCase("X") && tabuleiro[2][2].equalsIgnoreCase("X")) || 
					(tabuleiro[0][0].equalsIgnoreCase("O") && tabuleiro[1][1].equalsIgnoreCase("O") && tabuleiro[2][2].equalsIgnoreCase("O"))){
					
	 			 JOptionPane.showMessageDialog(null, tabuleiro[0][0] + "Ganhou! :) ");
				
	 		 }else if ((tabuleiro[0][2].equalsIgnoreCase("X") && tabuleiro[1][1].equalsIgnoreCase("X") && tabuleiro[2][0].equalsIgnoreCase("X")) || 
						(tabuleiro[0][2].equalsIgnoreCase("O") && tabuleiro[1][1].equalsIgnoreCase("O") && tabuleiro[2][0].equalsIgnoreCase("O"))){
					
	 			 JOptionPane.showMessageDialog(null, tabuleiro[0][2] + " Ganhou! :)");
				
	 		 }
	 		 else {
	 			JOptionPane.showMessageDialog(null, "Infelizmente Empataram :( ");
	 		 }}
	 
	     
	 	// reiniciar tabuleiro p\ uma nova jogada //
	     
	     public void reiniciarJogo() { // metodo de reiniciar jogada //
	    	 for (int i =0; i < tabuleiro.length; i++) {
	    		 for (int j = 0; j <tabuleiro.length; j++) {
	    		 tabuleiro[i][j] = null;
	    	 }
	    		 jogadorAtual = "X";
	     }}
	     
	    // come�ando o construtor //

	public JogoVelha(){ 
		
		this.setTitle("Jogo da Idosa");
		this.setModal(true);
		this.setSize(800,600);
		this.setResizable(false);
		
		Container jogoVelha = this.getContentPane();
		setLocationRelativeTo(jogoVelha);
		jogoVelha.setLayout(null);
		
		JTabbedPane tabbedJogoVelha = new JTabbedPane();
		
		tabbedJogoVelha = new JTabbedPane();
		tabbedJogoVelha.setBounds(0,0,1300,720);
		
		//1 Guia 
		
		JPanel pJogador1 = new JPanel();
		pJogador1.setLayout(null);
		
		
		JPanel jogador1 = new JPanel();
		jogador1.setLayout(null);
		
		lbJoga1 = new JLabel("Jogador 1:");
		lbJoga1.setBounds(20,20,100,25);
		jogador1.add(lbJoga1);
		
		txtJoga1 = new JTextField();
		txtJoga1.setBounds(90,20,100,25);
		jogador1.add(txtJoga1);
		
		// mostrando qual simbulo o jogador1 vai ser //
		
		lbOpcoes = new JLabel("Esse � o seu simbulo");
		lbOpcoes.setBounds(20,50,300,25);
		jogador1.add(lbOpcoes);
		
		JLabel imagem = new JLabel();
		imagem.setBounds(20,100,300,100);
		imagem.setIcon(new ImageIcon("src/X.png"));
		jogador1.add(imagem);
		
		
		// se confimar que esse � o nome nao pode mudar //
		BotaoPronto bto = new BotaoPronto();
		btoPronto = new JButton("Pronto"); 
		btoPronto.setBounds(70,200,100,25);
		btoPronto.addActionListener(bto);
		btoPronto.setBackground(Color.WHITE);
		Color btoProntoCr = Color.decode("#848EBC");
		jogador1.add(btoPronto);
		
		
		// avancar p\ guia 2 //
		
		/*BotaoAvance avc = new BotaoAvance();
		btoAvance = new JButton(); 
		btoAvance.setBounds(150,200,100,25);
		btoAvance.setText("Avan�ar");
		btoAvance.addActionListener(avc);
		btoAvance.setBackground(Color.WHITE);
		Color btoAvanceCr = Color.decode("#848EBC");
		jogador1.add(btoAvance);*/

		
		
		tabbedJogoVelha.addTab("Jogador 1 ",null,jogador1,"Primeiro Jogador");
		
		
		// 2 Guia
		
		JPanel jogador2 = new JPanel();
		jogador2.setLayout(null);
		
		lbJoga2 = new JLabel("Jogador 2:");
		lbJoga2.setBounds(20,20,100,25);
		jogador2.add(lbJoga2);
		
		txtJoga2 = new JTextField();
		txtJoga2.setBounds(90,20,100,25);
		jogador2.add(txtJoga2);
		
		// mostrando qual simbulo o jogador 2 vai ser //
		
		lbOpcoes = new JLabel("Esse � o seu simbulo:");
		lbOpcoes.setBounds(20,50,300,25);
		jogador2.add(lbOpcoes);
		
		JLabel imagem2 = new JLabel();
		imagem2.setBounds(20,100,300,100);
		imagem2.setIcon(new ImageIcon("src/O.png"));
		jogador2.add(imagem2);
		
		
		// se confimar que esse � o nome nao pode mudar //
		BotaoPronto2 btoDois = new BotaoPronto2();
		btoPronto2 = new JButton("Pronto"); 
		btoPronto2.setBounds(70,200,100,25);
		btoPronto2.addActionListener(btoDois);
		btoPronto2.setBackground(Color.WHITE);
		Color btoPronto2Cr = Color.decode("#848EBC");
		jogador2.add(btoPronto2);
				
				
		// avancar p\ guia 2 //
		
		/*qbtoAvance2 = new JButton("Avan�ar"); 
		btoAvance2.setBounds(150,200,100,25);
		btoAvance2.setBackground(Color.WHITE);
		Color btoAvance2Cr = Color.decode("#848EBC");
		jogador2.add(btoAvance2);*/
		
		tabbedJogoVelha.addTab("Jogador 2 ",null,jogador2,"Segundo Jogador");
		
		
		// 3 Guia
		
		JPanel telaJogo = new JPanel();
		telaJogo.setLayout(null);

		JLabel joguinhoImagem = new JLabel();
		joguinhoImagem.setBounds(20,50,700,400);
		joguinhoImagem.setIcon(new ImageIcon("src/joguinhoDaVelha2.png"));
		telaJogo.add(joguinhoImagem);
		
		btoRecomecar = new JButton("REINICIAR JOGO"); 
		btoRecomecar.setBounds(400,200,300,25);
		btoRecomecar.setBackground(Color.WHITE);
		Color color = Color.decode("#DA8D6");
		//btoRecomecar.setForeground(Color.WHITE);
		telaJogo.add(btoRecomecar);
		
		
		//Qual posicao o jogador vai escolher p\ o jogo rolar //
		
		JButton op = new JButton();		
		op.setBounds(30,60,100,100);
	    telaJogo.add(op);
	    
	    // primeiro if vai ser checado se � ou nao nulo se nao for ele o sistema para e se for ele continua//

	    op.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[0][0] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[0][0] = jogadorAtual;
							//op.setBounds(20,50,100,100);
							ImageIcon img = new ImageIcon("src/X.png"); 
							op.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[0][0] = jogadorAtual;
							//op.setBounds(20,50,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();		
				}

				
			});
			
			JButton op2 = new JButton();		
			op2.setBounds(160,60,100,100);
			op2.setVisible(true);
		    telaJogo.add(op2);
		    
			op2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[0][1] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[0][1] = jogadorAtual;
							//op2.setBounds(135,50,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op2.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[0][1] = jogadorAtual;
							//op2.setBounds(135,50,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op2.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();
					}

			});
			
			JButton op3 = new JButton();		
			op3.setBounds(299,60,100,100);
			op3.setVisible(true);
		    telaJogo.add(op3);
		    
			op3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[0][2] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[0][2] = jogadorAtual;
							//op2.setBounds(250,50,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op3.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[0][2] = jogadorAtual;
							//op2.setBounds(250,50,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op3.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();	
				}
			});
			
			JButton op4 = new JButton();		
			op4.setBounds(30,200,100,100);
			op4.setVisible(true);
		    telaJogo.add(op4);
		    
			op4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[1][0] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[1][0] = jogadorAtual;
							//op4.setBounds(135,200,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op4.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[1][0] = jogadorAtual;
							//op4.setBounds(135,200,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op4.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();
				}

				
			});
			
			JButton op5 = new JButton();		
			op5.setBounds(160,200,100,100);
			op5.setVisible(true);
		    telaJogo.add(op5);
		    
			op5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[1][1] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[1][1] = jogadorAtual;
							//op5.setBounds(135,200,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op5.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[1][1] = jogadorAtual;
							//op5.setBounds(135,200,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op5.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();
				}

				
			});
			
			JButton op6 = new JButton();		
			op6.setBounds(299,200,100,100);
			op6.setVisible(true);
		    telaJogo.add(op6);
		    
			op6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[1][2] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[1][2] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op6.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[1][2] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op6.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();
				}

				
			});
			
			JButton op7 = new JButton();		
			op7.setBounds(30,340,100,100);
			op7.setVisible(true);
		    telaJogo.add(op7);
		    
			op7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[2][0] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[2][0] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op7.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[2][0] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op7.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();	
				}

				
			});
			
			JButton op8 = new JButton();		
			op8.setBounds(160,340,100,100);
			op8.setVisible(true);
		    telaJogo.add(op8);
		    
			op8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[2][1] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[2][1] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op8.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[2][1] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op8.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();		
				}

				
			});
			
			JButton op9 = new JButton();		
			op9.setBounds(299,340,100,100);
			op9.setVisible(true);
		    telaJogo.add(op9);
		    
			op9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tabuleiro[2][2] != null) {
						
					}else {
						if (jogadorAtual == "X") {
							tabuleiro[2][2] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/X.png");
							op9.setIcon(img);
							jogadorAtual = "O";
						}else {
							tabuleiro[2][2] = jogadorAtual;
							//op6.setBounds(250,200,100,100);
							ImageIcon img = new ImageIcon("src/O.png");
							op9.setIcon(img);
							jogadorAtual = "X";
						}
					}
					jogoTabuleiro();
				}

			});

		
		// conf do botao que reinicia as jogadas //
		
		btoRecomecar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 op.setIcon(null);
		    	 op2.setIcon(null);
		    	 op3.setIcon(null);
		    	 op4.setIcon(null);
		    	 op5.setIcon(null);
		    	 op6.setIcon(null);
		    	 op7.setIcon(null);
		    	 op8.setIcon(null);
		    	 op9.setIcon(null);
		    	 reiniciarJogo();
			}		
		});

		
		// fim do construtor //
		
		tabbedJogoVelha.addTab("Comecem a Jogar!! ",null,telaJogo,"Comecem a jogar!");
		jogoVelha.add(tabbedJogoVelha);	
		
		this.setVisible(true);
		
		// Chamar os dois botoes prontos no cod mais acima //
		
		//}
		/*private class BotaoAvance implements ActionListener{
				public void actionPerformed(ActionEvent event) {
					tabbedJogoVelha.setSelectedIndex(1);
				}*/
				
			}
		private class BotaoPronto implements ActionListener{
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(null,"Nome do primeiro jogador:"+txtJoga1.getText());
								txtJoga1.setEnabled(false);
								txtJoga1.setVisible(false);
							}
				
		}
		private class BotaoPronto2 implements ActionListener{
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(null,"Nome do segundo Jogador:"+txtJoga2.getText());
								txtJoga2.setEnabled(false);
								txtJoga2.setVisible(false);
							}
}}

