package homework04_member;

public class Member {
	private String name, id, password, ssn, blood;
	private double tall, weight;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
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
		return String.format(
				"회원정보: \n" + "이름 : %s \n" + "아이디 : %s \n" + "비번 : %s \n" + "주민번호  %s \n" + "혈액형 : %s \n" + "키: %.2f \n"
						+ "몸무게 : %.1f \n" + "국어점수: %d \n" + "수학점수: %d \n" + "영어점수 : %d \n" + "연봉 : %d \n",
				name, id, password, ssn, blood, tall, weight, kor, math, eng, salary);
	}


}