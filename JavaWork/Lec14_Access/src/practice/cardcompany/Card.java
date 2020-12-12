package practice.cardcompany;

public class Card{
	
	// TODO
	// 필요한 변수, 메소드, 생성자 정의하기
	public static int num = 10000;
	private int cardNumber = 1000;
	
	// 기본생성자
	private Card() {
		cardNumber = num;
		System.out.println("카드 잘 발급되고 저장됨" + cardNumber);
	}
	
	
	private static Card instance = null;
	public static Card getInstance() {
		// 카드번호 1증가
		num++;

		// 인스턴스 생성!
		instance = new Card();	
		
		return instance;
	}

	// getter, setter
	public int getCardNumber() {return cardNumber;}
	public void setCardNumber(int cardNumber) {this.cardNumber = cardNumber;}
	
} // end class
