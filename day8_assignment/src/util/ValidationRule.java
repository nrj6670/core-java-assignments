package util;

import java.util.Date;
import com.app.exception.CustomerHandlingException;
import static com.app.customer.Customer.s;
import java.text.ParseException;


public class ValidationRule{
	
	
	public static void validateCredentials(String email, String password, double regAmnt, Date dob) throws CustomerHandlingException, ParseException {
		if(email.indexOf('@') == -1 || email.indexOf(".com") == -1) {
			throw new CustomerHandlingException("Invalid email. Must contain '@' and '.com' ");
		}
		
		if(regAmnt % 500 != 0) {
			throw new CustomerHandlingException("Registration amount should be multiple of 500");
		}
		
		if(password.length() < 4 || password.length() > 10) {
			throw new CustomerHandlingException("Password must be contains atleast 4 and atmost 10 characters");
		}
		
		if(dob.after(s.parse("01-01-1995"))) {
			throw new CustomerHandlingException("Date of birth must be before 1 Jan 1995");
		}
    }
}
