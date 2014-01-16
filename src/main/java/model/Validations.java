package model;
import model.Errors;
public class Validations
{
	Errors e = new Errors();
	public boolean isValidName(String name)
	{
		if (name.matches("^[\\p{L} .'-]+$")) 
		{
			e.setNameError(false);
			return true;
		}
		else 
		{
			e.setNameError(true);
			return false;
		}
	}
	public boolean isValidPhone(String phone)
	{
		if (phone.matches("[0-9]{10,13}"))
		{
			e.setPhoneError(false);
			return true;
		}
		else
		{
			e.setPhoneError(true);
			return false;
		}
	}
	public boolean isValidLoaction(String location)
	{
		if (location.matches("^[0-9\\p{L} ,.'-]+$")) 
		{
			e.setLocationError(false);
			return true;
		}
		else
		{
			e.setLocationError(true);
			return false;
		}
	}
	public boolean validate(String name,String phone,String location)
	{
		boolean error1 = isValidName(name);
		boolean error2 = isValidPhone(phone);
		boolean error3 = isValidLoaction(location);
		e.setName(name);
		e.setPhone(phone);
		e.setLocation(location);
		if (error1 && error2 && error3) 
		{
			return true;
		}
		else
		{

			return  false;
		}
		
	}
	public boolean checkLogin(String idnumber, String password)
	{
		String USERNAME = "root";
		String PASSWORD = "";
		String M_CONN_STRING = "jdbc:mysql://localhost/pizza";
		String query = "select idnumber, password from user";
		query = query +" WHERE ";
		query = query +" idnumber="+idnumber;
		query = query +" AND password="+password;
		return true;
	}
	public Errors getErrors()
	{
		return e;
	}
}