import java.util.*;
class Question44 {
    //Distance, speed, and time relationship: distance = speed * time
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed");
        int speed= scan.nextInt();
        System.out.println("Enter time");
        int time = scan.nextInt();
        int distance = speed*time;
        System.out.println("Distance = "+distance);
    }    
}
