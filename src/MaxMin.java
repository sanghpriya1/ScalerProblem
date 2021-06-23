import java.util.PriorityQueue;

public class MaxMin {
	private static void printSubArrays(int arr[], int n) 
	{ 
		  
		 for (int i=0; i <n; i++) //select the starting element 
		 { 
		  
		 for (int j=i; j<n; j++)   //select the ending element 
		 { 
		 for (int k=i; k<=j; k++) 
		  
		{ 
			 System.out.print(arr[k]);
			 System.out.print(" ");
		 
		} 
		  
		 } 
		} 
		 }
	 
//private static int printSubArrays(int [] arrA){
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(arrA.length, new MaxHeap());
//		PriorityQueue<Integer> qp = new PriorityQueue<Integer>(arrA.length, new MinHeap());
//        int arrSize = arrA.length;
//        int sum = 0;
//        for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
//            //group sizes
//            for (int grps = startPoint; grps <=arrSize ; grps++) {
//                //if start point = 1 then
//                //grp size = 1 , print 1
//                //grp size = 2, print 1 2
//                //grp size = 3, print 1 2 3 ans so on
//                for (int j = startPoint ; j < grps ; j++) {
//                    pq.add(arrA[j]);
//                    qp.add(arrA[j]);
//                }
//                
//            }
//            sum = pq.peek() - qp.peek();
//            pq.clear();
//            qp.clear();
//        }
//        return sum;
//    }
   public static void main(String[] args) {
	int[] arr = {4, 7, 3, 8};
	printSubArrays(arr, arr.length);
	System.out.println(1);
} 
   
}