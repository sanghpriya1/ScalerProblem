
public class AbsoluteMax {
	public static void main(String[] args) {
		int[] A = {1, 2};
		int[] B = {3, 6};
		int[] C = {10,11};
		int[] D = {1,6}; 	
		int n = A.length;
		int res = 0;
		
		for(int i = 0; i < 16; i++) {
			int mini = Integer.MAX_VALUE;
			int maxi = Integer.MIN_VALUE;
			for(int j = 0; j < n; j++) {
				int curr = A[j];
				for(int k = 0; k< 4; k++) {
					int temp = 0;
					if(k == 0)temp = B[j];
					else if(k == 1) temp = C[j];
					else if(k == 2) temp = D[j];
					else temp = j;
					if((i & (1 << k)) > 0)curr += temp;
					else curr -= temp;
				}
				maxi = Math.max(maxi, curr);
				mini = Math.min(mini, curr);
			}
			res = Math.max(res,  maxi-mini);
		}
			
		System.out.println(res);
	}

}
