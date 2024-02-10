import java.util.*;
public class Question39 {
    //Volume of a hemisphere: (2/3) * π * r^3 = volume
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your hemisphere");
        int radius = scan.nextInt();
        double hemisphere = 0.6*3.14*(radius*radius*radius);
        System.out.println("The volume of your hemisphere "+hemisphere);

    }
}
