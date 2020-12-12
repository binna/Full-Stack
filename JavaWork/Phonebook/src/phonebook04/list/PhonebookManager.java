package phonebook04.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

// CONTROLLER 객체
//	어플리케이션의 동작, 데이터 처리, (Business logic 담당)
public class PhonebookManager implements Pb {

	private ArrayList<PhonebookModel> pbList = new ArrayList<PhonebookModel>();
	
	// 몇 개의 데이터가 저장되었는지
	private int count = 0;
	
	// singleton 적용
	private PhonebookManager() {	}
	private static PhonebookManager instance = null;
	public static PhonebookManager getInstance() {
		if(instance == null) {
			instance = new PhonebookManager();
		}
		return instance;
	} // end getInstance()
	
	
	
	// 전화번호부 생성 등록
	@Override
	public int insert(String name, String phoneNum, String memo) {
		
		// 매개변수 검증 : 이름 필수
		if(name == null || name.trim().length() == 0) {
			throw new PhonebookException("insert() 이름입력오류 : ", Pb.ERR_EMPTY_STRING);
		}
		
		PhonebookModel model = new PhonebookModel((count + 1), name, phoneNum, memo, new Date());
		pbList.add(model);
		count++;
		
		return 1;
	}

	@Override
	public PhonebookModel[] selectAll() {
		return pbList.toArray(new PhonebookModel[pbList.size()]);
	}

	// 특정 uid 의 데이터 검색 리턴
	// 못찾으면 null 리턴
	@Override
	public PhonebookModel selectByUid(int uid) {
		
		for(int index = 0; index < count; index++) {
			if(index == uid) {
				return pbList.get(uid);
			}
		}
		
		return null;	// 못찾으면 null 리턴
	} // end selectByUid()

	@Override
	public int updateByUid(int uid, String name, String phoneNum, String memo) {
		// 매개변수 검증
		if(uid < 1) {
			throw new PhonebookException("update() uid 오류 : " + uid, Pb.ERR_UID); 
		}
		
		// 이름 필수
		if(name == null || name.trim().length() == 0) {
			throw new PhonebookException("update() 이름입력 오류 : ", Pb.ERR_EMPTY_STRING);
		}	
		
		// 특정 uid 값을 가진 데이터의 배열 인덱스 찾기
		int index = findIndexByUid(uid);
		
		if(index < 0) {
			throw new PhonebookException("update() 없는 uid", Pb.ERR_UID);
		}
		System.out.println(index);

		pbList.set((index - 1), new PhonebookModel((index),name, phoneNum, memo, new Date()));
		
		
		return 1;
	}

	@Override
	public int deleteByUid(int uid) {
		
		// 매개변수 검증
		if(uid < 1) {
			throw new PhonebookException("deleteByUid() uid 오류 : " + uid, Pb.ERR_UID); 
		}
		
		int index = findIndexByUid(uid);
		if(index < 0) {
			throw new PhonebookException("deleteByUid() 없는 uid", Pb.ERR_UID);
		}
		
		pbList.remove(uid-1);
		
		return 1;
	}
	
	// 현재 데이터 중 가능 큰 uid값을 찾아서 리턴
	private int getMaxUid() {
		int maxUid = 0;
		maxUid = count;
		
		return maxUid;
	}

	// 특정 uid 값을 가진 데이터의 배열 인덱스 찾기
	// 못찾으면 -1 리턴
	private int findIndexByUid(int uid) {
		
		for(int index = 0; index < count; index++) {
			if(index == uid) {
				System.out.println("findIndexByUid : "+uid);
				return uid;
			}
		}
		
		return -1;
	}
	
} // end PhonebookManager

// 예외 클래스 정의
// 예외발생하면 '에러 코드' + '에러 메시지'를 부여하여 관리하는게 좋다.
class PhonebookException extends RuntimeException{
	
	private int errCode = Pb.ERR_GENERIC;
	
	// 생성자 만들기
	public PhonebookException() {
		super("Phonebook 예외 발생");
	}
	
	public PhonebookException(String msg) {
		super(msg);
	}
	
	public PhonebookException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}
	
	
	// Throwable 의 getMessage 를 오버라이딩 가능
	@Override
	public String getMessage() {
		String msg = "ERR-" + errCode + "]" +Pb.ERR_STR[errCode] 
				+ " " + super.getMessage();
		return msg;
	} 
	
} // PhonebookException















