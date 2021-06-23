import java.util.Comparator;

public class PairCOmparator implements Comparator<Pair> {
	public int compare(Pair o1, Pair o2) {
		
		if (o1.getValue() > o2.getValue()) {
    		return 1;
    	}
    	if (o1.getValue() < o2.getValue()) {
    		return -1;
    	}
    	return 0;
	}

}
