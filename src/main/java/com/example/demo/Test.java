package com.example.demo;

public class Test {
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,2,4,5,6,6,7,8,2,2,3};
		String res = String.valueOf(arr[0]);
		for (int i=0;i<arr.length-1;) {
			int index = 0;
			for (int j=i+1;j<arr.length;j++) {
				index++;
				if (arr[i] != arr[j]) {
					res = res + "," + arr[j];
					i = i + index;
					break;
				}
			}
		}
		System.out.println(res);
		
	}

}
