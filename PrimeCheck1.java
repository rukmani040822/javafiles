package rukmani;

	import java.util.Scanner;

	public class PrimeCheck1 {

		public static void main(String[] args) {
			
				int num, count=0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter th number");
				num=sc.nextInt(); //num=6 , 1 2 3 6
				
//				for(int i=1;i<=num;i++) { //6%1, 6%2, 6%3, 6%4 6%5 6%6
//					if(num%i == 0) {
//						count++;
//						//count = count+1
//					
//					}
//				}  //
				
				//num=4, 2
				//num=7 , 2
				//1, 2
				boolean flag = true;
				for(int i=2;i<=Math.sqrt(num);i++) {
					if(num%i==0) { //
						flag=false;
					}
				}
				
				if(flag) {
					System.out.println(num+" is prime");
				}else {
					System.out.println(num+" is not prime");
				}

			}

	}
	
