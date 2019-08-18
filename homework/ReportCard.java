package homework;

import java.util.Scanner;

public class ReportCard {
/*To. 개발자님

  성적표 프로그램 을 하나 개발해야 합니다.
 교수는 학생과 국어, 영어, 수학점수만 입력하면
 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
 오더는 다음과 같이 화면에 출력하라고 합니다.

학생           국어        영어        수학        총점        평균        합격여부
 =======================================================
 홍길동     90       90      90     270      90       (장학생)

 합격여부는 다음과 같다고 합니다.
 평균이 90점 이상이면 장학생
 0점 이상 90점미만 이면 합격
 70미만이면 불합격이라고 하네요.
 단) 평균에서 소수점이하는 절삭입니다.
 * 
 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] subjects = {"국어","영어","수학"};
		int[] scores = new int[3];
		int sum = 0;
		int avg = 0;
		String name = "";
		
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		
		for(int i=0; i < subjects.length; i++) {
			System.out.printf("%s 점수를 입력하세요\n",subjects[i]);
			scores[i] = scanner.nextInt();
		}
		
		sum = scores[0]+scores[1]+scores[2];
		avg = sum /3 ;
		
		String passFail = "";
		if(avg >= 90) {
			passFail="장학생";
		}else if(avg >= 70) { 
			passFail = "합격";
		}else { passFail = "불합격";
		}
		
		System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
		System.out.println("=======================================================");
		System.out.printf(" %s       %d      %d     %d      %d     %d        %s", name, scores[0], scores[1],scores[2], sum , avg, passFail);	


	}

}
