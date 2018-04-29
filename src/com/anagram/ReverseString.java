package com.anagram;

import java.util.StringTokenizer;

class ReverseString {

	public static void main(String[] args) {
		String anagram = "";
		String sentence = "#he&lo @%w$o,r!ld.";
		String delim = "@.";

		StringTokenizer tokenazer = new StringTokenizer(sentence, delim);
		StringBuilder sentence1 = new StringBuilder();

		while (tokenazer.hasMoreTokens()) {

			anagram = tokenazer.nextToken();
			sentence1.append(anagram);
			sentence1 = sentence1.reverse();
			System.out.print(sentence1 + " ");
		}
	}
}
