package com.luwee;

import java.util.stream.Stream;


public class ConcatStringArrays {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		Stream<String> names = Stream.concat(Stream.of(names1), Stream.of(names2));
		names = names.distinct();
		return names.toArray(size -> new String[size]);
		
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", ConcatStringArrays.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
