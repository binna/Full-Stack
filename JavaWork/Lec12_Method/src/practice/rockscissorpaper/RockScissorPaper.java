package practice.rockscissorpaper;

import java.util.Scanner;
/*
	 간단한 가위, 바위, 보 게임을 만듭니다.
	(실행화면은 다음 페이지에)
	
	showMenu / inputChoice / displayChoice
	/ computeResult  메소드들을 어떻게 
	구현해볼수 있을까요? 
	
	
	main() 메소드는 오른쪽과 같이 구성하고
	변경하지 않는 상태에서
	나머지 메소드들을 구현하여 완성해보세요
	
	필요하다면 클래스의 멤버변수등을 추가해도
	좋습니다
 */
public class RockScissorPaper {

	// 멤버변수가 필요하면 작성하세요.
	
    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임");
        Scanner sc = new Scanner(System.in);
        
        while(true){
            showMenu(); // 메뉴보여주기
 
            int userChoice = inputChoice(sc); // 사용자 입력

            if(userChoice < 0 || userChoice > 3) {
            	System.out.println("잘못입력했습니다.\n다시 입력해주세요~");
            	
            } else {
            	if(userChoice == 0){ break; }	// 0 이면 종료
            	
            	// 컴퓨터 선택:   1 - 가위,  2- 바위,  3 - 보
            	int computerChoice = (int) Math.floor(Math.random() * 3) + 1;  
            	
            	displayChoice(userChoice, computerChoice); // 양측의 선택 보여주기
            	computeResult(userChoice, computerChoice); // 승부결과 보여주기
            }
        }
        sc.close();
        System.out.println("프로그램이 종료되었습니다~");
    } // end main()
    
    
	// method name: showMenu
	// return: void
	// arguments: none
	// 기능: 유저가 가위/바위/보 선택할 수 있는 메뉴 출력
	public static void showMenu() {
		System.out.println("[가위 바위 보 게임]");
		System.out.println("----------------");
		System.out.println("1] 가위");
		System.out.println("2] 바위");
		System.out.println("3] 보");
		System.out.println("0] 종료");
		System.out.println("----------------");
		System.out.println("선택");
	} // end showMenu()
	
	// method name: inputChoice
	// return: int (유저의 가위(1)/바위(3)/보(4) 선택 내용)
	// arguments: Scanner sc (입력장치)
	public static int inputChoice(Scanner sc) {
		int choice = 0;
		choice = sc.nextInt();
		
		return choice;
	} // end inputChoice()

	
	// method name: displayChoice
	// return: void
	// arguments:
	//   1) int user: 유저의 선택(가위(1)/바위(2)/보(3))
	//   2) int com: 컴퓨터의 선택(가위(1)/바위(3)/보(3))
	public static void displayChoice(int user, int com) {
		//displayChoice(userChoice, computerChoice); // 양측의 선택 보여주기
		System.out.println("사용자 vs 컴퓨터");

		System.out.println(getHandType(user) + " vs " + getHandType(com));
		
	} // end displayChoice()
	
	
	// method name: getHandType
	// return: String ("가위"/"바위"/"보")
	// arguments: int choice(1, 2, 3)
	public static String getHandType(int choice) {
		String type = "";

		switch(choice) {
		case 1:
			type = "가위";
			break;
		case 2:
			type = "바위";
			break;
		case 3:
			type = "보";
			break;
		}
		
		return type;
	} // end getHandType()
	
	
	// method name: computeResult
	// return: void
	// arguments:
	//   1) int user: 유저의 선택(가위(1)/바위(2)/보(3))
	//   2) int com: 컴퓨터의 선택(가위(1)/바위(2)/보(3))
	public static void computeResult(int user, int com) {
		//computeResult(userChoice, computerChoice); // 승부결과 보여주기

		switch(user) {
		//가위
		case 1:
			switch(com) {
			//가위, 비김
			case 1:
				System.out.println("비겼습니다.");
				break;
			//바위, 컴 승
			case 2:
				System.out.println("Com Win");
				break;
			//보, 컴 짐
			case 3:
				System.out.println("User Win");
				break;
			}
			break;
		//바위
		case 2:
			switch(com) {
			//가위, 컴 짐
			case 1:
				System.out.println("User Win");
				break;
			//바위, 비김
			case 2:
				System.out.println("비겼습니다.");
				break;
			//보, 컴 승
			case 3:
				System.out.println("Com Win");
				break;
			}
			break;
		//보
		case 3:
			switch(com) {
			//가위, 컴 이김
			case 1:
				System.out.println("Com Win");
				break;
			//바위, 컴 짐
			case 2:
				System.out.println("User Win");
				break;
			//보, 비김
			case 3:
				System.out.println("비겼습니다.");
				break;
			}
			break;
		}
		
	} // end computeResult()

} // end class

