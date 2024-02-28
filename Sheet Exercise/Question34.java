import java.util.*;
public class Question34 {
    public static void main(String args[]){
        //Area of a regular polygon: (perimeter * apothem) / 2 = area
        Scanner scan = new Scanner(System.in);
        int perimeter, apothem;
        System.out.println("Enter the perimeter of your polygon :");
        perimeter = scan.nextInt();
        System.out.println("Enter the apothem of the polygon :");
        apothem = scan.nextInt();
        int area = (perimeter * apothem)/2;
        System.out.println(" ");
        System.out.println(area);
    }
}
