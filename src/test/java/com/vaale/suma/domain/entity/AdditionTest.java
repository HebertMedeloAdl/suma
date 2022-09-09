package com.vaale.suma.domain.entity;

import org.junit.Assert;
import org.junit.Test;

import com.vaale.suma.domain.BaseTest;
import com.vaale.suma.domain.entity.testDataBuilder.AdditionTestDataBuilder;
import com.vaale.suma.domain.model.entity.Addition;
import com.vaale.suma.tools.exception.ExceptionMandatoryValue;

public class AdditionTest {

	private static final String SE_DEBE_INGRESAR_EL_VALOR_A_SUMAR = "El valor debe ser diferente de 0";

	@Test
	public void validarValueOne() {
		// arrange
		double valueOne = 0;
		// act - assert
		BaseTest.assertThrows(() -> new AdditionTestDataBuilder().conValueOne(valueOne).build(),
				ExceptionMandatoryValue.class, SE_DEBE_INGRESAR_EL_VALOR_A_SUMAR);
	}

	@Test
	public void validarValueTwo() {
		// arrange
		double valueTwo = 0;
		// act - assert
		BaseTest.assertThrows(() -> new AdditionTestDataBuilder().conValueTwo(valueTwo).build(),
				ExceptionMandatoryValue.class, SE_DEBE_INGRESAR_EL_VALOR_A_SUMAR);
	}
	
	@Test
	public void valueFull() {
		// arrange
		double valueFull = 25;
		Addition addition = new AdditionTestDataBuilder().build();
		// act
		addition.calculateAddition();
		// assert
		Assert.assertEquals(addition.getValueFull(), valueFull, 0.0);
	}
}
