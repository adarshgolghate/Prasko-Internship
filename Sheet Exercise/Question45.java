import java.util.Scanner;

public class Question45 {
    //Exterior angle of an n-sided polygon: 360 degrees / n, where n is the number of sides
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number of sides in polygon: ");
        byte s = scan.nextByte();
        System.out.println("exterior angle of "+s+"-sided polygon is " +360/s +" degrees");
    }
}
