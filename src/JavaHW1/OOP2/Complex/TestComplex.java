package JavaHW1.OOP2.Complex;

public class TestComplex {

    public static void main(String[] args) {
        System.out.println("---------------------------- TEST CLASS MyComplex---------------------------");
        MyComplex p = new MyComplex(1, -2);
        MyComplex n = new MyComplex(1, 3);
        System.out.println(p.isReal());
        System.out.println(p.equals(1, 2));
        System.out.println(p.equals(n));
        System.out.println(p.subtractNew(n));
        System.out.println(p.conjugate());
        System.out.println(p.conjugate());
    }
}
