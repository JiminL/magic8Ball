package magic8Ball;
import java.util.Random;

public class Magic8 {

	public static void main(String[] args) {
		String question = "Do I look good today?";
		System.out.println(question);
		
		// Fill the array with at least five potential answer
		
		String[] answers = new String[9];
		
			answers [0] = "Certainly";
			answers [1] = "As I see it, yes";
			answers [2] = "Hmmm...";
			answers [3] = "Cannot tell you now";
			answers [4] = "Really, no!";
			answers [5] = "Ask again later";
			answers [6] = "Better not tell you now";
			answers [7] = "Error :-)";
			answers [8] = "Ehh";
			
			
			int random = (int) (Math.random()*9);
			
			
		// Choose one of the answers at random, then print it
		System.out.println("Magic 8 ball says: " + answers[random] );

	}

}
