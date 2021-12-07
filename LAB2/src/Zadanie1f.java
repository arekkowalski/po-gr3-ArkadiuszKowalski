import java.util.Scanner;
public class Zadanie1f {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną a: ");
        int a = scan.nextInt();
        double suma = 1;
        while(a>0)
        {
            double myinput = scan.nextInt();
            suma = suma + Math.pow(myinput,2);
            a = a-1;
        }
        System.out.printf("Sum = %f\n",suma);
    }
}
