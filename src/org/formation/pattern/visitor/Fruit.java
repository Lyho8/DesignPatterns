package org.formation.pattern.visitor;

public class Fruit implements ItemElement {
	
	private double pricePerKg;
	private double weight;
	private String name;
	
	public Fruit(double pricePerKg, double weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}

}
