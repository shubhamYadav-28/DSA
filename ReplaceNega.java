package Arrays;
import java.util.*;
public class ReplaceNega {
    public static void main(String[] args) {
        int[] arr=new int[]{-1,-2,-3,-4,-5,1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
