package Bhola;
import java.util.Scanner;
public class SumOddEven{
	public static void main(String[] args){
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Ebter size of array=");
		int n=sc.nextInt();
		int sumant[]=new int[n];
		for(int i=0;i<n;i++){
		 sumant[i]=sc.nextInt();
		}
//---------------------------Even Number------------------------------------
		for(int i=0;i<n;i++)
		{
			//System.out.print("Your array element are="+sumant[i]+" ");
			if(sumant[i]%2==0)
			{
				s=s+sumant[i];	
			}
		}
			System.out.println("sum of Even element="+s);
//-------------------------Odd Number-----------------------------------------			
			for(int i=0;i<n;i++)
		{
			//System.out.print("Your array element are="+sumant[i]+" ");
			if(sumant[i]%2!=0)
			{
				s=s+sumant[i];	
			}
		}
			System.out.println("sum of Odd element="+s);
	}
		}
//---------------------------------------------------------
		