import java.util.PriorityQueue;

public class BclosestPointsToOrigin {
	public static void main(String[] args) {
		int[][] A = new int[][] {{1, -1},
	       {2, -1}};
	       int B = 1;
	    PriorityQueue<DistanceAndCoordinate> pq = new PriorityQueue<DistanceAndCoordinate>(A.length, new DistanceAndCoordinateComparator());
	    for(int i = 0; i < A.length; i++) {
	    	double x = Math.sqrt(A[i][0]*A[i][0] + A[i][1]*A[i][1] );
	    	DistanceAndCoordinate node = new DistanceAndCoordinate(x, A[i][0], A[i][1]);
	    	pq.add(node);
	    }
	    int[][] ans = new int[B][2];
	    		int i = 0;
	    while(B-- > 0) {
	    	DistanceAndCoordinate node = pq.poll();
	    	ans[i][0] = node.getX();
	    	ans[i][1] = node.getY();
	    	i++;
	    }
	    for( i = 0; i < ans.length; i++ ) {
	    	System.out.println(ans[i][0] + " " + ans[i][1]);
	    }
	}

}
