package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {
		String anagram = "";
		String sentence = "#he&lo @%w$o,rld.";
		String delim = "#&@%$,. ";
		StringTokenizer tokenizer = new StringTokenizer(sentence, delim, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringBuilder stringBuilder = new StringBuilder(token);
			anagram += stringBuilder.reverse().toString();
		}
		System.out.println(anagram);
	}
}
