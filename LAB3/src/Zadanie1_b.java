import java.util.Random;
import java.util.Scanner;

public class Zadanie1_b {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0 && n <= 100) {
            int[] tablica = new int[n];
            int dodatnia = 0;
            int ujemna = 0;
            int zero = 0;
            Random r = new Random();
            int range = 999 + 999 + 1;
            for (int i = 0; i < n; i++) {
                int int_random = r.nextInt(range) - 999;
                tablica[i] = int_random;
                if (tablica[i] >= 0) {
                    dodatnia++;
                }
                if (tablica[i] <= 0) {
                    ujemna++;
                }
                if (tablica[i] == 0) {
                    zero++;
                }
                System.out.printf("%d\n", tablica[i]);
            }
            System.out.printf("Ujemna: %d\n", ujemna);
            System.out.printf("Dodatnia: %d\n", dodatnia);
            System.out.printf("Zero: %d\n", zero);

        }
        else{
            System.out.println("Number out of range: ");

        }
    }
}