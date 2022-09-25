import java.util.Scanner;

public class SingleDigitNumber {

	public static void main(String[] args) {
		
		var r = new Scanner(System.in);
		System.out.println("Enter any number to prtint word :");
		int num = r.nextInt();
				
		if (num == 1)
			System.out.println("ONE");
		else if (num == 2)
			System.out.println("TWO");
		else if (num == 3)
			System.out.println("THREE");
		else if (num == 4)
			System.out.println("FOUR");
		else if (num == 5)
			System.out.println("FIVE");
		else if (num == 6)
			System.out.println("six");
		else if (num == 7)
			System.out.println("SEVEN");
		else if (num == 8)
			System.out.println("EIGNT");
		else if (num == 9)
			System.out.println("NINE");
		else if (num == 0)
			System.out.println("ZERO");
		else
			System.out.println("Enter Single Digit Number");
		
		
		

	}

}
