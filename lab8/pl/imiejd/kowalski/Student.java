package pl.imiajd.kowalski;

import pl.imiajd.kowalski.Osoba;

import java.time.LocalDate;

public class Student extends Osoba
{
    private String kierunek;
    private double sredniaOcen;

    public Student(String[] _imiona, String _nazwisko, boolean _plec, LocalDate _dataUrodzenia, String _kierunek, double _sredniaOcen)
    {
        super(_imiona, _nazwisko, _plec, _dataUrodzenia);
        this.kierunek = _kierunek;
        this.sredniaOcen = _sredniaOcen;
    }

    public String getKierunek()
    {
        return this.kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString()
    {
        return super.toString() + this.kierunek + "\n";
    }
}