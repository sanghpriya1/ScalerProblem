import java.util.PriorityQueue;

public class BhSmallestPrimeFraction {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5};
		int B = 3;
		PriorityQueue<DistanceAndCoordinate> pq = new  PriorityQueue<DistanceAndCoordinate>(B, new DistanceAndCoordinateComparator());
		for(int i =0;  i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				DistanceAndCoordinate node;
				int x = arr[i];
				int y = arr[j];
				
				double ch = (double)x/y;
				node = new DistanceAndCoordinate(ch, arr[i], arr[j]);
				pq.add(node);
			}
			
		}
		while(B-- > 1) {
			pq.poll();
		}
		DistanceAndCoordinate node;
		node = pq.poll();
		int[] ans = new int[2];
		ans[0] = node.getX();
		ans[1] = node.getY();
		
		System.out.println(ans[0] + " " + ans[1]);
	}
	

}
