package Bhola;
import java.util.Scanner;
public class Sort{
	public static void main(String[] args){
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n=sc.nextInt();
		int ram[]=new int[n];
		for(int i=0;i<ram.length;i++)
		{
			ram[i]=sc.nextInt();
		}
		System.out.println("Sorted Elements are :");
		for(int i=0;i<ram.length;i++)
		{
			for(int j=1+i;j<ram.length;j++)
			{	
				
				if(ram[i]>ram[j])
				{
			temp=ram[i];
			ram[i]=ram[j];
			ram[j]=temp;
				}
			}
		System.out.println(ram[i]);

		}
		
	}
}
		
			