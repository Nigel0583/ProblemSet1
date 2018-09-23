import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayAlgorithms {
    public static void main(String[] args) {
        double[] weights = new double[5];
        double under, percent, lightest, avg;

            populateWeights(weights);

            under = Under250(weights);

            percent = PercentOver(weights);

            lightest = Lightest(weights);

            avg = AverageWeight(weights);

     JOptionPane.showMessageDialog(null,"Weights: "+ Arrays.toString(weights) +
                "\nNumber under 250 kg: " + under + "\nPercentage over 400 kg: " +
             percent + "%\nLightest animal: " + lightest + "kg\nAverage weight: " +
             String.format("%.1f",avg) + "kg","Cattle Mart ",JOptionPane.INFORMATION_MESSAGE);

    }
    private static void populateWeights(double w[]) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < w.length; i++) {
            System.out.print("Please the weight: " + (i+1) + ": ");
            w[i] = input.nextDouble();
        }
    }

    private static double Under250(double w[]){
        int counter = 0;
        for (int i = 0; i < w.length; i++)
            if(w[i] < 250)
                counter++;

        return counter;
    }

    private static double PercentOver(double[] w){
        double counter = 0, over;
        for (int i = 0; i < w.length; i++)
            if(w[i] >= 400)
                counter++;
                over = ((counter / 5) * 100);

        return over;
    }

    private static double  Lightest(double[] w){
        double lightest = w[0];
        for (int i = 1; i < w.length; i++)
        {
            if(w[i] < lightest)
                lightest = w[i];
        }

        return lightest;
    }

    private static double AverageWeight(double w[]) {
        double total = 0;
        for (int i = 0; i < w.length; i++)
        {
            total += w[i];
        }

        return total/w.length;
    }
}
