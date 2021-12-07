import java.util.Random;
import java.util.Scanner;

public class Zadanie1_c {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0 && n <= 100) {
            int[] tablica = new int[n];
            int max = 0;
            int count = 0;
            Random r = new Random();
            int range = 999 + 999 + 1;
            for (int i = 0; i < n; i++) {
                int int_random = r.nextInt(range) - 999;
                tablica[i] = int_random;
                if (tablica[i] >= max) {
                    max = tablica[i];
                    count++;
                }
                System.out.printf("%d\n", tablica[i]);

            }
            System.out.printf("Największa: %d\n", max);
            System.out.printf("Ile razy wystąpiła: %d\n", + count);

        }
        else{
            System.out.println("Number out of range: ");

        }
    }
}