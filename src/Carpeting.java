import javax.swing.*;

public class Carpeting {
    public static void main(String[] args) {

        String name;
        double length, breath, cost;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room: "));
        breath = Double.parseDouble(JOptionPane.showInputDialog("Please enter the breath of the room: "));
        cost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost per square metre:"));

        double area = length * breath;
        double total = cost * area;



        JTextArea textArea = new JTextArea();
        textArea.setText ("Quotation for Length of room:\n Breadth of room:\n Total area of the room: "  +
                "Cost per square metre of carpet: \nTotal cost of carpet: " );

        textArea.append(String.format("%-20s %20s \n%-20s%.2f m.\n %-20s%.2f m.\n", name,length,breath,area,cost,total));

        JOptionPane.showMessageDialog(null, textArea);

    }
}
