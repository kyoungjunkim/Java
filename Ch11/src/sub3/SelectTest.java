package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 김경준
 * 내용 : JDBC Select 실습하기
 */

public class SelectTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
				try {
				// 1단계
					Class.forName("com.mysql.cj.jdbc.Driver");
				// 2단계
					Connection conn = DriverManager.getConnection(host,user,pass);
				// 3단계
					Statement stmt = conn.createStatement();
				// 4단계
					String sql = "SELECT * FROM `User1`;";
					
					ResultSet rs = stmt.executeQuery(sql); // SELECT만 executeQuery문으로
				// 5단계 - 결과처리
					while(rs.next()) {
						
						System.out.println("-----------------");
						System.out.printf("%s,%s,%s,%d\n", rs.getString(1),
														   rs.getString(2),
														   rs.getString(3),
														   rs.getInt(4));
						
					 }
					
				// 6단계
					stmt.close();
					conn.close();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("SELECT 완료...");
	}
}

