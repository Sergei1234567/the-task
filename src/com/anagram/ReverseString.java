package com.anagram;

import java.util.StringTokenizer;
import java.io.*;
import java.util.Arrays;

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
		String delim = "";
		String string = "";
		string.toCharArray();
		StringTokenizer tokenizer = new StringTokenizer(sentence, delim, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringBuilder stringBuilder = new StringBuilder(token);
			string += stringBuilder.reverse().toString();
		}
		return string;
	}
}
