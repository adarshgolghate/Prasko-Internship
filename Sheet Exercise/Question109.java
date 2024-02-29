import java.util.Scanner;
class Calculator{
    Scanner scan = new Scanner(System.in);
    
    void addition(){
        System.out.println("How many number do you want to insert: ");
        int n=scan.nextInt();
        int add[] = new int[n];
        for(int i=0;i<add.length;i++){
           System.out.print("Enter your "+(i+1)+"st Number");
            add[i]=scan.nextInt();
        }
        int sum =0;
        for(int i=0; i<add.length;i++){
            sum=sum+add[i];
        }
        System.out.println("The addition of the number you have entered = "+ sum);
    }
    void subtraction(){
        System.out.println("Enter your 1st Number");
        int a = scan.nextInt();
        System.out.println("Enter your 2nd Number");
        int b = scan.nextInt();
        int sub = a-b;       
        System.out.println("The subtraction of the number you have entered = "+ sub);
    }
    void multiplication(){
        System.out.println("Enter your 1st Number");
        int a = scan.nextInt();
        System.out.println("Enter your 2nd Number");
        int b = scan.nextInt();
        int multi = a*b;
        System.out.println("The multiplication of the given number = "+multi);
    }
    void division(){
        System.out.println("Enter your 1st Number");
        int a = scan.nextInt();
        System.out.println("Enter your 2nd Number");
        int b = scan.nextInt();
        int div = a/b;
        System.out.println("The devision of two number = "+div);
    }
}

public class Question109 {
    //Simple calculator with menu druven operation using switch case
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();
        boolean x = false;
        while (x==false) {
            System.out.println("----MENU----");
            System.out.println(" ");
            System.out.println("Press\t1\tfor\tAddition");
            System.out.println("Press\t2\tfor\tSubtraction");
            System.out.println("Press\t3\tfor\tMultiplication");
            System.out.println("Press\t4\tfor\tDivision");
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            byte choice = scan.nextByte();

            switch (choice) {
                case 1:cal.addition();break;
                case 2:cal.subtraction();break;
                case 3:cal.multiplication();break;
                case 4:cal.division();break;
                default:break;
            }
            System.out.println("Do you want to continue? ");
            System.out.println("Press 1 for yes");
            System.out.println("Press 2 for No");
            byte option = scan.nextByte();
            if(option == 1){
                x= false;
            }
            else{
                x=true;
            }
            
        }
    }
}
