package Arrays;

public class ArrayEvenAndOdd {
    public static void main(String[] args) {
        int[] num =new int[]{1,2,3,4,5,6,7,8,9};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
    
}
