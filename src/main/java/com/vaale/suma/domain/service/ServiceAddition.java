package com.vaale.suma.domain.service;

import org.springframework.stereotype.Component;

import com.vaale.suma.domain.model.entity.Addition;

@Component
public class ServiceAddition {

	public Double ejecutar(Addition addition) {
		addition.calculateAddition();
		return addition.getValueFull();
	}
}
