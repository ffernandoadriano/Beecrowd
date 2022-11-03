import java.util.Scanner;
    /*
    In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.

    Input
    The input file contains an integer value N (0 < N < 1000000).

    Output
    Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
     */
public class Problem1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[]{100, 50, 20, 10, 5, 2, 1};
        int value, quantity;

        value = sc.nextInt();

        System.out.println(value);

        for (int note : notes) {
            quantity = (value / note);
            value = (value % note);

            System.out.printf("%d nota(s) de R$ %d,00%n", quantity, note);
        }

        sc.close();
    }
}
