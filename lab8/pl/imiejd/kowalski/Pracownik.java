package pl.imiajd.kowalski;

import pl.imiajd.kowalski.Osoba;

import java.time.LocalDate;

public class Pracownik extends Osoba
{
    private int pensja;
    private LocalDate dataZatrudnienia;

    public Pracownik(String[] _imiona, String _nazwisko, boolean _plec, LocalDate _dataUrodzenia, int _pensja, LocalDate _dataZatrudnienia)
    {
        super(_imiona, _nazwisko, _plec, _dataUrodzenia);
        this.pensja = _pensja;
        this.dataZatrudnienia = _dataZatrudnienia;
    }

    public int getPensja() {
        return pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    @Override
    public String toString()
    {
        return super.toString() + this.pensja + "\n";
    }
}
