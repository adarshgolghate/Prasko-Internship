import java.util.*;
public class Question84 {
    //find the sum of first N natural number
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N");
        int n = scan.nextInt();int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.print("Sum of first "+n+" is "+sum);
    }
}
