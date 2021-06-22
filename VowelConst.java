package Bhola;
import java.util.Scanner;
public class VowelConst{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Character : ");
		char c=sc.next().charAt(0);
		if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O'|| c=='u' || c=='U')
		{
			System.out.print("It is Vowel");
		}
		else
		{
			System.out.print("Consonant");
		}
	}
}