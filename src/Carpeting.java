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

        textArea.setText(String.format("%-20s %5s \n %20s%.2f  \n %20s%.2f \n  %20s%.2f  \n %20s%.2f  \n %20s%.2f",
                                                                                "Quotation for "  ,name,
                                                                                "Length of room:" ,length,
                                                                                "Breadth of room: ",breath,
                                                                                "Total area of the room: " ,area,
                                                                                "Cost per square metre of carpet:" ,cost,
                                                                                "Total cost of carpet: " ,total));

        JOptionPane.showMessageDialog(null, textArea);

    }
}
