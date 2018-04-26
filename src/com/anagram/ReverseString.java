package com.anagram;

import java.util.StringTokenizer;

class ReverseString {
	static String line = "#he&lo @%w$o,r!ld.";
	static String delim = "#&@%$,!";
	static String key;

	public static void main(String[] args) {
		StringTokenizer theWords = new StringTokenizer(line, delim);

		while (theWords.hasMoreTokens()) {
			key = theWords.nextToken();
			System.out.println(key);
		}

	}

}
