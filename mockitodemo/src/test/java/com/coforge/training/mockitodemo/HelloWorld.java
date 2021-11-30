package com.coforge.training.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
//static mock method
public class HelloWorld {

	@Test
	public void greetTest()
	{
		IDemo d = mock(IDemo.class);  //create a mock object for IDemo
		
//		when-then is a style of representing the test
//		when -  used to specify the behaviour
//		then -  describes the changes you expect by the specified behaviour
		when(d.greet()).thenReturn(IDemo.S);
		System.out.println("Demo Greets: "+d.greet());
		
		assertEquals(d.greet(),IDemo.S);
	}
}
