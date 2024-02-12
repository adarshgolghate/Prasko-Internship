import java.util.*;
public class Question58 {
    //Age Group Categorization: Create a program that categorizes a person's age into different groups (e.g., child, teenager, adult, senior) based on predefined age ranges.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the your age:");
         
        byte age=scan.nextByte();
        if(age>=0 && age<=12){
            System.out.print("You are an child");
        }
        else if(age>=13 && age<=17){
            System.out.print("You are a teenager");
        }
        else if(age>=18 && age<=65){
            System.out.print("Your are an adult");
        }
        else{
            System.out.print("Your are a senior citizen");
        }
    }
}
