package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How big will the array be?");
		int n = in.nextInt();
		boolean[] array = new boolean[n];
		int primeNumber;
		int i;
		//putting stuff in the array :)
		for (i = 0; i < n; i++)
		{
			array[i] = true;
		}
		//this loop is for "eliminating" multiples of numbers
		int spot;
		for (spot = 2; spot < Math.sqrt(n); spot++)
		{	
			if (array[spot] == true)
				{
				for (primeNumber = (spot * spot);primeNumber < n; primeNumber = primeNumber + spot)
					{
					array[primeNumber] = false;
					}
				}	
		}
		for (i=0; i<n; i++)
		{
			if (array[i] == true)
			{	
			System.out.println(i);		
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		