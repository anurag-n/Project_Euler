package euler_applythyself;
import java.util.*;
public class Problem_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[23][26];
		int max = 1;
		for(int i = 0; i < 23; i++){
			for(int j = 0; j < 26; j++){
				grid[i][j] = 0;
			}
		}
		for(int i = 3; i < 23; i++){
			for(int j = 3; j < 23; j++){
				grid[i][j] = in.nextInt();
			}
		}
		for(int i = 3; i < 23; i++){
			for(int j = 3; j < 23; j++){
				int temp1 = grid[i][j] * grid[i-1][j] * grid[i-2][j] * grid[i-3][j];
				int temp2 = grid[i][j-1] * grid[i][j-2] * grid[i][j-3] * grid[i][j];
				int temp3 = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
				int temp4 = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
				int temp5 = grid[i][j] * grid[i-1][j-1] * grid[i-2][j-2] * grid[i][j-3];
				max = Math.max(max, Math.max(temp1, Math.max(temp2,Math.max(temp3, Math.max(temp4, temp5)))));
			}
		}
		System.out.println(max);
		in.close();
	}

}
