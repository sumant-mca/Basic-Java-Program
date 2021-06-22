package Bhola;

import java.util.Scanner;
class Factorial{
	int fact=1;
public static void main(String[] args){
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number : ");
	int n=sc.nextInt();
	if(0==n)
	{
		System.out.print("1");
	}
	else if(n>0)
	{
		for(int i=1;i<=n;i++)
			{
				fact=fact * i;
			}
			System.out.println(fact);
	}
		else{
			
			System.out.println("1");
			
		}
		
	
}
}
	