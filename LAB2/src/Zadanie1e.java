import java.util.Scanner;
public class Zadanie1e {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną a: ");
        int a = scan.nextInt();
        int suma = 1;
        while(a>0)
        {
            int myinput = scan.nextInt();
            suma = suma * Math.abs(myinput);
            a = a-1;
        }
        System.out.printf("Sum = %d\n",suma);
    }
}
