package org.formation.pattern.visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public double visit(Book b) {
		return b.getPrice();
	}

	@Override
	public double visit(Fruit f) {
		double cost = f.getPricePerKg()*f.getWeight();
		return cost;
	}

}
