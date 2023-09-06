package rukmani;
import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		String name;
		int units;
		float amount;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter customer name");
			name=sc.nextLine();
			System.out.println("Enter units consumed");
			units = sc.nextInt();
		    
		    
		 if(units>=0 && units <=200) {
			amount = units*3.80f;
			
		}
		 else if (units>200 && units<=300) {
			 amount = 200*3.30f+(units-200)*4.40f;
		 }
		 else if (units>300 && units>=400) {
			 amount = 200*3.80f+100*4.40f+(units-300)*5.10f;
		 }
		 else {
			 amount =200*3.80f+100*4.40f+100*5.10f+(units-400)*5.80f;
			 
		 }
		 System.out.println("customer Name:"+name);
		 System.out.println("Units consumed"+units);
		 System.out.println("Amount to pay"+amount);
		 
		 
	}

}
