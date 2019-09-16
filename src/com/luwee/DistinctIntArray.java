package com.luwee;

import java.util.Arrays;

public class DistinctIntArray {

    public static void main(String[] args) {
	int arrayWithDuplicates[] = { 1, 2, 25, 14, 2, 14 };
	int arrayWithoutDuplicates[] = Arrays.stream(arrayWithDuplicates).distinct().toArray();

	for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
	    System.out.println(arrayWithoutDuplicates[i]);
	}
    }
}
