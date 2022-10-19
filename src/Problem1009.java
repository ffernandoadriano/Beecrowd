import java.util.Locale;
import java.util.Scanner;
    /*
    Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month , with two decimal places.

    - Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

    - Don’t forget the blank spaces.

    Input
    The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the total value sold by him/her.

    Output
    Print the seller's total salary, according to the given example.
     */
public class Problem1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String sellerName;
        double fixedSalary, salesTotal, commissionPercentage = 15.0d, commissionValue, grossSalary;

        sellerName = sc.next();
        fixedSalary = sc.nextDouble();
        salesTotal = sc.nextDouble();

        commissionValue = (salesTotal * commissionPercentage) / 100;
        grossSalary = fixedSalary + commissionValue;

        System.out.printf("TOTAL = R$ %.2f%n", grossSalary);

        sc.close();
    }
}
