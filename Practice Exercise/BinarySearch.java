import java.util.*;
public class BinarySearch {
    //Implement Binary Search algorithm
    public static void main(String args[]){
        //decalre an array
        int a[]={10,20,30,40,50,60,70,80,90,100};
        int high=9,low=0, mid = low+high/2;;
        System.out.print("Enter the Number you want to serach");
        Scanner scan = new Scanner(System.in);
        int key=scan.nextInt();
        for(int i=0;i<a.length;i++){
           
            if(a[mid]==key){
                System.out.print("Search sucessful!, element found at :"+ (mid+1));
                break;
            }
            else if(a[mid]>key){
                high=mid;
                mid=low+high/2;
            }
            else if(a[mid]<key){
                low =mid;
                mid=low+high/2;
            }
            else{
                System.out.print("Element not found...");
            }

        }
    }
}
