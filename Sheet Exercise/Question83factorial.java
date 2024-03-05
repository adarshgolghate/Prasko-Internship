import java.util.*;
public class Question83factorial {
    //Calculate Factorial of a number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scan.nextInt();
        int factorial = 1;
        for( int i =num; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.print("Factorial of "+num+" = "+factorial);
    }
}
