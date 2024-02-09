//importing the util package
import java.util.*;
class Question11{
    public static void main(String args[]){
        //(a + b)4 = a4 + 4a3b + 6a2b2 + 4ab3 + b4
        //declared variable
        int a,b,result;
        //making object of scanner object.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        a = scan.nextInt();
        System.out.println("Enter 2nd value");
        b = scan.nextInt();
        result = (a*a*a*a)+(4*(a*a*a)*b)+(6*(a*a)*(b*b))+(4*a*(b*b*b))+(b*b*b*b);
        System.out.println("The output for the give input is: "+result);
    }

}