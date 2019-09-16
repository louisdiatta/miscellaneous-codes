package com.luwee;

public class SumOfInDigits {
    public static void main(String[] args) {
	int result, n = 452;
	for (result = 0; n > 0; result += n % 10, n /= 10);
	System.out.println(result);
    }
}
