import java.util.*;
public class Question43 {
    //Volume of a tetrahedron: (base area * height) / 3 = volume
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base area =");
        int baseara= scan.nextInt();
        System.out.print("Enter the height =");
        int height = scan.nextInt();
        int volume = (baseara * height)/3;
        System.out.print ("Volume = "+volume);
    }
}
