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
		Regex mobile = (name) -> {
			boolean check = Pattern.matches("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$", name);
			if (check == true) {
				System.out.println("Mobile Number is Valid");
			} else
				System.out.println("Enter valid Mobile Number");
		};
		mobile.validName("91 8932435454");
	}

	}

