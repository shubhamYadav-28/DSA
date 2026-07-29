package Sorting;
import java.util.*;
public class MergeSort {
    public static void mergeSort(int[]arr,int left,int right){
        if(left<right){
            int mid = left+(right-left)/2;
            // sort left half
            mergeSort(arr, left,mid);
            //sort right half
            mergeSort(arr, mid+1,right);
            merge(arr,left,right,mid);
        }
    }
    public static void merge(int[]arr,int left,int right,int mid){
        int n=mid-left+1;
        int m= right-mid;
        int[] leftArray =new int[n];
        int[] rightArray=new int[m];
            for(int i=0;i<n;i++){
                leftArray[i]=arr[left+i];
            }
            for(int j=0;j<m;j++){
                rightArray[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n && j<m){
            if(leftArray[i]<=rightArray[j]){
                arr[k] =leftArray[i];
                i++;
            }
            else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={38,27,43,3,9,82,10};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }  
}
