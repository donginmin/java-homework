package study05;

public class Member {
	
	private String name, id, pw, ssn, blood;
	private double weight, height;
	private int kor, eng, math, salary;
	
	

	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getPw() {
		return pw;
	}




	public void setPw(String pw) {
		this.pw = pw;
	}




	public String getSsn() {
		return ssn;
	}




	public void setSsn(String ssn) {
		this.ssn = ssn;
	}




	public String getBlood() {
		return blood;
	}




	public void setBlood(String blood) {
		this.blood = blood;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}




	public int getKor() {
		return kor;
	}




	public void setKor(int kor) {
		this.kor = kor;
	}




	public int getEng() {
		return eng;
	}




	public void setEng(int eng) {
		this.eng = eng;
	}




	public int getMath() {
		return math;
	}




	public void setMath(int math) {
		this.math = math;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", ssn=" + ssn + ", blood=" + blood + ", weight="
				+ weight + ", height=" + height + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", salary="
				+ salary + "]";
	}



}
