package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김경준
 * 내용 : 직렬화/역직렬화 실습하기
 */

public class DeserializeTest {
	public static void main(String[] args) {
	
		String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 가져오기(역직렬화)
		
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			ois.close();
			fis.close();
			
			a1.show();
			a2.show();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("역직렬화 완료...");
		
	}
}
