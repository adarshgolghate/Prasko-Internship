import java.util.*;
public class Question78 {
    //A program to display the name of a country based on its country code
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your code...");
      int choice = scan.nextInt();
      switch(choice){
        case 91:System.out.print("India");break;
        case 61: System.out.print("Australia");break;
        case 43: System.out.print("Austria");break;
        case 994: System.out.print("Azerbaijan");break;
      }
    }
}
