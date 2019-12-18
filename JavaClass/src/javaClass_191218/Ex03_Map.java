package javaClass_191218;

import java.util.*;

public class Ex03_Map {

	public static void main(String[] args) {
		// Map 객체 
		Map<Integer, String> map = new HashMap<Integer, String>();
		// map 객체에 데이터 저장하기 
		map.put(1, "가가가");
		map.put(10, "나나나");
		map.put(100, "다다다");
		
		System.out.println(map.size());
		
		System.out.println(map.get(100));
		
		// map 객체의 모든 데이터 출력하기 
		// key값을 set형태로 만들어서 set에서 사용하는 반복자 적용 
		Set<Integer> keyValues = map.keySet();
		Iterator<Integer> iterator = keyValues.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			int key = iterator.next();
			String value = map.get(key);
			System.out.println(key + ": "+value);
		}
		
		
		
		
		
		
	}

}
