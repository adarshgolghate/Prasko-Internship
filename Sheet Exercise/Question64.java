import java.util.*;
public class Question64 {
    //Time Converter: Implement a program that converts time from 12-hour format to 24-hour format.
    //Example: Input : 10PM , Output: 22
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your time: ");
        byte time = scan.nextByte();
        if(time<12){
            System.out.print("The current time is : " +(time+12));
        }
        else if(time == 24){
            System.out.print("Current time is 00");
        }
        else{
            System.out.print("The current time is"+ time);
        }


    }
}
