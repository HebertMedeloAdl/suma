package com.vaale.suma.tools.exception;

public class ValueValidation {

	private ValueValidation() {
	}

	public static void validateRequired(Double value, String message) {
		if (value == 0) {
			throw new ExceptionMandatoryValue(message);
		}
	}

}
