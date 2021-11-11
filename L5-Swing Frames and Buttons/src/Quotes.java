import javax.swing.*;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */


    public static void main(String[] args) {



        JFrame window = new JFrame("Three Quotes");
        JPanel panel = new JPanel();
        JButton quote1But = new JButton("Click for First Quote");
        JButton quote2But = new JButton("Click for the Second Quote");
        JButton quote3But = new JButton("");

        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        window.setLocationRelativeTo(null);

        quote1But.addActionListener(new quoteBut1());




        panel.add(button);
        window.add(panel);
        window.setVisible(true);
    }

}
