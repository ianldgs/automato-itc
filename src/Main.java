import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String word;

        do {
            word = JOptionPane.showInputDialog(null, "Digite uma palavra para testar o autômato:");

            if (null == word) {
                break;
            }

            AutomatonITC a = new AutomatonITC();

            if (a.recognize(word)) {
                JOptionPane.showMessageDialog(null, "A palavra " + word + " foi reconhecida!");
            } else {
                JOptionPane.showMessageDialog(null, "A palavra " + word + " não foi reconhecida!");
            }
        } while (true);
    }
}
