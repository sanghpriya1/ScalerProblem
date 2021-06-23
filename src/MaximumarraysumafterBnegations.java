import java.util.PriorityQueue;

public class MaximumarraysumafterBnegations {
	public static void main(String[] args) {
		int[] arr = {24, -68, -29, -9, 84};
		int B = 4;
		int sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(3, new MinHeap());
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			sum += arr[i];
		}
		while(B-- > 0) {
			int x = pq.poll();
			x *= -1;
			pq.add(x);
			sum += 2*x;
		}
		System.out.println(sum);
	}
}
