package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {

		String line = "#he&lo @%w$o,r!ld.";
		String delim = "#&@%$,!";
		String key;
		StringTokenizer theWords = new StringTokenizer(line, delim);

		while (theWords.hasMoreTokens()) {
			key = theWords.nextToken();
			System.out.println(key);
		}

	}

}
