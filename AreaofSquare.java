package rukmani;
import java.util.Scanner;
public class AreaofSquare {

	public static void main(String[] args) {
	     int length,area;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the length of the Square:");
	     length = sc.nextInt();
	     
	     area = length*length;
	     
	     System.out.println("Area of the square is:"+ area);
	}

}
