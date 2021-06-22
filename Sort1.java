package Bhola;

public class Sort1{
	public static void main(String[] args){
		int temp,i,j;
	int ram[]={10,25,12,-2,0,96};
	for(i=0;i<ram.length;i++){
		for(j=i+1;j<ram.length;j++){
			if(ram[i]<ram[j])
			{
				temp=ram[i];
				ram[i]=ram[j];
				ram[j]=temp;
			}
		}
			
		System.out.print(ram[i]+" ");		
	}
	
	}
}	