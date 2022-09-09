package com.vaale.suma.aplication.comand.handler;

import org.springframework.stereotype.Component;

import com.vaale.suma.aplication.comand.ComandAddition;
import com.vaale.suma.aplication.comand.factory.FactoryAddition;
import com.vaale.suma.domain.model.entity.Addition;
import com.vaale.suma.domain.service.ServiceAddition;
import com.vaale.suma.tools.commons.ComandResponse;
import com.vaale.suma.tools.commons.handler.HandlerComandResponse;

@Component
public class HandlerAddition implements HandlerComandResponse<ComandAddition, ComandResponse<Double>> {

	private final FactoryAddition factoryAddition;
	private final ServiceAddition serviceAddition;

	public HandlerAddition(FactoryAddition factoryAddition, ServiceAddition serviceAddition) {
		this.factoryAddition = factoryAddition;
		this.serviceAddition = serviceAddition;
	}

	public ComandResponse<Double> run(ComandAddition comandAddition) {
		Addition addition = this.factoryAddition.addition(comandAddition);
		return new ComandResponse<>(this.serviceAddition.ejecutar(addition));
	}
}
