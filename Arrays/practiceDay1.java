// Initialization an Array

//Method1
// int[] arr = {1,2,3};

//Method2
// int arr[] = {1,2,3,4,5};

// Note: This is the standard Java convention because the [] is associated with the type (int[]), making it clear that arr is an array of integers.


// Operations on Array Elements
public class practiceDay1{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};

        //1.Access Array Elements
        System.out.println("First element of arr: " + arr[0]);

        //2.Update Array Elements
        arr[1] = 70;
        System.out.println("Element of arr after update: " + arr[1]);

        //3.Traverse Array
        System.out.print("Elements of arr are: ");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //4.Size of Array
        int n = arr.length;
        System.out.println("Size of array: " + n);

        //5.What happens if we try to access elements outside the array size?
        System.out.println("Size of array: " + arr[5]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}