package JavaHW2.Chapter1.Task6;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6TestToo {


    public static void main(String[] args) {

        int n = 1000;

        BigInteger factorial =  BigInteger.valueOf(1);

        for(int i = 2; i  <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }




}
