//importing util package
import java.util.Scanner;
public class Question79 {
   //A program to convert a month name to its corresponding number (January - 1, February - 2, etc.).
   public static void main(String args[]){
        //made an objec 'scan' od scanner class
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a Month Name");
        str = scan.nextLine();
        //below code switches to the case based on the input
        switch (str) {
            case "January": System.out.println("1"); break;
            case "February": System.out.println("2"); break;
            case "March": System.out.println("3"); break;
            case "April": System.out.println("4"); break;
            case "May": System.out.println("5"); break;
            case "June": System.out.println("6"); break;
            case "July": System.out.println("7"); break;
            case "August": System.out.println("8"); break;
            case "September": System.out.println("9"); break;
            case "October": System.out.println("10"); break;
            case "November": System.out.println("11"); break;
            case "December": System.out.println("12"); break;           
            default:System.out.println("Invalid Month Name Entered");break;
        }
   } 
}
