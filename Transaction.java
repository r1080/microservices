package org.account.model;

import java.time.LocalDate;

public class Transaction {

	private LocalDate date;
	private String narration;
	private Double debitAmount;
	private Double creditAmount;
	private Long refNumber;
	private Double closingBalance;

	private Transaction(Builder builder) {
		this.date = builder.date;
		this.narration = builder.narration;
		this.debitAmount = builder.debitAmount;
		this.creditAmount = builder.creditAmount;
		this.refNumber = builder.refNumber;
		this.closingBalance = builder.closingBalance;
	}

	public static class Builder {

		private LocalDate date;
		private String narration;
		private Double debitAmount;
		private Double creditAmount;
		private Long refNumber;
		private Double closingBalance;
		
		public Builder() {
			
		}

		public Builder(LocalDate date, String narration, Double debitAmount) {
			this.date = date;
			this.narration = narration;
			this.debitAmount = debitAmount;
		}

		public Builder narration(String narration) {
			this.narration = narration;
			return this;
		}

		public Builder refNumber(Long refNumber) {
			this.refNumber = refNumber;
			return this;
		}

		public Builder closingBalance(Double closingBalance) {
			this.closingBalance = closingBalance;
			return this;
		}

		public Transaction build() {
			return new Transaction(this);
		}
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", narration=" + narration + ", debitAmount=" + debitAmount
				+ ", creditAmount=" + creditAmount + ", refNumber=" + refNumber + ", closingBalance=" + closingBalance
				+ "]";
	}

	public LocalDate getDate() {
		return date;
	}

	public String getNarration() {
		return narration;
	}

	public Double getDebitAmount() {
		return debitAmount;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public Long getRefNumber() {
		return refNumber;
	}

	public Double getClosingBalance() {
		return closingBalance;
	}

}
