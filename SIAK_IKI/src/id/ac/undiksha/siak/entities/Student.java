package id.ac.undiksha.siak.entities;
import id.ac.undiksha.organization.*;


public class Student extends Human{
	private String nim;
	private StudyProgram studyProgram;
	
	public Student (String name, String nim, String studyProgramCode, String studyProgramName, String address, boolean gender,  String email){
		super(name, address, gender, email);
		this.nim = nim;
	}
	public void printAllInfo() {
		System.out.println("NIM		: "				+ this.nim);
		System.out.println("Name		: "				+ this.name);
		System.out.println("Address		: "			+ this.address);
		System.out.println("Study Program	: "	+ this.getStudyProgram().setStudyProgramCode(studyProgramCode));
		System.out.println("Study Program	: "	+ this.getStudyProgram().setStudyProgramName(studyProgramName));
		System.out.println("Department	: "		+ this.department);
		System.out.println("Faculty		: "			+ this.faculty);
			
		System.out.println("Gender		: "	+
					(gender ? "Male":"Female"));
		System.out.println("");
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public StudyProgram getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}
	
}
