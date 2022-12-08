package s03;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Random rand = new Random();


		int n = rand.nextInt(10);

		int guess;


		do{
			Scanner guessScanner = new Scanner(System.in);
			System.out.println("Try to guess the number: ");
			guess= guessScanner.nextInt();
			System.out.println("try again \n");

		}while(guess != n);
			System.out.println("correct");
			
			

//		other way to write the game, found online. There is room for improvement
//			guess = 0;        
//
//			do {
//			    guess = keyboard.nextInt(); 
//
//			    if (guess > random) {
//			        System.out.print("Lower!");
//			        attempts += 1; 
//			    } else {
//			        System.out.print("Higher!");
//			        attempts +=1;
//			    }
//			 } while (guess != random);
	}
}
