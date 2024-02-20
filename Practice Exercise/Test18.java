import java.util.*;
public class Test18 {
   

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a=0, x=0, y=0;
		System.out.println("Enter your Amount");
		a=scan.nextInt();

		x=a%10;
		y=a/10;
        System.out.println(x);
        System.out.println(y);
		if(a<=10){
			switch(a){
			case 1:System.out.print("One");
			case 2:System.out.print("Two");
			case 3:System.out.print("Three");
			case 4:System.out.print("Four");
			case 5:System.out.print("Five");
			case 6:System.out.print("Six");
			case 7:System.out.print("Seven");
			case 8:System.out.print("Eight");
			case 9:System.out.print("Nine");
			case 10:System.out.print("Ten");
			}
		}
		else{
			switch(y){
			case 1: switch(a){
				case 1:System.out.print("Eleven");
				case 2:System.out.print("Twelve");
				case 3:System.out.print("Thirteen");
				case 4:System.out.print("Fourteen");
				case 5:System.out.print("Fiveteen");
				case 6:System.out.print("Sixteen");
				case 7:System.out.print("Seventeen");
				case 8:System.out.print("Eightteen");
				case 9:System.out.print("Nineteen");
				case 10:System.out.print("Tenteen");
				}
			case 2: switch(a){
				case 1:System.out.print("Twentyone");
				case 2:System.out.print("Twentytwo");
				case 3:System.out.print("Twentythree");
				case 4:System.out.print("Twentyfour");
				case 5:System.out.print("TwentyFive");
				case 6:System.out.print("TwentySix");
				case 7:System.out.print("TwentySeven");
				case 8:System.out.print("TwentyEight");
				case 9:System.out.print("Twentynine");
				case 10:System.out.print("Thirty");}
				}
		}
	}
}	

