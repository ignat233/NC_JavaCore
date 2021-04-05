package JavaHW2.Chapter2.Task5;

public class TestForPoint {

    public static void main(String[] args) {

        System.out.println("------------------------- Test CLASS Point -----------------");
        Point p = new Point(3, 4);
        System.out.println(p.translate(1,3).scale(0.5));
    }
}
