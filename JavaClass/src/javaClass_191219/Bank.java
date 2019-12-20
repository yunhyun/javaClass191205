package javaClass_191219;

import java.util.Scanner;

public class Bank {
	Scanner scan = new Scanner(System.in);
	
	// 필드 선언 
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	// 생성자(2가지)
	
	public Bank() {
		
	}
	
	public Bank(int clientNumber, String name, String accountNumber, int balance) {
		this.clientNumber = clientNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int balance) {
		this.balance += balance;
//		this.balance = this.balance + balance;
		System.out.println("입금완료!! 잔액 : "+this.balance+" 원");
	}

	public void withdraw() {
		
	}

	
	
	
	
}
