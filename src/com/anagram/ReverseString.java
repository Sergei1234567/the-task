package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public String toAnagram(String sentence, String delim) {
		String anagram = "";
		StringTokenizer tokenizer = new StringTokenizer(sentence, delim, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringBuilder stringBuilder = new StringBuilder(token);
			anagram += stringBuilder.reverse().toString();
		}
		return anagram;
	}

	public String toAnagram(String sentence) {
		char[] symbols = sentence.toCharArray();
		String delim = "";
		for (char character : symbols) {
			if(!Character.isLetter(character)) {
				delim += character;
			}
		}
		return toAnagram(sentence,delim);
	}
}
