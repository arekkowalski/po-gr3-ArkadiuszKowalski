package pl.imiajd.kowalski;

import java.time.LocalDate;

public class Skrzypce extends Instrument
{
    public Skrzypce(String _producent, LocalDate _rokProdukcji)
    {
        super(_producent, _rokProdukcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("SkrzypSkrzyp");
    }
}
