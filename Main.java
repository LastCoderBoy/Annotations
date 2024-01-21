package Annotations;

public class Main {
    public static void main(String args[]){
        Main.sum(10,20);
    }

    @Addition(str="Calculating addition of two numbers")
    public static void sum(int x, int y){
        System.out.println(x+y);
    }
}
