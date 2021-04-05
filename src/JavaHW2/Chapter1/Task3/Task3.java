package JavaHW2.Chapter1.Task3;

public class Task3 {

    private int number1;
    private int number2;
    private int number3;

    public Task3(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int numberMax() {
        int max;
        if(number1 > number2) max = number1;
        else max = number2;
        if (max < number3) max = number3;
        return max;
    }

    public int numberMathMax(){
        int max;
        max = Math.max(number1,number2);
        max = Math.max(max,number3);
        return max;
    }
}
