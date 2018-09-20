import javax.swing.*;

public class Volume {
    public static void main(String[] args) {


    int v = Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of the cube: "));

    if(MyMethods.cube(v) > 100 ){
        JOptionPane.showMessageDialog(null,"You can’t take this on board, put it into your check-in luggage");
    }
    else {
     JOptionPane.showMessageDialog(null,"You carry this on board");
    }

    }
}
