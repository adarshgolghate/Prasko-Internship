import java.util.*;
public class Question102 {
    //Find the sum of even and odd number separately from 1 to N
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sumEven =0, sumOdd=0;
        System.out.println("Enter the Nth value");
        int n = scan.nextInt();         
        for(int i=1 ;i<=n; i++){
            if(i%2==0){
                sumEven = sumEven+i;
            }
            else{
                sumOdd = sumOdd+i;
            }
        }
        System.out.println("Sum of all even number from 1 to"+n+" is"+sumEven);
        System.out.println("Sum of all odd number from 1 to"+n+" is"+sumOdd);       
    }
}
