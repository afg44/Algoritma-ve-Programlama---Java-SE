package ders05.konu01;

public class Fruit implements Comparable {

	private String fruitName;

	public Fruit() {
		fruitName = "";
	}

	public Fruit(String name) {
		fruitName = name;
	}

	public void setName(String name) {
		fruitName = name;
	}

	public String getName() {
		return fruitName;
	}

	@Override
	public int compareTo(Object o) {

		if ((o != null) && (o instanceof Fruit)) {
			Fruit otherFruit = (Fruit) o;
			return (this.fruitName.compareTo(otherFruit.fruitName));
		}
		return -1; // Default if other object is not a Fruit
	}

}
