import javax.swing.*;

public class MathMethods {
    public static void main(String[] args) {
       int c =0;

        JTextArea textArea = new JTextArea();
        textArea.setText(String.format("%-10s %10s  \n %-20s %10s ", "Number", "Cube", "-------", "-------"));

        for (int i = 1; i <= 15; i++) {
            c++;
            textArea.append("\n"+i+"\t"+cube(c));
        }
        JOptionPane.showMessageDialog(null, textArea);
    }
    private static int cube(int n){
        return (n*n*n);
    }
}
