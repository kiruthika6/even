package positive;

import java.util.Scanner;

public class even {

	
	public static void main(String[] args) {
		int a;
		System.out.println("enter the number");
		Scanner in=new Scanner (System.in);
		a=in.nextInt();
		if((a%2)*2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
			
		}
				
	}

}
