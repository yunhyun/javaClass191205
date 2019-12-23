package javaClass_191223;

public class Ex06_BankMain {

	public static void main(String[] args) {
		Ex06_WooriBank wb = new Ex06_WooriBank();
		Ex06_KookminBank kb = new Ex06_KookminBank();
		Ex06_HanaBank hb = new Ex06_HanaBank();
		
		wb.interestRate();
		kb.interestRate();
		hb.interestRate();
	}

}
