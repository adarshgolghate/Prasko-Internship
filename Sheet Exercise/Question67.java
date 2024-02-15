import java.util.*;
public class Question67 {
    public static void main(String args[]){
        //Month Name: Write a program that takes a number (1 to 12) as input and prints the corresponding month name.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number:");
        byte number = scan.nextByte();
        if(number <13){
            if(number ==1){
                System.out.print("January");
            }
            else if(number ==2){
                System.out.print("February");
            }
            else if(number ==3){
                System.out.print("March");
            }
            else if(number ==4){
                System.out.print("April");
            }
            else if(number ==5){
                System.out.print("May");
            }
            else if(number ==6){
                System.out.print("June");
            }
            else if(number ==7){
                System.out.print("July");
            }
            else if(number ==8){
                System.out.print("August");
            }
            else if(number ==9){
                System.out.print("September");
            }
            else if(number ==10){
                System.out.print("October");
            }
            else if(number ==11){
                System.out.print("November");
            }
            else{
                System.out.print("December");
            }
        }
        else{
            System.out.print("Invalid Entery");
        }
    }
}
