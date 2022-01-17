import pl.imiajd.kowalski.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args) {
        String[] imiona = {"Arek", "Second name"};
        String nazwisko = "Kowalski";
        boolean plec = true;
        LocalDate dataUrodzenia = LocalDate.of(2000, 10, 28);
        Osoba osoba = new Osoba(imiona, nazwisko, plec, dataUrodzenia);

        System.out.println(osoba.getImiona()[0]);
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getRokUrodzenia());
        System.out.println(osoba.getPlec() ? "facet" : "kobieta");

        Pracownik pracownik = new Pracownik(
                imiona,
                nazwisko,
                plec,
                dataUrodzenia,
                15000,
                LocalDate.of(2015, 10, 10));
        System.out.println(pracownik.getPensja());
        System.out.println(pracownik.getDataZatrudnienia());

        Student student = new Student(imiona, nazwisko, plec, dataUrodzenia, "Filologia", 4.5);
        System.out.println(student.getKierunek());
        System.out.println(student.getSredniaOcen());
        student.setSredniaOcen(4.0);
        System.out.println(student.getSredniaOcen());
        System.out.println("--------------------------------");
        ArrayList<Instrument> orkiestra = new ArrayList<>(Arrays.asList(
                new Flet("DDD", LocalDate.ofYearDay(2000, 365)),
                new Fortepian("AAA", LocalDate.ofYearDay(2020, 365)),
                new Skrzypce("ADB", LocalDate.ofYearDay(2010, 365)),
                new Skrzypce("ZZZ", LocalDate.ofYearDay(2019, 365)),
                new Flet("DPA", LocalDate.ofYearDay(2000, 365))));
        for (Iterator<Instrument> it = orkiestra.iterator(); it.hasNext();)
        {
            it.next().dzwiek();
        }
        System.out.println(orkiestra);
    }
}
