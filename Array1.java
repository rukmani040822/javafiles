package rukmani;
import java.util.Scanner;
public class Array1 {

			public static void main(String[] args) {
				int arr[]=new int[5];
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter array elements "+arr.length);
				for(int i=0;i<arr.length;i++) {
					arr[i] =sc.nextInt();
				}
				
				System.out.println("Entered Rollnos are ");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
				
			}

		}

	


