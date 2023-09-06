package rukmani;

public class PrimeNumber {

		public static void main(String[] args) {
			int c=0;
			for(int i=1;i<100;i++) {  //1 2 3 4 5 6 7 ..........100
				c=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						c++;
					}
				}
				if(c==2) {
					System.out.print(i+" ");
				}
				
			}

		}

	}

			
		

	


