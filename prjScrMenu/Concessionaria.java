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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

// JMenu extençoes 

import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	

	public class Concessionaria extends  JDialog{
		 		
		JLabel lbNome;
		JLabel lbNumCel;
		JLabel lbEmail; 
		JLabel lbModelo;
		JLabel lbMarca;
		JLabel lbLogo;
		JLabel img;
		JLabel lbOpcoes;
		JTextField txtNome;
		JTextField txtNumCel;
		JTextField txtEmail;
		JComboBox cbMarca;
		JComboBox cbModelo;
		JRadioButton rdCorBr;
		JRadioButton rdCorPr;
		JRadioButton rdCorCi;
		ButtonGroup bgCor;
		JCheckBox ckOp1;
		JCheckBox ckOp2;
		JCheckBox ckOp3;
		JCheckBox ckOp4;
		JButton btoSalvar;
		JButton btoCancelar;
		
		ImageIcon imgCarro = null;	
		
	public Concessionaria() {
		
		img = new JLabel(imgCarro);
		img.setBounds(380,100,430,200);
		add(img);
		
		this.setTitle("VM Cars");
		this.setModal(true);
		this.setSize(800,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Color minhaCor = new Color(222,229,237);
		getContentPane().setBackground(minhaCor);
		
		JLabel imagem = new JLabel();
		imagem.setBounds(670,17,600,100);
		imagem.setIcon(new ImageIcon("src/logo.png"));
		add(imagem);
		
		lbLogo = new JLabel();
		lbLogo.setBounds(336,5,300,48);
		lbLogo.setText("<html><font color = 'black'> ESCOLHA SEU CARRO </font></html> ");
		add(lbLogo);
		
		  
				lbNome = new JLabel();
				lbNome.setBounds(20,50,100,25);
				lbNome.setText(" Digite seu nome: ");
				add(lbNome);
				
				txtNome = new JTextField();
				txtNome.setBounds(120,50,100,25);
				add(txtNome);
				
				lbNumCel = new JLabel();
				lbNumCel.setBounds(240,50,100,25);
				lbNumCel.setText("Num celular:");
				add(lbNumCel);
				
				txtNumCel = new JTextField();
				txtNumCel.setBounds(320,50,100,25);
				add(txtNumCel);
				
				lbEmail = new JLabel();
				lbEmail.setBounds(440,50,100,25);
				lbEmail.setText("Digite seu Email:");
				add(lbEmail);
				
				txtEmail = new JTextField();
				txtEmail.setBounds(540,50,100,25);
				add(txtEmail);
				
				//ComboBox mais Jlabel nome //
				
				lbMarca = new JLabel();
				lbMarca.setBounds(20,90,300,25);
				lbMarca.setText("MARCAS DISPONIVEIS:");
				add(lbMarca);
				
				cbMarca = new JComboBox();
				cbMarca.setBounds(20,130,125,25);
				cbMarca.addItem("Ford");
				cbMarca.addItem("Hyundai");
				cbMarca.addItem("Jaguar Cars");
				add(cbMarca);
				
				lbModelo = new JLabel();
				lbModelo.setBounds(20,170,300,25);
				lbModelo.setText("VEICULOS DISPONIVEIS:");
				add(lbModelo);
				
				cbModelo = new JComboBox();
				cbModelo.setBounds(20,200,125,25);
				add(cbModelo);
				
				// RadionButton 
				
				
				//lbCor = new JLabel();
				//lbCor.setBounds(20,240,300,25);
				//lbCor.setText("CORES DISPONIVEIS:");
				//add(lbCor);
						
				rdCorBr = new JRadioButton("Branco");
				rdCorBr.setBounds(20,250,100,25);
				rdCorBr.setText("Branco");
				add(rdCorBr);
				
				
				rdCorPr = new JRadioButton();
				rdCorPr.setBounds(150,250,100,25);
				rdCorPr.setText("Preto");
				add(rdCorPr);
				
				rdCorCi = new JRadioButton();
				rdCorCi.setBounds(290,250,100,25);
				rdCorCi.setText("Cinza");
				add(rdCorCi);
				
				bgCor = new ButtonGroup();
				bgCor.add(rdCorBr);
				bgCor.add(rdCorPr);
				bgCor.add(rdCorCi);
				
		

				// CheckBox com acessorios
				
				lbOpcoes = new JLabel();
				lbOpcoes.setBounds(20,300,300,25);
				lbOpcoes.setText("OPÇOES DE ACESSORIOS:");
				add(lbOpcoes);
				
				ckOp1 = new JCheckBox();
				ckOp1.setBounds(20,350,130,25);
				ckOp1.setText("Ar Condicionado");
				add(ckOp1);
						
				ckOp2 = new JCheckBox();
				ckOp2.setBounds(160,350,130,25);
				ckOp2.setText("Rodas Liga Leve");
				add(ckOp2);
						
				ckOp3 = new JCheckBox();
				ckOp3.setBounds(160,400,130,25);
				ckOp3.setText("Direção Hidraulica");
				add(ckOp3);

				ckOp4 = new JCheckBox();
				ckOp4.setBounds(20,400,129,25);
				ckOp4.setText("Kit Multimidia");
				add(ckOp4);
				
				// botao salvar e cancelar
				
				btoSalvar = new JButton();
				btoSalvar.setBounds(20,500,100,25);
				btoSalvar.setText("Enviar");
				btoSalvar.setBackground(Color.BLACK);
				btoSalvar.setForeground(Color.WHITE);
				add(btoSalvar);
				
				btoCancelar = new JButton();
				btoCancelar.setBounds(150,500,100,25);
				btoCancelar.setText("Cancelar");
				btoCancelar.setBackground(Color.BLACK);
				btoCancelar.setForeground(Color.WHITE);
				add(btoCancelar);
				

				
				// ESCOLHER MODELO DO CARRO PELA MARCA //
				
				cbMarca.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String marca,corBr = "",nome,email,num,modelo;
						marca = cbMarca.getSelectedItem().toString();
						
						if (cbMarca.getSelectedItem() == ("Ford")) {
							cbModelo.removeAllItems();
							cbModelo.addItem("Mustang Match 1");
							cbModelo.addItem("Ford GT");
							cbModelo.addItem("Ford F-150");
							//Imagems
							
							
							
						}else if (cbMarca.getSelectedItem() == ("Hyundai")) {
							cbModelo.removeAllItems();
							cbModelo.addItem("Creta");
							cbModelo.addItem("Tucson");
							cbModelo.addItem("Veloster");
							//Imagems
							
							
						}else {
							cbModelo.removeAllItems();
							cbModelo.addItem("Jaguar I-Pace");
							cbModelo.addItem("Jaguar F-Type");
							cbModelo.addItem("Jaguar Xe");
							//Imagems
						}
					}
				});
				
			    // ESCOLHER AS CORES DO CARRO //
			
				
				rdCorBr.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Mustang Match 1") && rdCorBr.isSelected()) {
							img.setIcon(new ImageIcon("src/msBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Ford GT") && rdCorBr.isSelected()) {
							
							img.setIcon(new ImageIcon("src/fgtBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Ford F-150") && rdCorBr.isSelected()){
							img.setIcon(new ImageIcon("src/msBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}
						// HYUNDAI //
						
						if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Creta") && rdCorBr.isSelected()) {
							img.setIcon(new ImageIcon("src/ctBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Tucson") && rdCorBr.isSelected()) {
							img.setIcon(new ImageIcon("src/tsBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Veloster") && rdCorBr.isSelected()){
							img.setIcon(new ImageIcon("src/vlBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}
						// JAGUAR 
						
						
						if (cbMarca.getSelectedItem() == "Jaguar Cars" && cbModelo.getSelectedItem().equals("Jaguar I-Pace") && rdCorBr.isSelected()) {
							img.setIcon(new ImageIcon("src/jaguarIPaceBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Jaguar Cars" && cbModelo.getSelectedItem().equals("Jaguar F-Type") && rdCorBr.isSelected()) {
							img.setIcon(new ImageIcon("src/jaguarITypeBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else {
							img.setIcon(new ImageIcon("src/jaguarXeBranco.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}
						
					}
				});
				
				rdCorPr.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						

						if(cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Mustang Match 1") && rdCorPr.isSelected()) {
							img.setIcon(new ImageIcon("src/msPreto.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Ford GT") && rdCorPr.isSelected()) {
							img.setIcon(new ImageIcon("src/fgtPreto.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
						
						}else if (cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Ford F-150") && rdCorPr.isSelected()) {
						img.setIcon(new ImageIcon("src/msPreto.png"));
						imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
						img.setIcon(imgCarro);
						}
						//HYUNDAI//
						if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Creta") && rdCorPr.isSelected()) {
						img.setIcon(new ImageIcon("src/ctPreto.png"));
						imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
						img.setIcon(imgCarro);
						
						}else if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Tucson") && rdCorPr.isSelected()) {
						img.setIcon(new ImageIcon("src/tsPreto.png"));
						imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
						img.setIcon(imgCarro);
						
						}else if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Veloster") && rdCorPr.isSelected()) {
							img.setIcon(new ImageIcon("src/vlPreto.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
						
						}
						// JAGUAR //
						
						if (cbMarca.getSelectedItem() == "Jaguar Cars" && cbModelo.getSelectedItem().equals("Jaguar I-Pace") && rdCorPr.isSelected()) {
							img.setIcon(new ImageIcon("src/jaguarIPacePreto.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
							}else if (cbMarca.getSelectedItem() == "Jaguar Cars" && cbModelo.getSelectedItem().equals("Jaguar F-Type") && rdCorPr.isSelected()) {
							img.setIcon(new ImageIcon("src/jaguarITypePreto.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
							}else {
								img.setIcon(new ImageIcon("src/jaguarXePreto.png"));
								imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
								img.setIcon(imgCarro);
							
							}
					}
				});
				
				rdCorCi.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Mustang Match 1") && rdCorCi.isSelected()) {
							img.setIcon(new ImageIcon("src/msCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Ford GT") && rdCorCi.isSelected()) {
							
							img.setIcon(new ImageIcon("src/fgtCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}else if (cbMarca.getSelectedItem() == "Ford" && cbModelo.getSelectedItem().equals("Ford F-150") && rdCorCi.isSelected()){
							img.setIcon(new ImageIcon("src/msCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
						}
						// HYUNDAI //
						
						if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Creta") && rdCorCi.isSelected()) {
							img.setIcon(new ImageIcon("src/ctCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
							}else if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Tucson") && rdCorCi.isSelected()) {
							img.setIcon(new ImageIcon("src/tsCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
							}else if (cbMarca.getSelectedItem() == "Hyundai" && cbModelo.getSelectedItem().equals("Veloster") && rdCorCi.isSelected()) {
								img.setIcon(new ImageIcon("src/vlCinza.png"));
								imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
								img.setIcon(imgCarro);
							
							}
							// JAGUAR //
					
						if (cbMarca.getSelectedItem() == "Jaguar Cars" && cbModelo.getSelectedItem().equals("Jaguar I-Pace") && rdCorCi.isSelected()) {
							img.setIcon(new ImageIcon("src/jaguarIPaceCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
							}else if (cbMarca.getSelectedItem() == "Jaguar Cars" && cbModelo.getSelectedItem().equals("Jaguar F-Type") && rdCorCi.isSelected()) {
							img.setIcon(new ImageIcon("src/jaguarITypeCinza.png"));
							imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
							img.setIcon(imgCarro);
							
							}else {
								img.setIcon(new ImageIcon("src/jaguarXeCinza.png"));
								imgCarro.setImage(imgCarro.getImage().getScaledInstance(img.getWidth(),img.getHeight(),1));
								img.setIcon(imgCarro);
							
							}
				
					}
				});
				
				// BOTOES DE CANCELAR E SALVAR //
				
				btoSalvar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String nome,email,marca,modelo="",cor="",ar="",rodas="",hidra="",kit="";
						Double cel = Double.parseDouble(txtNumCel.getText());
						//boolean ar,rodas,hidra,kit;
						
						nome = txtNome.getText().toString();
						email = txtEmail.getText().toString();
						marca = cbMarca.getSelectedItem().toString();
						modelo = cbModelo.getSelectedItem().toString();
						
						// Criando mensagem
						
					
						if(rdCorBr.isSelected()) {
							cor = rdCorBr.getText();
							
						}else if(rdCorPr.isSelected()) {
							cor = rdCorPr.getText();
							
						}else {
							cor = rdCorCi.getText();
						}
						
						if(ckOp1.isSelected()) {
							ar = ckOp1.getText();
						}
						if(ckOp2.isSelected()) {
							rodas = ckOp2.getText();
							
						}
						if(ckOp3.isSelected()) {
							hidra = ckOp3.getText();
						}
						if(ckOp4.isSelected()) {
							kit = ckOp4.getText();
						}
						
						JOptionPane.showMessageDialog(null,  "ORÇAMENTO PRONTO" );
						JOptionPane.showMessageDialog(null, "Nome:" +nome+ "Num Celular:" +cel+ "Email:" +email+ "Marca:" + marca + 
								"Modelo:" +modelo+  "cor" +cor ); 
					}

				});





				
		
				btoCancelar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						txtNome.setText("");
						txtNumCel.setText("");
						txtEmail.setText("");
						cbMarca.setSelectedIndex(0);
						cbModelo.removeAllItems();
						rdCorBr.setSelected(false);
						rdCorPr.setSelected(false);
						rdCorCi.setSelected(false);
						ckOp1.setSelected(false);
						ckOp2.setSelected(false);
						ckOp3.setSelected(false);
						ckOp4.setSelected(false);

						
						// qndo eu conseguir por imagem JLabel vai aki 
						
						
						JOptionPane.showMessageDialog(null, "Confirme para cancelar!", "CANCELAMENTO", JOptionPane.QUESTION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Orçamento cancelado!!" );
					}		
				});
		
		
		
		
		

		this.setLayout(null); //sempre deixar por ultimo
		this.setVisible(true); //sempre deixar por ultimo
		
	}

	}


