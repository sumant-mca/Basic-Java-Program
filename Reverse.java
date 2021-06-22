package Bhola;
import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int ram[]=new int[num];
		
		
		  for(i=0;i<num;i++)
		{	
		ram[i]=sc.nextInt();
		
		}
		
		System.out.println("Reverse array element are ");
		
		 for(i=num-1;i>=0;i--)
		{
		System.out.print(ram[i]);
		}
		
		

	}
}

	