import java.util.PriorityQueue;



public class Minimumlargestelement {
	public static void main(String[] args) {
		int[] arr = {4, 8};
		int B = 0;
		int [] ans = new int[arr.length];
		for(int i = 0; i < arr.length; i++)ans[i] = arr[i];
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(arr.length, new PairCOmparator());
		for(int i = 0; i < arr.length; i++)pq.add(new Pair(2*arr[i],i));
		while(B-- > 0) {
			Pair pair = pq.peek();
			ans[pair.getIndex()] = pair.getValue();
			pq.poll();
			pq.add(new Pair(arr[pair.getIndex()] + pair.getValue(), pair.getIndex()));
		}
		int max_element = ans[0];
		for(int i = 0; i < ans.length; i++) {
			max_element = Math.max(max_element, ans[i]);
		}
		System.out.println(max_element);
	}

}
