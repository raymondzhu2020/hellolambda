package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import java.util.Map;

public class HelloTest implements RequestHandler<Map<String,Object>, String> {
         
	@Override
	public String handleRequest(Map<String,Object> input, Context context) {
		// TODO Auto-generated method stub
		System.out.println("Input: " +  input);
		if (input != null || input.length() !=0)
			   return "Greeting 1! Hello," + input;
		return "Hello, World!";
	}

}
