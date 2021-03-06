package JavaHW1.OOP2.ContainerOfBall;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth(){
        return x2-x1;
    }

    public int getHeight(){
        return y2-y1;
    }

    public boolean collides(Ball ball){
    if(ball.getX() < x1 || ball.getX() > x2 || ball.getY() < y1 || ball.getX() > y2)
        return false;
    else if (x2 - x1 < ball.getRadius() || y2 - y1 < ball.getRadius())
        return false;
    else if(ball.getX() - x1 < ball.getRadius() || x2 - ball.getX() < ball.getRadius() || ball.getY() - y1 < ball.getRadius() || y2 - ball.getX() < ball.getRadius())
        return false;
    else return true;
    }

    public String toString(){
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," +y2 + ")]";
    }
}
