
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE JAVA CALCULATOR (using switch case)"
				+ "\n These are the operations that i will accept"
				+ "\n For Addition: +"
				+ "\n For Subtraction : -"
				+ "\n For Multiplication  : *"
				+ "\n For Division : /");
		
		Scanner variable1Scanner = new Scanner(System.in);
		System.out.println("Submit the first variable: ");
		float variable1 = variable1Scanner.nextFloat();
		
		Scanner operatorScanner = new Scanner(System.in);
		System.out.println("Submit the operator: ");
		String operator = operatorScanner.next();
		
		Scanner variable2Scanner = new Scanner(System.in);
		System.out.println("Submit the second variable: ");
		float variable2 = variable2Scanner.nextFloat();
		
		float result;
		
		switch(operator) {
		case "+":
			 result = (variable1+variable2);
			System.out.println(result);
			break;
		case "-":
			 result = (variable1-variable2);
			System.out.println(result);
			break;
		case "/":
			 result = (variable1/variable2);
			System.out.println(result);
			break;
		case "*":
			 result = (variable1*variable2);
			System.out.println(result);
			break;
		}
		
		

	}

}
