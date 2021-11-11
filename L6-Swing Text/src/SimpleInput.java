import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickCount = 0;

    public static void main(String[] args) {
        JFrame window = new JFrame("Clicker Explosion!");
        JPanel panel = new JPanel();
        clickCountLabel = new JLabel("Click Count: ");
        JLabel inputLabel = new JLabel("Enter product name: ");
        input = new JTextField(15);
        JButton button = new JButton("CLICK FOR EXPLOSION");

        window.setSize(250, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRealtiveTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(inputLabel);
        panel.add(input);
        panel.add(clickCountLabel);
        panel.add(button);

        window.add(panel);

        window.setVisible(true);

    }


    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String product = input.getText();

            clickCount++;

            clickCountLabel.setText("Sold " + clickCount + "number of " + product);

        }
    }
}
