package Bhola;
import java.util.Scanner;
public class Circle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius : ");
		double r=sc.nextDouble();
	//	double Area=3.147*r*r;			
	//	double Area=(r*r)*Math.PI;			//Math.PI; is 2nd Method
		double Area=(22*r*r)/7;				// is 3rd Method------------------Very easy method
		System.out.print("Area of Circle : "+Area);
	}
}