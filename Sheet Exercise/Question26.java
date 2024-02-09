import java.util.Scanner;

public class Question26 {
    public static void main(String args[]){
        //Area of a square: side * side = area
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of side of the square:");
        int side = scan.nextInt();
        int area = side*side;
        System.out.println("The area of your square is:" +area);
    }
}
