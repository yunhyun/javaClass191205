package javaClass_191212;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_ArraySort {

	public static void main(String[] args) {
		// 정수 5개 입력받아서 오름차순 정렬하기
		Scanner scan = new Scanner(System.in);

//		int[] num = new int[5];
		int temp;

//		for (int i = 0; i < num.length; i++) {
//			num[i] = scan.nextInt();
//		}
		int[] num = { 3, 2, 1, 4, 5 };
		// 오름차순 정렬
		// 0,1 0,2 0,3 0,4
		// 1,2 1,3 1,4
		// 2,3 2,4
		// 3,4

//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				// 순서 바꾸기 (버블정렬)
////				System.out.println(i + "," + j);
////				System.out.println(num[i] + "," + num[j]);
//				if (num[i] > num[j]) {
//					temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//		}

//		Arrays.parallelSort(num);
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
