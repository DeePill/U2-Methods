import javax.swing.*;
import java.awt.*;

public class ChangingColors {


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550,300));
        frame.getContentPane().setBackground(Color.GREEN);
        frame.pack();
        frame.setVisible(true);



    }
}
