package Arrays;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int sum=0;
		int revsum=0;
		int nMatrix = in.nextInt();
		int[][] array = new int[nMatrix][nMatrix];
		for(int i=0;i<nMatrix;i++)
			for(int j=0;j<nMatrix;j++)
			{	array[i][j]=in.nextInt();}

		for(int i=0;i<nMatrix;i++)
		{
			sum +=array[i][i];
			revsum +=array[i][nMatrix-i-1];
		}
		System.out.println(Math.abs(sum-revsum));
	}
}
