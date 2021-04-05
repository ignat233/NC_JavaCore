package JavaHW2.Chapter2.Task5;

public class Point {

    private double x;
    private double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public String toString(){
        return "(" + x + "," + y + ')';
    }

    public Point translate(double dx, double dy) {
        x += dx;
        y += dy;
        return new Point(x,y);
    }

    public Point scale(double coeff) {
        x *= coeff;
        y *= coeff;
        return new Point(x,y);
    }

}
