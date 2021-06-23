import java.util.HashMap;

public class TwoPointer {
	private static int solve(int[] A) {
		int i = 0;
		int j = 0;
		int length = A.length;
		HashMap<Integer, Integer> hmp = new HashMap<>();
		int ans = 0;
		while (j < length) {
			if (!hmp.containsKey(A[j])) {
				hmp.put(A[j], 1);

			} else {
				
				while(i < j) {
					
					if(A[i] == A[j]) {
						
						i++;
						break;
					}
					else hmp.remove(A[i]);
					i++;
				}
			}
			ans += j - i + 1;
			j++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 93, 9, 12, 32, 97, 75, 32, 77, 40, 79, 61, 42, 57, 19, 64, 16, 86, 47, 41, 67, 76, 63, 24, 10, 25,
				96, 1, 30, 73, 91, 70, 65, 53, 75, 5, 19, 65, 6, 96, 33, 73, 55, 4, 90, 72, 83, 54, 78, 67, 56, 8, 70,
				43, 63 };
		System.out.println(solve(arr));
	}

}
