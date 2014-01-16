package model;
public class Errors
{
	private boolean nameerror = false;
	private boolean phoneerror = false;
	private boolean locationerror = false;
	private String name = " ";
	private String  phone = " ";
	private String  location = " ";

	public boolean getNameError()
	{
		return this.nameerror;
	}
	public void setNameError(boolean error)
	{
		nameerror = error;
	}
	public boolean getLocationError()
	{
		return this.locationerror;
	}
	public void setLocationError(boolean error)
	{
		locationerror = error;
	}
	public void setPhoneError(boolean error)
	{
		phoneerror = error;
	}
	public boolean getPhoneError()
	{
		return this.phoneerror;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLocation()
	{
		return this.location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}