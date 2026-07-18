package Arrays;

public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr= new int[]{1,3,5,7,9,9,10,11};
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max1<=arr[i]){
                max2=max1;
                max1=arr[i];
            }
        }
        System.out.println(max2);
    }
    
}
