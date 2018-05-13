package com.anagram;

public class TestReverseString {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String string = reverseString.toAnagram("1he&lo 6%w7o,@rld.");
		System.out.println(string);
	}
}
