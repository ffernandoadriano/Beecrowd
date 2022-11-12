import java.util.Locale;
import java.util.Scanner;
    /*
    Read a value of floating point with two decimal places. This represents a monetary value. After this, calculate the smallest possible number of notes and coins on which the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

    Input
    The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

    Output
    Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.
     */
public class Problem1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] notes = new double[]{100, 50, 20, 10, 5, 2};
        double[] coins = new double[]{1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        double monetaryValue;
        int quantityNote, quantityCoin;

        monetaryValue = sc.nextDouble();

        //solution to the penny problem
        monetaryValue = (monetaryValue * 100) + 0.05;

        System.out.println("NOTAS:");

        for (double note : notes) {
            quantityNote = (int) (monetaryValue / (note * 100));
            System.out.printf("%d nota(s) de R$ %.2f%n", quantityNote, note);
            monetaryValue = monetaryValue % (note * 100);
        }

        System.out.println("MOEDAS:");

        for (double coin : coins) {
            quantityCoin = (int) (monetaryValue / (coin * 100));
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantityCoin, coin);
            monetaryValue = monetaryValue % (coin * 100);
        }

        sc.close();
    }
}
