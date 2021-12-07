import java.util.Scanner;
public class Zadanie2c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dlugosc ciagu n, a nastepnie wartosci:\n");
        int suma=0;
        int n = scan.nextInt();
        while(n>0)
        {
            int a = scan.nextInt();
            if (Math.sqrt(a)%2==0)
                suma+=1;
            n-=1;
        }
        System.out.println("Ilosc: " + suma);
    }
}
