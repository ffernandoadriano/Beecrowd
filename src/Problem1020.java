import java.util.Scanner;
    /*
    Read an integer value corresponding to a person's age (in days) and print it in years, months and days, followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

    Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364. This is just an exercise for the purpose of testing simple mathematical reasoning.

    Input
    The input file contains 1 integer value.

    Output
    Print the output, like the following example.
     */
public class Problem1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageInDays, years, months, days;

        ageInDays = sc.nextInt();

        years = ageInDays / 365;
        months = (ageInDays - (365 * years)) / 30;
        days = ageInDays - (365 * years) - (30 * months);

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", years, months, days);

        sc.close();
    }
}
