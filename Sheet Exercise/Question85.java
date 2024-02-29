import java.util.*;
public class Question85 {
    //Check if a number is prime
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not");
        int i = scan.nextInt();
        if(i/i==1 ){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Co-prime");
        }
    }
}
