package homework;

import java.util.Scanner;

/*
 to. 개발자님
여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요

=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 


입력이 종료되면 ...아래처럼 보이게 해주세요


=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형
 */

public class Join {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String id = "", password="",name="",birth="",blood="";
		String checkAudlt="";
		double tall=0, weight =0;
		
		System.out.println("아이디를 입력하세요");
		id = scanner.next();
		System.out.println("비밀번호를 입력하세요");
		password=scanner.next();
		System.out.println("이름을 입력하세요");
		name=scanner.next();
		System.out.println("생년월일 입력하세요 ex) 1980-01-01");
		birth = scanner.next();
		
		System.out.println("키");
		tall = scanner.nextDouble();
		System.out.println("몸무게");
		weight = scanner.nextDouble();
		System.out.println("혈액형");
		blood = scanner.next();
		
		System.out.println("=== 회원정보 ===");
		int temp=Integer.parseInt(birth.substring(1,4));
		if(temp<=1999) { checkAudlt = "성년";
		}else { 
			checkAudlt = "미성년";
		}
		System.out.printf("아이디: %s \n 비밀번호:%s \n 이름: %s \n 생년월일: %s \n 성인여부: %s \n 키: %.1f \n 몸무게: %.1f \n 혈액형: %s",id,password,name,birth,checkAudlt,tall,weight,blood);
		

	}

}
