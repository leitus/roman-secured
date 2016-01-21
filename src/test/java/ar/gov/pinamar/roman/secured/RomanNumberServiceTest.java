package ar.gov.pinamar.roman.secured;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ar.gov.pinamar.roman.secured.service.RomanNumber;
import ar.gov.pinamar.roman.secured.service.RomanNumberService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RomanSecuredApplication.class)
@WebAppConfiguration
public class RomanNumberServiceTest {

	@Autowired
	private RomanNumberService romanNumberService;

	@Test
	public void testSuccessIfImputIs30() {

		RomanNumber roman = new RomanNumber();
		roman.setrNumber("XXIX");
		Integer res = romanNumberService.convertToDecimal(roman, 0);
		Assert.assertEquals(res, new Integer(29));
	}
	
	@Test
	public void testSuccessIfImputIsEmptyTrim() {

		RomanNumber roman = new RomanNumber();
		roman.setrNumber(" ");
		Integer res = romanNumberService.convertToDecimal(roman, 0);
		Assert.assertEquals(res, new Integer(0));
	}
	@Test
	public void testSuccessIfImputIsNull() {

		RomanNumber roman = new RomanNumber();
		//roman.setrNumber(null);
		Integer res = romanNumberService.convertToDecimal(roman, 0);
		Assert.assertEquals(res, new Integer(0));
	}
	@Test
	public void testSuccessIfImputIsLowerCase() {

		RomanNumber roman = new RomanNumber();
		roman.setrNumber("xxiv");
		Integer res = romanNumberService.convertToDecimal(roman, 0);
		Assert.assertEquals(res, new Integer(24));
	}
	@Test
	public void testSuccessIfImputIsFruit() {

		RomanNumber roman = new RomanNumber();
		roman.setrNumber("fruit");
		Integer res = romanNumberService.convertToDecimal(roman, 0);
		Assert.assertEquals(res, new Integer(0));
	}
	@Test
	public void testSuccessIfNotNull() {
		Assert.assertNotNull(romanNumberService);

	}
}
