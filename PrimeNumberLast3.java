package rukmani;

public class PrimeNumberLast3 {

		public static void main(String[] args) {
			int c=0, cn=0;
			for(int i=100;i>=1;i--) {  //1 2 3 4 5 6 7 ..........100
				c=0;
				for(int j=1;j<=i;j++) { //i=5  , j=1 2 3 4
					if(i%j==0) {  //5%1==0 , 5%2!=0  5%3!=0  5%4!=0  5%5==0
						c++; //c=3
						//System.out.println(c);
					}
				}
				if(c==2) {
					cn++;
					System.out.print(i+" ");
					if(cn == 3)
					{
						break;
					}
				}
				
			}

		}

	}

