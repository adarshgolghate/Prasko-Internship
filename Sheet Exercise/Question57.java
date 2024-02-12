import java.util.Scanner;

public class Question57 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //Calculator: Build a simple calculator program that performs basic arithmetic operations (+, -, *, /) based on user input.
        System.out.print("Enter two number");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("--------------Menu--------------");
        System.out.println("Press-1 for Addition");
        System.out.println("Press-2 for Subtraction");
        System.out.println("Press-3 for Multiplication");
        System.out.println("Press-4 for Division");
        System.out.println("Choose your option");
        byte c=scan.nextByte();
        if(c==1){
            int sum = a+b;
            System.out.print("The sum of two number is "+sum);
        }
        else if(c==2){
            int sub = a-b;
            System.out.print("The subtraction of two number is "+sub);
        }
        else if(c==3)
        {
            float multi = (a*b);
            System.out.print("The multiplication of two number is "+multi);
        }
        else{
            double div = a/b;
            System.out.print("The multiplication of two number is "+div);
        }
        
    }
    
}
