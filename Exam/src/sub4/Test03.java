package sub4;

/*
 * 날짜 : 2022/09/16
 * 이름 : 김경준
 * 내용 : 문자열처리 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		String fileName = "자바 프로그래밍.pdf";
		
		int idx = fileName.lastIndexOf(".") ;
				
		String Title = fileName.substring(0, idx) ;
		String ext = fileName.substring(idx+1) ;
		
		System.out.println("파일명 : "+Title);
		System.out.println("확장자 : "+ext);
	}
}
