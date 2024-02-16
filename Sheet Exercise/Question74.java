import java.util.*;
public class Question74 {
    //A program to print the name of the day of the week based on the given day number.
    public static void main(String args[]){
        System.out.print("Enter the number of the day...");
        Scanner scan = new Scanner(System.in);
        byte choice = scan.nextByte();
        switch (choice) {
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday");break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thrsday");break;
            case 5: System.out.print("Friday");break;
            case 6: System.out.print("Saturday");break;
            case 7: System.out.print("Sunday");break;        
            default:System.out.println("Invalid Input"); break;
        }
    }
}
