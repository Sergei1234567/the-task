package com.anagram;

public class TestReverseString {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String Anagram = reverseString.toAnagram("#he&lo @%w$o,rld.", "#&@%$,. ");
		System.out.println(Anagram);
	}
}
