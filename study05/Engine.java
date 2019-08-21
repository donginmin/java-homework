package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		
		while(true) {
			System.out.println("0반 종료 1번 회원가입 2번 정보보기 3번아이디찾기 4번 BMI 5번 REAPORTCARD 6 TAX");

			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 :
				member = new Member();
				
				System.out.println("아이디");
				member.setId(scanner.next());
				System.out.println("pw");
				member.setPw(scanner.next());
				System.out.println("이름");
				member.setName(scanner.next());
				System.out.println("주민번호");
				member.setSsn(scanner.next());
				System.out.println("키");
				member.setHeight(scanner.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scanner.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scanner.next());
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				System.out.println("영어점수");
				member.setEng(scanner.nextInt());
				System.out.println("수학점수");
				member.setMath(scanner.nextInt());
				System.out.println("연봉");
				member.setSalary(scanner.nextInt());
				
				
				
				
				break;
			case 2 :
				System.out.println(member.toString());
				
				break;
			case 3 : 
				System.out.println("아이디 이름 입력하면 비번 알려줌");
				String searchId = scanner.next();
				String searchPw = scanner.next();
				
				if(searchId.equals(member.getName()) && searchPw.equals(member.getPw()) ) {
					
					System.out.printf("당신의 pw는 %s",member.getPw());
					
				}else {
					System.out.println("잘못입력하셨습니다");
					
				}
				
				break;
			case 4 : 
				System.out.println("bmi 구하기");
				System.out.println(service.getBmi(member)); 
				break;
			case 5 : 
				
				System.out.println("리포트카드");
				System.out.println(service.getReportCard(member));
				
				break;
			case 6 :
				System.out.println("세금");
				System.out.println(service.getTax(member));
				break;
			
			
			}
	
		}

	}

}
