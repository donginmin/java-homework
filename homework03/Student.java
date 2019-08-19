package homework03;

import java.util.Scanner;

public class Student {
	public String getAc(String op, int a, int b, int eval) {

		
		switch (op) {
		case "+": eval = a+b;			
		break;
		case "-": eval = a-b;	
		break;
		case "*": eval = a*b;	
		break;
		case "/": eval = a/b; 
		break;
		}

		
		String result = String.format("%d %s %d = %d",a, op ,b, eval);		
		
		return result;
		
	}


	public String getBmi(String name,double weight,double tall) {
		double bmi = weight/(tall*tall);
		String eval = "";
		
		if(bmi > 30.0) {
			eval="고도비만";
		}else if(bmi > 25.0) {
			eval="바먼";
		}else if(bmi > 23.0) {
			eval="고도비만";
		}else if(bmi > 18.5) {
			eval="정상";
		} else {
			eval="저체중";
		}
		String result = String.format("%s님은  bmi는 %.1f %s 입니다", name, bmi, eval);
		return result;
	

	}
	public void getHowMuch() {
		int price = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in); 

		System.out.println("얼마에요?");
		price = scanner.nextInt();
		System.out.println("몇개 드릴까요?");
		num = scanner.nextInt();
		
		int total = price * num;
		int dc = total / 10;
		int finalPrice = total - dc;
		
		System.out.printf("그럼 총 금액은 %d 원 입니다.\n",total);
		System.out.printf("할인 금액은 %d 원 입니다.\n",dc);
		System.out.printf("최종 금액은 %d 원 입니다.\n",finalPrice);
	}
	public String getJoin(String id, String password, String name, String birth, String blood, double tall, double weight) {

		int temp=Integer.parseInt(birth.substring(1,4));
		String checkAudlt="";
		if(temp<=1999) { checkAudlt = "성년";
		}else { 
			checkAudlt = "미성년";
		}
		String result = String.format("=== 회원정보 === \n 아이디: %s \n 비밀번호:%s \n 이름: %s \n 생년월일: %s \n 성인여부: %s \n 키: %.1f \n 몸무게: %.1f \n 혈액형: %s",id,password,name,birth,checkAudlt,tall,weight,blood);
		return result;
		

	}
	public String getLeapYear(int year) {
		String result = "";
		if(year%4==0){
			result ="윤년";
			if(year%100==0) {
				result ="평년";
				if(year%400==0) {
					result ="윤년";
				}else {
					result ="평년";
				}
			}else {
				result ="윤년";
			}
		}else{
			result ="평년";
		}
		result =String.format("%s 입니다", result);
		return result;
		
	}
	
	public String getMonthEndDay(int month) {
		String eval = "";
		switch(month){
		case 1 : eval= "31일"; break;
		case 2 : eval= "29일"; break;
		case 3 : eval= "31일"; break;
		case 4 : eval= "30일"; break;
		case 5 : eval= "31일"; break;
		case 6 : eval= "30일"; break;
		case 7 : eval= "31일"; break;
		case 8 : eval= "31일"; break;
		case 9 : eval= "30일"; break;
		case 10 : eval= "31일"; break;
		case 11 : eval= "30일"; break;
		case 12 : eval= "31일"; break;
		}
		String result = String.format("%d월은 %s까지 입니다",month,eval);
		return result;
	}
	
	public String getPassOrFail(String name,String subjects[],int scores[]) {

		
		int sum = scores[0]+scores[1]+scores[2];
		int avg = sum /3 ;
		
		String passFail = "";
		if(avg >= 90) {
			passFail="장학생";
		}else if(avg >= 70) { 
			passFail = "합격";
		}else { passFail = "불합격";
		}
		
		String result = String.format("학생      국어     영어     수학     총점     평균      합격여부 \n================================================ \n %s   %d    %d    %d   %d   %d   %s", name, scores[0], scores[1],scores[2], sum , avg, passFail);	
		return result;
	}
	
	public String getRanking(double q, double w, double e) {
		if (q<w) {
	         if (q<e) {
	            if (w<e) {
	               //qwe
	               String result = String.format("1등 : A 선수기록  %.f 초 \n 2등 : B 선수기록  %.f 초 \n 3등 : C 선수기록  %.f 초", q, w, e);
	               return result;
	            } else {
	               //qew
		           String result = String.format("1등 : A 선수기록  %.f 초 \n 2등 : C 선수기록  %.f 초 \n 3등 : B 선수기록  %.f 초", q, e, w);
		           return result;
	            }
	         }
	         else {
	            //eqw
		           String result = String.format("1등 : C 선수기록  %.f 초 \n 2등 : A 선수기록  %.f 초 \n 3등 : B 선수기록  %.f 초", w, e, q);
		           return result;
	         }
	      } else if (w<q) {
	         if (w<e) {
	            if (q<e) {
	               //wqe
			           String result = String.format("1등 : B 선수기록  %.f 초 \n 2등 : A 선수기록  %.f 초 \n 3등 : C 선수기록  %.f 초", w, q, e);
			           return result;
	            }else {
	               //weq
			           String result = String.format("1등 : B 선수기록  %.f 초 \n 2등 : C 선수기록  %.f 초 \n 3등 : A 선수기록  %.f 초", w, e, q);
			           return result;
	            }
	         }
	         else {
	            //cba
		           String result = String.format("1등 : C 선수기록  %.f 초 \n 2등 : B 선수기록  %.f 초 \n 3등 : A 선수기록  %.f 초", e, w, q);
		           return result;
	         }
	      }
		return null;
	
	}
	public String getScoreCalc(String[] arry) {
		int num = Integer.parseInt(arry[0]);
		int  Acc= Integer.parseInt(arry[1]) ,loop = Integer.parseInt(arry[2]);
		String AccString= arry[3];
		
		
			if (arry[0].equals("-1")) {
				AccString = AccString.substring(0, AccString.length()-1);
				String result = String.format("현재까지의 누적값은 %s = %d점 이고, 평균은 %d점 입니다.", AccString , Acc , Acc/loop);
				return result;
			} else {
				String result;
			}
			return AccString;
			
	}

	public String getTax(String name, double income) {

				double rate = 9.7d;

				double tax = income * (rate*0.01);

				String result = String.format("연봉 %.0f만원을 받으시는 %s님께서 납부할 세금은 %.0f만원입니다.", income, name, tax);
				return result;

	}

	public String getTimeCalc(int num) {
		int  ss =0, mm = 0, hh =0, temp=0 ;

		// 초 구하기
		ss = num % 60 ;
		temp = num / 60 ; 

		//분 구하기
		mm = temp % 60 ;
		temp = temp / 60 ;

		// 시간 구하기 
		hh = temp;

		String result = String.format("입력하신 초단위 %d는 %d시간 %d분 %d초 입니다. ", num, hh, mm, ss);
		return result ;

	}

	
}	
