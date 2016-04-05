package com.spring.examples;

public class CreditCard {
	private String cardNo;
	private String bankName;
	private int cvv;

	public CreditCard(String cardNo, String bankName, int cvv) {
		super();
		this.cardNo = cardNo;
		this.bankName = bankName;
		this.cvv = cvv;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}