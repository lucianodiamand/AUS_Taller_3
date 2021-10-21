import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager2;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestVerticalAlignement {

    protected void initUI() {
        final JFrame frame = new JFrame();
        frame.setTitle("Test vertical alignement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel menu = new JPanel();
        LayoutManager2 lm = new BoxLayout(menu, BoxLayout.Y_AXIS);
        menu.setLayout(lm);
        JButton label1 = new JButton("label1");
        JButton label2 = new JButton("label2");
        menu.add(label1);
        menu.add(label2);
        panel.add(menu, gbc);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestVerticalAlignement().initUI();
            }
        });
    }

}