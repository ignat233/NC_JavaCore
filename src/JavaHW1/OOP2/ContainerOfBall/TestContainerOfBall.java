package JavaHW1.OOP2.ContainerOfBall;

public class TestContainerOfBall {

    public static void main(String[] args) {

        System.out.println("------------------------ TEST CLASS Ball and CLASS Container-----------------------");
        Ball ball = new Ball(1,1,1,1,0);
        Container con = new Container(0,0,2,2);
        System.out.println(con.collides(ball));
        ball.move();
        System.out.println(con.collides(ball));
    }
}
