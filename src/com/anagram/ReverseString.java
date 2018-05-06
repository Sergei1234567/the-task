package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	String anagram;
	StringTokenizer tokenizer;
	ReverseString(String sentence, String delim){
		tokenizer = new StringTokenizer(sentence, delim, true);
	}

	public String anagramSTDemo() {
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringBuilder stringBuilder = new StringBuilder(token);
			anagram += stringBuilder.reverse().toString();
		}
		return anagram;
	}
}
