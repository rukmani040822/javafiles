/*
 * 
input
3
2
4
output
  1
 2  2
3  3  3
 1
2 2
    1
   2  2
  3  3  3
4  4  4  4
   
   
 */

package rukmani;

import java.util.Scanner;

public class Pattern{
	public static void main(String[] args) {
		int r1,r2,r3;
		
		Scanner sc = new Scanner(System.in);
		r1=sc.nextInt();
		r2=sc.nextInt();
		r3=sc.nextInt();
		for(int i=1;i<=r1;i++) {
			//print blank
			for(int b=1;b<=r1-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//second triangle
		for(int i=1;i<=r2;i++) {
			//print blank
			for(int b=1;b<=r2-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//3rd triangle
		//second triangle
				for(int i=1;i<=r3;i++) {
					//print blank
					for(int b=1;b<=r3-i;b++) {
						System.out.print(" ");
					}
					for(int j=1;j<=i;j++) {
						System.out.print(i+" ");
					}
					System.out.println();
				}
	}
	
}
	
	




