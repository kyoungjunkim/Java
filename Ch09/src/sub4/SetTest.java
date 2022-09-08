package sub4;

import java.util.HashSet;
import java.util.Set;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김경준
 * 내용 : 자료구조 집합 실습하기
 */
public class SetTest {
	public static void main(String[] args) {
		
		//집합 생성
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		//집합갯수
		System.out.println("set 집합 원소 갯수 : "+ set.size()); // 컬렉션은 size
		
		
		//집합 출력
		System.out.println(set);
		
		for(int n : set ) {
			System.out.print(n+", ");
		}
		System.out.println();
		
		
		
		
	}
}
