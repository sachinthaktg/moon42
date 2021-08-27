package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private LogicService logicService;


	/**
	 * Problem 3
	 * Write a function that computes the list of the first 100 Fibonacci numbers. By
	 * definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each
	 * subsequent number is the sum of the previous two. As an example, here are the first
	 * 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
	 */
	@Test
	void testProblam3() {
		ArrayList<Integer> integers = logicService.problam3();
		System.out.println(integers);
	}

	/**
	 * Problem 4
	 * Write a function that given a list of non negative integers, arranges them such that
	 * they form the largest possible number. For example, given [50, 2, 1, 9], the largest
	 * formed number is 95021.
	 */
	@Test
	void testProblam4() {
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(50);
		numbers.add(2);
		numbers.add(1);
		numbers.add(9);
		logicService.printLargest(numbers);
	}

}
