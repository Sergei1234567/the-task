package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {
		String anagram = "";
		String sentence = "#he&lo @%w$o,rld.";
		String delim = "#&@%$,. ";

		StringTokenizer tokenazer = new StringTokenizer(sentence, delim, true);
		while (tokenazer.hasMoreTokens()) {
			StringBuilder sentence1 = new StringBuilder();
			String token = tokenazer.nextToken();
			sentence1.append(token);
			token = sentence1.reverse().toString();
			anagram += token;
		}
		System.out.println(anagram);
	}
}
