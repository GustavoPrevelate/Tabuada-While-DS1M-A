package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		painel.setBackground(Color.white);
		
		FrameTabuada tela1 = new FrameTabuada();
		tela1.titulo = "Tabuada";
		tela1.altura = 600;
		tela1.largura = 600;
		
		
		
		
		tela.setVisible(true);
		
		
		

	}
}