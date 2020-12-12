package practice.cardcompany;

public class Company {
	
	// 기본 생성자
	private Company() {	}
	
	private static Company instance = null;
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();	// 인스턴스 생성
		}
		return instance;
	}
	
	// 이때 카드 발급..!!
	public Card createCard() {
		return Card.getInstance();
	}
	
	
}
