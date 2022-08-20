package Day23Assignment;
import java.util.regex.Pattern;

/**
 * Regex program code with help of Lambda expressions
 * @author HP
 *
 */
public class LambdaExpression {

	public static void main(String[] args) {
/*
 *password
 */
		System.out.println("Welcome to User Registration program");
		Regex password = (name) -> {
			boolean check = Pattern.matches("[a-z]{8,12}", name);
			if (check == true) {
				System.out.println("password is Valid");
			} else
				System.out.println("Enter valid password ");
		};
		password.validName("Dhananjay");
	}

	}

