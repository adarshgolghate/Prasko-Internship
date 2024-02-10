import java.util.*;
public class Question35 {
    //Time Converter: Implement a program that converts time from 24-hour format to 12-hour format.Example: Input : 23 , Output: 11
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time you want to convert..");
        int time = scan.nextInt();
        if(time<12){
            System.out.println("The current time is "+time+" a.m.");
        }
        else{
            System.out.println("The current time is "+(time-12)+" p.m");
        }
    }
}
