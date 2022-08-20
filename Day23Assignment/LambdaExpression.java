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
 * At least One capital latter password 
 */
	Regex password1 = (pass) -> {
		boolean check = Pattern.matches("[a-z]{8,12}", pass);
		if (check == true) {
			System.out.println("password is Valid");
		} else
			System.out.println("Enter valid password ");
	};
	password1.pass1("Dhananjay");
	
	}
}
	

