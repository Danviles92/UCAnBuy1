package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService implements ValidationServiceInterface{
	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
        @Override
	public boolean passwordLengthIsCorrect(String password)
	{
            if((password.length() < 6) || (password.length() > 12))
		return false;
            
            return true;
	}
	
        @Override
	public boolean emailLengthIsCorrect(String email)
	{
            if(email.length() > 50)
            	return false;
		
            return true;
	}
	
        @Override
	public boolean equalStrings(String string1, String string2)
	{
            if(string1.equals(string2))
                return true;
		
            return false;
	}
	
	/**
     * Validate given email with regular expression.
     * 
     * @param email
     *            email for validation
     * @return true valid email, otherwise false
     */
    @Override
    public boolean validateEmail(String email)
    {
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        
        return matcher.matches();
    }
}
