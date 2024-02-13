//importing all packages from utility package
import java.util.*;
//this class contains the 
class AllProgram{
    
    void checkBalance(double a){
        System.out.println("Wel-Come User");
        System.out.println(" ");
        System.out.print("Your balance is "+a);
    }
    void withdrawMoney(double b){
        Scanner scanMoney = new Scanner(System.in);
        System.out.print("Enter your amount");
        double withdraw = scanMoney.nextInt();
        System.out.println(" ");
         b = b-withdraw;
        System.out.println(" ");
        System.out.println("Remaining balance is "+b);
    }
    void depositMoney(double c){
        Scanner scanMoney = new Scanner(System.in);
        System.out.println("Enter your amount");
        double deposit = scanMoney.nextInt();
        System.out.println(" ");
        c = c + deposit;
        System.out.println(" ");
        System.out.println("Your balance is "+c);
    }
}
public class Extra2 {
    //ATM Transaction Simulator: A program that simulates an ATM transaction, where the user can select options like checking balance, withdrawing money, depositing money, etc. 
    //Switch-case can be used to handle the menu selection, and if-else can be used for additional validations.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test=1;
        //below section allows user to register himself
        System.out.println("--------Register Your Self--------");
        System.out.println(" ");
        System.out.print("Enter desired card number:");        
        int cardNumber = scan.nextInt();
        System.out.println(" ");
        System.out.print("Enter your pin:");
        int pinNumber = scan.nextInt();
        System.out.println(" ");
        System.out.print("Conform your pin:");
        int conformPin = scan.nextInt();
        System.out.println(" ");
        if(pinNumber == conformPin){
            System.out.println("Pin Generated Succefully!!!");
            System.out.println(" ");
            System.out.println("Enter your deposit amount...");
            System.out.println(" ");
        }
        else{
            System.out.print("Invalid Pin");
            pinNumber =0;
            conformPin = 0;
        }        
        double balance = scan.nextInt();
        //this while loop checks for verifying the user and making him to perform certain actions
        while(test<3){
            System.out.print("Enter your Card Number:");
            int name = scan.nextInt();
            System.out.println(" ");
            System.out.print("Enter your pin");
            int pin = scan.nextInt();
            System.out.println(" ");
            if(name == cardNumber && pin== pinNumber){
                System.out.println("---------Menu---------");
                System.out.println("Press\t1 for Checking Balance");
                System.out.println("Press\t2 for Money Withradwal");
                System.out.println("Press\t3 for Deposit Money");
                byte choice = scan.nextByte();
                //onject of AllProgram class
                AllProgram ap = new AllProgram();
                switch (choice) {
                    case 1: ap.checkBalance(balance);break;
                    case 2: ap.withdrawMoney(balance);break;
                    case 3: ap.depositMoney(balance);break;                    
                    default:System.out.print("Choose a valid option");break;
                }
                test=3;
            }
            else{
                System.out.println("Invalid Cridentials");
                test++;
                System.out.println(" ");
                System.out.println("Number of attempts left "+(test-1));
            }            
        } 
    }
}
