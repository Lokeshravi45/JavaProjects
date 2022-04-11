package com.PracticeProject;

public class Longestincresingsubs {
		 public static int LIS(int[] arr, int i, int n, int pre)
		 {
		 if (i == n) {
		 return 0;
		 }
		 int excl = LIS(arr, i + 1, n, pre);
		 int incl = 0;
		 if (arr[i] > pre) {
		 incl = 1 + LIS(arr, i + 1, n, arr[i]);
		 }
		 return Integer.max(incl, excl);
		 }
		 public static void main(String[] args)
		 {
		 int[] arr = { 1, 5, 20, 11, 16, 60, 25, 115, 9, 15,661,79 };
		 System.out.print("The length of the LIS is "
		 + LIS(arr, 0, arr.length, Integer.MIN_VALUE));
		 } 
}
