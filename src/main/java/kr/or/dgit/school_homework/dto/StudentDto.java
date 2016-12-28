package kr.or.dgit.school_homework.dto;

public class StudentDto {
	private int stdNo;
	private int kor;
	private int eng;
	private int math;
	private String stdName;
	
		
	
	/*getter method*/
	public int getStdNo() {
		return stdNo;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getStdName() {
		return stdName;
	}
	
	
	/*setter method*/
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
		public void setEng(int eng) {
		this.eng = eng;
	}
		public void setMath(int math) {
		this.math = math;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	
}
