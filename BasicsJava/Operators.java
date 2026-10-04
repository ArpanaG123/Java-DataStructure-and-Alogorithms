public class Operators{
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        int sum = a + b;

        int diff = a - b;

        int mul = a*b;

        int mod = a % b;

        int div = a/b;

        System.out.println("Sum: " + sum); // 15
        System.out.println("Difference: " + diff); // 5
        System.out.println("Multiplication: " + mul); // 50
        System.out.println("Modulus: " + mod); // 0
        System.out.println("Division: " + div); // 2

        int x = 20, y = 10;
        System.out.println("Postincrement : " + (x++)); // 20
        System.out.println("Preincrement : " + (++x)); // 22

        System.out.println("Postdecrement : " + (y--)); // 10
        System.out.println("Predecrement : " + (--y)); // 8

        int num = 10; 
        System.out.println("Initial: " + num);

        num += 5;
        System.out.println("Initial: " + num);

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        int c = 5;
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

        boolean p = true;
        boolean q = false;

        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!q: " + (!q));

        int result = ((a > b) ? a : c);
        System.out.println("Max of three numbers = "+ result);
    }
}