package com.project.project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String args[]) {
		
		String str1 = "Shiv";
		String str2 = "Shiv";
		String str3 = new String("Shiv");
		
		System.out.println(str1.equals(str3));
		
//		
//		List<Integer> list = Arrays.asList(5,3,8,2,9,0,4,8,5,3);
//		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
//		Integer secondLargest = sortedList.stream().skip(1).findFirst().orElse(null);
//		System.out.println(sortedList);
//		System.out.println(secondLargest);
//		
//		List<String> str = Arrays.asList("Shiv", "Kumar", "Sharma");
//		List<String> contains = str.stream().filter(element -> element.toLowerCase().contains("s")).collect(Collectors.toList());
//		System.out.println(contains);
//		
		
	
//	System.out.println("Hello");
//	
//	SolveInterface sum = (a, b) -> a+b;
//	
//	System.out.println(sum.solve(10, 20));
//	System.out.println(SolveInterface.message("Hello World !!"));
//	System.out.println(sum.msg("This is the message from Default Method"));
//	
//	
	
	}
}
