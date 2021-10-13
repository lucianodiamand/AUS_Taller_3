import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiVentana extends JFrame { //implements ActionListener {

	private JButton boton;
	private JLabel etiqueta;
	private JButton otroBoton;

	public MiVentana() {
		boton = new JButton("Aceptar");
		etiqueta = new JLabel("Hola Mundo!");
		otroBoton = new JButton("Otro boton");

		Container ctx = getContentPane();
		ctx.add(etiqueta, BorderLayout.NORTH);
		ctx.add(otroBoton);
		ctx.add(boton, BorderLayout.SOUTH);
		
		// MiListener ml = new MiListener(etiqueta);
		InnerListener ml = new InnerListener();
		boton.addActionListener(ml);
		otroBoton.addActionListener(ml);
//		boton.addActionListener(this);
//		boton.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				etiqueta.setText("Chau mundo!");
//			}
//
//		});
//		
//		otroBoton.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				etiqueta.setText("Chau mundo!");
//			}
//
//		});
				
//		ActionListener al = new ActionListener();
	}
	
	public static void main(String[] args) {
		MiVentana mv = new MiVentana();
		mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mv.setSize(800, 600);
		mv.setVisible(true);
	}

	private class InnerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton j = (JButton) e.getSource();
			if (j == boton) {
				etiqueta.setText("AAAAAAAAAAAAAAAAAAAAAAAAAA");
			} else if (j == otroBoton) {
				etiqueta.setText("BBBBBBBBBBBBBBBBBBBBBBBBBB");
				Thread t = new Thread(new Runnable() {
					
					public void run() {
						System.out.println("Ejecuto en un hilo separado");
					}
				});
				t.start();
			}
		}
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		//System.out.println("Hola");
//		etiqueta.setText("Chau mundo!");		
//	}

}
