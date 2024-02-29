import java.util.*;
public class Question75 {
    //write a program to calculate number of days in a given month
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your month...");
        String string = scan.nextLine();
        switch (string) {
            case "January": System.out.println("Number of Days 31");break;
            case "Febryary": System.out.println("Number of Days 28");break;
            case "March": System.out.println("Number of Days 30");break;
            case "April":System.out.println("Number of Days 31");break;
            case "May": System.out.println("Number of Days 30");break;
            case "June": System.out.println("Number of Days 31");break;
            case "July":System.out.println("Number of Days 30");break;
            case "August":System.out.println("Number of Days 31");break;
            case "September": System.out.println("Number of Days 30");break;
            case "October": System.out.println("Number of Days 31");break;
            case "November":System.out.println("Number of Days 30");break;
            case "December":System.out.println("Number of Days 31");break;        
            default:System.out.println("Entered Month dosn't exist");break;
        }
    }
}
