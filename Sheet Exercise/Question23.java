//importing the util package
import java.util.*;
class Question23{
    public static void main(String args[]){
        //Area of a Square = a²
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the side of your square:");
        int sides = scan.nextInt();
        int area = sides*sides;
        System.out.println("The area od your swaure is:"+area);
    }

}