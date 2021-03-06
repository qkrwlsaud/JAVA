package fruitProgram;

/*
 * 작성자 : 박진명
 * 수정일 : 2020.04.17
 * 수정내용 : 생성자로 변수초기와
 */

public class FruitBuyer {
	// 속성 : 변수

	// 멤버 변수 또는 인스턴스 변수
	// int myMoney = 10000; // 보유한 나의 돈
	// int numOfApple = 0; // 구매한 사과의 개수

	// 변수의 명시적 초기화 변경
	int myMoney;
	int numOfApple;

	FruitBuyer() { //생성자 
		myMoney=5000;
		numOfApple=0;
	}
	
	FruitBuyer(int money,int num){
		myMoney=money;
		numOfApple=num;
	}

	// 구매 기능 : 메서드
	// 1. 판매자 찾기
	// 2. 판매자에게 돈을 지불 지출한 돈 정의
	// 3. 판매자에게 돈을 주고 판매 요청 -> 사과 개수
	// 4. 사과의 개수를 증가
	// 5. 지출한 돈 만큼 나의 돈에서 차감

	// 반환 값이 없으므로 void, 참조변수는 해당 클래스로 만들어진 객체의 주소 값을 저장하는 변수
	void buyApple(FruitSeller seller, int money) { // int money는 구매자가 지불 할 돈

		int num = seller.saleApple(money); // 구매한 사과의 개수
		numOfApple += num; // 구매한 사과의 개수
		myMoney -= money; // 지출 한 나의 돈

	}

}
