import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class BaseballQuiz {

private ArrayList<Question> questionSet;
	
public boolean gameOver;	
public int inning = 9;
public int strikes = 3;
public int scoreOpponent = 4;
public int numCorrect = 0;
public int outs;

public BaseballQuiz() {
		
	    questionSet = new ArrayList<Question>();
	    
		String q = "Which legendary Dodgers pitcher wore the number 55?";
	    String[] a = {"Orel Hershiser", "Don Drysdale", "Sandy Koufax", "Eric Gagne"};
	    
	    // must reuse variable every time string array is created and new keyword
	    // constants can only be used during init.
	    
		questionSet.add(new Question(q, a, "Orel Hershiser"));
		
		q = "On April 18, 1958, The Dodgers baseball club, formerly from the Flatbush section of Brooklyn in New York, played their first game on the Pacific Coast as the Los Angeles Dodgers. What venue served as the site for the opening day game?";
	    a = new String[] {"Dodger Stadium", "Los Angeles Coliseum", "A High School Baseball Field", "none of these!"};
	    
	    questionSet.add(new Question(q, a, "Los Angeles Coliseum"));
	    
	    q = "Which former Red Sox player wore the number 99 for the Dodgers in 2009?";
	    a = new String[] {"Hanley Ramirez", "Alex Verdugo", "Mookie Betts", "Manny Ramirez"};
	    
	    questionSet.add(new Question(q, a, "Manny Ramirez"));
	    
	    q = "Who was the manager of the LA Dodgers for the 2008 season?";
	    a = new String[] {"Don Mattingly", "Dave Roberts", "Joe Torre", "Tommy Lasorda"};
	    
	    questionSet.add(new Question(q, a, "Joe Torre"));
	    
	    q = "Who did the Dodgers play in the first regular season home game at Ebbets Field? ~First ever Dodger game~";
	    a = new String[] {"The Philadelphia Phillies", "The Boston Braves", "The New York Yankees", "The Detroit Tigers"};
	    
	    questionSet.add(new Question(q, a, "The Philadelphia Phillies"));
	    
	    q = "When right fielder, Shawn Green, broke the Dodgers franchise record, in 2001, for most homeruns in a season, whose record did he beat?";
	    a = new String[] {"Gary Sheffield", "Steve Garvey", "Mike Piazza", "Tommy Davis"};
	    
	    questionSet.add(new Question(q, a, "Gary Sheffield"));
	    
	    q = "Dodger Stadium is located in which Los Angeles park?";
	    a = new String[] {"Bluff Park", "Exposition Park", "Elysian Park", "Petco Park"};
	    
	    questionSet.add(new Question(q, a, "Elysian Park"));
	    
	    q = "Which former Brooklyn Dodger had his number retired throughout the Major Leagues in 1997?";
	    a = new String[] {"Sandy Koufax", "Duke Snider", "Pee Wee Reese", "Jackie Robinson"};
	    
	    questionSet.add(new Question(q, a, "Jackie Robinson"));
	    
	    q = "This man is a historic sportscaster. He broadcasted the Dodger games in addition to many other sporting events for over 50 years. Who is this icon?";
	    a = new String[] {"Harry Caray", "Jerry Dogget", "Harry Calas", "Vin Scully"};
	    
	    questionSet.add(new Question(q, a, "Vin Scully"));
	    
	    q = "What Dodger set a World Series record when he hit two pinch hit home runs in the 1959 World Series?";
	    a = new String[] {"Don Demeter", "Carl Furillo", "Chuck Essegian","Norm Larker"};
	    
	    questionSet.add(new Question(q, a, "Chuck Essegian"));
	    
	    q = "What manager transitioned the team from Brooklyn to Los Angeles?";
	    a = new String[] {"Leo Durocher", "Tommy Lasorda", "Walter Alston", "Chuck Dressen"};
	    
	    questionSet.add(new Question(q, a, "Walter Alston"));
	    
	    q = "What Dodger of the 20th Century has the highest career strikeout ratio per nine innings pitched with at least two full seasons with the Dodgers?";
	    a = new String[] {"Dazzy Vance", "Sandy Koufax", "Hideo Nomo", "Bill Singer"};
	    
	    questionSet.add(new Question(q, a, "Hideo Nomo"));
	    
	    q = "The Dodgers franchise retired the number 19 in my honor. Who am I?";
	    a = new String[] {"Jim Gilliam", "Don Sutton", "Wes Parker", "Don Drysdale"};
	    
	    questionSet.add(new Question(q, a, "Jim Gilliam"));
	    
	    q = "In 1994 I was voted the top Rookie in the National League. Who am I?";
	    a = new String[] {"Mike Piazza", "Raul Mondesi", "Eric Karros", "Hideo Nomo"};
	    
	    questionSet.add(new Question(q, a, "Raul Mondesi"));
	    
	    q = "Which one of these players had the most RBIs in a single season for the Dodgers?";
	    a = new String[] {"Duke Snider", "Roy Campanella", "Mike Piazza", "Tommy Davis"};
	    
	    questionSet.add(new Question(q, a, "Tommy Davis"));
	    
	    q = "Which of these Dodgers pitchers led the NL in strikeouts for seven consecutive seasons?";
	    a = new String[] {"Sandy Koufax", "Don Drysdale", "Dazzy Vance", "Orel Hershiser"};
	    
	    questionSet.add(new Question(q, a, "Dazzy Vance"));
	    
	    
	    
	    Collections.shuffle(questionSet, new Random());


}

public void start() {
	String [] dueUp = {"Trea Turner", "Freddie Freeman", "Justin Turner", "Max Muncy", "Chris Taylor", "Cody Bellinger", "Trayce Thomspon", "Will Smith"};
	Scanner scan = new Scanner(System.in);
	int numCorrect = 0;
			

	for (int question = 0; question < questionSet.size(); question++) {
		System.out.println(questionSet.get(question).getQuestion());
		int numChoices = questionSet.get(question).getChoices().size();
		// choices from questions in questionSet
		for (int choice = 0; choice < numChoices; choice++) {
			System.out.println((choice + 1) + "; " + questionSet.get(question).getChoices().get(choice));
		}
		int playerAnswer = scan.nextInt();
		ArrayList<String> choiceSet = questionSet.get(question).getChoices();
		String correctAnswer = questionSet.get(question).getAnswer();
		int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
		
	
		if(playerAnswer == correctAnswerIndex + 1) {
			numCorrect++;
			System.out.println("HOOOOOME RUUUUUN!!!! You scored " + numCorrect + " run(s)!");
			resetStrikes();
			
			
		}else {
		strikes++;
		System.out.println("STRIIIIIKE");
		}
		
		
		if(numCorrect == 1 && outs == 0) {
			System.out.print("Now Batting: ");
			System.out.println(dueUp[0]);
		}
		if(numCorrect == 2 && outs == 0) {
			System.out.print("Now Batting: ");
			System.out.println(dueUp[1]);
		}
		if(numCorrect == 3 && outs == 0) {				
			System.out.print("Now Batting: ");
			System.out.println(dueUp[2]);
		}
		if(numCorrect == 4 && outs == 0) {
			System.out.print("Now Batting: ");
			System.out.println(dueUp[3]);
		}
		if(numCorrect == 1 && outs == 1) {
			System.out.print("Now Batting: ");
			System.out.println(dueUp[1]);
		}
		if(numCorrect == 2 && outs == 1) {
			System.out.print("Now Batting: ");
			System.out.println(dueUp[2]);
		}
			if(numCorrect == 3 && outs == 1) {
				System.out.print("Now Batting: ");
				System.out.println(dueUp[3]);
			
		}
			if(numCorrect == 4 && outs == 1) {
				System.out.print("Now Batting: ");
				System.out.println(dueUp[4]);
			
		}
			if(numCorrect == 1 && outs == 2) {
				System.out.print("Now Batting: ");
				System.out.println(dueUp[2]);
			
		}
			if(numCorrect == 2 && outs == 2) {
				System.out.print("Now Batting: ");
				System.out.println(dueUp[3]);
			}
			if(numCorrect == 3 && outs == 2) {
				System.out.print("Now Batting: ");
				System.out.println(dueUp[4]);
			}
			if(numCorrect == 4 && outs == 2) {
				System.out.print("Now Batting: ");
				System.out.println(dueUp[5]);
			}
		
	
	if(strikes == 3) {
	outs++;
	System.out.println("OUT: " + outs + ": Next Batter " );
	
	resetStrikes();
	}
	
	
	
	if( outs == 3) {
		
		System.out.println("THATS THE GAME!!!");
		System.out.println("GIANTS WIN :( BOOOOOOO GIANTS STINK!!! :P ");
		System.out.println("                          ");
		System.out.println("                          ");
		System.out.println("                          "); 
		System.out.println("FINAL: Dodgers: " + numCorrect + ", Giants: " + scoreOpponent);
		System.out.println("                          ");  
		TheGame g = new TheGame();
		g.gameMenu();
		
	}
	
	
if (numCorrect == 5) {
	 System.out.println("THATS THE GAME!!!");
	 System.out.println(" ! ! ! DODGERS WIIIIIIIIIIIN!!!! I LOOOOOOOOOOVE LA! ! ! ");
	 System.out.println("                          ");
	 System.out.println("                          ");
	 System.out.println("                          "); 
	 System.out.println("                          ");  
	 System.out.println("FINAL: Dodgers: " + numCorrect + ", Giants: " + scoreOpponent); 
	 System.out.println("                      ");
	 System.out.println("                      ");
	 TheGame g = new TheGame();
		g.gameMenu();
}

}
	
	
	start();

}
	

	


public void resetStrikes(){

strikes = 0;

}

}


