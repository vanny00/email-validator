package com.email_validator.email_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator 
{
	/* researched http://stackoverflow.com/questions/8204680/java-regex-email
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public  boolean validate(String email) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
		        return matcher.find();
		}*/
	boolean validate(String email){
		if(email.contains("@") && email.contains(".")
				&& email.length()<255 && !email.contains(" "))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
}
