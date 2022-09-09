package com.vaale.suma.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vaale.suma.aplication.comand.ComandAddition;
import com.vaale.suma.aplication.comand.handler.HandlerAddition;
import com.vaale.suma.tools.commons.ComandResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/se_vaale")
@Api(tags = { "Controlador comando suma" })
public class CommandControllerAddition {

	private final HandlerAddition handlerAddition;

	@Autowired
	public CommandControllerAddition(HandlerAddition handlerAddition) {
		this.handlerAddition = handlerAddition;
	}

	@PostMapping
	@ApiOperation("Sumar valores")
	@ResponseStatus(code = HttpStatus.OK)
	public ComandResponse<Double> addition(@RequestBody ComandAddition comandAddition) {
		return handlerAddition.run(comandAddition);
	}
}
