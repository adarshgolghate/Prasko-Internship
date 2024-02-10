import java.util.*;
public class Question32 {
    //Perimeter of a parallelogram: 2 * (side1 + side2) = perimeter
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your first side");
        int side1 = scan.nextInt();
        System.out.println("Enter the length of your second side");
        int side2 = scan.nextInt();
        int perimeter = 2*(side1+side2);
        System.out.println("The perimeter = "+perimeter);
    }
}
