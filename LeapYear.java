package Bhola;
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Year : ");
		int n=sc.nextInt();
		if(n%4==0)
		{
				if(n%100==0)
			{
				if(n%400==0)
				{
					System.out.print("Leap year");
				}
				else
				{
					System.out.print(" Not Leap year");
				}
			}
				else
				{
					System.out.print(" Leap year");
				}
		}
			else
			{
				System.out.print(" Not Leap year");
			}
		
		
	}
}