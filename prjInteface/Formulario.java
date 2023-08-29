package prjInteface;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame {

	JLabel lbNome;
	JTextField txtNome;
	JButton btoSalvar;
	
	public Formulario() {
		this.setTitle("Meu primeiro Formulario");
		//largura, altura
		this.setSize(800,600);
		//x,y
		// this.setLocation(400,0);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//mudar a cor
		Color minhaCor = new Color(230 ,230, 250);
		getContentPane().setBackground(minhaCor);
		//this.getContentPane().setBackground(Color.BLACK);
		
		
		// Label - Caixa de texto
		lbNome = new JLabel();
		//x,y altura largura
		lbNome.setBounds(20,20,100,25);
		lbNome.setText("Nome");
		add(lbNome);
		
		// campo de um texto p/ informar
		txtNome = new JTextField();
		//x,y altura largura
		lbNome.setBounds(20,20,100,25);
		add(lbNome);
		
		// Botao 
		btoSalvar = new JButton();
		btoSalvar.setBounds(20,20,100,25);
		btoSalvar.setText("Salvar");
		btoSalvar.setBackground(Color.PINK);
		btoSalvar.setForeground(Color.WHITE);
		add(btoSalvar);
		
		
		
		this.setLayout(null); //sempre deixar por ultimo
		this.setVisible(true); //sempre deixar por ultimo

				
				
	}
	
	
	
}
