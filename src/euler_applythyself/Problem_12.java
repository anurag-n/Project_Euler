package euler_applythyself;

public class Problem_12 {
	
	public static int countFactors(int num){
		int res = 1;
		for(int i = 2; i*i <= num; i++){
			if(num % i == 0 && i*i < num) res+=2;
			else if(num % i == 0 && i*i == num) res++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int factor_count = 6;
		while(factor_count <= 500){
			n++;
			int num = n*(n+1)/2;
			factor_count = countFactors(num);
		}
		System.out.println(n*(n+1)/2);
	}

}
