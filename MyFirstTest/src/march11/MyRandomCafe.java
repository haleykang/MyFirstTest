package march11;

/*
 * 랜덤하게 음료를 추천하는 프로그램 작성
 * 
 * 아메리카노
 * 카페라떼
 * 바닐라라떼 
 * 카푸치노
 * 카페모카
 * 카라멜마끼아또 
 * 키위주스
 * 오렌지주스 
 * 
 */

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.Random;

public class MyRandomCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int no1 = 0;
		
		String user_input = "";
		char y_n = ' '; 
		int c_c = 0;
		
		String [] random_menu = new String [8];	// 메뉴 이름 저장 배열 
		
		random_menu[0] = "아메리카노";
		random_menu[1] = "카페라떼";
		random_menu[2] = "바닐라라떼";
		random_menu[3] = "카푸치노";
		random_menu[4] = "카페모카";
		random_menu[5] = "카라멜마끼아또";
		random_menu[6] = "키위주스";
		random_menu[7] = "바나나주스";
		
		try {
			MENU :
			do {
			no1 = random.nextInt(7);
			
			System.out.println("주문하실 음료로 " + random_menu[no1] + 
					" 어떠신가요?");
			System.out.print("주문을 원하시면 Y를, 다른 음료를 원하시면 N을 입력해주세요 : ");
			user_input = scanner.next();
			y_n = user_input.charAt(0);
			
		
			if(y_n == 'y' || y_n == 'Y' ) { 
				System.out.println(random_menu[no1] + "를 주문하셨습니다.");
				
				PAY :
				do {
				System.out.println("1.현금 결제 / 2. 카드 결제");
				System.out.print("결제 방법을 선택해주세요 : ");
				
				c_c = scanner.nextInt();
				
				if(c_c == 1) {
					System.out.println("현금 결제를 선택 하셨습니다.");
					System.out.println("현금을 투입해주세요.");
					break MENU;
				}
				else if(c_c == 2) {
					System.out.println("카드 결제를 선택 하셨습니다.");
					System.out.println("투입구에 카드를 넣어주세요.");
					break MENU;
				}
				else {
					System.out.println("잘못 선택 하셨습니다.");
					continue;
				}
				} while(true);
				
			}
			else if(y_n == 'n' || y_n == 'N') {
				continue;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			}while(true);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("오류가 발생했습니다.");
			System.out.println("가까운 직원에게 문의하시기 바랍니다.");
			
		}
		
		
		

	}

}
