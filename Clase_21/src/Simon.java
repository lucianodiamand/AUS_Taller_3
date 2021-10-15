import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simon extends JFrame {

	private JButton [] botones;
//	private Color [] colores;
	private int[] secuenciaColores;
	private static final int CANT_COLORES = 256;
	private int indice;
	private boolean jugando;
	private boolean accionUsuario;
	private JButton inicio;
	
	public Simon() {
		secuenciaColores = new int[CANT_COLORES];
		for (int i = 0; i < secuenciaColores.length; i++) {
			secuenciaColores[i] = (int)(Math.random() * 4);
		}

		inicio = new JButton("Jugar!!!");
		inicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ev) {
//				Thread demo = new Thread() {
//					
//					public void run() {
//						for (int i = 0; i < 10; i++) {
//							int color = secuenciaColores[i];
//							botones[color].setBackground(new Color(1f, 0f, 1f));
//							try {
//								Thread.sleep(500);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//							botones[color].setBackground(ColoresSimon.values()[color].getColor());
//							try {
//								Thread.sleep(500);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//						}
//					}
//				};
//				
//				demo.start();
				
				inicio.setEnabled(false);
				for (int i = 0; i < botones.length; i++) {
					botones[i].setEnabled(true);
				}
				jugando = true;

				Thread juego = new Thread() {
					
					public void run() {
						while (jugando) {
							for (int i = 0; i <= indice; i++) {
								int color = secuenciaColores[i];
								botones[color].setBackground(new Color(1f, 0f, 1f));
								try {
									Thread.sleep(1000);
									botones[color].setBackground(ColoresSimon.values()[color].getColor());
									Thread.sleep(1000);
								} catch (InterruptedException e) { }
							}
							
							Thread wait = new Thread() {
								
								public void run() {
									while(!accionUsuario) {
										Thread.yield();
									}
									accionUsuario = false;
								}

							};
							wait.start();
							
							try {
								wait.join();
								Thread.sleep(1000);
							} catch (InterruptedException e) { }

							indice++;
						}
					}

				};
		
				juego.start();
			}
		});
		
		botones = new JButton[4];
//		colores = new Color[4];
//		for (int i = 0; i < colores.length; i++) {
//			colores[i] = ColoresSimon.values()[i].getColor();
//		}
		
		for (int i = 0; i < botones.length; i++) {
			botones[i] = new JButton();
			botones[i].setBackground(ColoresSimon.values()[i].getColor());
			botones[i].setEnabled(false);
			botones[i].addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					accionUsuario = true;
				}
			});

//			switch (i) {
//			case 0:
//				botones[i].setBackground(ColoresSimon.values()[i].getColor());
//				break;
//			case 1: 
//				botones[i].setBackground(ColoresSimon.values()[i].getColor());
//				break;
//			case 2:
//				botones[i].setBackground(ColoresSimon.values()[i].getColor());
//				break;
//			case 3:
//				botones[i].setBackground(ColoresSimon.values()[i].getColor());
//				break;
//			}	
		}
		
		Container ctx = getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		for (int i = 0; i < botones.length; i++) {
			panel.add(botones[i]);	
		}
		
		ctx.add(inicio, BorderLayout.SOUTH);
		ctx.add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

}
