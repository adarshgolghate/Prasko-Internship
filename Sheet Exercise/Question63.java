import java.util.*;
public class Question63 {
    //Gradin System: Implement a program that takes a student's score as input and assigns a grade based on a grading scale defined in the program
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score in number");
        byte grade = scan.nextByte();
        if(grade<52){
            System.out.print("F");
        }
        else if(grade>=52 && grade<=63){
            System.out.println("D");
        }
        else if(grade>=64 && grade<=75){
            System.out.println("C");
        }
        else if(grade>=76 && grade<=87){
            System.out.println("B");
        }
        else if(grade>=88 && grade<=100){
            System.out.println("A");
        }
    }
}
