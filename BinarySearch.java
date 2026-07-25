package Searching;

public class BinarySearch{
    static int Problem(int[] arr,int find){
        int left=0;
        int right=arr.length- 1;
        while(left<=right){
            int mid=(left+right)/2;
        if(arr[mid] ==find){
            return mid;
        }
        else if(arr[mid]>find){
            right=mid-1;
        }
        else if(arr[mid]<find){
            left=mid+1;
        }
    }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,24,57,67,99,101,555};
        int find=101;
        int ans=Problem(arr,find);
        System.out.println("found number at index :"+ans);
    }

}