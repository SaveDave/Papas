package model;

public class Order
{
	protected String id;
	protected String name;
	protected String phoneNum;
	protected String location;
	protected String type;
	protected String qty;
	protected String size;
	protected String salespoint;
	protected String timestamp;
	protected String remtop;
	protected String addtop;
	protected double price;

	public String getId() {
	    return this.id;
	}

	public String getName() {
	    return this.name;
	}

	public String getPhoneNum() {
	    return this.phoneNum;
	}

	public String getLocation() {
	    return this.location;
	}

	
	public String getQty() {
	    return this.qty;
	}
	public String getAddtop()
	{
		return this.addtop;
	}
	public String getRemtop()
	{
		return this.remtop;
	}
	public double getPrice()
	{
		return this.price;
	}

	public String getSize() {
	    return this.size;
	}

	public String getSalespoint() {
	    return this.salespoint;
	}

	public String getTimestamp() {
	    return this.timestamp;
	}

	public void setId(String id) {
	    this.id = id;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
	    this.phoneNum = phoneNum;
	}

	public void setLocation(String location) {
	    this.location = location;
	}

	public void setType(String type) {
	    this.type = type;
	}

	public void setQty(String qty) {
	    this.qty = qty;
	}

	public void setSize(String size) {
	    this.size = size;
	}
	public void setAddtop(String addtop)
	{
		this.addtop =  addtop;
	}
	public void setRemtop(String remtop)
	{
		this.remtop =  remtop;
	}

	public void setSalespoint(String salespoint) {
	    this.salespoint = salespoint;
	}

	public void setTimestamp(String timestamp) {
	    this.timestamp = timestamp;
	}
	public String getType() {
	    return this.type;
	}

	
	
	
	public Order(String id, String name, String phoneNum, String location, String type,
		String qty, String size, String addtop, String remtop, String salespoint,String timestamp,double price){
		this.id= id;
		this.name= name;
		this.phoneNum= phoneNum;
		this.location= location;
		this.type= type;
		this.qty= qty;
		this.size= size;
		this.addtop=addtop;
		this.remtop=remtop;
		this.salespoint= salespoint;
		this.timestamp= timestamp;
		this.price=price;

	}


	public String toString(){
		String orders= this.id+"\n"+this.name+"\n"+phoneNum+"\n"+location+"\n"+type+"\n"+qty
		+"\n"+size+"\n"+salespoint+"\n"+timestamp;
		return orders;
	} 
}