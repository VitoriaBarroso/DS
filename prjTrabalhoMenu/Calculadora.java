package prjTrabalhoMenu;



	import javax.swing.JOptionPane;

	import javax.swing.ImageIcon;
	import java.awt.Color;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JDialog;
	

	public class Calculadora  extends JDialog{
		
		JLabel lbNum1;
		JLabel lbNum2;
		JTextField txNum1;
		JTextField txNum2;
		JButton btoSomar;
		JButton btoMult;
		JButton btoDiv;
		JButton btoSub;	
		
		
		
		public Calculadora () {
	

			this.setTitle("Calculadora Basica");
			//largura, altura
			this.setModal(true);
			this.setSize(800,600);
			this.setResizable(false);
			//x,y
			// this.setLocation(400,0);
			this.setLocationRelativeTo(null);
			//this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			//mudar a cor
			
			Color minhaCor = new Color(230 ,230, 250);
			getContentPane().setBackground(minhaCor);
			//this.getContentPane().setBackground(Color.BLACK);
			
			JLabel imagem = new JLabel();
			imagem.setBounds(200,20,500,600);
			imagem.setIcon(new ImageIcon("src/solzinho.png"));
			add(imagem);
			
			// Label - Caixa de texto
			lbNum1 = new JLabel();
			//x  y  largura altura
			lbNum1.setBounds(20,20,100,25);
			lbNum1.setText("Numero 1:");		
			add(lbNum1);	
			
			txNum1 = new JTextField();
			txNum1.setBounds(80,20,100,25);
			add(txNum1);
			
					lbNum2 = new JLabel();
					lbNum2.setBounds(20,50,100,25);
					lbNum2.setText("Numero 2:");		
					add(lbNum2);	
					
					txNum2 = new JTextField();
					txNum2.setBounds(80,50,100,25);
					add(txNum2);
					
			
			// Botao 
					// Botao 
					btoSomar = new JButton();
					btoSomar.setBounds(20,100,100,25);
					btoSomar.setText("Soma");
					btoSomar.setBackground(Color.PINK);
					btoSomar.setForeground(Color.WHITE);
					add(btoSomar);
					
					btoSomar.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int n1= Integer.parseInt(txNum1.getText());
							int n2 =Integer.parseInt(txNum2.getText());
							int r = n1+n2;
							JOptionPane.showMessageDialog(null,"O resultado da soma e " +r);
							
						 }
						});
																
					btoSub = new JButton();
					btoSub.setBounds(160,100,100,25);
					btoSub.setText("Sub");
					btoSub.setBackground(Color.PINK);
					btoSub.setForeground(Color.WHITE);
					add(btoSub);
					
					btoSub.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int n1= Integer.parseInt(txNum1.getText());
							int n2 =Integer.parseInt(txNum2.getText());
							int r = n1-n2;
							JOptionPane.showMessageDialog(null,"O resultado da subtraçao e " +r);
							
						 }
						});
					
					btoMult = new JButton();
					btoMult.setBounds(300,100,100,25);
					btoMult.setText("Multiplico");
					btoMult.setBackground(Color.PINK);
					btoMult.setForeground(Color.WHITE);
					add(btoMult);
					
					btoMult.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int n1= Integer.parseInt(txNum1.getText());
							int n2 =Integer.parseInt(txNum2.getText());
							int r = n1*n2;
							JOptionPane.showMessageDialog(null,"O resultado da Multiplica��o � " +r);
							
						 }
						});
					
					btoDiv = new JButton();
					btoDiv.setBounds(440,100,100,25);
					btoDiv.setText("Div");
					btoDiv.setBackground(Color.PINK);
					btoDiv.setForeground(Color.WHITE);
					add(btoDiv);
					
					btoDiv.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							double n1= Double.parseDouble(txNum1.getText());
							double n2 =Double.parseDouble(txNum2.getText());
							double r;
							if(n2==0) {
								JOptionPane.showMessageDialog(null,"Nao e possivel realizar a operacao ");

							}else {
								 r = n1/n2;
								JOptionPane.showMessageDialog(null,"O resultado da divisao e " +r);
								}
							
						 }
						});
					
				
					
					
			
			this.setLayout(null); //sempre deixar por ultimo
			this.setVisible(true); //sempre deixar por ultimo


}
	}

