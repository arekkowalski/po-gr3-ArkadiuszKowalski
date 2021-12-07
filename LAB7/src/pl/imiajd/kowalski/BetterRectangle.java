package pl.imiajd.kowalski;

class BetterRectangle extends java.awt.Rectangle{

    BetterRectangle(int x, int y){
        super(x,y);
    }
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }
    public int getPerimeter(){
        return x+x+y+y;
    }
    public int getArea(){
        return x*y;
    }
}
