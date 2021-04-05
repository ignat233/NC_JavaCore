package JavaHW2.Chapter1.Task1;

public class TestForTask1 {

    public static void main(String[] args) {
        System.out.println("------------------------- Test CLASS Chapter1Task1 -----------------");
        System.out.println(toBinary(61));

        System.out.println(toOctal(571));

        System.out.println(toHexa(7467));

        System.out.println(reciprocalToHexa(0.136));
    }
    static StringBuilder toOctal(int integer) {
        StringBuilder octal = new StringBuilder("");
        while (integer >= 8) {
            int in = integer % 8;
            octal.insert(0 , in);
            if(integer/8 < 8)  octal.insert(0 ,integer/8);
            integer = integer/8;

        }
        return octal;
    }

    static StringBuilder toBinary(int integer) {
        StringBuilder binary = new StringBuilder("");
        while (integer != 0) {
            int in = integer % 2;
            binary.insert(0 , in);
            integer = integer/2;

        }
        return binary;
    }

    static void helperToHexa(int in, StringBuilder hexa){
        if (in < 10)   hexa.insert(0 , in);
        if (in == 10)  hexa.insert(0,'A');
        if (in == 11)  hexa.insert(0,'B');
        if (in == 12)  hexa.insert(0,'C');
        if (in == 13)  hexa.insert(0,'D');
        if (in == 14)  hexa.insert(0,'F');
        if (in == 15)  hexa.insert(0,'G');

    }

    static void helperReciprocalToHexa(int in, StringBuilder hexa){
        if (in < 10)   hexa.append(in);
        if (in == 10)  hexa.append('A');
        if (in == 11)  hexa.append('B');
        if (in == 12)  hexa.append('C');
        if (in == 13)  hexa.append('D');
        if (in == 14)  hexa.append('F');
        if (in == 15)  hexa.append('G');

    }

    static StringBuilder toHexa(int integer) {
        StringBuilder hexa = new StringBuilder("");
        while (integer >= 16) {
            int in = integer % 16;
            helperToHexa(in , hexa);
            if(integer/16 < 16)  helperToHexa(integer/16 , hexa);
            integer = integer/16;
        }
        return hexa;
    }

    static StringBuilder reciprocalToHexa(double reciprocal ) {
        StringBuilder hexa = new StringBuilder("");
        if(reciprocal == 1) {
            hexa =hexa.append("1");
        }
        else{
            hexa =hexa.append("0.");
            int i = 0;
            while(reciprocal > 0 && i < 6){
                int in =(int)(reciprocal*16.0/1.0);
                helperReciprocalToHexa(in,hexa);
                reciprocal = reciprocal*16%1;
                i++;
            }
        }
        return hexa;
    }
}
