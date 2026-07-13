import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of integer type a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of long integer type b: ");
        long b = sc.nextLong();

        System.out.print("Enter the value of float type c: ");
        float c = sc.nextFloat();

        System.out.print("Enter the value of double type d: ");
        double d = sc.nextDouble();

        System.out.print("Enter the value of string type e: ");
        String e = sc.next();

        System.out.print("Enter the value of char type f: ");
        char f = sc.next().charAt(0);

        System.out.print("Enter the value of boolean type g: ");
        boolean g = sc.nextBoolean();

        System.out.print("Enter the value of byte type h: ");
        byte h = sc.nextByte();

        System.out.print("Enter the value of short type i: ");
        short i = sc.nextShort();



        sc.close();

        System.out.println("\nValues entered:");
        System.out.println("Integer : " + a);
        System.out.println("Long    : " + b);
        System.out.println("Float   : " + c);
        System.out.println("Double  : " + d);
        System.out.println("String  : " + e);
        System.out.println("Char    : " + f);
        System.out.println("Boolean : " + g);
        System.out.println("Byte : " + h);
        System.out.println("short : " + i);
    }
}

// -----------outputs-------------------
// Enter the value of integer type a: 34
// Enter the value of long integer type b: 734787873289
// Enter the value of float type c: 23.34
// Enter the value of double type d: 6234786.20
// Enter the value of string type e: Arpana
// Enter the value of char type f: z
// Enter the value of boolean type g: true
// Enter the value of byte type h: 12
// Enter the value of short type i: 1029

// Values entered:
// Integer : 34
// Long    : 734787873289
// Float   : 23.34
// Double  : 6234786.2
// String  : Arpana
// Char    : z
// Boolean : true
// Byte : 12
// short : 1029