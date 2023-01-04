package id.ac.undiksha.siak.entities;

public class Staff extends Human{
	private String nip;
	
	public Staff (String name, String nip, String address, boolean gender, String department, String faculty, String email){
		super(name, address, gender, department, faculty, email);
		this.nip = nip;
	}
	public void printAllInfo() {
		System.out.println("NIP		: "				+ this.nip);
		System.out.println("Name		: "				+ this.name);
		System.out.println("Address		: "			+ this.address);
		System.out.println("Department	: "		+ this.department);
		System.out.println("Faculty		: "			+ this.faculty);
			
		System.out.println("Gender		: "	+
					(gender ? "Male":"Female"));
		System.out.println("");
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
}
