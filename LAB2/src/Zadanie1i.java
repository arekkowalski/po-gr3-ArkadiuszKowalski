import java.util.Scanner;
public class Zadanie1i {
    public static int silnia (int n) {
        int iloczyn = 1;
        for (int i=1; i<=n; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dlugosc ciagu n, a nastepnie wartosci:\n");
        double suma=0;
        int n = scan.nextInt();
        int m = 1;
        int p = n;
        while(n>0)
        {
            double a = scan.nextDouble();
            if (m % 2 != 0)
            {
                a*=-1;
            }
            a=(a/silnia(m));
            m+=1;
            suma+=a;
            n-=1;
        }
        System.out.println("Suma: " + suma);
    }
}
