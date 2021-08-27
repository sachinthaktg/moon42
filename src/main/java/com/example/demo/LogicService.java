package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

@Service
public class LogicService {

    /**
     * Problem 1
     * Write three functions that compute the sum of the numbers in a given list using a
     * for-loop, a while-loop, and recursion.
     * @return
     */
    static int sumMethod1(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int sumMethod2(int[] numbers) {
        int sum = 0;
        int count = 0;
        while (numbers.length > count) {
            sum += numbers[count];
            count++;
        }
        return sum;
    }

    static int sumMethod3(int[] numbers, int count)
    {
        if (count <= 0)
            return 0;
        return (sumMethod3(numbers, count - 1) + numbers[count - 1]);
    }


    /**
     * Problem 2
     * Write a function that combines two lists by alternating taking elements. For
     * example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2,
     * c, 3].
     */

    static ArrayList<Object> merge(ArrayList list1, ArrayList list2) {
        int c1 = 0, c2 = 0;
        ArrayList<Object> res = new ArrayList<>();
        while(c1 < list1.size() || c2 < list2.size()) {
            if(c1 < list1.size())
                res.add(list1.get(c1++));
            if(c2 < list2.size())
                res.add(list2.get(c2++));
        }
        return res;
    }

    /**
     * Problem 3
     * Write a function that computes the list of the first 100 Fibonacci numbers. By
     * definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each
     * subsequent number is the sum of the previous two. As an example, here are the first
     * 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
     */
    static ArrayList<Integer> problam3() {
        ArrayList<Integer> res= new ArrayList<>();
        int x = 0, y = 0, z = 1;
        for(int i = 1; i <= 100; i++) {
            z = y;
            y = z;
            z = x + y;
            res.add(z);
        }
        return res;
    }

    /**
     * Problem 4
     * Write a function that given a list of non negative integers, arranges them such that
     * they form the largest possible number. For example, given [50, 2, 1, 9], the largest
     * formed number is 95021.
     */
    static void printLargest(ArrayList<Integer> numbers) {

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override public int compare(Integer num1, Integer num2) {
                Integer conNum1 = Integer.parseInt(String.valueOf(num1).concat(String.valueOf(num2)));
                Integer conNum2 = Integer.parseInt(String.valueOf(num2).concat(String.valueOf(num1)));
                return conNum1.compareTo(conNum2) > 0 ? -1 : 1;
            }
        });
        Iterator it = numbers.iterator();
        while (it.hasNext()) System.out.print(it.next());
    }
}
