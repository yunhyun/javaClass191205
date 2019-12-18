package javaClass_191218;

import java.util.*;

public class Ex04_ListEx {

	public static void main(String[] args) {
		/*
		 * List에 단어 5개를 입력 받아서 
		 * 가장 긴 단어를 출력하세요. 
		 */
		Scanner scan = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		//5개의 단어 입력하기 
		for(int i=0; i<5; i++) {
			System.out.print("단어를 입력하세요 :");
			String word = scan.next();
			list.add(word);
		}
		//입력된 내용 확인 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//가장 긴 단어 찾기 
		int longWord=0;
		for(int i=1;i<list.size();i++) {
			if(list.get(longWord).length()<list.get(i).length()) {
				longWord = i;
			}
		}
		System.out.println("가장 긴 단어는 : "+list.get(longWord));

	}

}
