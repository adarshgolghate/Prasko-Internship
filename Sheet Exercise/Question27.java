import java.util.*;
class Question27 {
    public static void main(String args[]){
        //Area of a triangle: (base * height) / 2 = area
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Height of the triangle:");
        int height = scan.nextInt();
        System.out.print("Enter the Base of the triangle:");
        int base = scan.nextInt();
        int area = (base*height)/2;
        System.out.print("Area of your trianlge ="+area);
    }    
}
