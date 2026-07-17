package Arrays;
import java.util.Arrays;
public class ArrayCreation {
    public static void main(String[] args) {
        //creating an array of size 20.it will have startIndex 0 and endIndex 19.it is of fixed size.
        int[] arr=new int[20];
        System.out.println(arr[7]);//this is how we randomly access an array element O(1).
        System.out.println(arr);//This prints the type of array and its reference.
        System.out.println(Arrays.toString(arr));//this is how we print an array.
        arr[5]=230120;//modifying  element of array.
        System.out.println(Arrays.toString(arr));
        //creating andn initializing an array.
        int[] arr1={12,345,23,34,12,90};
        System.out.println(arr1[3]);
        System.out.println(Arrays.toString(arr1));
        int[] arr2=new int[]{12,23,345,46,67,68};
        System.out.println(arr2[5]);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);
        // System.out.println(arr2[arr2.length]); arr2.length gives size of the array arr2.
        System.out.println(arr2[arr2.length-1]);// accessing the last element of array.
    }
    
}
