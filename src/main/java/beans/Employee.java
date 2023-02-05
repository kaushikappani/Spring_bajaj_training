package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObject")
public class Employee {
	@Value("101")
	private int eid;
	private String name;
	private int salary;
	private Address address;
	private List<String> languages;
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee (){
		super();
		System.out.println("in default constructor");
	}
	public Employee(Address address) {
		this.address = address;
	}
	public Employee(Address address,int eid,String name,int salary) {
		super();
		System.out.println("in paramerter constructor");
		this.address = address;
		this.eid = eid;
		
		this.name = name;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", languages=" + languages + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
