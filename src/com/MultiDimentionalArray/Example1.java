package com.MultiDimentionalArray;

public class Example1 {

	public static void main(String[] args) {

		//multidimensional array

		//array object creation
		int matrix[][] = new int[2][2];

		//initialized values to an array object
		matrix[0][0] = 56;
		matrix[0][1] = 49;

		matrix[1][0] = 64;
		matrix[1][1] = 78;


		//iterate the array values
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.println(matrix[i][j]);
			}
		}

		System.out.println();

		//iterate the array values
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");
		}

	}

}
