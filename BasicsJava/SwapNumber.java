import java.util.Scanner;

public class SwapNumber{
    public static void main(String[] args){
        swap(20,10);
    }

    static void swap(int a, int b){

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swap:");
        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);
    }
}