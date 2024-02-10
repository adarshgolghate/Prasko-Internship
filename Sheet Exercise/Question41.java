import java.util.*;
public class Question41 {
    public static void main(String args[]){
        //Total surface area of a hemisphere: 3 * π * r^2 = surface area
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = scan.nextInt();
        double hemisphere = 3*3.14*(radius*radius);
        System.out.println("The Surface Area = "+hemisphere);

    }
}
