import java.util.Locale;
import java.util.Scanner;
    /*
    You must make a program that read a float-point number and print a message saying in which of following intervals the number belongs: [0,25] (25,50], (50,75], (75,100]. If the read number is less than zero or greather than 100, the program must print the message “Fora de intervalo” that means "Out of Interval".

    The symbol '(' represents greather than. For example:
    [0,25] indicates numbers between 0 and 25.0000, including both.
    (25,50] indicates numbers greather than 25 (25.00001) up to 50.0000000.

    Input
    The input file contains a floating-point number.

    Output
    The output must be a message like following example.
     */
public class Problem1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double number;

        number = sc.nextDouble();

        if (number > 0 && number <= 25) {
            System.out.println("Intervalo [0,25]");

        } else if (number > 25 && number <= 50) {
            System.out.println("Intervalo (25,50]");

        } else if (number > 50 && number <= 75) {
            System.out.println("Intervalo (50,75]");

        } else if (number > 75 && number <= 100) {
            System.out.println("Intervalo (75,100]");

        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
