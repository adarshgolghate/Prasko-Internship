import java.util.*;
public class Question77 {
    public static void main(String args[]){
        //program to convert numerical grade into a letter grade
        Scanner scan = new Scanner(System.in);
        System.out.println("a month");
        String month = scan.nextLine();
        switch(month){
            case "January": System.out.println("31");break;
            case "February": System.out.println("28");break;
            case "March": System.out.println("30");break;
            case "April": System.out.println("31");break;
            case "May": System.out.println("30");break;
            case "June":System.out.println("31");break;
            case "July":System.out.println("30");break;
            case "August": System.out.println("31"); break;
            case "September": System.out.println("30");break;
            case "October": System.out.println("31");break;
            case "November": System.out.println("30");break;
            case "December": System.out.println("31");break;

        }

    }
}
