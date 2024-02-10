import java.util.*;
public class Question42 {
    public static void main(String args[]){
        //Perimeter of a rhombus: 4 * side = perimeter
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your side");
        int side = scan.nextInt();
        int perimeter = 4*side;
        System.out.println("The perimeter of rhombus = "+perimeter);
    }
}
