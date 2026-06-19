public class Recur2{
    static void printName(int num){
        if(num == 0){
            return;
        }System.out.println("hello shubham" + num);
        printName(num-1);
        System.out.println("bye shubham" + num); 
        

    }
    // static void printsur(int num){
    //     if(num == 5){
    //         return;
    //     }System.out.println("Yadav" + num);
    //     printsur(num+1);

    // }
    public static void main(String[] args) {
        printName(5);
        // printsur(0);
        
    }
}
