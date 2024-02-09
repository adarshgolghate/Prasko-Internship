//importing util package
import java.util.*;
class Question24 {
    public static void main(String args[]){
        //Area of a rectangle: length * width = area
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length of your rectangle:");
        int length = scan.nextInt();
        System.out.println("Enter the Width of your Rectangle:");
        int width = scan.nextInt();
        //calculating the area of your rectangle
        int area = (length*width);
        System.out.println("The area of your rectangle is:"+ area);
    }
    
}
