package week1.day2assignments;

public class FibonacciSeries {

	public static void main(String[] args) {

int n = 8, t1 = 0, t2 = 1;
System.out.println("Fibonacci Series of " + n + " terms:");

for (int i = 0; i < n;i++) {
	System.out.println(t1);
	
int sum = t1 + t2;
t1 = t2;
t2 = sum;

}}
}


