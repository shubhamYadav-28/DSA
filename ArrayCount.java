package Arrays;

public class ArrayCount {
    public static void main(String[] args) {
        int[] arr=new int []{1,2,3,5,6,2,2,2,2,2,2};
        int target=2;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
