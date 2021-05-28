import java.util.PriorityQueue;
import java.util.Stack;

public class ProductOfThree {
	public static void main(String[] args) {
		int[] arr = {10, 2, 13, 4};
		int[] ans = new int[arr.length];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(arr.length, new MaxHeap()); 
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if(pq.size() < 3) {
				ans[i] = -1;
			}
			else {
				Stack<Integer> S = new Stack<>();
				int t = 3;
				int product = 1;
				while(t-- > 0) {
					int x = pq.poll();
					product *= x;

					S.push(x);
					
					
				}
				ans[i] = product;
				while(!S.isEmpty()) {
					pq.add(S.pop());
				}
			}
		}
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
