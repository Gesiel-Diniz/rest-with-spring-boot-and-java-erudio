package ws.tecnologia.gds.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ws.tecnologia.gds.helpers.Calculations;



@RestController
public class MathController {

	Calculations cal = new Calculations();
	
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method=RequestMethod.GET )
	public Double average(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return cal.average(numberOne, numberTwo);
	}
	
	
	
	@RequestMapping(value = "/square/{numberOne}", method=RequestMethod.GET )
	public Double square(@PathVariable(value = "numberOne") String numberOne) throws Exception {
		
		return cal.square(numberOne);
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET )
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return cal.multiplication(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method=RequestMethod.GET )
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return cal.division(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET )
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return cal.subtraction(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET )
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		return cal.sum(numberOne, numberTwo);
	}
	
}
