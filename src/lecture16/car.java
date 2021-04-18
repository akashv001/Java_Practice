package lecture16;

public class car implements Comparable<car> {

	int speed;
	int price;
	String color;

	public car(int price, int speed, String color) {
		this.speed = speed;
		this.color = color;
		this.price = price;
	}

	public String toString() {
		return " S: " + this.speed + " P: " + this.price + " C: " + this.color;
	}

	@Override
	public int compareTo(car other) {
		return this.speed - other.speed;
//		return other.price-this.price;
		
//		return this.color.compareTo(other.color);
	}

}
