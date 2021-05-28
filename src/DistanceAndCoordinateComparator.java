import java.util.Comparator;

public class DistanceAndCoordinateComparator implements Comparator< DistanceAndCoordinate> {
	@Override
	public int compare(DistanceAndCoordinate o1, DistanceAndCoordinate o2) {
	
		if (o1.getDistance() > o2.getDistance()) {
    		return 1;
    	}
    	if (o1.getDistance() < o2.getDistance()) {
    		return -1;
    	}
    	return 0;
	}
}
