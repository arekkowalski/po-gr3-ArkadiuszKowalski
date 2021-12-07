package pl.imiajd.kowalski;

public class TestBetterRectangle {
    public static void main(String[] args) {
        BetterRectangle abc = new BetterRectangle(4,5);
        abc.setSize(4,5);
        abc.setLocation(4,5);
        System.out.println(abc.getPerimeter());
        System.out.println(abc.getArea());
    }
}
