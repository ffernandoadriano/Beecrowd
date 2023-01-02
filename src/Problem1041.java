import java.util.Locale;
import java.util.Scanner;
    /*
     Write an algorithm that reads two floating values (x and y), which should represent the coordinates of a point in a plane. Next, determine which quadrant the point belongs, or if you are at one of the Cartesian axes or the origin (x = y = 0)

     If the point is at the origin, write the message "Origem".

     If the point is at X axis write "Eixo X", else if the point is at Y axis write "Eixo Y".

     Input
     The input contains the coordinates of a point.

     Output
     The output should display the quadrant in which the point is.
     */
public class Problem1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Eixo X");
        }

        sc.close();

    }
}
