package euler_applythyself;

public class Problem_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerloop:
		for(int i = 1; i < 1000; i++){
			for(int j = 1; j<1000; j++){
				int c = (int) Math.sqrt((double)i*i + j*j);
				if(c == (int) Math.ceil(Math.sqrt((double)i*i + j*j))){
					if(i+j+c == 1000) {
						System.out.println(i+" "+j);
						break outerloop;
					}
				}
			}
		}
	}

}
