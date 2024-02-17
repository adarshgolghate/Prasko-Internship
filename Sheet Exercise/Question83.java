//importing the util package
import java.util.*;
public class Question83 {
    //Print numbers from 1 to N.
    public static void main(String args[])
    {
        //making a object of scanner class 
        Scanner scan = new Scanner(System.in);
        //declaring a statement
        System.out.println("Enter a vaule to print till...");
        int n = scan.nextInt();
        int i=1;
         while(i<=n){
            System.out.print(i +"\t");
            i++;
         }

    }
}
