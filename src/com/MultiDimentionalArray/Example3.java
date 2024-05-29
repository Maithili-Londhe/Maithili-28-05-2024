package com.MultiDimentionalArray;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter rows: ");
	 int rows=sc.nextInt();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter columns: ");
     	int column=sc1.nextInt();
		//array object creation
		int matrix[][] = new int[rows][column];//creating matrix to store rows n column
		System.out.println("Enter a matrix values: ");
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < column; j++)
			{
				matrix[i][j]=sc.nextInt();//read the matrix values
			}
		}
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < column; j++)
			{
				
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");
		}

	}
		
	}




