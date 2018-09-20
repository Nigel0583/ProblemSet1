import javax.swing.*;

public class Stringclass {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Please enter your first name, middle name if any and surname:");

        int characters = name.length();
         char first = name.charAt(0);
         String upper = name.toUpperCase();
        String surname = name.substring(name.lastIndexOf(" ")+1);

         JOptionPane.showMessageDialog(null,"Name length: " +characters+ "\nFirst letter: " +first+
                "\nUppercase: " +upper+ "\nLast name: " +surname );


    }
}
