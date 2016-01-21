package ar.gov.pinamar.roman.secured.service;

import javax.validation.constraints.NotNull;

public class RomanNumber {

	@NotNull
	private String rNumber;

	public String getrNumber() {
		return rNumber;
	}

	public void setrNumber(String rNumber) {
		this.rNumber = rNumber;
	}

	public Boolean romanVerified() {
		toUpperCaseChar();
		return this.rNumber.matches("[I*V*X*L*C*D*M*]*");
	}

	public Integer obtainLenght() {
		return this.rNumber.length();
	}

	public char obtainCharAt(int nPosition) {
		return this.rNumber.charAt(nPosition);
	}

	public void toUpperCaseChar() {
		this.rNumber = this.rNumber.toUpperCase();
	}
}
