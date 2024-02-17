import java.util.*;
public class Question80 {
    //"A program to calculate the total cost of a shopping cart based on the item prices and quantities."
    //Ex: items and price in ruppes :-> 1.fridge:20, 2.Laptop:30, 3.car:40
    //input :1
    //enter quantityt:2
    //output: rs.40.
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----MENU-----");
        System.out.println("Press\t1\tfor\tFridge\tPrice=20");
        System.out.println("Press\t2\tfor\tLaptop\tPrice=30");
        System.out.println("Press\t3\tfor\tCar\tPrice=40");
        System.out.println("Enter your choice");
        byte choice = scan.nextByte();
        switch(choice){
            case 1: System.out.println("Enter your quantity");
                    int qt1 = scan.nextInt();
                    int price1 = qt1*20;
                    System.out.println("---Your Bill---");
                    System.out.println("Fridge * "+qt1+" ="+price1);
                    break;
            case 2: System.out.println("Enter your quantity");
                    int qt2 = scan.nextInt();
                    int price2 = qt2*30;
                    System.out.println("---Your Bill---");
                    System.out.println("Fridge * "+qt2+" ="+price2);
                    break;
            case 3: System.out.println("Enter your quantity");
                    int qt3 = scan.nextInt();
                    int price3 = qt3*40;
                    System.out.println("---Your Bill---");
                    System.out.println("Fridge * "+qt3+" ="+price3);
                    break;
            default:System.out.println("Invalid Entery");
        }
       
    }
}
