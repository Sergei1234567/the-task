package com.anagram;

import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseString {
	static String line = "#he&lo @%w$o,r!ld.";
	static String key;
	static String val;

	public static void main(String[] args) {
		StringTokenizer theWords = new StringTokenizer(line, "@.");
		StringBuilder line1 = new StringBuilder();
		StringBuilder line2 = new StringBuilder();

		while (theWords.hasMoreTokens()) {
			key = theWords.nextToken();
			val = theWords.nextToken();
		}

		line1.append(key);
		line1 = line1.reverse();
		line2.append(val);
		line2 = line2.reverse();

		System.out.println(line1 + " " + line2);

	}

}
