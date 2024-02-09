//importing util package
import java.util.*;
class Question15 {
    public static void main(String args[]){
        //Circumference of a circle: 2  π  radius = circumference
        //making object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Want to know circumfarence of your circle?");
        System.out.println("Enter the radius of your circle:");
        int radius = scan.nextInt();
        double circumfarence = (2*3.147*radius);
        System.out.println("Circumfarence of your circle of radius "+radius+" is "+circumfarence);
    }    
}
