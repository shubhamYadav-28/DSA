package Arrays;
public class ArraySumAndAverage {
    public static void main(String[] args) {
    int[] nums={1,3,5,7,9};
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
    }
    System.out.println(sum);
    float avg=sum/nums.length;
    System.out.println(avg);
    }
}
