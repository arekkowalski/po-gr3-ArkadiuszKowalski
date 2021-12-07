package pl.imiajd.kowalski;
class Osoba
{
    Osoba(String nazwisko, int rokUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public int getRokUrodzenia(){
        return rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append(nazwisko);
        sb.append(", ");
        sb.append(rokUrodzenia);
        return String.valueOf(sb);
    }
    public String nazwisko;
    public int rokUrodzenia;
}

class Student extends Osoba
{
    Student(String nazwisko, int rokUrodzenia, String kierunek)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }
    public String getKierunek(){
        return kierunek;
    }
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append(nazwisko + ", " + rokUrodzenia + ", " + kierunek);
        return String.valueOf(sb);
    }
    private String kierunek;
}

class Nauczyciel extends Osoba
{
    Nauczyciel(String nazwisko, int rokUrodzenia, double pensja)
    {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    public double getPensja(){
        return pensja;
    }
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append(nazwisko + ", " + rokUrodzenia + ", " + pensja);
        return String.valueOf(sb);
    }
    private double pensja;
}

