import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
    /*
    Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding to 4 scores obtained by a student. Calculate the average with weights 2, 3, 4 e 1 respectively, for these 4 scores and print the message "Media: " (Average), followed by the calculated result. If the average was 7.0 or more, print the message "Aluno aprovado." (Approved Student). If the average was less than 5.0, print the message: "Aluno reprovado." (Reproved Student). If the average was between 5.0 and 6.9, including these, the program must print the message "Aluno em exame." (In exam student).

    In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed by the typed score. Recalculate the average (sum the exam score with the previous calculated average and divide by 2) and print the message “Aluno aprovado.” (Approved student) in case of average 5.0 or more) or "Aluno reprovado." (Reproved student) in case of average 4.9 or less. For these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final average) followed by the final average for this student in the last line.

    Input
    The input contains four floating point numbers that represent the students' grades.

    Output
    Print all the answers with one digit after the decimal point.
     */
public class Problem1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("#,#0.0");
        Scanner sc = new Scanner(System.in);
        double[] note = new double[4];
        double gradeAverage = 0.0d, exam = 0.0d, gradeAverageFinal = 0.0d;
        int[] weight = new int[]{2, 3, 4, 1};
        int sumWeight = 0;

        for (int i = 0; i < note.length; i++) {
            note[i] = sc.nextDouble();
        }

        for (int i = 0; i < weight.length; i++) {
            gradeAverage += note[i] * weight[i];
            sumWeight += weight[i];
        }

        gradeAverage /= sumWeight;

        if (gradeAverage >= 5 && gradeAverage < 7) {
            exam = sc.nextDouble();
            gradeAverageFinal = (gradeAverage + exam) / 2;
        }

        System.out.println("Media: " + df.format(gradeAverage));

        if (gradeAverage >= 7) {
            System.out.println("Aluno aprovado.");

        } else if (gradeAverage >= 5) {
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + df.format(exam));

            if (gradeAverageFinal >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + df.format(gradeAverageFinal));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + df.format(gradeAverageFinal));
            }

        } else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
