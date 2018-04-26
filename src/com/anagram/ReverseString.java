package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {

		String line = "#he&lo @%w$o,r!ld.";
		String delim = "#&@%$,!";
		String token;
		StringTokenizer theWords = new StringTokenizer(line, delim);

		while (theWords.hasMoreTokens()) {
			token = theWords.nextToken();
			System.out.println(token);
		}

	}

}
