package Bhola;
import java.util.Scanner;
public class Traingle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base : ");
		double b=sc.nextDouble();
		System.out.print("Enter Height : ");
		double h=sc.nextDouble();
		
		double Area=(b*h)/2;
		System.out.print("Area of Trainle  : "+Area);
	}
}