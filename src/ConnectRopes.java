import java.util.PriorityQueue;

public class ConnectRopes {
	public static void main(String[] args) {
		int[] arr = {5, 17, 100, 11};
		int sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(3, new MinHeap() );
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		while(!pq.isEmpty()) {
			int sums = pq.poll();
			sums += pq.poll();
			sum += sums;
			pq.add(sums);
			if(pq.size() == 1) break;
		}
		System.out.println(sum);
	}

}
