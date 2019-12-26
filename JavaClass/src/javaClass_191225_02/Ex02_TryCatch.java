package javaClass_191225_02;

import java.util.*;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		// ArrayList를 선언해서 Exception을 발생시켜보세요
		
		
		try {
			List<String> list = new ArrayList<String>();
			list.add("aa");
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("무조건 나와요");
		}
		
		
	}

}







