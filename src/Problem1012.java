import java.util.Locale;
import java.util.Scanner;
    /*
    Make a program that reads three floating point values: A, B and C. Then, calculate and show:
    a) the area of the rectangle triangle that has base A and height C.
    b) the area of the radius's circle C. (pi = 3.14159)
    c) the area of the trapezium which has A and B by base, and C by height.
    d) the area of the square that has side B.
    e) the area of the rectangle that has sides A and B.

    Input
    The input file contains three double values with one digit after the decimal point.

    Output
    The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after the decimal point.
     */
public class Problem1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double rectangleTriangleArea, circleArea, pi = 3.14159d, trapeziumArea, squareArea, rectangleArea;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        rectangleTriangleArea = (a * c) / 2;
        circleArea = pi * c * c;
        trapeziumArea = ((a + b) * c) / 2;
        squareArea = b * b;
        rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f%n", rectangleTriangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);

        sc.close();
    }
}
