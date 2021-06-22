package Bhola;
import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number");
		int n=sc.nextInt();
		//for(int i=1;i<=n;i++)
			if(n%2==0)
			{
				System.out.println("Even number");
				
			}
			else
			{
				System.out.println("odd number");

			}
	}
}
