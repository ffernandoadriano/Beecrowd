import java.util.Locale;
import java.util.Scanner;
    /*
    Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. If it's impossible to calculate the roots because a division by zero or a square root of a negative number, presents the message “Impossivel calcular”.

    Input
    Read 3 floating-point numbers (double) A, B and C.

    Output
    Print the result with 5 digits after the decimal point or the message if it is impossible to calculate.
     */
public class Problem1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0 && a != 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);

        } else {
            System.out.println("Impossivel calcular");
        }

        sc.close();
    }
}
