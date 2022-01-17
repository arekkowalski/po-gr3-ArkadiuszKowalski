package pl.imiajd.kowalski;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument
{
    private String producent;
    private LocalDate rokProdukcji;

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public Instrument(String _producent, LocalDate _rokProdukcji)
    {
        this.producent = _producent;
        this.rokProdukcji = _rokProdukcji;
    }

    public abstract void dzwiek();

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public String toString() {
        return  this.producent + "\t" + this.rokProdukcji;
    }
}
