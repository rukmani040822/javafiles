package rukmani;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int terms, f1=1,f2=1,f3;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of terms");
	terms = sc.nextInt();
	
	System.out.println("Fibonacci Series ");
	System.out.print(f1+" "+f2+" ");
	
	for(int i=1;i<=terms-2;i++) {  
		f3 = f1+f2;
		System.out.print(f3+" ");  
		 f1=f2 ;                        
		 f2=f3;
	}
	
}
}		  

	


