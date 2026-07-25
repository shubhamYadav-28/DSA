package Searching;
public class MaxOnes{
    static int maxOnes(int[] arr,int count,int max){
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,0,1,1,1,1};
        int count=0;
        int max=0;
        int ans=maxOnes(arr,count,max);
        System.out.println(ans);
    }
}