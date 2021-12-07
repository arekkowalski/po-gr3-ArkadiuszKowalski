import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dlugosc ciagu n, a nastepnie wartosci:\n");
        int n = scan.nextInt();
        int[] tab = new int[n];
        for(int i=0; i<n; i++)
            tab[i] = scan.nextInt();
        for(int i=1; i<n; i++)
            System.out.println(tab[i]);
        System.out.println(tab[0]);
    }
}
