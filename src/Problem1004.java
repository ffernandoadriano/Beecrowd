import java.util.Scanner;
    /*
    Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

    Input
    The input file contains 2 integer numbers.

    Output
    Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.
     */
public class Problem1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, result;

        x = sc.nextInt();
        y = sc.nextInt();

        result = x * y;

        System.out.printf("PROD = %d%n", result);

        sc.close();
    }
}
