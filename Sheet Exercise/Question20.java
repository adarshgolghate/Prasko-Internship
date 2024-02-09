//importing util package
import java.util.*;
class Question20 {
    //Area of an ellipse: π * major axis * minor axis = area
    public static void main(String args[]){
        //making an object of scanner class
        Scanner scan = new Scanner(System.in);
        //decalring the statement to take value and asking to enter the values
        System.out.println("Enter the value of major axis:");
        int majoraxis = scan.nextInt();
        System.out.println("Enter the value of minor axis:");
        int minoraxis= scan.nextInt();
        //calculating the area of the ecillipse
        double area = 3.14*(majoraxis*minoraxis);
        //printing the area 
        System.out.println("The area of your ellipe =" +area);
    }    
}
