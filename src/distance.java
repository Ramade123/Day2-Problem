import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of x : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the value of y : ");
		int y = sc.nextInt();
		double d = Math.sqrt(x * x + y * y);
		System.out.println("The total distance is : " + d);
	}

}
