package euler_applythyself;
/* Problem - https://projecteuler.net/problem=7
 * Find the 10001st Prime number
 * Solution
 * We first need a method that checks if a number is prime or not
 * Then we can iterate over natural numbers until we get to the 10001st Prime
 * Checking if given number is prime or not
 */
public class Problem_7 {
	
	public static boolean isPrime(long num){
		if(num % 2 == 0 || num % 3 == 0) return false;
		for(int i = 5; i*i <= num; i += 6){
			if(num%i == 0 || num%(i+2) ==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 6;
		long num = 14;
		while(count < 10001){
			if(isPrime(num)) count++;
			num++;
		}
		System.out.println(num-1);
	}

}
