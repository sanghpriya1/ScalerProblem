
import java.util.PriorityQueue;

public class Athlargestelement {
	public static void main(String[] args) {
		int[] A = {25, 16, 11, 31, 28, 20, 3, 8};
		int[] C = new int[A.length];
		int B = 6;
		int j = 0;
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(B - 1, new MinHeap());
		for (int i = 0; i < A.length; i++) {
			pq.add(A[i]);
			if(pq.size()>B) {
				A[j] = pq.poll();
				j++;
			}

		}
		while(pq.isEmpty())A[j++] = pq.poll();
	
	}

}
