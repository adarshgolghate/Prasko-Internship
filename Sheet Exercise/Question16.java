//importing the util package
import java.util.*;
public class Question16 {
    public static void main(String args[]){
        //Volume of a cylinder: π  radius^2  height = volume
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to know volume of your cylinder?");
        System.out.print("Enter height of your cylinder:");
        int height=scan.nextInt();
        System.out.print("Enter radius of your cylinder:");
        int radius=scan.nextInt();
        double volume = (3.14*(radius*radius)*height);
        System.out.print("Volume of your cylinder is "+volume);
    }
}
