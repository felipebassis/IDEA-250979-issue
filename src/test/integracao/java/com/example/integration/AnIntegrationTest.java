package com.example.integration;

import com.example.FooClass;
import com.example.SharedTestClass;
import org.junit.Test;

public class AnIntegrationTest {

	@Test
	public void shouldRunTest() {
		//Test import
		SharedTestClass testClass = new SharedTestClass();
		FooClass fooClass = new FooClass();
	}
}
