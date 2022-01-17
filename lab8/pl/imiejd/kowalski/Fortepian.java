package pl.imiajd.kowalski;

import java.time.LocalDate;

public class Fortepian  extends Instrument
{
    public Fortepian(String _producent, LocalDate _rokProdukcji)
    {
        super(_producent, _rokProdukcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("TamTamTam");
    }
}
