
// Display prime number

package Bhola;

import java.util.Scanner;
class PrimeDisplay{
	public static void main(String[] args){
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Start number :");
		int n=sc.nextInt();
		System.out.print("enter Last number :");
		int m=sc.nextInt();
	for(int i=n;i<=m;i++){
		c=0;														// must be intialize here
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				c++;
			}
		}
		if(c==2)
			System.out.print(" "+i);
	}
	
		
	}
}
