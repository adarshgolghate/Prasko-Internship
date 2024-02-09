//importing util package
import java.util.*;
class Question21 {
    //Volume of a pyramid: (base area * height) / 3 = volume
    public static void main(String args[]){
        //making an object of scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base area:");
        int base = scan.nextInt();
        System.out.println("Enter the height :");
        int height = scan.nextInt();
        int volume = (base*height)/3;
        System.out.println("The area of your Pyramid is:"+ volume);

    }
}
