package pl.imiajd.kowalski;
class Punkt
{
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int x()
    {
        return x;
    }
    public int y()
    {
        return y;
    }
    public void show()
    {
        System.out.println("Punkt: " + "<" + x + ";" + y + ">");
    }
    private int x,y;
}
class NazwanyPunkt extends Punkt
{
    NazwanyPunkt(int x, int y, String name)
    {
        super(x,y);
        this.name = name;
    }
    public void show()
    {
        System.out.println(name + ": <" + x() + ";" + y() + ">");
    }
    private String name;

}
