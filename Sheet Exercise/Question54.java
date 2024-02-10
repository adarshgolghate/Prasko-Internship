import java.util.*;
public class Question54 {
    //Grade Calculator: Implement a program that takes a student's score as input and converts it to a letter grade (e.g., A, B, C, etc.) based on certain criteria.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = scan.nextInt();
        if(marks>90 && marks<100){
            System.out.print("Your grade = A+");
        }
        else if(marks>=85 && marks<=89){
            System.out.print("Your grade = A");
        }
        else if(marks>=80 && marks<=84){
            System.out.print("Your grade = A-");
        }
        else if(marks>=75 && marks<=79){
            System.out.print("Your grade = B+");
        }
        else if(marks>=70 && marks<=74){
            System.out.print("Your grade = B");
        }
        else if(marks>=65 && marks<=69){
            System.out.print("Your grade = C+");
        }
        else if(marks>=60 && marks<=64){
            System.out.print("Your grade = C+");
        }
        else if(marks>=55 && marks<=59){
            System.out.print("Your grade = D+");
        }
        else if(marks>=50 && marks<=54){
            System.out.print("Your grade = D");
        }
        else if(marks>=40 && marks<=49){
            System.out.print("Your grade = E");
        }
        else{
            System.out.print("Your grade = F");
        }
    }
}
