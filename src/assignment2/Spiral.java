package assignment2;

public class Spiral {

	public static void main(String[] args) {
		int n=4;
		int index=1, loop=0;
		int[][] result= new int[n][n];
		
		if(n % 2 == 0)
			loop=n/2;
		else
			loop=(n/2)+1;
		
		for(int i=0; i<= loop; i++) {
			
			for(int j=i; j< n-1;j++) {
				result[i][j]= index++;
			}
			for(int j=i; j<n-i; j++) {
				if(result[j][n-i-1]==0) {
					result[j][n-i-1]= index++;
				}
			}
			for(int j=n-i-1; j>=0; j--) {
				if(result[n-i-1][j]==0) {
					result[n-i-1][j]= index++;
				}
			}
			for(int j=n-i-1; j>= 0; j--) {
				if(result[j][i]== 0) {
					result[j][i]= index++;
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
