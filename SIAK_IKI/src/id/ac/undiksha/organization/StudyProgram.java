package id.ac.undiksha.organization;

public class StudyProgram {
	private String studyProgramCode;
	private String studyProgramName;
	
	public StudyProgram(String studyProgramCode, String studyProgramName) {
		super();
		this.studyProgramCode = studyProgramCode;
		this.studyProgramName = studyProgramName;
	}

	public String getStudyProgramCode() {
		return studyProgramCode;
	}

	public void setStudyProgramCode(String studyProgramCode) {
		this.studyProgramCode = studyProgramCode;
	}

	public String getStudyProgramName() {
		return studyProgramName;
	}

	public void setStudyProgramName(String studyProgramName) {
		this.studyProgramName = studyProgramName;
	}
	
}
