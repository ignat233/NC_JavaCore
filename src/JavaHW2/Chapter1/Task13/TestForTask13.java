package JavaHW2.Chapter1.Task13;

import java.util.ArrayList;

public class TestForTask13 {

    public static void main(String[] args) {

        System.out.println("------------------------- Test CLASS Chapter1Task13 -----------------");
        printLotteryComb(1,49,6);
    }

    static void printLotteryComb(int firstNumber, int lastNumber , int numberOfNumbers) { //for various lotteries
        int sizeNumbers = lastNumber - firstNumber + 1;
        int maxIndex = sizeNumbers - 1;
        ArrayList<Integer> numbers = new ArrayList<Integer>(sizeNumbers);
        for (int i = 0;i <= maxIndex;i++){
            numbers.add(i+1);
        }
        String lotteryCombination = "";
        int index = maxIndex;
        for(int j = 0;j <= numberOfNumbers; j++){
            int randomIndex = (int)(Math.random() * index);
            lotteryCombination +=  numbers.get(randomIndex) + " ";
            numbers.remove(randomIndex);
            index--;
        }
        System.out.println(lotteryCombination);
    }
}
