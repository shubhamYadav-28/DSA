package Arrays;
import java.util.*;
public class ArrayRev {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
    //    for(int i=arr.length-1;i>=0;i--){
    //     System.out.print(arr[i]+" ");
    //    }
    int n=arr.length-1;
    for(int i=0;i<=n/4;i++){ //inplace reversal     //TC= O(n)
        int temp=arr[i];       //SC =O(1)
        arr[i]=arr[n/2-i];
        arr[n/2-i]=temp;
    }
    System.out.println(Arrays.toString(arr));
        }
    }
    

