package se.lexicon;

public class Calculator implements ICalculator{
    public int add (int a,int b){
        int c=a+b;
        return c;
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;
    }

    public int mul(int a,int b){
        int c=a*b;
        return c;
    }
    public double div(double a,double b){
        double c=a/b;
        return c;
    }
}
