import java.util.*;
public class Question82 {
    //write a program to take category as input and print pets in that category
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("----Menu----");
        System.out.println("Mammal");
        System.out.println("Aquatic");
        System.out.println("Avian");
        System.out.println("Rodent");
        System.out.println("Reptile");
        System.out.println("Enter your category..");
        String str = scan.next();

        switch (str) {
            case "Mammal": System.out.println("DOG"); System.out.println("CAT"); System.out.println("RABBIT"); System.out.println("DOG");  break;
            case "Aquatic": System.out.println("Fish"); break;
            case "Avian": System.out.print("Bird");break;
            case "Rodent": System.out.print("Hamster");System.out.println("Guinea Pig");break;
            case "Reptile":System.out.print("Turtle"); System.out.print("Snake");System.out.print("Lizard");break;
            default:System.out.print("Invalid entery");break;
        }

    }
}
