package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class DemoApplicationTests {

	private final LogicService logicService;

	DemoApplicationTests(LogicService logicService) {
		this.logicService = logicService;
	}

	@Test
	void testProblam2() {
		ArrayList array1 = new ArrayList();
		array1.add("a");
		array1.add("b");
		array1.add("c");
		ArrayList array2 = new ArrayList();
		array1.add("1");
		array1.add("2");
		array1.add("3");
		ArrayList<Object> merge = this.logicService.merge(array1, array2);
		System.out.println(merge);
	}

}
