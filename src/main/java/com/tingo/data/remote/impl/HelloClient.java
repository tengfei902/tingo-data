package com.tingo.data.remote.impl;

import com.tingo.data.remote.IHelloClient;
import org.springframework.stereotype.Component;

@Component
public class HelloClient implements IHelloClient{
	@Override
	public String hello(String username) {
		return null;
	}
}
