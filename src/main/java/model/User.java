package model;
import java.util.GregorianCalendar;




public class User
{
	public  String  name,phone,location, type,size,quantity,addtop,remtop,salespoint,timestamp;
	public User(String name, String phone,String location,
		String type, String size, String quantity, String addtop, String remtop, String salespoint, String timestamp)
	{
		
		this.name = name;
		this.phone = phone;
		this.location = location;
		this.type = type;
		this.size =  size;
		this.quantity = quantity;
		this.addtop=addtop;
		this.remtop=remtop;
		this.salespoint = salespoint;
		this.timestamp = timestamp;

	}
	public User(String name, String phone,String location,
		String type, String size, String quantity, String addtop, String remtop,  String salespoint)
	{
		this(name,phone,location,type,size,quantity,addtop,remtop,salespoint, new GregorianCalendar().getTime().toGMTString());
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setPhone()
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getLocation()
	{
		return this.location;
	}
	public String getAddtop()
	{
		return this.addtop;
	}
	public String getRemtop()
	{
		return this.remtop;
	}
	public String getSize()
	{
		return this.size;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getType()
	{
		return this.type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setQuantity(String quantity)
	{
		this.quantity = quantity;
	}
	public String getQuantity()
	{
		return this.quantity;
	}
	public void setAddtop(String addtop)
	{
		this.addtop =  addtop;
	}
	public void setRemtop(String remtop)
	{
		this.remtop =  remtop;
	}
	public void setSalesPoint(String salespoint)
	{
		this.salespoint =  salespoint;
	}
	public String getSalesPoint()
	{
		return this.salespoint;
	}
	public void setTimeStamp(String timestamp)
	{
		this.timestamp = timestamp;
	}
	public String getTimeStamp()
	{
		return this.timestamp;
	}

	
	public String toString()
	{
		return "your name is "+this.name+" this is the time it got stored "+ timestamp;
	}

}
