package phonebook06.db;

// 전화번호부 6.0 : 파일이 아닌 데이터 베이스로 변경
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// CONTROLLER 객체
//   어플리케이션의 동작, 데이터 처리(CRUD), (Business logic 담당)


public class PhonebookManager implements Pb, Closeable {

	// TODO : DB를 위한 변수를 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// singleton적용
	private PhonebookManager() {

		// TODO : 
		// JDBC 프로그래밍
		//  클래스 로딩
		//  연결 Connection
		//  Statement (필요하다면) 생성
		
		try {
			// JDBC 드라이버 클래스를 메모리에 로드
			Class.forName(DRIVER);	// 동적 클래스 로딩
			//System.out.println("드라이버 클래스 로딩 성공");

			// DB와 connection을 맺음
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			//System.out.println("DB Connection 연결");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	private static PhonebookManager instance = null;
	public static PhonebookManager getInstance() {
		if (instance == null) {
			instance = new PhonebookManager();
		}
		return instance;
	} // end getInstance()

	
	// 전화번호부 생성 등록
	@Override
	public int insert(String name, String phoneNum, String memo) {

		// 매개변수 검증 : 이름 필수
		if (name == null || name.trim().length() == 0) {
			throw new PhonebookException("insert() 이름입력오류: ", Pb.ERR_EMPTY_STRING);
		}

		int cnt = 0;
		
		// TODO
		// SQL_INSERT 사용하여 INSERT
		// PreparedStatement 사용.., 여기서 close도 필요(PreparedStatement만...!!)
		try {
			// "INSERT INTO phonebook(pb_uid, pb_name, pb_phonenum, pb_memo) 
			// VALUES(phonebook_seq.nextval, ?, ?, ?)"
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setString(3, memo);
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(rs != null) {rs.close();}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return 1;
	}

	
	@Override
	public PhonebookModel[] selectAll() {
		
		// TODO
		// SQL_SELECT_ALL 사용하기
		PhonebookModel[] pb = null;
		int rowCount = 0;
		
		try {
			// Row 행의 값을 찾기
			pstmt = conn.prepareStatement(SQL_COUNT_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rowCount = rs.getInt("cnt");
			}
			
			pstmt.close();
			rs.close();

			// SQL_SELECT_ALL 사용하기
		    // SELECT * FROM phonebook ORDER BY pb_uid DESC
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			
			pb = new PhonebookModel[rowCount];
			
			int Number = 0;
			
			while(rs.next()) {
				pb[Number] = new PhonebookModel(rs.getInt(COL_LABEL_UID), 
						rs.getString(COL_LABEL_NAME), 
						rs.getString(COL_LABEL_PHONENUM),
						rs.getString(COL_LABEL_MEMO),
						rs.getDate(COL_LABEL_REGDATE));
				Number++;
			} // end while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(rs != null) {rs.close();}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return pb;
	}
	

	// 특정 uid 의 데이터 검색 리턴
	// 못찾으면 null 리턴
	@Override
	public PhonebookModel selectByUid(int uid) {

		// TODO : 옵션
		PhonebookModel pb = null;
		
		try {
			// "SELECT pb_uidFROM phonebook WHERE pb_uid = ?"
			pstmt = conn.prepareStatement(SQL_SELECT_CHOOSE);
			pstmt.setInt(1, uid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pb = new PhonebookModel(rs.getInt(COL_LABEL_UID), 
						rs.getString(COL_LABEL_NAME), 
						rs.getString(COL_LABEL_PHONENUM),
						rs.getString(COL_LABEL_MEMO),
						rs.getDate(COL_LABEL_REGDATE));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(rs != null) {rs.close();}
				return pb;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null; // 못찾으면 null 리턴
	}// end selectByUid()

	@Override
	public int updateByUid(int uid, String name, String phoneNum, String memo) {

		// 매개변수 검증
		if (uid < 1)
			throw new PhonebookException("update() uid 오류: " + uid, Pb.ERR_UID);
		int cnt = 0;

		// TODO
		// SQL_UPDATE_BY_UID  사용
		try {
			// "UPDATE phonebook SET pb_name = ?, 
			// pb_phonenum = ?, pb_memo = ? WHERE pb_uid = ?"
			pstmt = conn.prepareStatement(SQL_UPDATE_BY_UID);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setString(3, memo);
			pstmt.setInt(4, uid);
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(rs != null) {rs.close();}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cnt;
	}

	
	@Override
	public int deleteByUid(int uid) {
		// 매개변수 검증
		if (uid < 1)
			throw new PhonebookException("deleteByUid() uid 오류: " + uid, Pb.ERR_UID);

		int cnt = 0;
		
		// TODO
		// SQL_DELETE_BY_UID 사용
		try {
			// "DELETE FROM phonebook WHERE pb_uid = ?"
			pstmt = conn.prepareStatement(SQL_DELETE_BY_UID);
			pstmt.setInt(1, uid);
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(rs != null) {rs.close();}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return cnt;
	}

	
	// 현재 데이터중 가장 큰 uid 값을 찾아서 리턴
	private int getMaxUid() {
		int maxUid = 0;

		try {
			//"SELECT MAX(pb_uid) FROM phonebook"
			pstmt = conn.prepareStatement(SQL_SELECT_MIX);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				maxUid = rs.getInt("uid_max");
				return maxUid;
			} // end while
			
			System.out.println(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(rs != null) {rs.close();}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return maxUid;
	}

	
	@Override
	public void close() throws IOException {

		// TODO
		// ResultSet
		// Statement 
		// Connection
		// 들 close()
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	} // end close()


} // end PhonebookManager

// 예의 클래스 정의
// 예외발생하면 '에러코드' + '에러메세지'를 부여하여 관리하는게 좋다.
class PhonebookException extends RuntimeException {

	private int errCode = Pb.ERR_GENERIC;

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
		String msg = "ERR-" + errCode + "]" + Pb.ERR_STR[errCode] + " " + super.getMessage();
		return msg;
	}

} // end PhonebookException
