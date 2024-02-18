import java.util.*; 
public class Question130 {
    //calculate the sum of array elements
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array...");
        int n = scan.nextByte();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter number ... ");
            arr[i]=scan.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum of elements in an arrya = "+sum);
    }
}
