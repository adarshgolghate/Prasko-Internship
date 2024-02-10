import java.util.*;
public class Question37 {
    //Surface area of a pentagonal prism: (5 * s * height) + (5 * base area) = surface area
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your sieds");
        int side = scan.nextInt();
        System.out.println("Enter the height of your prism");
        int height = scan.nextInt();
        System.out.println("Enter the base area your prism");
        int basearea = scan.nextInt();
        int surfacearea = (5*side*height)+(5*basearea);
        System.out.println("The Surface Aea of your prims is = "+surfacearea);
    }
}
