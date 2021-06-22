package Bhola;
import java.util.Scanner;
public class Display{
	public static void main(String[] aregs){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int num=sc.nextInt();
		int ram[]=new int[num];
		for(int i=1;i<num;i++)	   //ram.length is also used in the placed "num"
		{			
			ram[i]=sc.nextInt();
		}
		
		for(int i=1;i<num;i++)
		{
		System.out.print(ram[i]+" ");
		}
	}
}
		
		
		
	