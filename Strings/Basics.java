public class Basics{
    public static void main(String[] args){

        //ways of creating string in java
        //1.using literals
        String name = "Arpana";
        System.out.println(name);

        //2.using new keyword
        String str = new String("Arpana");
        System.out.println(str);

        //How to Modify a String?
        str = str.concat(" kashyap");
        System.out.println(str);

        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); 
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}

// In Java, the equals() method and the == operator are used to compare objects.
// The main difference is that 
// string equals() method compares the content equality of two strings 
// while the == operator compares the reference or memory location of objects in a heap, whether they point to the same location or not.

// equals() can be overridden to define custom equality.
// For String objects, equals() is generally preferred for content comparison.



