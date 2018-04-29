package com.anagram;

import java.util.StringTokenizer;

class ReverseString {
	static String token1;
	static String token2;

	public static void main(String[] args) {

		String sentence = "#he&lo @%w$o,r!ld.";
		String delim = "@.";

		StringTokenizer tokenazer = new StringTokenizer(sentence, delim);
		StringBuilder sentence1 = new StringBuilder();
		StringBuilder sentence2 = new StringBuilder();

		while (tokenazer.hasMoreTokens()) {

			token1 = tokenazer.nextToken();
			token2 = tokenazer.nextToken();
		}
		sentence1.append(token1);
		sentence1 = sentence1.reverse();
		sentence2.append(token2);
		sentence2 = sentence2.reverse();
		System.out.println(sentence1 + "\n " + sentence2);
	}
}
