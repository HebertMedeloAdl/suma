package com.vaale.suma.tools.commons;

public class ComandResponse<T> {
	private T value;

	public ComandResponse(T value) {
		this.value = value;
	}

	public T getseVaale() {
		return value;
	}
}
