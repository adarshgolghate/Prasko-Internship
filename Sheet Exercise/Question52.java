//importing util package
import java.util.*;
public class Question52 {
    //Even or Odd: Write a program that takes an integer as input and checks if it's even or odd.
    public static void main(String args[])
    {
        //made an object 'scan' of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        //below condition checks for the values is even or not
        if(a%2==0)
        {
            System.out.println("The entered value "+a+" is a Even Number");
        }
        else{
            System.out.println("The entered value"+a+" is a Odd Number");
        }

    }
}
