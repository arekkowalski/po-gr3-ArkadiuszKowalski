import java.util.Random;
import java.util.Scanner;

public class Zadanie1_a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0 && n <= 100) {
            int[] tablica = new int[n];
            int dodatnie = 0;
            int parzysta = 0;
            Random r = new Random();
            int range = 999 + 999 + 1;
            for (int i = 0; i < n; i++) {
                int int_random = r.nextInt(range) - 999;
                tablica[i] = int_random;
                if (tablica[i] % 2 == 0) {
                    parzysta++;
                }
                System.out.printf("%d\n", tablica[i]);
            }
            System.out.printf("Parzysta: %d\n", parzysta);
            System.out.printf("Nieparzysta: %d\n", n - parzysta);

        }
        else{
            System.out.println("Number out of range: ");

        }
    }
}