import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 14;
        float b = 23.50f;

        System.out.println("sum = " + (a+b)); //int + float = float

        if (a == 10){
            System.out.println("In if block");
        }else{
            System.out.println("In else block");

        }

        int c = 1;
        while (c <= 5){
            System.out.println("value of c: " + c);
            c++;
        }
        for (c = 1; c<= 10; c++){
            System.out.println("value of c: " + c);
        }

    }
    
}