package javaClass_191218;

import java.util.*;

public class Ex04_MapEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> words = new HashMap<String, String>();
		int score = 0;
		int i = 1;
		words.put("chair","의자");
		words.put("desk","책상");
		words.put("water","물");
		words.put("pencil","연필");
		words.put("watch","시계");
		
		Set<String> keyValues = words.keySet();
		Iterator<String> iterator = keyValues.iterator();
		while(iterator.hasNext()) {
			
			String key = iterator.next();
			System.out.print("문제"+(i)+". "+key+"의 뜻은 무엇인가요? ");
			String answer = scan.next();
			String value = words.get(key);
			
			if(answer.equals(value)) {
				System.out.println("정답입니다.");
				score++;
			} else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은 "+value+"입니다.");
			}
			i++;
			
		}
		
		String str = "가가가";
		System.out.println(str.length());
		
		
		System.out.println("총 "+score+"개 정답입니다. ");
		double percent=100*((double)score/words.size());
		System.out.println("정답률은 "+percent+"% 입니다.");
		
		
		
		
		
		
	}

}
