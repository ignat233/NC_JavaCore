package JavaHW2.Chapter1.Task2;

public class TestForTask2 {

    public static void main(String[] args) {

        System.out.println("------------------------- Test CLASS Chapter1Task2 -----------------");

        System.out.println(normalizesAngel(760));
        System.out.println(normalizesAngel(-1180));
        System.out.println(normalizesAngelFloor(760));
        System.out.println(normalizesAngelFloor(-1180));

    }
    static int normalizesAngel(int angel) {
        int a = angel % 360;
        if (a < 0) a += 360;
        return a;
    }

    static int normalizesAngelFloor(int angel) {
        return Math.floorMod(angel , 360);
    }

}
