package homework04_member;
public class MemberService {
	
	public String getBmi2(homework04_member.Member member) {
		String result = "";
		String eval = "";
		String name = member.getName();
		double tall = member.getTall();
		double weight = member.getWeight();
		
		double bmi = weight/(tall*tall);
		if(bmi>30) {
			eval = "고도비만";
		}else if(bmi>25) {
			eval="비만";
		}else if(bmi>23) {
			eval="과체중";
		}else if(bmi>18) {
			eval="정상";
		}else {
			eval="저체중";
		}
		result = String.format("bmi는 %.1f %s 입니다", bmi,eval);
		return result;
		
	}
	public String getReportCard2(homework04_member.Member member) {
		String result = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		
		int sum = kor+eng+math;
		int avg = sum /3 ;
		
		String passFail = "";
		if(avg >= 90) {
			passFail="장학생";
		}else if(avg >= 70) { 
			passFail = "합격";
		}else { passFail = "불합격";
		}
		
		result = String.format("학생      국어     영어     수학     총점     평균      합격여부 \n"
				+ "================================================ \n  "
				+ "%s   %d    %d    %d   %d   %d   %s", 
				name, kor, eng ,math, sum , avg, passFail);	
		
		return result;
	}
	public String getTax2(homework04_member.Member member) {
		String result = "";
		int salary = member.getSalary();
		String name = member.getName();
		
		
		double tax = salary * (9.7 / 100.0);
		
		result = String.format("연봉 %d만원을 받는 %s님의 세금은 %.1f만원 입니다.", salary, name, tax);
		
		return result;
	}

}