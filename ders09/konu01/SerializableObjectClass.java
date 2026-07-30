package ders09.konu01;

import java.io.Serializable;

public class SerializableObjectClass implements Serializable {

	private String name;
	private int population;
	private double growthRate;

	public SerializableObjectClass() {
		name = null;
		population = 0;
		growthRate = 0.0;
		System.out.println("constructor 1 calisti...");
	}

	public SerializableObjectClass(String initialName, int initialPopulation, double initialGrowthRate) {
		name = initialName;
		if (initialPopulation >= 0)
			population = initialPopulation;
		else {
			System.out.println("ERROR: Negative population.");
			System.exit(0);
		}
		growthRate = initialGrowthRate;

		System.out.println("constructor 2 calisti...");
	}

	public String toString() {
		return ("Name = " + name + "\n" + "Population = " + population + "\n" + "Growth rate = " + growthRate + "%");
	}
}
