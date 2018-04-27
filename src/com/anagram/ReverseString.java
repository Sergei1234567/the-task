package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {

		String line = "#he&lo @%w$o,r!ld.";
		String delim = "#&@%$,!";
		StringTokenizer tokenazer = new StringTokenizer(line, delim);

		while (tokenazer.hasMoreTokens()) {
			String token = tokenazer.nextToken();
			System.out.println(token);
		}

	}

}
