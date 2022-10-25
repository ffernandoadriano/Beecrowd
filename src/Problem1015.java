import java.util.Locale;
import java.util.Scanner;
    /*
    Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them, showing four decimal places after the comma, according to the formula:

    Distance = <img align="left" alt="Problem105" width="40px" src="https://user-images.githubusercontent.com/96425026/197864402-d32586d0-f38a-45af-b5f5-43f36a020807.png"/>

    Input
    The input file contains two lines of data. The first one contains two double values: x1 y1 and the second one also contains two double values with one digit after the decimal point: x2 y2.

    Output
    Calculate and print the distance value using the provided formula, with 4 digits after the decimal point.
     */
public class Problem1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, distance;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f%n", distance);

        sc.close();
    }
}
