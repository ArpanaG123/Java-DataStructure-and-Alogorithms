import java.util.Scanner;

//Type 1: By taking inputs
public class Functions{
    public static void main(String[] args){
        sum();
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter a value of b: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("sum of a and b is: " + sum);
    }

}

//Type 2: By passing inputs as arguments
public class Functions{
    public static void main(String[] args){
        sum(10,20);
    }

    static void sum(int a, int b){
        int sum = a + b;
        System.out.println("sum of a and b is: " + sum);
    }

}

//type 3: String type exmaple
public class Functions{
    public static void main(String[] args){
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting = "How are you doing";

        return greeting;
    }

}

