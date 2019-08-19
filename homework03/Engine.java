package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		while(true) {
			System.out.println("0.종료 1.사칙연산 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ScaoreCalc 10.Tax 11.TimeCalc");
			switch(scanner.nextInt()) {
			case 0 : ; return;
			case 1:
				System.out.println("사칙 연산 프로그램");
				String op="";
				int a=0;
				int b=0;
				int eval =0;

				System.out.println("사칙연산을 선택하세요");
				System.out.println("+ - * /");
				op = scanner.next();
				System.out.println("첫번째 수를 입력하세요");
				a = scanner.nextInt();
				System.out.println("두번째 수를 입력하세요");
				b = scanner.nextInt();
				String result = student.getAc(op,a,b,eval);
				System.out.println(result);
				
				 
			break;
			case 2: 
				System.out.println("비만 측정 프로그램입니다");
				String name = "";
				double weight = 0;
				double tall = 0;
				System.out.println("이름을 입력하세요");
				name = scanner.next();
				System.out.println("몸무게를 입력하세요");
				weight = scanner.nextInt();
				System.out.println("키를 m로 입력하세요 ex) 176cm -> 1.76m ");
				tall = scanner.nextDouble();
				result = student.getBmi(name,weight,tall);
				System.out.println(result); 
			
			break;
			case 3:
				System.out.println("HowMuch"); 
				student.getHowMuch();
	
			break;
			case 4:
				String id = "", password="", birth="",blood="";
				name="";
				String checkAudlt="";
				tall=0; 
				weight =0;
				
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
				
				result = student.getJoin(id, password, name, birth, blood, tall, weight);
				System.out.println(result);
				
			break;
			case 5:
				int year=0;
				result= "";
				System.out.println("년도를 입력하세요");
				year = scanner.nextInt();
				
				result = student.getLeapYear(year);
				System.out.println(result);
				
				
				
			break;
			case 6:
				int month = 0;
				System.out.println("달을 입력하세요");
				month = scanner.nextInt();
				
				result = student.getMonthEndDay(month);
				System.out.println(result);
				
			break;
			case 7:
				String[] subjects = {"국어","영어","수학"};
				int[] scores = new int[3];

				name = "";
				
				System.out.println("이름을 입력하세요");
				name = scanner.next();
				
				for(int i=0; i < subjects.length; i++) {
					System.out.printf("%s 점수를 입력하세요\n",subjects[i]);
					scores[i] = scanner.nextInt();
				}
				result = student.getPassOrFail(name, subjects, scores);
				System.out.println(result);
				
			break;
			case 8:
				double[] records = new double[3];
				System.out.println("기록측정");
				System.out.print("시간입력>");
				for(int i = 0; i < 3; i++) {
					records[i] = scanner.nextDouble();
				}
				result = student.getRank(records);
				
				System.out.println(result);

			break;
			case 9:
				int count = 0;
				int[] numbers = null;
				while(true) {
					
					System.out.println("숫자입력 (-1종료)");
					int sc = scanner.nextInt();
					if(sc == -1) {
						break;
					}
					int[] temp = new int[count];
					for(int i = 0; i < count ; i++) {
						temp[i] = numbers[i];
						
					}
					count ++;
					numbers = new int[count];
					for(int i = 0 ;i <count-1 ; i++) {
						numbers[i] = temp[i];
						
					}
					numbers[count-1] = sc;
					
					
				}
				result = student.getScoreCalc(numbers);
				
				
				
				System.out.println(result);
			
			case 10:
				System.out.println("세금계산기");
				System.out.println("이름>");
				name = scanner.next();
				System.out.println("연봉>");
				int income = scanner.nextInt();
				result = student.getTax(name, income);
				System.out.println(result);
			break;
			
			case 11:
				System.out.println("시간계산기");
				System.out.println("시간입력:");
				int time = scanner.nextInt();
				result = student.getTimeCalc(time);
				
				System.out.println(result);
			
			break;
				
			}
			
			
		}
		

	}

}