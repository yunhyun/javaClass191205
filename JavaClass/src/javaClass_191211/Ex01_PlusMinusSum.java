package javaClass_191211;

public class Ex01_PlusMinusSum {

	public static void main(String[] args) {
		int sum=0;//합계용 변수
		int num=0;//숫자용 변수
		int count=1;//카운트용 변수 
		int s=1;//부호용 변수
		while(true) {
			sum=sum+num;
			if(sum>=100) {
				break;
			} else {
			num=s*count;
			s=-s;//부호 변경(s를 -1로 선언해도 무방)
			count++;//순차적 숫자 증가를 위한 증감연산자
			System.out.println("현재 num,s,count값 : "+num+","+s+","+count);
			}
		}
		/* for(count=1;sum<100;count++,s=-s) { 
		 * num=count*s; 
		 * sum=sum+num; 
		 * } */
		System.out.println("숫자 : " + num);
		System.out.println("합계 : " + sum);
	}

}
