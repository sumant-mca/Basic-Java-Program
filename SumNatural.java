package Bhola;
import java.util.Scanner;
public class SumNatural{
	public static void main(String[] args){
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.print("Sum of Natural number ="+s);
	}
}