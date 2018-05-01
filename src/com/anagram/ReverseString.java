package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {
		String anagram = "";
		String sentence = "#he&lo @%w$o,rld.";
		String delim = "#&@%$,. ";
		String token = "";
		StringTokenizer tokenizer = new StringTokenizer(sentence, delim, true);
		while (tokenizer.hasMoreTokens()) {
			StringBuilder stringBuilder = new StringBuilder(token);
			token = tokenizer.nextToken();
			anagram += stringBuilder.reverse().toString();
		}
		System.out.println(anagram);
	}
}
