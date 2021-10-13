import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;

public class MiFrame extends JFrame {

	private JLabel et1;
	private JButton aceptar;
	
	public MiFrame() {
		setTitle("Ejemplo 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		
		Container ctx = getContentPane();
//		ctx.setLayout(null);

		JPanel menu = new JPanel();
		menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
		menu.add(new JButton("A"));
		menu.add(new JButton("B"));
		menu.add(new JButton("C"));
		menu.add(new JButton("D"));
		menu.add(new JButton("E"));

		JPanel centro = new JPanel();
		centro.setLayout(new FlowLayout());
		et1 = new JLabel("Busqueda");
		//et1.setBounds(400, 0, 100, 70);
		aceptar = new JButton("Aceptar");
		//aceptar.setMaximumSize(new Dimension(500, 50));
//		aceptar.setMinimumSize(new Dimension(100, 50));
//		aceptar.setBounds(0, 100, 500, 50);
//		aceptar.setPreferredSize(new Dimension(500, 50));

		JPanel sur = new JPanel();
		sur.add(new JLabel("Host: "));
		sur.add(new JTextField(20));
		sur.add(new JButton("Conectar"));
		
		ctx.add(sur, BorderLayout.SOUTH);
		centro.add(et1, BorderLayout.NORTH);
		centro.add(aceptar);
		
		ctx.add(menu, BorderLayout.WEST);
		ctx.add(centro);
		
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		MiFrame m = new MiFrame();
	}
}
