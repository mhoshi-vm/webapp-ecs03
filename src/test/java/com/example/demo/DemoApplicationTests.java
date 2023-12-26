package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestDemoApplication.class)
class DemoApplicationTests {

	@Autowired
	DemoRepository demoRepository;

	@Autowired
	DemoController demoController;


	@Test
	void contextLoads() {

		demoController.setter("hoge");

		Assertions.assertEquals(demoController.getter().size(), 1);
		Assertions.assertEquals(demoController.getter().get(0).getDemoValue(), "hoge");

	}

}
