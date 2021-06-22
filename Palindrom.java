package Bhola;

import java.util.Scanner;
public class Palindrom{
	
	
public static void main(String[] args){
	int s=0,r,temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number : ");
	int n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10;
		s=s*10+r;
		n=n/10;	
	}
	if(temp==s)
	{
		System.out.println("Palindrom");
	}
	else
	{
		System.out.println(" Not Palindrom");
	}
	
	
}
}