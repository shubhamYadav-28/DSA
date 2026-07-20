package Arrays;
import java.util.Arrays;
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] nums ={12,243,34,45,2,35,35,89};
        //traversing array nums using for loop
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
        //traversing array nums using while loop
        int i=0;
        while(i<nums.length){
            System.out.println(nums[i]);
            i=i+1;
        }
        System.out.println(Arrays.toString(nums));
        //traversing array using enhanced for loop
        for(int n:nums){
        System.out.println(n);
    }
    }
    
    
}
