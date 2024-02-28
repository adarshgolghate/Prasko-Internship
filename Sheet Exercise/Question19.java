import java.util.*;
public class Question19 {
    //Simple Interest (principal rate time) / 100 = intrest
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int principal, rate, time;
        System.out.println("Enter the principal : ");
        principal = scan.nextInt();
        System.out.println("Enter the rate :");
        rate = scan.nextInt();
        System.out.println("Enter the time : ");
        time = scan.nextInt();

        int intrest = (principal * rate * time)/100;
        System.out.println(intrest);
    }
}
