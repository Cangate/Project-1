
package pizza;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import static java.lang.System.in;
import javax.swing.JFrame;
import sun.tools.jar.Main;

public class Maingame extends JFrame {

    static Maingame frame;

    Home home;
    How_to how;
    Order order;
    Pizza pizza;
    Makepizza make;
    Score score = new Score();
    Good good;
    Gover over;

    public Maingame() {

        frame = this;
        setTitle("wow WOW pizza");
        setResizable(false);
        setBounds(275, 120, 700, 620);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home = new Home();
        add(home);
        setVisible(true);

    }


    public static void main(String[] args) {
        new Maingame();

    }

}
