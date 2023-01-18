import java.util.Scanner;
    /*
    Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

    Input
    The input file contains 4 integer values.

    Output
    Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, according to the following example, with a blank space before and after the equal signal.
     */
public class Problem1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, difference;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        difference = (a * b - c * d);

        System.out.printf("DIFERENCA = %d%n", difference);

        sc.close();
    }
}
