package id.ac.undiksha.siak.entities;

public abstract class Human {

	protected String name;
	protected String address;
	protected boolean gender;
	protected String department;
	protected String faculty;
	protected String email;
	
	public Human (String name, String address, boolean gender, String department, String faculty, String email){
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.department = department;
		this.faculty = faculty;
		this.email = email;
	}
	public void printAllInfo() {
		System.out.println("Name: "				+ this.name);
		System.out.println("Address: "			+ this.address);
		System.out.println("Department: "		+ this.department);
		System.out.println("Faculty: "			+ this.faculty);
		System.out.println("Email: "			+ this.email);
			
		System.out.println("Gender: "	+
					(gender ? "Male":"Female"));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
