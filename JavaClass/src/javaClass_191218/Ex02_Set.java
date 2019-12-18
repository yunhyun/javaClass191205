package javaClass_191218;

import java.util.*;

public class Ex02_Set {

	public static void main(String[] args) {
		// Set 객체 선언 
		Set<String> set = new HashSet<String>();
		// set객체에 데이터 저장 
		set.add("가가가");
		set.add("나나나");
		set.add("다다다");
		set.add("다다다");
		
		// set 크기 확인
		System.out.println(set.size());
		
		// set에 저장된 데이터 출력하기 (반복자)
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set에 담긴 데이터 삭제 
		set.remove("다다다");
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}






