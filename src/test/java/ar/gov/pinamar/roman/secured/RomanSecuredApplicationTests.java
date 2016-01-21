package ar.gov.pinamar.roman.secured;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import ar.gov.pinamar.roman.secured.service.RomanNumber;
import ar.gov.pinamar.roman.secured.service.RomanNumberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RomanSecuredApplication.class)
@WebAppConfiguration
public class RomanSecuredApplicationTests {
	
	@Autowired
	private RomanNumberService romanNumberService; 
	
	@Test
	public void contextLoads() {
		Assert.assertNotNull(romanNumberService);
	}

}
