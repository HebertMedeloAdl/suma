package com.vaale.suma.tools.commons.handler;

import org.springframework.transaction.annotation.Transactional;

public interface HandlerComand<C> {

	@Transactional
	void run(C comand);
}
