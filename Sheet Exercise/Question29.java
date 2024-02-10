import java.util.*;
public class Question29 {
    //Area of a circle: π * radius^2 = area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("The the radius of your circle:");
        int radius = scan.nextInt();
        double area = 3.14*(radius*radius);
        System.out.println("The area of your circle is ="+area);

    }
}
