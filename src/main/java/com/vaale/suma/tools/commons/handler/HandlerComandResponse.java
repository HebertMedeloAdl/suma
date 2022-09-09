package com.vaale.suma.tools.commons.handler;

import org.springframework.transaction.annotation.Transactional;

public interface HandlerComandResponse<C, R> {

	@Transactional
	R run(C comand);
}
