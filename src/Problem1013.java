import java.util.Scanner;
    /*
    Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:

    MaiorAB = (a + b + abs(a - b)) / 2

    Input
    The input file contains 3 integer values.

    Output
    Print the greatest of these three values followed by a space and the message “eh o maior”.
     */
public class Problem1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, largerAB, largerABC;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        largerAB = (a + b + Math.abs(a - b)) / 2;
        largerABC = (c + largerAB + Math.abs(c - largerAB)) / 2;

        System.out.printf("%d eh o maior%n", largerABC);

        sc.close();
    }
}
