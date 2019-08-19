package homework;

import java.util.Scanner;

/*
 * To. 개발자님

저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

라고 출력시켜주세요.

 */
public class Ranking {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("A 선수의 기록을 입력하세요");
	      double a = scan.nextDouble();
	      System.out.println("B 선수의 기록을 입력하세요");
	      double b = scan.nextDouble();
	      System.out.println("C 선수의 기록을 입력하세요");
	      double c = scan.nextDouble();
	      
	      System.out.println("###### 성적 랭킹 #######");

	      
			if (a<b) {
	         if (a<c) {
	            if (b<c) {
	               //abc
	               System.out.println("1등 : A 선수기록 (" + a + "초)");
	               System.out.println("2등 : B 선수기록 (" + b + "초)");
	               System.out.println("3등 : C 선수기록 (" + c + "초)");
	            } else {
	               //acb
	               System.out.println("1등 : A 선수기록 (" + a + "초)");
	               System.out.println("2등 : C 선수기록 (" + c + "초)");
	               System.out.println("3등 : B 선수기록 (" + b + "초)");
	            }
	         }
	         else {
	            //cab
	            System.out.println("1등 : C 선수기록 (" + c + "초)");
	            System.out.println("2등 : A 선수기록 (" + a + "초)");
	            System.out.println("3등 : B 선수기록 (" + b + "초)");
	         }
	      } else if (b<a) {
	         if (b<c) {
	            if (a<c) {
	               //bac
	               System.out.println("1등 : B 선수기록 (" + b + "초)");
	               System.out.println("2등 : A 선수기록 (" + a + "초)");
	               System.out.println("3등 : C 선수기록 (" + c + "초)");
	            }else {
	               //bca
	               System.out.println("1등 : B 선수기록 (" + b + "초)");
	               System.out.println("2등 : C 선수기록 (" + c + "초)");
	               System.out.println("3등 : A 선수기록 (" + a + "초)");
	            }
	         }
	         else {
	            //cba
	            System.out.println("1등 : C 선수기록 (" + c + "초)");
	            System.out.println("2등 : B 선수기록 (" + b + "초)");
	            System.out.println("3등 : A 선수기록 (" + a + "초)");
	         }
	      }
			
	}
	public String getScoreCalc(String[] arry) {
		
	}

}
