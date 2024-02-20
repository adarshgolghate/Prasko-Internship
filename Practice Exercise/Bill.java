import java.util.*;
class Bill{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a=0, x=0, y=0;
		System.out.println("Enter your Amount");
		a=scan.nextInt();

		x=a%10;
		y=a/10;
		if(a<=12){
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
			case 11:System.out.print("Eleven");
			case 12:System.out.print("Twelve");
			
			}
		}
		else if(a<20){
			switch (x) {
				case 3:System.out.print("Thirteen");break;
				case 4:System.out.print("Fourteen");break;
				case 5:System.out.print("Fiveteen");break;
				case 6:System.out.print("sixteen");break;
				case 7:System.out.print("Seventeen");break;
				case 8:System.out.print("Eightteen");break;
				case 9:System.out.print("Nineteen");break;
			
				default:break;
			}
		}
		else{
			switch(y){
				
				case 2:System.out.print("Twenty");break;
				case 3:System.out.print("Thirty");break;
				case 4:System.out.print("Fourty");break;
				case 5:System.out.print("Fifty");break;
				case 6:System.out.print("Sixty");break;
				case 7:System.out.print("Seventy");break;
				case 8:System.out.print("Eighty");break;
				case 9:System.out.print("Ninty");break;
			}
			switch(x){
				case 1:System.out.print("One");break;
				case 2:System.out.print("Two");break;
				case 3:System.out.print("Three");break;
				case 4:System.out.print("Four");break;
				case 5:System.out.print("Five");break;
				case 6:System.out.print("Six");break;
				case 7:System.out.print("Seven");break;
				case 8:System.out.print("Eight");break;
				case 9:System.out.print("Nine");break;
			
			}	
			
		}
	}
}
	