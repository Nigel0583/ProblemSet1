import java.util.Scanner;

public class ArraysInput10 {
    public static void main(String[] args) {
      int numbers[] = new int[10];
      readArray(numbers);
      displayNumber(numbers);


    }
    public static void readArray(int n[]){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i<n.length; i++)
        {
          System.out.print("Please enter an integer: ");
          n[i] = input.nextInt();
        }
    }

    public static void displayNumber(int n[]){


        System.out.print("\n\nThe first value in the array is " +(n[0]));

        System.out.print("\nThe 5th number in the array is " +(n[4]));
    }
}
