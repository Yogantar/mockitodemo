package com.coforge.training.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockitoSpyTest {

	List<String> list;
	List<String> listSpy;
	
	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<String>();
		listSpy = spy(list);
	}

	@Test
	void test() {
		listSpy.add("James Arthur");
		System.out.println(listSpy.get(0));
		
		assertEquals("James Arthur",listSpy.get(0));
		
		when(listSpy.get(0)).thenReturn("Pete Beker");
		
		System.out.println(listSpy.get(0));
		assertEquals("Pete Beker",listSpy.get(0));

	}

}
