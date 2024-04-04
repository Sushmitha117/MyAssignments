package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=37;
		int count=0;
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
			if(count==0)
			{
				System.out.println("the number is Prime number");
			}
			else
			{
				System.out.println("the number is not a Prime number");
			}
			}
				
		}
	

