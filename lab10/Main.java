import pl.imiajd.kowalski.Osoba;
import pl.imiajd.kowalski.Student;

import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Osoba> list = new ArrayList<Osoba>(Arrays.asList(
                new Osoba("Kowalski", LocalDate.of(2000, 10, 28)),
                new Osoba("nazwisko5", LocalDate.now().plusDays(3)),
                new Osoba("nazwisko5", LocalDate.now().plusDays(4)),
                new Osoba("nazwissko1", LocalDate.now()),
                new Osoba("nazwiskoo2", LocalDate.now())
        ));

        System.out.println(list);

        Collections.sort(list, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                int tmp = o1.compareTo(o2);
                return tmp;
            }
        });

        System.out.println(list);

        System.out.println("------------------------------ PROGRAM2 -----------------------------------------------");

        ArrayList<Student> list2 = new ArrayList<Student>(Arrays.asList(
                new Student("nazwisko1", LocalDate.now(), 1.0),
                new Student("nazwisko2", LocalDate.now(), 2.0),
                new Student("Kowalski", LocalDate.of(2000, 10, 28), 3.0),
                new Student("nazwisko5", LocalDate.now().plusDays(3), 4.0),
                new Student("nazwisko5", LocalDate.now().plusDays(4), 5.0)
        ));

        System.out.println(list2);

        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int tmp = o1.compareTo(o2);
                return tmp;
            }
        });

        System.out.println(list2);

        System.out.println("------------------------------ PROGRAM3 -----------------------------------------------");

        try
        {
            BufferedReader buffer = new BufferedReader(new FileReader(args[0]));
            ArrayList<String> result = new ArrayList<>();
            String line = buffer.readLine();
            while (line != null)
            {
                result.add(line);
                line = buffer.readLine();
            }
            buffer.close();

            System.out.println(result);
            Collections.sort(result);
            System.out.println(result);

        }
        catch (Exception e)
        {
            return;
        }
    }
}
