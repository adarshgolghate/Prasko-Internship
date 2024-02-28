import java.util.*;
public class Question88 {
    //Calculate the sum of even number from 1 to N
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N number ");
        int n = scan.nextInt();
        int sum =0;
        for(int i=1; i<=n; i++)
        {
            if(i%2==0){
                sum =sum+i;
            }

        }
        System.out.println(sum);

    }
}
