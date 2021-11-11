import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    The Plan:
    1. Get input - a word hopefully with a p and letters
    2. Isolate the p
    3. Isolate the three letters AFTER the p
    4. output
     */

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word that has a p, and three letters");
        JOptionPane.showMessageDialog(null,splitP(word));
        System.exit(0);

    }

    public static String splitP(String word) {
        int pIndex = word.indexOf('p');

        return word.substring(pIndex, pIndex + 4);

    }
}
