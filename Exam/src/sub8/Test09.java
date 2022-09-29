package sub8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2022/09/28
 * 이름 : 김경준
 * 내용 : 자바 총정리 연습문제
 */

public class Test09 {
public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2; x<=9; x++) {
				System.out.printf("%d단\n",x);
				
				for(int y=1; y<=9; y++) {
					int z = x*y;
					System.out.printf("%d X %d = %d\n", x, y, z);
				}
			}
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일생성 완료...");
	}
}
