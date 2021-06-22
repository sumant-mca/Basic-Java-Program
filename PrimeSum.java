package Bhola;
import java.util.Scanner;
public class PrimeSum{
	public static void main(String[] args){
		int c,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			c=0;
		for(int j=1;j<=i;j++){
			
			if(i%j==0){
				c++;
			}
		}
		if(c==2)
			
		//	System.out.println(i+" ");
		s+=i;
		
		}
		System.out.println("sum="+s);
		
	}
}
			
		
