package JavaHW1.OOP.Figures;

import JavaHW1.OOP.Point.MyPoint;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2,int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString(){
        return "MyTriangle(v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + ")";
    }

    public double getPerimeter(){
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType(){
        double e = 0.00001;
        String type = "";
        int count = 0;
        if( (Math.abs(v1.distance(v2) - v1.distance(v3))) < e)
        count++;
        if( (Math.abs(v1.distance(v2) - v2.distance(v3))) < e)
        count++;
        if( (Math.abs(v1.distance(v3) - v2.distance(v3))) < e)
        count++;
            if(count==3)
            type = "Equilateral";
            else if(count==1)
            type = "Isosceles";
            else type = "Scalene";
            return type;
    }

}

