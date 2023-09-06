package rukmani;
import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case'A':
		case'a':
		case'E':
		case'e':
		case'I':
		case'i':
		case'O':
		case'o':
		case'U':
		case'u':System.out.println(ch+" is an vowel");
		        break;
		default: System.out.println("not a vowel");
		
		}

	}

}
