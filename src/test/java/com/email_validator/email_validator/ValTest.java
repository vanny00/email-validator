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
	public void testEmpty()
	{
		EmailValidator app = new EmailValidator();
		boolean success = app.validate(" ");
		assertFalse(success);
	}
	//String is 255 characters long			
		public void test2long()
	{
			EmailValidator app = new EmailValidator();
			boolean success = app.validate("JtpZAfBx4e0mWXtwibvMWCzQTgvSXybaYkXwl8soKgnseqaibf8yS2bvQRWrFmo0zxMsVLalcG1emUYbzXMOSjoK3x2fMF4tZbyyPZkjFZPPLWr5guTJ1LWQc0oi7IWh1qMU9muA3leOecOuhyZTwcGxLs4EGDBATJewfzoJRHMPwWB1AonSAvXyBE6H4MUieDI64L2P66UhIsKKKAMFtC58T85xHiI9WRunujVYs8yAZqopEBzbaZm8qtyhiUO");
			assertFalse(success);
	}
	
	
	
}
