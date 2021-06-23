
public class OddFibonacci {
	
	public static void main(String[] args) {
		
		int A = 30; int B = 36;
		int count = Math.floorDiv(B, 3) -Math.floorDiv(A-1, 3);
		int total_number = B-A +1;
		total_number -= count;
		System.out.println(total_number);
		
	}

}
