package ders08.konu01;

import java.io.Serializable;

public class Demo02Obj implements Serializable {

	private Object name;
	private int population;
	private double growthRate;

	public Demo02Obj() {
		name = null;
		population = 0;
		growthRate = 0;
		System.out.println("constructor 1 calisti...");
	}

	public Demo02Obj(String initialName, int initialPopulation, double initialGrowthRate) {
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
