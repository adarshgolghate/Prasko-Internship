import java.util.*;
public class Question114 {
    //Print the day of the week based on the given number(1 for sunday , 2 for Monday , etc.) using switch case and loop
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean x = false;
        while (x==false) {
            System.out.println("-----MENU-----");
            System.out.println("Press\t1\tfor\tSunday");
            System.out.println("Press\t2\tfor\tMonday");
            System.out.println("Press\t3\tfor\tTuesday");
            System.out.println("Press\t4\tfor\tWednesday");
            System.out.println("Press\t5\tfor\tThursday");
            System.out.println("Press\t6\tfor\tFriday");
            System.out.println("Press\t7\tfor\tSaturday");
            System.out.println(" ");
            System.out.println("Please enter your choice");
            byte choice = scan.nextByte();

            switch (choice) {
                case 1:System.out.println("Sunday");break;
                case 2: System.out.println("Monday");break;
                case 3:System.out.println("Tuesday");break;
                case 4:System.out.println("Wednesday");break;
                case 5:System.out.println("Thursday");break;
                case 6:System.out.println("Friday");break;
                case 7:System.out.println("Saturday");
                default:System.out.println("Invalid choice");break;
            }

            System.out.println("Do you want to countinue???");
            System.out.println("Press\t1\tfor\tYES");
            System.out.println("Press\t2\tfor\tNO");
            byte choice2 = scan.nextByte();
            if(choice2==1){
                x=false;
            }            
            else if(choice2==2){
                x=true;
            }
            else{
                System.out.println("Enter a valid choice");
            }
            
        }
    }
}
