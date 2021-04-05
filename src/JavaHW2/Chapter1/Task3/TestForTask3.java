package JavaHW2.Chapter1.Task3;

public class TestForTask3 {

    public static void main(String[] args) {

        System.out.println("------------------------- Test CLASS Chapter1Task3 -----------------");

        System.out.println(numberMax(1,2,3));
        System.out.println(numberMathMax(5,1,2));
    }
    static int numberMax(int number1, int number2, int number3) {
        int max;
        if(number1 > number2) max = number1;
        else max = number2;
        if (max < number3) max = number3;
        return max;
    }

    static int numberMathMax(int number1, int number2, int number3){
        int max;
        max = Math.max(number1,number2);
        max = Math.max(max,number3);
        return max;
    }
}

