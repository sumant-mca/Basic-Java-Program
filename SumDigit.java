package Bhola;
import java.util.Scanner;
public class SumDigit{
	public static void main(String[] args){
		int r,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter any umber");
		int num=sc.nextInt();
		while(num>0)
		{
			r=num%10;
			s=s+r;
			num=num/10;
			
		}
		System.out.print(s);
		
	}
}
