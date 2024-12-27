package com.vanix.easygl.commons;

public interface ThrowableConsumer<T, E extends Throwable> {
	void accept(T t) throws E;
}
