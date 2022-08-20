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
		Regex LastName = (name) -> {
			boolean check = Pattern.matches("^([A-Z]{1}+)[A-Za-z]{2,}$", name);
			if (check == true) {
				System.out.println("Firstname is Valid");
			} else
				System.out.println("Enter valid name");
		};
		LastName.validName("Dhananjay");
	}

	}

