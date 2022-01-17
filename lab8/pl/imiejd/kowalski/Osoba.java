package pl.imiajd.kowalski;

import java.time.LocalDate;

public class Osoba
{
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private String imiona[];
    boolean plec;

    public Osoba(String[] _imiona, String _nazwisko, boolean _plec, LocalDate _dataUrodzenia)
    {
        this.imiona = _imiona;
        this.nazwisko = _nazwisko;
        this.plec = _plec;
        this.dataUrodzenia = _dataUrodzenia;
    }

    public String[] getImiona()
    {
        return this.imiona;
    }

    public LocalDate getRokUrodzenia()
    {
        return this.dataUrodzenia;
    }

    public String getNazwisko()
    {
        return this.nazwisko;
    }

    public boolean getPlec()
    {
        return this.plec;
    }

    @Override
    public String toString()
    {
        return this.nazwisko + "\n" + this.dataUrodzenia + "\n";
    }
}
