package com.tundla.sahil.power;

import java.util.Scanner;

public class Power 
{
//	public static double power(double m, int n)
//	{
//		int i = 1;
//		double y = 1.0;
//		while(i<=n){                      
//			i = i+1;
//			y = y*m;                
//	}
//		return y;
//	}
//	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m :");
		int m = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int x =1;
		for(int i=1;i<=n;i++)
		{
			x=x*m;
		}
		System.out.println("Value of m^n is :");
		System.out.println(x);
		
		
		
//		Power p = new Power();
//		double y =p.power(2,3);
//		System.out.println(y);
//		int m,n;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the Integer for m^n");
//	System.out.println("Enter the value of m: ");
//	m = sc.nextInt();
//	System.out.println("Enter the value of n: ");
//	n = sc.nextInt();
//	
//	System.out.println(Math.pow(m, n));
	}
}
