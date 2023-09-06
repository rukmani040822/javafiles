package rukmani;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		String pname;
		float price,discount,amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name");
		pname = sc.nextLine();
		
		System.out.println("Enter the product price");
		price =sc.nextFloat();
		
		if(price>0 && price<=10000) {
			discount= price*0.05f;
			
		}
		else if (price<10000 && price<=20000) {
			discount = price*0.1f;
			
		}
		else if (price<20000 && price<=35000) {
             discount = price*1.5f;
             
		}
		else {
			discount = price*0.2f;
			
		}
        amount = price-discount;
        System.out.println("the product name"+ pname);
        System.out.println("the product price"+ price);
        System.out.println(" the discount is"+discount);
        System.out.println("the amount to be paid"+amount);
	}
}    
    
	
