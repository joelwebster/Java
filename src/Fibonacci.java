import java.util.Scanner;
public class Fibonacci {
	
	public static void main (String[] args) {
		
		// take input for number of series
		System.out.println("Enter number up to which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		
		// print Fibonacci series up to number
		System.out.println("\n\n Fibonacci series up to " + number + " numbers: ");
		fibLoop(number);
		
	}
	
	public static void fibLoop (int number) {
		
		int fib1 = 1;
		int fib2 = 1;
		int fibonacci = 1;
		
		for (int i=1;i<=number;i++) {
			
			if (i==1 || i==2) {
				System.out.print("1, ");
			
			} else {
			
			fibonacci = fib1 + fib2; // Fibonacci number is sum of the two previous Fibonaccis
			fib1 = fib2;
			fib2 = fibonacci;
			
			System.out.print(fibonacci + ", ");
			}
			
		}
		
	}

}