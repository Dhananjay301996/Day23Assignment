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
		
/*
 * At least One capital latter and number in password 
 */
	Regex password2 = (pass) -> {
		boolean check = Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$", pass);
		if (check == true) {
			System.out.println("password is Valid");
		} else
			System.out.println("Enter valid password ");
	};
	password2.pass1("Dhananjay123");
	
	}
}
	

