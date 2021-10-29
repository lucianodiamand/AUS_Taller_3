import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager2;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiVentana extends JFrame {

	public MiVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
		
		Container ctx = getContentPane();
//		JPanel menu = new JPanel();
//		menu.setLayout(new GridLayout(3, 3));
		
		JPanel botonera = new JPanel();
		LayoutManager2 lo = new BoxLayout(botonera, BoxLayout.Y_AXIS);
		botonera.setLayout(lo);
		botonera.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		JButton button1 = new JButton("Boton 1");
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		botonera.add(button1);
		JButton button2 = new JButton("Boton 2");
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		botonera.add(button2); 	
		JButton button3 = new JButton("Boton 3");
		button3.setAlignmentX(Component.CENTER_ALIGNMENT);
		button3.setAlignmentY(Component.CENTER_ALIGNMENT);
		botonera.add(button3);
		
//		menu.add(new JButton());
//		menu.add(new JButton());
//		menu.add(new JButton());
//		menu.add(new JButton());
//		menu.add(botonera);
//		menu.add(new JButton());
//		menu.add(new JButton());
//		menu.add(new JButton());
//		menu.add(new JButton());
		
		ctx.add(botonera, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		MiVentana mv = new MiVentana();
	}
}
