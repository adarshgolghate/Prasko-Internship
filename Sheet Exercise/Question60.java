//importing the util package for accessing the scanner class
import java.util.*;
//weekday name:  write the program that takes a number (1 to 7) as input and prints the corresponding day of the week
class Question60 {
    //main method
    public static void main(String args[])
    {
        //making a scanner object 
        Scanner scan = new Scanner(System.in);
        //declared a statement to print someting
        System.out.println("Enter a number");
        int a = scan.nextInt();
        //these conditions check for the days in a week.
        if(a==1)
        {
            System.out.println("Monday");
        }
        else if(a==2)
        {
            System.out.println("Tuesday");
        }
        else if(a==3)
        {
            System.out.println("Wednesday");
        }
        else if(a==4)
        {
            System.out.println("Thursdaay");
        }
        else if(a==5)
        {
            System.out.println("Friday");
        }
        else if(a==6)
        {
            System.out.println("Saturday");
        }
        else if(a==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Number");
        }

    }
    
}
