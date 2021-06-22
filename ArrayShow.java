package Bhola;
import java.util.Scanner;
public class ArrayShow{
	public static void main(String[] args){
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		// Read each element by user
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//  show Elemnts of array
		System.out.print("All elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
		
		//sorting
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])				//	this condition for Swapping element
				{
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.print("All Sorted elements are : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
		
	}
}
		
		
