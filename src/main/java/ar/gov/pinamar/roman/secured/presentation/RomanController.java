package ar.gov.pinamar.roman.secured.presentation;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ar.gov.pinamar.roman.secured.service.RomanNumber;
import ar.gov.pinamar.roman.secured.service.RomanNumberService;

@RestController
public class RomanController {

	@Autowired
	private RomanNumberService romanNumberService;

	@RequestMapping(value = "/roman", method = RequestMethod.POST)
	public Object printRoman(@RequestBody @Valid RomanNumber rn) {

		return romanNumberService.convertToDecimal(rn, 0);
	}
	
}
