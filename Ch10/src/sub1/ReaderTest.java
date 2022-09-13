package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김경준
 * 내용 : 문자 스트림 실습하기
 * 
 * 파일 입출력(I/O)
 * -파일(File)은 컴퓨터 저장매체에 저장되는 데이터 묶음
 * -프로그램은 데이터 처리와 함께 저장하기위해 파일 입출력을 수행
 * -파일 입출력을 위해 스트림(Stream)을 연결하야 됨 
 */

public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		
		
		
		try {
			// 파일과 스트림 연결
			FileReader fr = new FileReader(path);
			
			
			
			while(true) {
				int value = fr.read();
				
				if(value == -1) {
					//파일을 모두 읽었으면
					break;
				}
				
				//char c = (char)value;				
				//System.out.print(c);
				
				
			char c = (char)value;
			System.out.print(c);
			}
			
			//스트림 해제
			fr.close();
			
			
			
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	

