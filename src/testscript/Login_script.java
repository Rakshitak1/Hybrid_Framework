package testscript;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import generic.Fetch_Data;
import generic.Generic_class;
import pom.Pom;

public class Login_script extends Generic_class
{

	@Test
	public void test1() throws FileNotFoundException 
	{
		String un = Fetch_Data.get_data("Sheet1",0,0);
		String pwd = Fetch_Data.get_data("Sheet1",0,1);
		Pom p = new Pom(driver);
		p.username(un);
		p.password(pwd);
		p.login_btn();
	}
}
