package Bhola;
class Repeating{
static boolean isPrime(int n){
int c=0;
for(int i=2;i<n;i++)
{
	if(n%i==0)
	{
		c++;
		break;
	}
	if(c==0)
		return true;
	else
		return false;
}
public static void main(String[] args)
{
	int[] a={3,4,6,7,2,5,3,5,7};
	int s=0;
	int hash[100]={0};
	for(int i=0;i<a.length;i++)
	{
		hash[a[i]]++;
	}
	int s=0;
	
		if(isPrime(al))
			for(int i=1;i<100;i++)
			{
				if(isprime(i)&&hash[i]>1)
					s=s+i;
			}
			System.out.print(s);
}