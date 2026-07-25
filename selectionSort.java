package Searching;
import java.util.*;
public class selectionSort {
    static int[] Selection( int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{4, 2, 4, 1, 2};
        int[] ans=Selection(arr);
        System.out.println(Arrays.toString(arr));
    } 
}
