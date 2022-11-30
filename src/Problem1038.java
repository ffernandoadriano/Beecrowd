import java.util.Locale;
import java.util.Scanner;
    /*
    Using the following table, write a program that reads a code and the amount of an item. After, print the value to pay. This is a very simple program with the only intention of practice of selection commands.

    https://user-images.githubusercontent.com/96425026/204511561-afef8eba-d1c9-4e69-b283-e05577e2b3fe.jpg

    Input
    The input file contains two integer numbers X and Y. X is the product code and Y is the quantity of this item according to the above table.

    Output
    The output must be a message "Total: R$ " followed by the total value to be paid, with 2 digits after the decimal point.
     */
public class Problem1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] tablePrice = new double[]{4, 4.5, 5, 2, 1.50};
        int code, amountProduct;
        double totalPrice;

        code = sc.nextInt();
        amountProduct = sc.nextInt();

        totalPrice = (tablePrice[code - 1] * amountProduct);

        System.out.printf("Total: R$ %.2f%n", totalPrice);

        sc.close();
    }
}
