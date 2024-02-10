import java.util.*;
public class Question36 {
    //Volume of a prism: base area * height = volume
    public static void mian(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of base area:");
        int basearea= scan.nextInt();
        System.out.println("Enter the height of your prism");
        int height = scan.nextInt();
        int volume = basearea *height;
        System.out.println("The vaolume of your prism is:"+volume);
    }
}
