package com.cloudwise.smartagent.plugin.api.exception;

public class NoExistImplementException extends RuntimeException {

	public NoExistImplementException(String msg) {
		super(msg);
	}

	public NoExistImplementException(StringBuffer msg) {
		super(msg.toString());
	}

	public NoExistImplementException(Throwable e) {
		super(e);
	}

	public NoExistImplementException(String msg, Throwable e) {
		super(msg, e);
	}
}

