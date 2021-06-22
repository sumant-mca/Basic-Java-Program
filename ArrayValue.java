package Bhola;
import java.util.Scanner;

public class ArrayValue{
	
	
public static void main(String[] args){
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int num=s.nextInt();
	int ram[]=new int[num];
	
	for(int i=0;i<ram.length;i++)			//Read each value by input user
		ram[i]=s.nextInt();
	
		for(int i=0;i<ram.length;i++){	
		if(ram[i]%2==0)	
		{	
		sum=sum+ram[i];
		}
									}
		System.out.print(""sum);			
}
}