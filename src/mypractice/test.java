package mypractice;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		int[] arr = { 3,0,0,1,2,4 };
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans = greatestElement(arr);
		System.out.println(ans);
	}

	public static ArrayList<Integer> greatestElement(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <= arr.length; j++) {
				if (i == arr.length - 1) {
					ans.add(-1);
				} else if (arr[j] > arr[i]) {
					ans.add(arr[j]);
					break;
				} else if (arr[j] < arr[i]) {
					continue;
				}
			}
		}
		return ans;
	}
}
