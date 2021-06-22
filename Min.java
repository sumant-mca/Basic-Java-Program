package Bhola;
import java.util.Scanner;
public class Min{
public static void main(String[] args){
	//int min=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array : ");
	int n=sc.nextInt();
	int ram[]=new int[n];
	for(int i=0;i<ram.length;i++)
	{
		ram[i]=sc.nextInt();
	}
	int min=ram[0];
	for(int i=0;i<ram.length;i++)
	{		
		if(min>ram[i])
		{
			min=ram[i];	
		}
	}
	System.out.print("Smallest element are :"+ min);
	
}
}
