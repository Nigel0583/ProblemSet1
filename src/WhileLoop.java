import javax.swing.*;

public class WhileLoop {
    public static void main(String[] args) {

        String ExchangeRates, Pounds;
        double exchangeRate, pound=1, euro;

        ExchangeRates= JOptionPane.showInputDialog("Please enter exchange rate (£ to €)");
        exchangeRate=Double.parseDouble(ExchangeRates);

        while(pound!=0)
        {
            Pounds=JOptionPane.showInputDialog("Please enter the pounds to be converted");
            pound=Integer.parseInt(Pounds);

            if(pound>0)
            {
                euro=pound*exchangeRate;

                JOptionPane.showMessageDialog(null,"£"+pound+" equals €"+String.format("%.2f",euro));
            }
        }
    }
}
