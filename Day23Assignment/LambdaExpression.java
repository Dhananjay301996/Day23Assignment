package Day23Assignment;
import java.util.regex.Pattern;

public class LambdaExpression {

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		Regex firstName = (name) -> {
			boolean check = Pattern.matches("^([A-Z]{1}+)[A-Za-z]{2,}$", name);
			if (check == true) {
				System.out.println("Firstname is Valid");
			} else
				System.out.println("Enter valid name");
		};
		firstName.validName("Dhananjay");
	}

	}

