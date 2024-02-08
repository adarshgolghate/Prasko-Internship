/*
Print the pattern of numbers in a pyramid.
*
***
******
***
*
 */
public class Question107 {
    public static void main(String args[]){
        for(int i=1; i<=3;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int x=1; x<=5;x++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
        for(int y=1; y<=3; y++){
            for(int z=3; z>=y;z--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
