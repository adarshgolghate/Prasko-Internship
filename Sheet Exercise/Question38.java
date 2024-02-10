import java.util.*;
public class Question38 {
    //Perimeter of a regular hexagon: 6 * s, where s is the side length
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your sides");
        int length = scan.nextInt();
        int perimeter = 6*length;
        System.out.println("The perimeter of your Hexagon is:"+ perimeter);
    }
}
