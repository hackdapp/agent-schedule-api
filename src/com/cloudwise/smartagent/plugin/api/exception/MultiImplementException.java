package com.cloudwise.smartagent.plugin.api.exception;

public class MultiImplementException extends RuntimeException {

	public MultiImplementException(String msg) {
		super(msg);
	}

	public MultiImplementException(StringBuffer msg) {
		super(msg.toString());
	}

	public MultiImplementException(Throwable e) {
		super(e);
	}

	public MultiImplementException(String msg, Throwable e) {
		super(msg, e);
	}
}

