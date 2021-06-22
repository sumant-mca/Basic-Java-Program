import java.util.Scanner;
public class Simple{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number");
		int n=sc.nextInt();
		if(n%3==0 && n%5==0)
		{
			System.out.print("Bhola and sumant");
			
		}
		else if(n%3==0)
		{
			System.out.print("Bhola");
			
		}
		else if(n%5==0)
		{
			System.out.print("Sumant");
			
		}
		else{
			System.out.print("Wrong input");
		}
	}
}
		
	/*	1
		3  2
		4  5  6 
		10 9  8  7
		11 12 13 14 15
		*/