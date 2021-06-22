package Bhola;
import java.util.Scanner;
public class AsciiCheck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any character : ");
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90)
		{
			System.out.print("Upper Case Character");
		}
		else if(c>=97 && c<=122)
		{
			System.out.print("Lower Case Character");
		}
		else
		{
			System.out.print("Wrong Input");
		}
	}
}