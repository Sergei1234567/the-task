package com.anagram;

import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		//String input = "#he&lo %w$or!ld";

		StringBuilder input1 = new StringBuilder("#he&lo %w$or!ld");

		//input1.append(input);

		input1 = input1.reverse();
		System.out.println(input1);
	}

}