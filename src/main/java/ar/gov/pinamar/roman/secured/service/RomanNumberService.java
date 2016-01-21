package ar.gov.pinamar.roman.secured.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

@Service
public class RomanNumberService {

	private static Hashtable<Character, Integer> hashTable = new Hashtable<Character, Integer>();

	static {
		hashTable.put('I', 1);
		hashTable.put('X', 10);
		hashTable.put('C', 100);
		hashTable.put('M', 1000);
		hashTable.put('V', 5);
		hashTable.put('L', 50);
		hashTable.put('D', 500);
	}

	public Integer convertToDecimal(RomanNumber romanInput, int nPos) {
		
		if (romanInput.getrNumber() != null &&  !romanInput.getrNumber().trim().isEmpty() && romanInput.romanVerified())  {
			
			if (nPos == romanInput.obtainLenght() - 1) {
				return hashTable.get(romanInput.obtainCharAt(nPos));

			} else {

				if (hashTable.get(romanInput.obtainCharAt(nPos)) >= hashTable.get(romanInput.obtainCharAt(nPos + 1))) {
					return hashTable.get(romanInput.obtainCharAt(nPos)) + convertToDecimal(romanInput, nPos + 1);
				} else {
					return -hashTable.get(romanInput.obtainCharAt(nPos)) + convertToDecimal(romanInput, nPos + 1);
				}
			}
		} else {
			return 0;
		}
	}// End convertToDecimal
}
