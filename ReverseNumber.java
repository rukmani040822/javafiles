package rukmani;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int rev=0;
		
		System.out.println("Enter the number=");
		int num=sc.nextInt();		
        int  a=num;
		while(num>0) {
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if (rev==a) {
			System.out.println("The given no is palindrom");
			
		}
		else {
			System.out.println("not a palindrom");
		}
	}

}
