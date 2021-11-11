import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a Number: ");
        JLabel inputLabel2 = new JLabel("Enter a Number: ");
        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);

        JButton addBut = new JButton("Add");
        JButton subtractBut = new JButton("Subtract");
        JButton multBut = new JButton("Multiply");
        JButton dividBut = new JButton("Divide");

        JLabel resultLabel = new JLabel("0.00");

        window.setSize(200,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(resultLabel);

        panel.add(subtractBut);
        panel.add(addBut);
        panel.add(multBut);
        panel.add(dividBut);

        window.add(panel);
        window.setVisible(true);



    }

    private static class addListener implements ActionListener{

    }
    