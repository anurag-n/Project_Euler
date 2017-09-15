package euler_applythyself;

public class Problem_10 {
	public static boolean isPrime(long num){
		if(num % 2 == 0 || num % 3 == 0) return false;
		for(int i = 5; i*i <= num; i += 6){
			if(num%i == 0 || num%(i+2) ==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 10;
		long sum = 17;
		while(num <2000000){
			if(isPrime(num)) sum +=num;
			num++;
		}
		System.out.println(sum);

	}

}
