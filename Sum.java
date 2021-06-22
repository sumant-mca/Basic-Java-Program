package Bhola;
import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			s=s+arr[i];
		}
		System.out.print("sum="+s);
		
	}
}
		