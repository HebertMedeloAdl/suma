package com.vaale.suma.domain.entity.testDataBuilder;

import com.vaale.suma.domain.model.entity.Addition;

public class AdditionTestDataBuilder {

	private double valueOne;
	private double valueTwo;
	private double valueFull;

	public AdditionTestDataBuilder() {
		valueOne = 5;
		valueTwo = 20;
	}

	public AdditionTestDataBuilder conValueOne(double valueOne) {
		this.valueOne = valueOne;
		return this;
	}

	public AdditionTestDataBuilder conValueTwo(double valueTwo) {
		this.valueTwo = valueTwo;
		return this;
	}

	public AdditionTestDataBuilder conValueFull(double valueFull) {
		this.valueFull = valueFull;
		return this;
	}

	public Addition build() {
		return new Addition(valueOne, valueTwo);
	}
}
