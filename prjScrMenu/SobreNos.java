package prjTrabalhoMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

// import para o gif //
import java.net.*;

// JMenu extençoes 

import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
public class SobreNos extends JDialog {

	JLabel lbTitulo;
	JLabel lbMari;
	JLabel lbVih;
	JLabel lbFrase1;
	JLabel lbFrase2;

	public SobreNos() {
		

		this.setTitle("Desenvolvedoras");
		this.setModal(true);
		this.setSize(800,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Color minhaCor =  Color.decode ("#BACCF4");
		getContentPane().setBackground(minhaCor);

		JLabel imagem = new JLabel();
		imagem.setBounds(20,50,700,200);
		imagem.setIcon(new ImageIcon("src/dance.gif"));
		add(imagem);
		
		lbTitulo = new JLabel();
		lbTitulo.setBounds(210,5,500,25);
		lbTitulo.setText(" NOSSO TRABALHO USANDO INTERFACE GRAFICA :) ");
		lbTitulo.setForeground(new Color (112,117,113));
		add(lbTitulo);
		
		
		lbMari = new JLabel();
		lbMari.setBounds(200,90,300,25);
		lbMari.setText("<html><h3> Mariana Brandão, 17 anos </h3></html>");
		add(lbMari);
		
		lbFrase1 = new JLabel();
		lbFrase1.setBounds(200,135,330,100);
		lbFrase1.setText("<html><h3> ~ GitHub: MarianaBrandao (mariana8brandao) ~ Cursando: M-Tec em Desenvolvimento de Sistemas. </h3></html>");
		add(lbFrase1);
		
		lbVih = new JLabel();
		lbVih.setBounds(200,250,300,25);
		lbVih.setText("<html><h3> Vitória Barroso, 16 anos </h3></html>");
		add(lbVih);
		
		lbFrase2 = new JLabel();
		lbFrase2.setBounds(200,270,230,100);
		lbFrase2.setText("<html><h3> ~ GitHub: Toory ( vitoriabarroso)  ~ Cursando: M-Tec em Desenvolvimento de Sistemas. </h3></html>");
		add(lbFrase2);
				
		JLabel imagemNossa = new JLabel();
		imagemNossa.setBounds(580,90,300,200);
		imagemNossa.setIcon(new ImageIcon("src/FoootinhoNossa.jpg"));
		add(imagemNossa);
		
		
		this.setLayout(null); //sempre deixar por ultimo
		this.setVisible(true); //sempre deixar por ultimo
		
	}
	
}
