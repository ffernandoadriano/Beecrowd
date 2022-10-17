import java.util.Locale;
import java.util.Scanner;
    /*
    Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, always with one decimal place.

    Input
    The input file contains 3 values of floating points (double) with one digit after the decimal point.

    Output
    Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with a blank space before and after the equal signal.
     */
public class Problem1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double note1, note2, note3, weight1 = 2.0d, weight2 = 3.0d, weight3 = 5.0d, average;

        note1 = sc.nextDouble();
        note2 = sc.nextDouble();
        note3 = sc.nextDouble();

        average = ((note1 * weight1) + (note2 * weight2) + (note3 * weight3)) / (weight1 + weight2 + weight3);

        System.out.printf("MEDIA = %.1f%n", average);

        sc.close();
    }
}
