package Arrays;

import java.util.Scanner;

public class BigSum {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int noOfTestElems = in.nextInt();
		int[] array = new int[noOfTestElems];
		for(int i=0;i<noOfTestElems;i++)
		{
			array[i]=in.nextInt();
		}
		long sum=0;

		for(int i=0;i<noOfTestElems;i++)
		{
			sum +=array[i];
		}
		System.out.println(sum);
		
	}
}
