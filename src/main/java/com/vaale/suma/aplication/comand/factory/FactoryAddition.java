package com.vaale.suma.aplication.comand.factory;

import org.springframework.stereotype.Component;

import com.vaale.suma.aplication.comand.ComandAddition;
import com.vaale.suma.domain.model.entity.Addition;

@Component
public class FactoryAddition {
	public Addition addition(ComandAddition comandAddition) {
		return new Addition(comandAddition.getValueUne(), comandAddition.getValueTwo());
	}
}
