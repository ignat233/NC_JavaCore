package com.company;

public class MyComplex {

    private  double real = 0.0;
    private  double imag = 0.0;

    public MyComplex(){

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
       if (imag >=0) {return "(" + real +
                "+" + imag +
                "i)";}
       else {return "(" + real +
               + imag +
               "i)";}
    }

    public boolean isReal(){
        boolean a = (real != 0.0);
        return a;
    }

    public boolean isImaginary(){
        boolean a = (imag != 0.0);
        return a;
    }

    public boolean equals(double real, double imag){
        boolean a = (this.real==real && this.imag == imag);
        return a;
    }

    public boolean equals(MyComplex complex){
        boolean a = (this.real==complex.real && this.imag == complex.imag);
        return a;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imag,2));
    }

    public double argument(){
        double a = 0.0;
        if(this.real > 0 & this.imag >= 0)
            a = Math.atan(this.real/this.imag);
        if(this.real < 0 & this.imag >= 0)
            a = Math.PI - Math.atan(Math.abs(this.real/this.imag));
        if(this.real < 0 & this.imag < 0)
            a =  Math.PI + Math.atan(Math.abs(this.real/this.imag));
        if(this.real > 0 & this.imag < 0)
            a =  2 * Math.PI - Math.atan(Math.abs(this.real/this.imag));
        if(this.real==0 & this.imag > 0)
            a =  Math.PI/2;
        if(this.real==0 & this.imag < 0)
            a =  3*Math.PI/2;
        return a;
    }


    public MyComplex add (MyComplex complex){
        this.real += complex.real;
        this.imag += complex.imag;
        return this;
    }

    public MyComplex addNew (MyComplex complex){
        double newReal = this.real + complex.real;
        double newImag = this.imag + complex.imag;
        return new MyComplex(newReal,newImag);
    }

        public MyComplex subtract (MyComplex complex){
        this.real -= complex.real;
        this.imag -= complex.imag;
        return this;
    }

    public MyComplex subtractNew (MyComplex complex){
        double newReal = this.real - complex.real;
        double newImag = this.imag - complex.imag;
        return new MyComplex(newReal,newImag);
    }

    public MyComplex multyply (MyComplex complex){
        this.real = this.real * complex.real - this.imag * complex.imag;
        this.imag= this.imag * complex.real + this.real * complex.imag;
        return  this;
    }

    public MyComplex conjugate(){
        this.imag = -this.imag ;
        return this;
    }

    public MyComplex divide (MyComplex complex){
        this.real = (this.real * complex.real + this.imag * complex.imag)/complex.magnitude();
        this.imag= (this.imag * complex.real - this.real * complex.imag)/complex.magnitude();
//        this.multyply(complex.conjugate());
//        this.real = this.real/complex.magnitude();
//        this.imag = this.imag/complex.magnitude();
        return this;
    }

}
