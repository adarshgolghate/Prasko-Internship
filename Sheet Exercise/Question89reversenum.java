import java.util.*;
public class Question89reversenum {
    //Reverse a number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num>0){
            num = num*10+num%10;
            num = num/10;
        }
        System.out.println(num);
    }
}
