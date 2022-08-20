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
 *Last name 
 */
		System.out.println("Welcome to User Registration program");
		Regex Mail = (name) -> {
			boolean check = Pattern.matches("[a-zA-Z0-9]+[@]+[a-z]{2,5}[.][a-z]{2,4}", name);
			if (check == true) {
				System.out.println("Firstname is Valid");
			} else
				System.out.println("Enter valid name");
		};
		Mail.validName("Dhananjay123@gmail.com");
	}

	}

