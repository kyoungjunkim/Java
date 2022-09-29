package sub8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2022/09/28
 * 이름 : 김경준
 * 내용 : 자바 총정리 연습문제
 */


class User {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return uid+","+name+","+hp+","+age;
	}
}

public class Test10 {
	private static String host = "jdbc:mysql://127.0.0.1:3306/java1db";
	private static String user = "root";
	private static String pass = "1234";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(host, user, pass);
	}
	public static void main(String[] args) {
		query("INSERT INTO `User3` VALUES ('j101', '홍길동', '010-1111-1111', 21)");
		System.out.println("데이터 입력완료...");
		
		result1 = query
	}
}
