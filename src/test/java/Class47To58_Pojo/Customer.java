package Class47To58_Pojo;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private long mobNumber;
	private List<Address> address;
	private List<String> country;
	private boolean hasPrime;
	private List<FavPlace> Services;

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public void setCountry(List<String> country) {
		this.country = country;
	}

	public boolean isHasPrime() {
		return hasPrime;
	}

	public List<Address> getAddress() {
		return address;
	}

	public List<String> getCountry() {
		return country;
	}

	public List<FavPlace> getServices() {
		return Services;
	}

	public void setHasPrime(boolean hasPrime) {
		this.hasPrime = hasPrime;
	}

	public void setServices(List<FavPlace> services) {
		Services = services;
	}

}