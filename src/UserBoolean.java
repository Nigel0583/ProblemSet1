import javax.swing.*;

public class UserBoolean {
    public static void main(String[] args) {
        int num ;
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer. (-1 to exit)"));

        if (isEven(num)){
            JOptionPane.showMessageDialog(null,+num+ " is even");
        }
        else{
            JOptionPane.showMessageDialog(null,+num+ " is odd");
        }

        while (num != -1) {

             num = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer. (-1 to exit)"));

            if (isEven(num)){
                JOptionPane.showMessageDialog(null,+num+ " is even");
            }
            else{
                JOptionPane.showMessageDialog(null,+num+ " is odd");
            }

        }
    }
    private static boolean isEven(int e){
        return (e % 2) == 0;

    }



}
