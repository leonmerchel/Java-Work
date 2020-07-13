package learning_java;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str2 = "";

		do {
//			try {
////				wipeConsole();
//				Runtime.getRuntime().exec("cls");
//			} catch(Exception e) {
//				System.out.println("ERROR HERE:" + e.toString());
//			}
			
			String nameA = "leon";
			String nameB = "rafal";
			String passwordA = "yeet101";
			String passwordB = "PassWord";
			System.out.println("Please type in your username.");
			String a = reader.nextLine();
			System.out.println("Please type in your password.");
			String b = reader.nextLine();

			if (a.equals(nameA) && b.equals(passwordA)) {
				System.out.println("You have succesfully signed into your account, " + nameA + " .");
				System.out.println("");
				System.out.println(
						"You have now gained access to the secret vault of big brain thoughts. ");
				System.out.println("");
				System.out.println("'Go to bed, you’ll feel better in the morning' is the human version of 'Did you turn it off and turn it back on again?'");
				System.out.println("The sinking of the Titanic must have been a miracle to the lobsters in the kitchen.");
				System.out.println("The word ‘Fat’ just looks like someone took a bite out of the first letter of the word ‘Eat’.");
				System.out.println("Your stomach thinks that all potatoes are mashed.");
				System.out.println("Nothings on fire, fire is on things.");
				System.out.println("");
				System.out.println("In that case, would you like to sign out? Answer 'yes' or 'no'.");
				str2 = reader.nextLine();

			} else if (a.equals(nameB) && b.equals(passwordB)) {
				System.out.println("You have succesfully signed into your account, " + nameB + " .");
				System.out.println("");
				System.out.println(
						"You have now gained access to the secret vault of big brain thoughts. ");
				System.out.println("");
				System.out.println("'Go to bed, you’ll feel better in the morning' is the human version of 'Did you turn it off and turn it back on again?'");
				System.out.println("The sinking of the Titanic must have been a miracle to the lobsters in the kitchen.");
				System.out.println("The word ‘Fat’ just looks like someone took a bite out of the first letter of the word ‘Eat’.");
				System.out.println("Your stomach thinks that all potatoes are mashed.");
				System.out.println("Nothings on fire, fire is on things.");
				System.out.println("");
				System.out.println("In that case, would you like to sign out? Answer 'yes' or 'no'.");
				str2 = reader.nextLine();

				
			} else {
				System.out.println("Username or password incorrect, please try again.");
			}
					} while (str2.equalsIgnoreCase("Yes"));

	}
	
	public static 
	void wipeConsole() throws AWTException{
        Robot robbie = new Robot();
        //shows the Console View
        robbie.keyPress(KeyEvent.VK_ALT);
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_Q);
        robbie.keyRelease(KeyEvent.VK_ALT);
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_Q);
        robbie.keyPress(KeyEvent.VK_C);
        robbie.keyRelease(KeyEvent.VK_C);

        //clears the console
        robbie.keyPress(KeyEvent.VK_SHIFT);
        robbie.keyPress(KeyEvent.VK_F10);
        robbie.keyRelease(KeyEvent.VK_SHIFT);
        robbie.keyRelease(KeyEvent.VK_F10);
        robbie.keyPress(KeyEvent.VK_R);
        robbie.keyRelease(KeyEvent.VK_R);
    }
}
