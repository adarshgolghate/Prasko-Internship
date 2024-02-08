//importing the util package
import java.util.Scanner;
//Check if a person is eligible to vote based on age.
class Question69 {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int age;
        //Declaring the statement
        System.out.println("Enter you age..");
        age = scan.nextInt();
        if(age>18){
            System.out.println("Congratulation!! Your are eligible to vote.");
        }
        else{
            System.out.println("Sorry:( you are not eligible to vote");
        }

    }
    
}
