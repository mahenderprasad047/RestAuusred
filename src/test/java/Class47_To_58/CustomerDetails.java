package Class47_To_58;

import java.util.List;

public class CustomerDetails 
{
	private int id;
	private String name;
	private long mobNumber;
	private List<Address> address;
	private List<String> country;
	private boolean hasPrime;
	private List<List<String>> services;
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}
	public Object getAddress() {
		return address;
	}
	public Object getCountry() {
		return country;
	}
	
	public void setCountry(List<String> country) {
		this.country = country;
	}

	public boolean isHasPrime() {
		return hasPrime;
	}
	public void setHasPrime(boolean hasPrime) {
		this.hasPrime = hasPrime;
	}
	public Object getServices() {
		return services;
	}

	public void setServices(List<List<String>> services) {
		this.services = services;
	}
	
	

}
