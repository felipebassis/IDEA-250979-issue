package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.example.integration.AnIntegrationTest;

@RunWith(Suite.class)
@SuiteClasses({
		AnUnityTest.class,
		AnIntegrationTest.class
})
public class SuiteClass {
}
