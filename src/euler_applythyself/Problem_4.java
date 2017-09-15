package euler_applythyself;
/* Problem - https://projecteuler.net/problem=4
 * Find the largest palindrome which is the product of two 3-digit numbers.
 * Solution
 */
public class Problem_4 {
	
	public static boolean isPalindrome(int n){
		int num = n;
		int rev = 0;
		while(num > 0){
			rev = rev*10 + num%10;
			num /= 10;
		}
		return (rev==n);
	}
	
	public static void main(String[] args) {
		int max = 0;
		for(int i = 999; i > 800; i--){
			for(int j = 990; j >= 880; j -= 11){
				if(isPalindrome(i*j)) max = max > i*j ? max : i*j;
			}
		}
		System.out.println(max);
	}

}
