package week1.day2;

public class LearnPalindrome {

	public static void main(String[] args) {
		
		
		int number=313 ;
		int number2= number;
		int rem;
		int reverseNum=0;
	while(number>0)	
	{
		rem=number%10;   
		reverseNum=(reverseNum*10)+rem;
		number=number/10;  
		
	}
	
	if(number2==reverseNum)
	{
		System.out.println("the number is Palindrome");
	}
	else
	{
		System.out.println("the number is not Palindrome");
	}
	}
	
}
