package bankEx;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Client client = null;
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Client> clientList = new ArrayList<Client>();
		boolean run = true;
		while(run) {
		System.out.print("기능 선택 1.생성 2.조회 3.입금 4.출금");
		int select = scan.nextInt();
		switch(select) {
		case 1:
			int clientNumber = clientList.size()+1;
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("계좌 : ");
			String accountNumber = scan.next();
			System.out.print("입금액 : ");
			int balance = scan.nextInt();
			client = new Client(clientNumber, name, accountNumber, balance);
			clientList.add(client);
			break;
		case 2:
			for(int i=0;i<clientList.size();i++) {
				System.out.println(clientList.get(i).toString());		
			}
			break;
		default:
			System.out.println("없는 메뉴입니다.");
			break;
		}
		
		}
	}

}
