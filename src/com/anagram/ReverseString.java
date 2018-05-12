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
		String anagram = "";
		char[] simbol = sentence.toCharArray();
		String delim = "";
		for (char i : simbol) {
			if(!Character.isLetter(i)) {
				delim += i;
			}
		}
		StringTokenizer tokenizer = new StringTokenizer(sentence, delim, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringBuilder stringBuilder = new StringBuilder(token);
			anagram += stringBuilder.reverse().toString();
		}

		return anagram;
	}
}
