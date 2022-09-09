package com.bridgelabz;

public class DigiteInAnInteger {

	public static void main(String[] args) {

		int count = 0, num = 000352;

		while (num != 0) {
			num = num/10;
			++count;
		}

		System.out.println("Number of digits: " + count);
	}

}
