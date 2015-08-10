package org.formation.pattern.visitor;

public interface Visitor {
	public double visit(Book b);
	public double visit(Fruit f);
}
