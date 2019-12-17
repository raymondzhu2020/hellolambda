package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

public class HelloTest implements RequestHandler<String, String> {

	@Override
	public String handleRequest(String input, Context context) {
		// TODO Auto-generated method stub
		
		if (input != null || input.length() !=0)
			   return "Hello," + input;
		return "Hello, World!";
	}

}
