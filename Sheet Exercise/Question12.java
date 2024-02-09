//import util package
import java.util.*;
class Question12 {
    public static void main(String args[]){
        //(a – b)4 = a4 – 4a3b + 6a2b2 – 4ab3 + b4
        int a,b,result;
        //making object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first value:");
        a = scan.nextInt();
        System.out.println("Enter the second number");
        b = scan.nextInt();
        result = (a*a*a*a)+(b*b*b*b)-(4*(a*a*a)*b)+(6*(a*a)*(b*b))-(4*a*(b*b*b));
        System.out.println("The output will be:"+ result);
    
    }
    
}
