package com.company;

public class MyPolynomial {

    private int[] coeffs;

    public MyPolynomial(int[] coeffs) {
        this.coeffs = coeffs;
    }


    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String polynomial = "";
        for (int i = getDegree(); i >= 0; i--) {
            if (i == 0) polynomial += coeffs[0] ;
            else polynomial += coeffs[i] + "x^" + i + "+";
        }
        return polynomial;
    }

    public MyPolynomial add(MyPolynomial poly) {
        if (this.coeffs.length > poly.coeffs.length) {
            int[] newpolynomial = new int[this.coeffs.length];
            for (int i = this.getDegree(); i > this.coeffs.length - poly.coeffs.length; i--)
                newpolynomial[i] = this.coeffs[i];
            for (int i = this.coeffs.length - poly.coeffs.length; i >= 0; i--)
                newpolynomial[i] = this.coeffs[i] + poly.coeffs[i];
            return new MyPolynomial(newpolynomial);
        } else if (this.coeffs.length < poly.coeffs.length) {
            int[] newpolynomial = new int[poly.coeffs.length];
            for (int i = poly.getDegree(); i > poly.coeffs.length - this.coeffs.length; i--)
                newpolynomial[i] = poly.coeffs[i];
            for (int i = poly.coeffs.length - this.coeffs.length; i >= 0; i--)
                newpolynomial[i] = this.coeffs[i] + poly.coeffs[i];
            return new MyPolynomial(newpolynomial);
        } else {
            int[] newpolynomial = new int[this.coeffs.length];
            for (int i = this.coeffs.length - 1; i >= 0; i--) {
                newpolynomial[i] = this.coeffs[i] + poly.coeffs[i];
            }
            return new MyPolynomial(newpolynomial);
        }
    }

    public MyPolynomial multiply(MyPolynomial poly){
        int[] newpolynomial = new int [this.coeffs.length + poly.coeffs.length -1];
        for (int i = this.getDegree(); i >= 0; i--){
            for ( int j = poly.getDegree(); j >= 0; j--)
                newpolynomial[i + j] += this.coeffs[i] * poly.coeffs[j];
        }
        return new MyPolynomial(newpolynomial);
    }
}
