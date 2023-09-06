package rukmani;
import java.util.Scanner;

		public class FactorialMain {
		    public static void main(String[] args) {
				int num;
				long fact=1;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number");
				num = sc.nextInt();
				
				for(int i=num;i>=1;i--) {
					fact = fact*i;
				}
				
				System.out.println("Factorial of a number "+fact);
			}
		

	}


