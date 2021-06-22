package Bhola;
import java.util.Scanner;
public class HCF{
	public static void main(String[] args){
		int r=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int n1=sc.nextInt();
		System.out.print("Enter Sencond Number : ");
		int n2=sc.nextInt();
		for(i=1;i<=n1 || i<=n2; i++){
			if(n1%i==0 && n2%i==0)
			
				r=i;
		}
			
				System.out.print("HCF of 2 numbers are : "+r);
	}
}
