package prjTrabalhoMenu;



	import java.awt.Color;
import java.awt.event.*;
	import javax.swing.*;


	public class Menu extends JFrame{
		

		JLabel lbFrase1;
		
	public Menu() {
			
			this.setSize(800,600);
			this.setTitle("Abas de Menu");
			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			Color minhaCor =  Color.decode ("#9CAF88");
			getContentPane().setBackground(minhaCor);
			this.setExtendedState(MAXIMIZED_BOTH);
			

			
		
			JMenu calc = new JMenu("Calculadora");
			JMenu cons = new JMenu("Concessionaria");
			JMenu jdv = new JMenu("Jogo da Velha");
			JMenu sbr = new JMenu ("Sobre nos");
			JMenu aju = new JMenu ("Ajuda");
			
			JMenuItem cb = new JMenuItem("Calculadora Basica");
			JMenuItem or = new JMenuItem("Escolha seu Carro");
			JMenuItem jg = new JMenuItem("Comece a Jogar");
			JMenuItem so = new JMenuItem("Mais sobre as desenvolvedoras");
			JMenuItem sair = new JMenuItem("Sair");

		
			calc.add(cb);
			cons.add(or);
			jdv.add(jg);
			sbr.add(so);
			sbr.add(sair);
			

			JMenuBar bar = new JMenuBar();
			setJMenuBar(bar);
			bar.add(calc);
			bar.add(cons);
			bar.add(jdv);
			bar.add(sbr);
			
			
			sair.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						System.exit(0);
					}
				}
				);
			cb.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							Calculadora c = new Calculadora();
											
					}
					}
					);
			or.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							Concessionaria cs = new Concessionaria();
											
					}
					}
					);
			so.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							SobreNos sn = new SobreNos();
											
					}
					}
					);
			
			jg.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							JogoVelha jv = new JogoVelha();
											
					}
					}
					);
			JLabel imagem = new JLabel();
			imagem.setBounds(20,50,700,200);
			imagem.setIcon(new ImageIcon("src/dance.gif"));
			add(imagem);
			
			this.setVisible(true);
	}
	}


