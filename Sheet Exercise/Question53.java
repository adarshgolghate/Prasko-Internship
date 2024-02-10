import java.util.*;
class Question53 {
    //Positive or Negative: Create a program that reads a number and determines if it's positive, negative, or zero.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if(num>0){
            System.out.print("The number entered is a positive number");
        }
        else if(num<0)
        {
            System.out.print("The numerb entered is a negetive number");
        }
        else
        {
            System.out.print("The numer is a zero");
        }
    }
}
