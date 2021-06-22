package Bhola;
import java.util.Scanner;
public class Max{
	public static void main(String[] args){
		// int max=0;									this line is not when we take negative all number
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n=sc.nextInt();
		int ram[]=new int[n];
		for(int i=0;i<ram.length;i++)
		{
			ram[i]=sc.nextInt();
		}
		int max=ram[0];
		for(int i=0;i<ram.length;i++)
		{
			if(ram[i]>max)
			{
				max=ram[i];
								
			}
	}
			System.out.print("Greatest Element are : "+max);
		
		
	}
}
		
		
		
