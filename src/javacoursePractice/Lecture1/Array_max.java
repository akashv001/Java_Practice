package javacoursePractice.Lecture1;

import java.util.Scanner;

public class Array_max {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 10, 1, 54, 23, 45 };
//		int ans=max(arr);
//		System.out.println(ans);
		int ans = min(arr);
		System.out.println(ans);
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}