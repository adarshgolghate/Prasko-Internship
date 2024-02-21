import java.util.*;
public class Question68 {
    //Pass or Fail: Write a program that takes the marks of the student in different subject as input and determines if the student is pass or failed based on predefined passing criteria.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of Maths..");
        byte maths = scan.nextByte();
        System.out.println("Enter the value of Sciene");
        byte science = scan.nextByte();
        System.out.println("Enter the marsk of English");
        byte english = scan.nextByte();
        System.out.println("The the marks of Physical Education");
        byte physicalEducation = scan.nextByte();
        if(maths>34 && science>34 && english>34 && physicalEducation>34){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}
