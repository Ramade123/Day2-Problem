import java.util.Scanner;
public class Display_Unit {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		if (a < 10) {
			System.out.println("Enter number's unit is one");
		} else if (a < 100) {
			System.out.println("Enter number's unit is ten");
		} else if (a < 1000) {
			System.out.println("Enter number's unit is hundred");
		} else if (a < 100000) {
			System.out.println("Enter number's unit is thousand");
		} else {
			 System.out.print("Enter a valid Number");
		
		
		}

	}

}
