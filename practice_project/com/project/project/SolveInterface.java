package com.project.project;

public interface SolveInterface {
	
	int solve(int a, int b);
	
	static String message(String str) {
		return str;
	}
	
	default String msg(String str) {
		return str;
	}

}