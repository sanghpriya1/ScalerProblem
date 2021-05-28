
public class DistanceAndCoordinate {
	private double distance;
	private int x;
	private int y;
	public DistanceAndCoordinate(double distance, int x, int y) {
		
		this.distance = distance;
		this.x = x;
		this.y = y;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "DistanceAndCoordinate [distance=" + distance + ", x=" + x + ", y=" + y + "]";
	}
	public DistanceAndCoordinate() {
		
	}
	
	
	
}
