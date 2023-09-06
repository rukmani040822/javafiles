package rukmani;


	import java.util.Scanner;

	public class PrimeCheck {

		public static void main(String[] args) {
			
				int num, count=0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter th number");
				num=sc.nextInt(); //num=6 , 1 2 3 6
				
				for(int i=1;i<=num;i++) { //6%1, 6%2, 6%3, 6%4 6%5 6%6
					if(num%i == 0) {
						count++;
						//count = count+1
					
					}
				}
				
				if(count == 2) {
					System.out.println(num+" is prime number");
				}
				else {
					System.out.println(num+" is not prime number");
				}
			}

	}

