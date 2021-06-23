import java.util.Arrays;

public class UniqueElements {
	public static void main(String[] args) {
		int[] A = {2,4,3,4,5,3};
		Arrays.sort(A);
        int count = 0;
        for(int i = 1; i < A.length; i++){
            if(A[i] == A[i-1]){
                A[i] +=1;
                count +=1;
            }
            else if(A[i] < A[i-1]){
                int x = (A[i-1] +1) - A[i];
                A[i] += x;
                count += x;
            }
        }
        System.out.println(count);
	}

}
