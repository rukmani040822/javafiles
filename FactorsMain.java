package rukmani;
	import java.util.Scanner;

	public class FactorsMain {

		public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter th number");
			num=sc.nextInt(); //num=6 , 1 2 3 6
			System.out.print("Factors of "+num+ " are :");
			for(int i=1;i<=num;i++) { //6%1, 6%2, 6%3, 6%4 6%5 6%6
				if(num%i == 0) {
					System.out.print(i+" ");
				
				}
			}
			
			}
		}

	

