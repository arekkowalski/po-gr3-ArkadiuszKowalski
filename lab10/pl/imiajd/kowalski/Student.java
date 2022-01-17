package pl.imiajd.kowalski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>
{
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen)
    {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Osoba o) {
        int result = super.compareTo(o);
        if (result == 0)
            result = Double.compare(this.sredniaOcen, ((Student)o).sredniaOcen);

        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "sredniaOcen=" + sredniaOcen +
                '}';
    }
}
