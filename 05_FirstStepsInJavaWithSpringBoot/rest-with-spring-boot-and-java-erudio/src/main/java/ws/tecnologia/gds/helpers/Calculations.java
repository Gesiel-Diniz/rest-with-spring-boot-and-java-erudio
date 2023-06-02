package ws.tecnologia.gds.helpers;

import ws.tecnologia.gds.exceptions.UnsupportedMathOperationException;

public class Calculations {

	public Double sum(String numberOne, String numberTwo) {
		
		if(!ValidationData.isNumeric(numberOne) || !ValidationData.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return ValidationData.convertToDouble(numberOne) + ValidationData.convertToDouble(numberTwo);
	}
	
	public Double multiplication(String numberOne, String numberTwo) {
		
		if(!ValidationData.isNumeric(numberOne) || !ValidationData.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return ValidationData.convertToDouble(numberOne) * ValidationData.convertToDouble(numberTwo);
	}
	
	public Double subtraction(String numberOne, String numberTwo) {
		
		if(!ValidationData.isNumeric(numberOne) || !ValidationData.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return ValidationData.convertToDouble(numberOne) - ValidationData.convertToDouble(numberTwo);
	}
	
	public Double division(String numberOne, String numberTwo) {
		
		if(!ValidationData.isNumeric(numberOne) || !ValidationData.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return ValidationData.convertToDouble(numberOne) / ValidationData.convertToDouble(numberTwo);
	}
	
	public Double average(String numberOne, String numberTwo) {
		
		if(!ValidationData.isNumeric(numberOne) || !ValidationData.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return ((ValidationData.convertToDouble(numberOne) + ValidationData.convertToDouble(numberTwo)) / 2);
	}
	
	public Double square(String numberOne) {
		
		if(!ValidationData.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return Math.sqrt(ValidationData.convertToDouble(numberOne));
	}
	
}
