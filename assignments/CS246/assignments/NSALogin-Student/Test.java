
import java.util.Scanner;

/**
 * The class Test is designed to use the classes {@ink User} and {@link NSALoginController} to
 * verify that they work correctly.
 *
 * @author Caleb Baird
 * @version 1.1
 */
public class Test {
	public static void main(String[] args) {
		// Promp user for a password
		System.out.println("Please enter a password. ");

		// Create a user with the passowerd provided.
		Scanner s = new Scanner(System.in);
		User user = new User(s.nextLine());

		// Print out the current state of the user's variables
		System.out.println("Initial password: " + user.getPassword());
		System.out.println("Initial salt: " + user.getSalt());
		System.out.println("Initial hashed password: " + user.getHashedPassword());

		// Generate the salt and the hashed password
		try {
			NSALoginController.hashUserPassword(user);
		}
		catch (Exception exception) {
			System.out.println("There was an exception");
		}

		// Verify that the salt and hashed password were added
		System.out.println("Password after hash: " + user.getPassword());
		System.out.println("Salt after hash: " + user.getSalt());
		System.out.println("Hashed password after hash: " + user.getHashedPassword());

		//Prompt the user for the password again.
		System.out.println("Please reenter your password.");
		user.setPassword(s.nextLine());

		// Verify that the new password matches the old password.
		try {
			System.out.println(NSALoginController.verifyPassword(user));
		}
		catch (Exception exception) {
			System.out.println("There was an exception");
		}
	}
}
