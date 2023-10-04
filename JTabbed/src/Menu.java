
import java.awt.Color;
import java.awt.event.*;
	import javax.swing.*;


	public class Menu extends JFrame{
		
		
	public Menu() {
			
			this.setSize(800,600);
			this.setTitle("Abas de Menu");
			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			Color minhaCor =  Color.decode ("#9CAF88");
			getContentPane().setBackground(minhaCor);
			this.setExtendedState(MAXIMIZED_BOTH);
			

			
		
			JMenu calc = new JMenu("Cadastro");
			JMenu aju = new JMenu ("Ajuda");
			
			JMenuItem cb = new JMenuItem("Cadas");
			JMenuItem sair = new JMenuItem("Sair");

			
			

			calc.add(cb);
			aju.add(sair);
			

			JMenuBar bar = new JMenuBar();
			setJMenuBar(bar);
			bar.add(calc);
			bar.add(aju);
			
			
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
							ObjetoJTabbedPane otp = new ObjetoJTabbedPane();
							otp.setVisible(true);
						}
					}
					);
			
	
	}
}
