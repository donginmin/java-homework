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
		Scanner scanner = new Scanner(System.in);
		
		String[] player = {"a","b","c"};
		double[] scores = new double[3];
		
	
		
		for(int i=0; i < scores.length; i++) {
			System.out.printf("%s의 기록를 입력하세요\n",player[i]);
			scores[i] = scanner.nextDouble();
		}
		
		System.out.println("###### 성적 랭킹 #######");
		
		//1등 2등 3등 순으로 정렬한느 방법을 모르겠습니다.
		

	}

}
