package pl.imiajd.kowalski;

import java.time.LocalDate;

public class Flet extends Instrument
{
    public Flet(String _producent, LocalDate _rokProdukcji)
    {
        super(_producent, _rokProdukcji);
    }
    @Override
    public void dzwiek() {
        System.out.println("Fiuuuu");
    }
}
