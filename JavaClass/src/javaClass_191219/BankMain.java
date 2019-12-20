package javaClass_191219;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		/*
		 * 은행 프로그램
		 * 1. 고객 등록을 할 수 있다. 
		 * 	1.1 생성자를 이용한 방법 
		 *  1.2 getter, setter 이용한 방법 
		 * 2. 예금 기능을 수행할 수 있다. 
		 * 3. 출금 기능을 수행할 수 있다. 
		 * 	3.1 잔액이 0원 미만이면 출금 불가능 메시지를 출력한다. 
		 * 4. 잔액 확인을 할 수 있다. 
		 * 5. 고객 정보
		 *  - 고객번호, 이름, 계좌번호, 잔액
		 * 6. 고객 정보는 ArrayList에 저장한다.  
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		// 고객정보를 저장할 ArrayList 선언
		List<Bank> clientList = new ArrayList<Bank>();
		Bank bank = null;

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("0. 계좌생성(get,set) | 1.계좌생성(생성자) | 2.입금 | 3.출금 | 4.잔액 | 5.고객리스트 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			switch (select) {
			case 0:
				bank = new Bank();
				int clientNumber = clientList.size() + 1;
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("계좌 : ");
				String accountNumber = scan.next();
				System.out.print("입금액 : ");
				int balance = scan.nextInt();
				bank.setClientNumber(clientNumber);
				bank.setName(name);
				bank.setAccountNumber(accountNumber);
				bank.setBalance(balance);
				clientList.add(bank);				
				break;
			case 1:
				clientNumber = clientList.size()+1;
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("계좌 : ");
				accountNumber = scan.next();
				System.out.print("입금액 : ");
				balance = scan.nextInt();
				// 매개변수가 있는 생성자 호출을 통한 객체 생성 
				bank = new Bank(clientNumber, name, accountNumber, balance);
				clientList.add(bank);
				break;
			case 2:
				System.out.print("계좌");
				accountNumber = scan.next();
				System.out.print("입금액");
				balance = scan.nextInt();
				// 입력된 계좌번호와 동일한 객체를 찾아서 그 객체에다가 입금액 추가 
				for(int i=0; i<clientList.size();i++) {
					// 리스트에 저장된 계좌를 저장하기 위한 변수 사용 
					String depositAno = clientList.get(i).getAccountNumber();
					if(depositAno.equals(accountNumber)) {
						clientList.get(i).deposit(balance);
					}
				}
				break;
			case 3:
				bank.withdraw();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("메뉴에 없는 번호 입니다.");
				break;
			}
		}

		scan.close();
		
		
	}

}
