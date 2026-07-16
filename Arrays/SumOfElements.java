public class SumOfElements{
    public static void main(String[] args){
        int[] arr = {10,22,24,50,60,100};

        sum(arr);
        System.out.println(sum(arr));
    }

    static int sum(int[] arr){
        int sm = 0;
        int n = arr.length;

        for (int i = 0;i<n;i++){
            sm += arr[i];
        }

        return sm;
    }
    
}

// Limitations of Java Arrays
// Fixed Size: Array size cannot be changed after creation. Better option is to use ArrayList (dynamic resizing).
// Type Homogeneity: Stores only same data type elements. Better option is to use Object class, Collections, or custom classes for mixed data
// Costly Insertion & Deletion: Adding/removing elements requires shifting. Better option is to use LinkedList for efficient insert/delete operations
