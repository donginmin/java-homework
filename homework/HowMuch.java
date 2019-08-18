package homework;

import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price = 0;
		int num = 0;
		
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

}
