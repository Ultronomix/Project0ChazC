
import java.util.ArrayList;
import java.util.Scanner;


public class TheGame {
	
	public ArrayList <String> lad;	
		
	public void gameMenu () {
		int choice2;
		String[] lineup = {"Mookie Betts", "Trea Turner", "Freddie Freeman","Justin Turner", "Max Muncy", "Chris Taylor", "Cody Bellinger", "Trayce Thomspon", "Will Smith"};
			
		
				
			
				
				System.out.println("G A M E  M E N U");
				System.out.println("======================");
				System.out.println("Press 1 for Dodgers Lineup");
				System.out.println("Press 2 to play ball!");
				System.out.println("press 3 to exit program");
				System.out.println("======================");
				System.out.print("Enter choice: ");
				
			Scanner scan2 = new Scanner(System.in);
			  
			choice2 = scan2.nextInt();
			  
			while(choice2 !=3) {
				if (choice2 == 1) {
					System.out.println("==T H E  D O D G E R S==");
					System.out.println("======================");
					System.out.println("                      ");
					for (String i : lineup) {
						System.out.println(i);
						System.out.println("                      ");
						
					}
				
				}
				else if (choice2 == 2) {
					
					BaseballQuiz b = new BaseballQuiz();
					b.start();
				}
					gameMenu();
			
			  
			choice2 = scan2.nextInt();
			}	
		System.out.println("Goodbye!");
		System.exit(0);
			
	}
	
			
	     
	}
	

