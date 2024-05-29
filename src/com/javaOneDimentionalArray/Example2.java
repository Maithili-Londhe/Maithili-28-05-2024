package com.javaOneDimentionalArray;
import java.util.*;
public class Example2 {
   //taking input from user
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the matrix values:");
		int matrix[]=new int[4];
		 for(int i=0;i<matrix.length;i++) {
			 matrix[i]=sc.nextInt();	
		 }
		 for(int i=0;i<matrix.length;i++) {
			 System.out.println(matrix[i]+"\t");
		 }

	}

}
