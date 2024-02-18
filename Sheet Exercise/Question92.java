import java.util.*;
public class Question92 {
    //Print the multiplication table of a number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to print the table");
        int num = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
