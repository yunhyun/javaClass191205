package javaClass_191218;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 1. List
		 * 	- 순서(인덱스)를 유지하고 저장할 수 있음. 
		 *  - 중복저장 가능. 
		 * 2. Set
		 * 	- 저장데이터의 순서가 없음. 
		 *  - 중복저장 불가능.  
		 * 3. Map
		 *  - key, value의 쌍으로 저장. 
		 *  - key값은 중복 불가능
		 */
		// List 객체 선언 
		List<String> list = 
				new ArrayList<String>();
		/*
		 * <> : Generic 
		 * 타입변환을 하지 않고도 데이터를 사용할 수 있게 해줌 
		 */
		// list 객체에 데이터 저장 
		list.add("가가가가");
		list.add("나나나나");
		list.add("다다다다");
		list.add(1, "라라라라");
		list.add(1, "마마마마");
		list.add("다다다다");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		// list의 크기 출력 
		System.out.println(list.size());
		
		// list 데이터 삭제 
		list.remove(1);
		
		list.remove("다다다다");
		// for 이용하여 list에 담긴 데이터 전체 출력하기 
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		List<Integer> listInt = new ArrayList<Integer>();
		
		
		
		
		
//		List list1 = new ArrayList();
//		// ArrayList 객체에 데이터 저장
//		// Object
//		list1.add("아아아");
//		
//		Object objValue = list1.get(0);
//		String value = (String) objValue;
//		System.out.println(value);
//		
//		System.out.println(list1.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
