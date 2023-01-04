package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.*;


public class Main {

	public static void main(String[] args) {
		Student std1 = new Student(
				"Budi",
				"123456",
				"Computer Science",
				"Code 1",
				"Singaraja",
				true,
				"Informatics",
				"FTK",
				"agung.kannha@undiksha.ac.id");
		std1.printAllInfo();
		Lecturer lec1 = new Lecturer(
				"Budi",
				"123456",
				"Singaraja",
				true,
				"Informatics",
				"FTK",
				"agung.kannha@undiksha.ac.id");
		lec1.printAllInfo();
	}

}
