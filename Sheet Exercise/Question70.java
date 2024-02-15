import java.util.*;
public class Question70 {
    public static void main(String args[]){
        //Determine the day of the week based on the day number (1 for Sunday, 2 for Monday, etc.).
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number");
        byte number = scan.nextByte();
        if(number<8){
            if(number ==1){
                System.out.print("Monday");
            }
            else if(number==2){
                System.out.print("Tuesday");
            }
            else if(number==3){
                System.out.print("Wednesday");
            }
            else if(number==4){
                System.out.print("Thursday");
            }
            else if(number ==5){
                System.out.println("Friday");
            }
            else if(number == 6){
                System.out.print("Saturday");
            }
            else{
                System.out.print("Sunday");
            }
        }
        else{
            System.out.print("Invalid Number");
        }

    }
}
