package ar.gov.pinamar.roman.secured;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ar.gov.pinamar.roman.secured.service.RomanNumber;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RomanSecuredApplication.class)
@WebAppConfiguration
public class RomanNumberTest {

	@Test
	public void testRomanVerifiedTrue() {
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("XXX");
		Assert.assertTrue(roman.romanVerified());
	}

	@Test
	public void testRomanVerifiedFalse() {
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("Pqr");
		Assert.assertFalse(roman.romanVerified());
	}

	@Test
	public void testObtainLenghtTrue(){
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("XXX");
		Integer output = roman.obtainLenght();
		Assert.assertTrue(output.compareTo(3)==0);
	}
	
	@Test
	public void testObtainLenghtFalse(){
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("XXX");
		Integer output = roman.obtainLenght();
		Assert.assertFalse(output.compareTo(3) != 0);
	}
	
	@Test
	public void testObtainLenghtEmpty(){
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("");
		Integer output = roman.obtainLenght();
		Assert.assertTrue(output.compareTo(0)==0);
	}
	
	@Test
	public void testObtainCharAtTrue() {
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("VXL");
		char output = roman.obtainCharAt(2);
		Assert.assertTrue(output == 'L');
	}
	
	@Test
	public void testObtainCharAtFalse() {
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("XXIV");
		char output = roman.obtainCharAt(2);
		Assert.assertFalse(output != 'I');
	}
	
	@Test
	public void testToUpperCaseCharTrue() {
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("ivxcl");
		roman.toUpperCaseChar();
		Assert.assertTrue(roman.getrNumber().compareTo("IVXCL")==0);
	}
	@Test
	public void testToUpperCaseCharFalse() {
		RomanNumber roman = new RomanNumber();
		roman.setrNumber("clx");
		roman.toUpperCaseChar();
		Assert.assertFalse(roman.getrNumber().compareTo("CLX")!=0);
	}
}
