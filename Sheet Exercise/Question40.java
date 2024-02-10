import java.util.*;
public class Question40 {
    //Curved surface area of a hemisphere: 2 * π * r^2 = surface area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your hemisphere");
        int radius = scan.nextInt() ;
        double surfacearea = 2*3.14*(radius*radius);
        System.out.println("The value of Surface Area = "+surfacearea);
    }
}
