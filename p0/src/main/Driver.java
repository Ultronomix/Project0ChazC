import java.sql.Connection;
import java .sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		
		TheGame g = new TheGame();
		g.gameMenu();
		BaseballQuiz b = new BaseballQuiz();
		b.start();

	}

}
