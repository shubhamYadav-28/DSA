package Arrays;

public class ArrayMaxAndMin {
    public static void main(String[] args) {
    int[] num=new int []{100,1,2,4,6,7,9,6,4,0};
    int max=num[0];
    int min =num[0];

    for(int i=0;i<num.length;i++){
        if(max<num[i]){
            max=num[i];
        }
        else if(min>num[i]){
            min=num[i];
        }
    }
    System.out.println("Maximum value of this array is :"+ max);
    System.out.println("minimum value of this array is :"+min);
    }
}
