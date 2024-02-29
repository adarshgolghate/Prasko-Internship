import java.util.*;
public class Question88 {
    //calculate the power of a number using loop
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        System.out.println(" ");
        System.out.println("Enter the power of a number");
        int power = scan.nextInt();
        int value =1;
        for(int i=0; i<power; i++){
            value=value*num;
        }
        System.out.println(value);
    }
}
