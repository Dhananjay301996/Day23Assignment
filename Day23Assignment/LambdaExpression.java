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
 * At least One capital latter and number and special character in password 
 */
	Regex password3 = (pass) -> {
		boolean check = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,24}$", pass);
		if (check == true) {
			System.out.println("password is Valid");
		} else
			System.out.println("Enter valid password ");
	};
	password3.pass1("Dhananjay@123");
	
	}
}
	

