package asm1;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            System.out.println("Denominator can't equal 0! -> auto set to 1");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public Fraction simplified(){
        int g = gcd(numerator, denominator);
        return new Fraction(numerator / g, denominator/g);
    }

    public void inverse(){
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public Fraction add(Fraction other){
        return new Fraction(
                this.numerator * other.denominator + other.numerator * this.denominator,
                this.denominator * other.denominator
        ).simplified();
    }

    public Fraction sub(Fraction other){
        return new Fraction(
                this.numerator * other.denominator - other.numerator * this.denominator,
                this.denominator * other.denominator
        ).simplified();
    }

    public Fraction mul(Fraction other){
        return new Fraction(
                this.numerator * other.numerator, this.denominator * other.denominator
        ).simplified();
    }

    public Fraction div(Fraction other){
        return new Fraction(
                this.numerator * other.denominator, this.denominator * other.numerator
        ).simplified();
    }

    int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    public void print(){
        System.out.println(numerator +"/"+ denominator);
    }
}
