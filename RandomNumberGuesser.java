/*
 * Class: CMSC203 CRN 31569
 * Instructor:Ahmed Tarek
 * Description: (Give a brief description for each Class)
   Develop an  application that will receive a guess and report if your guess is the random number that was generated.
 * Due: 02/21/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ruth Ferez
*/
import java.util.Scanner;

public class RandomNumberGuesser extends RNG{

	public static void main(String[] args) {



		Scanner input=new Scanner(System.in);
		int lowGuess = 0, highGuess =100;
		int randomGeneratedNum;
		int guess;
		int userGuess;
		String reply;
		do {
			 randomGeneratedNum = RNG.rand();
			lowGuess = 0;
			highGuess =100;
			guess = 0;
			System.out.println("Enter your first guess");
			userGuess=input.nextInt();
			while(userGuess < lowGuess || userGuess > highGuess) {
				RNG.inputValidation(userGuess, lowGuess, highGuess);
				userGuess=input.nextInt();
			}
			if(userGuess >= lowGuess && userGuess <=highGuess){
				RNG.inputValidation(userGuess, lowGuess, highGuess);
			}
			guess++;
			
			while(userGuess != randomGeneratedNum) {
				System.out.println("Number of guesses is: " + guess);
				if(guess == 7) {
					System.out.println("Your trial is over");
					break;
				}
				if(userGuess > randomGeneratedNum) {
					System.out.println("Your guess is too high");
					highGuess = userGuess;
				}
				else if(userGuess < randomGeneratedNum) {
					System.out.println("Your guess is too low");
					lowGuess = userGuess;
				}
				System.out.println("Enter the next guess between " + lowGuess + " and " + highGuess);
				userGuess=input.nextInt();
				while(userGuess < lowGuess || userGuess > highGuess) {
					RNG.inputValidation(userGuess, lowGuess, highGuess);
					
					userGuess=input.nextInt();
				}
				if(userGuess >= lowGuess && userGuess <=highGuess){
					RNG.inputValidation(userGuess, lowGuess, highGuess);
					
				}
				guess++;
			}
			if(userGuess == randomGeneratedNum) {
				System.out.println("Congratulations! You guessed the number correctly!");
			}
			input.nextLine();
			System.out.println("Try again? (yes/no)");
			reply = input.nextLine();
			
		}while(reply.contains("yes"));
		
System.out.println("Thanks for playing...");
		}
	}



	


