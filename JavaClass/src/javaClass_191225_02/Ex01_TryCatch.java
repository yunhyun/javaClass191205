package javaClass_191225_02;

import java.util.*;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		try {
		for(int i=0; i<list.size()+1;i++) {
			System.out.println(list.get(i));
		}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("리스트 초과!!");
			e.printStackTrace();
		} finally {
			System.out.println("무조건");
		}
	}

}
