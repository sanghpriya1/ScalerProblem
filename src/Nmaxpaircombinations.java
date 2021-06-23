import java.util.PriorityQueue;

public class Nmaxpaircombinations {
	public static void main(String[] args) {
		int[] A = {3, 1, 3, 1};
		int[] B = {1, 4, 1, 4};
			PriorityQueue<Integer> Ans = new PriorityQueue<Integer>(A.length, new MinHeap());
		for(int  i = 0; i < A.length; i++) {
			for(int  j = 0; j < A.length; j++) {
				Ans.add(A[i] + B[j]);
				if(Ans.size() > A.length) Ans.poll();
			}
			
		}
		for(int  i = A.length-1; i >=0; i--) {
			A[i] = Ans.poll();
		}
			for(int  i = 0; i < A.length; i++) {
				System.out.print(A[i]);
				if(i != A.length) System.out.print(" ");
			}
	}

}
