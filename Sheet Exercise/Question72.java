//importing utility package
import java.util.*;
    
public class Question72 {
    //A program to simulate a simple calculator with basic operations (addition, subtraction, multiplication, division).
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("Press-1 for Addition");
        System.out.println("Press-2 for Subtraction");
        System.out.println("Press-3 for Multiplicatio ");
        System.out.println("Press-4 for Division");
        byte choice=scan.nextByte();
        switch (choice) {
            case 1: System.out.print("Enter 2 number");
                    int a=scan.nextInt();
                    int b=scan.nextInt();
                    int c=a+b;
                    System.out.print("= "+c);                
                    break;
            case 2: System.out.print("Enter 2 number");
                    int e=scan.nextInt();
                    int f=scan.nextInt();
                    int g=e-f;
                    System.out.print("= "+g);                
                    break;  
            case 3: System.out.print("Enter 2 number");
                     int h=scan.nextInt();
                     int i=scan.nextInt();
                     int j=h*i;
                     System.out.print("= "+j);                
                     break;   
            case 4: System.out.print("Enter 2 number"); 
                    int x=scan.nextInt();
                    int y=scan.nextInt();
                    int z=x*y;
                    System.out.print("= "+z);                
                    break;            
            default:System.out.print("Invalid Choice made");break;
        }


    }
}
