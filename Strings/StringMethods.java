public class StringMethods{
    public static void main(String[] args){
        String s1 = "ArpanaKashyap";

        //1.length
        System.out.println(s1.length());

        //2.charAt(int i),This method returns the character at ith index.
        System.out.println(s1.charAt(2));

        //3.substring(int i),This method return the substring from the ith index character to end.
        System.out.println(s1.substring(2,6));

        System.out.println(s1.substring(6));

        //4.concat:This method appends the given string to the end of the current string.
        s1 = s1.concat("SayHello");
        System.out.println(s1);

        //5. indexOf:This method returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        
    }
}