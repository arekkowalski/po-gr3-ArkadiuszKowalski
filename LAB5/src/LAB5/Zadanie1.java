import java.util.ArrayList;
public class Zadanie1 {
    public static ArrayList<Integer> append (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.addAll(a);
        lista1.addAll(b);
        return lista1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ArrayList<Integer> wynik = append(a,b);
        System.out.print(wynik);

    }

}
