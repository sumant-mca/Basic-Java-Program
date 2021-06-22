package Bhola;
import java.util.Scanner;
public class ArrayEvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n=sc.nextInt();
		int ram[]=new int[n];
		for(int i=0;i<ram.length;i++)
			ram[i]=sc.nextInt();
		for(int i=0;i<ram.length;i++){
			if(ram[i]%2==0){
				System.out.print("Even number :"+ram[i] + "\n");
			}
			else{
				System.out.print("Odd number :"+ram[i] + "\n");
			}
		}
	}
}