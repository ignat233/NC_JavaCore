package JavaHW1.OOP2.Polynomial;

public class TestPolynomial {

    public static void main(String[] srgs) {
        System.out.println("---------------------------- TEST CLASS MyPolynomial---------------------------");
        int[] b = new int[]{1,2,3,4,5,6};
        int[] s = new int[]{6,5,4,3,2,1};
        MyPolynomial v = new MyPolynomial(b);
        MyPolynomial g = new MyPolynomial(s);
        System.out.println(v.toString());
        System.out.println(v.getDegree());
        System.out.println(v.add(g));
        System.out.println(v.multiply(g));
    }
}
