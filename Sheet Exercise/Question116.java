import java.util.*;
public class Question116 {
    //Print the multiplication table using switch case and loop
    public static void main(String arga[]){
        Scanner scan = new Scanner(System.in);
        boolean x = true;
        while(x==true){
            System.out.println("----MENU----");
            System.out.println("Press\t1\tfor\tmultiplication table of one");
            System.out.println("Press\t2\tfor\tmultiplication table of two");
            System.out.println("Press\t3\tfor\tmultiplication table of three");
            System.out.println("Press\t4\tfor\tmultiplication table of four");
            System.out.println("Press\t5\tfor\tmultiplication table of five");
            System.out.println("Press\t6\tfor\tmultiplication table of six");
            System.out.println("Press\t7\tfor\tmultiplication table of seven");
            System.out.println("Press\t8\tfor\tmultiplication table of eight");
            System.out.println("Press\t9\tfor\tmultiplication table of nine");
            System.out.println("Press\t10\tfor\tmultiplication table of ten");
            System.out.println("Enter the number of which you want to print the table : ");
            byte choice = scan.nextByte();
            switch (choice) {
                case 1:for(int i=1;i<=10;i++){
                         System.out.println("1 *"+i+" = "+(1*i));
                        }break;
                case 2:for(int i=1;i<=10;i++){
                        System.out.println("2 *"+i+" = "+(2*i));
                        }break;
                case 3:for(int i=1;i<=10;i++){
                        System.out.println("3 *"+i+" = "+(3*i));
                        }break;
                case 4:for(int i=1;i<=10;i++){
                        System.out.println("4 *"+i+" = "+(4*i));
                        }break;
                case 5:for(int i=1;i<=10;i++){
                        System.out.println("5 *"+i+" = "+(5*i));
                        }break;
                case 6:for(int i=1;i<=10;i++){
                        System.out.println("6 *"+i+" = "+(6*i));
                        }break;
                case 7:for(int i=1;i<=10;i++){
                        System.out.println("7 *"+i+" = "+(7*i));
                        }break;
                case 8:for(int i=1;i<=10;i++){
                        System.out.println("8 *"+i+" = "+(8*i));
                        }break;
                case 9:for(int i=1;i<=10;i++){
                        System.out.println("9 *"+i+" = "+(9*i));
                        }break;
                case 10:for(int i=1;i<=10;i++){
                        System.out.println("10 *"+i+" = "+(10*i));
                        }break;
                default:System.out.println("Invalid Entry..");break;
            }
            System.out.println("Do you want to print more table?");
            System.out.println("Press 1 for Yes");
            System.out.println("Press 2 for No");
            byte option = scan.nextByte();
            if(option == 1){
                x=true;
            }
            else{
                x=false;
            }

        }
    }
}
