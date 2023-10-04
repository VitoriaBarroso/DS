import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjetoJTabbedPane extends JDialog{

	private JLabel lbNome;
	private JTextField txtNome;
	private JButton btoCadastrar;
	
	public ObjetoJTabbedPane() {
		this.setTitle("Cadastro Aluno");
		this.setModal(true);
		this.setSize(500,470);
		this.setResizable(false);
		
		Container janelacalc = this.getContentPane();
		setLocationRelativeTo(janelacalc);
		janelacalc.setLayout(null);
		
		// criar o JTabbedPane
		JTabbedPane tabbedpane = new JTabbedPane();
		
		// primeira guia
		//tamanho e posicionamento 
		tabbedpane.setBounds(0,0,500,470);
		
		JPanel painel1 = new JPanel();
		painel1.setLayout(null);
		
		lbNome = new JLabel("Nome");
		lbNome.setBounds(10,15,50,20);
		painel1.add(lbNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(55,15,150,20);
		painel1.add(txtNome);
		
		btoCadastrar = new JButton("cadastrar");
		btoCadastrar.add(btoCadastrar);
		
		EventoBotao evb = new EventoBotao();
		btoCadastrar.addActionListener(evb);
		
		tabbedpane.addTab("abb 1",null, painel1,"Primiro Painel");
		

		JPanel painel2 = new JPanel();
		painel2.setLayout(null);
		painel2.setBackground(Color.WHITE);
		
		tabbedpane.addTab("abb 2",null, painel2,"Primiro Painel");
		
		janelacalc.add(tabbedpane);	
		
	
	}
	
	private class EventoBotao implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,"Nome:"+txtNome.getText());
			
			txtNome.setEnabled(false);
			txtNome.setVisible(false);
		
		}
	}
	 
	
}

