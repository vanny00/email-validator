package com.email_validator.email_validator;
import junit.framework.TestCase;

public class ValTest extends TestCase
{
	public void testGmail()
	{
		EmailValidator app = new EmailValidator();
		boolean success = app.validate("van@here.com");
		assertTrue(success);
	}
	
	public void testBmail()
	{
		EmailValidator app = new EmailValidator();
		boolean success = app.validate("van");
		assertFalse(success);
	}
	
	
	
}
