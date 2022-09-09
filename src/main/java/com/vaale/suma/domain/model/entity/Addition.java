package com.vaale.suma.domain.model.entity;

import static com.vaale.suma.tools.exception.ValueValidation.validateRequired;

import lombok.Getter;

@Getter
public class Addition {

	private static final String SE_DEBE_INGRESAR_EL_VALOR_A_SUMAR = "El valor debe ser diferente de 0";

	private double valueOne;
	private double valueTwo;
	private double valueFull;

	public Addition(double valueOne, double valueTwo) {

		validateRequired(valueOne, SE_DEBE_INGRESAR_EL_VALOR_A_SUMAR);
		validateRequired(valueTwo, SE_DEBE_INGRESAR_EL_VALOR_A_SUMAR);

		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

	public void calculateAddition() {
		this.valueFull = this.valueOne + this.valueTwo;
	}

}
