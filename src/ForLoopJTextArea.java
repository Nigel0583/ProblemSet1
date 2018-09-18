import javax.swing.*;


public class ForLoopJTextArea {
    public static void main(String[] args) {
        int in;

        JTextArea textArea = new JTextArea();
        textArea.setText("Yard\tInches\n------\t------");

        for ( int i = 1; i <= 10; i++) {

            in = (i * 36);

            textArea.append("\n"+i+"\t"+in);
        }

        JOptionPane.showMessageDialog(null, textArea);
    }
}
