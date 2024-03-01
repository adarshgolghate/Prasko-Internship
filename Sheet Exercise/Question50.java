import java.util.Scanner;

public class Question50 {
    //Angle sum in a polygon: (n - 2) * 180 degrees, where n is the number of sides
    public static void main(String args[]){
        System.out.println("Angle sum in a polygon");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the Number of sides: ");
        int n = scan.nextInt();
        System.out.println("the angle sum in a polygon having sides "+n+" is "+(n-2)*180+" degrees.");
    }
}
