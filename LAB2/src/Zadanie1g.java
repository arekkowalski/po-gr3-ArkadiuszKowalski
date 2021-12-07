import java.util.Scanner;
public class Zadanie1g {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną a: ");
        int a = scan.nextInt();
        int sumadodawania = 0;
        double sumamnozenia = 1;
        while(a>0)
        {
            int myinput = scan.nextInt();
            sumamnozenia = sumamnozenia * myinput;
            sumadodawania = sumadodawania + myinput;
            a = a-1;
        }
        System.out.printf("Sum = %d\n",sumadodawania);
        System.out.printf("Sum = %f\n",sumamnozenia);
    }
}
