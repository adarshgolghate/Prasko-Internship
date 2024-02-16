import java.util.*;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
public class Question73 {
    //A prograom to conver a indian rupees into a given currency amount(USD,EUR,GBP,JPY).
    public static void main(String args[]){
        System.out.println("------Menu------");
        System.out.println("Press\t1\t=\tUSD");
        System.out.println("Press\t2\t=\tEUR");
        System.out.println("Press\t3\t=\tGBP");
        System.out.println("Press\t4\t=\tJPY");
        Scanner scan = new Scanner(System.in);
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:System.out.println("Enter your amount...");
                    double amount = scan.nextDouble();
                    amount = amount*0.012;
                    System.out.print(amount+"USD");                    
             break;
            case 2:System.out.println("Enter your amount..."); 
                    double amount2 = scan.nextDouble();
                    amount2 = amount2*0.011;
                    System.out.print(amount2+"EUR");
            break;
            case 3:System.out.println("Enter your amount...");
                    double amount3 = scan.nextDouble();
                    amount3 = amount3*0.00996;
                    System.out.print(amount3+"GBP");
            break;
            case 4:System.out.print("Enter your amount...");
                    double amount4 = scan.nextDouble();
                    amount4 = amount4*1.81;
                    System.out.print(amount4+"JPY");
             break;        
            default: System.out.println("Invalid Entery...");break;
        }

    }
}
