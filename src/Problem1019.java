import java.util.Scanner;
    /*
    Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed in hours:minutes:seconds.

    Input
    The input file contains an integer N.

    Output
    Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
     */
public class Problem1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int durationSeconds, second, minute, hours;

        durationSeconds = sc.nextInt();

        second = durationSeconds % 60;
        minute = (durationSeconds / 60) % 60;
        hours = durationSeconds / 3600;

        System.out.printf("%d:%d:%d%n", hours, minute, second);

        sc.close();
    }
}
