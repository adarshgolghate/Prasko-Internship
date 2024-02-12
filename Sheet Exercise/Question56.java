//importing util package
import java.util.*;
public class Question56 {
    //Largest among Three: Write a program that finds the largest among three numbers.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three values");
        System.out.print("Enter 1st values");
        int a = scan.nextInt();
        System.out.print("Enter 2nd values");
        int b = scan.nextInt();
        System.out.print("Enter 3rd values");
        int c = scan.nextInt();
        if(a>b && a>c){            
                System.out.print("The largest number is "+a);            
        }
        else if(b>a && b>c)
        {            
                System.out.print("The largest number is " +b);            
        }
        else{
            System.out.print("The largest number is " +c);
        }
    }    
}
