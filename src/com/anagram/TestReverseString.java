package com.anagram;

public class TestReverseString {
	public static void main(String[] args) {
		ReverseString m = new ReverseString("#he&lo @%w$o,rld.", "#&@%$,. ");
		m.anagram = "";
		String anagram = m.anagramSTDemo();
		System.out.println(anagram);
	}
}
