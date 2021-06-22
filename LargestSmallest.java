package Bhola;
public class LargestSmallest{
	public static void main(String[] args){
		int large,small;
		int r[]={10,-1,5,4,8,9,7,4};
		large=r[0];
		small=r[0];
		System.out.print("Largest number=");
		for(int i=0;i<r.length;i++){
			
		if(large<r[i])
		{
			large=r[i];
		}
		}
		System.out.println(large);
		System.out.print("Smallest number=");
		for(int i=0;i<r.length;i++){
			
		if(small>r[i])
		{
			small=r[i];
		}
		}
		System.out.print(small);
	}
}
		