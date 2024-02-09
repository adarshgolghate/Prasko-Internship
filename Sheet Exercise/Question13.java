//import util package
import java.util.*;
public class Question13 {
    //a4– b4 = (a – b)(a + b)(a2 + b2)
    public static void main(String args[]){
        //decalring varibales
        int a,b,result;
        //making object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value:");
        a = scan.nextInt();
        System.out.println("Enter value of second value:");
        b = scan.nextInt();
        result = (a-b)*(a+b)*((a*a)+(b*b));
        System.out.println("The out of the given 2 numbers will be "+result);
    }
}
