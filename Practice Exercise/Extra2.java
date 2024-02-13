import java.util.*;
class AllProgram{
    double balance=15000;
    void checkbalance(){
        System.out.println("Wel-Come User");
        System.out.print("Your balance is "+balance);
    }
    void withdrawMone(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount");
        double withdraw = sc.nextInt();
        balance = balance-withdraw;
        System.out.print("Remaining balance is "+balance);
    }
    void depositMoney(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your amount");
        double deposit = sc1.nextInt();
        balance = balance + deposit;
        System.out.print("Your balance is "+balance);
    }
    void changePin(){
        
        
    }
}
public class Extra2 {
    //ATM Transaction Simulator: A program that simulates an ATM transaction, where the user can select options like checking balance, withdrawing money, depositing money, etc. 
    //Switch-case can be used to handle the menu selection, and if-else can be used for additional validations.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test=0;
        while(test<3){
            System.out.print("Enter your Card Number:");
            int name = scan.nextInt();
            System.out.print("Enter your pin");
            int pin = scan.nextInt();
            if(name == 15082002 && pin== 1508){
                System.out.println("---------Menu---------");
                System.out.println("Press\t1 for Checking Balance");
                System.out.println("Press\t2 for Money Withradwal");
                System.out.println("Press\t3 for Deposit Money");
                System.out.println("Press\t4 for Pin Changing");
                byte choice = scan.nextByte();
                AllProgram ap = new AllProgram();
                switch (choice) {
                    case 1: ap.checkbalance();break;
                    case 2: ap.withdrawMone();break;
                    case 3: ap.depositMoney();break;
                    case 4: ap.changePin();break;
                    default:System.out.print("Choose a valid option");break;
                }
            }
            else{
                System.out.println("Invalid Cridentials");
                test++;
                System.out.println("Number of attempts left "+(test-1));
            }
            
        }     
    

    }
}
