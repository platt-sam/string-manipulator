// Sam Platt
// CS 257 Lab 1C
// Written Jan 11, 2020

import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class StringManip {
	public static void main(String[] args) {
		String s;
		
		// Have the user enter a String
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
	
		s = scan.nextLine();
		
		int len = s.length();
		
		String[] chars = new String[len];
		
		// Assigning the characters to the Array.
		for(int i = 0; i < len; i++) {
			chars[i] = s.substring(i, i+1);
		}
		
		// Print all characters in the array that are not spaces.
		for(int j = 0; j < len; j++) {
			if(chars[j].equals(" ")) {
				continue;
			} else {
				System.out.print(chars[j]);
			}
		}
		
		System.out.print("\n");
		
		// Print every other character in the array, starting with the first character.
		for(int k = 0; k < len; k++) {
			if(k%2 == 1) {
				continue;
			} else {
				System.out.print(chars[k]);
			}
		}
		
		System.out.print("\n");
		
		// Print every other character in the array, starting with the last character.
		for(int m = len - 1; m >= 0; m=m-2) {
			System.out.print(chars[m]);
		}
	}
}
