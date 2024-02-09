import java.util.*;
public class Question17 {
    //Surface area of a cylinder: 2  π  radius * (radius + height) = surface area
    public static void main(String args[]){
        int radius,height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of your cylinder:");
        radius = scan.nextInt();
        System.out.println("Enter height of your cylinder:");
        height=scan.nextInt();
        double surfacearea =2*3.14*(radius*(radius+height));
        System.out.println("The Surface Area of your Cylinder = "+surfacearea); 
    }
}
