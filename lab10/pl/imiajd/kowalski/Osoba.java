package pl.imiajd.kowalski;

import java.time.*;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>
{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public int compareTo(Osoba o) {
        int result = this.nazwisko.compareTo(o.nazwisko);
        if (result == 0) {
            result = this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return result > 0 ? 1 : (result == 0 ? 0 : -1);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
