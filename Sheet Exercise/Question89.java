import java.util.*;
public class Question89 {
    //find the largest number in an array
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array");
        byte n = scan.nextByte();
        int a[] = new int[n];
        int max=0;
        for(int i =0; i<a.length; i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.print("The maximum element in an array is "+max);
    }
}
