package com.srinu;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		for(int i =1;i<=100;i++) {
			numList.add(i);
		}
		numList.stream().filter(num -> num%7==0).forEach(a -> System.out.println(a));
	}
	

}
