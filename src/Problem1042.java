import java.util.Scanner;
    /*
    Read three integers and sort them in ascending order. After, print these values in ascending order, a blank line and then the values in the sequence as they were readed.

    Input
    The input contains three integer numbers.

    Output
    Present the output as requested above.
     */
public class Problem1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[3];
        int[] aux = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            aux[i] = number[i];
        }

        //Bubble Sort
        int temp;
        for (int i = aux.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (aux[j] > aux[j + 1]) {
                    temp = aux[j];
                    aux[j] = aux[j + 1];
                    aux[j + 1] = temp;
                }
            }
        }

        for (int value : aux) {
            System.out.println(value);
        }

        System.out.println();

        for (int value : number) {
            System.out.println(value);
        }

        sc.close();
    }
}
