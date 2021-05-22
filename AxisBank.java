package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("10.25%");

	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
