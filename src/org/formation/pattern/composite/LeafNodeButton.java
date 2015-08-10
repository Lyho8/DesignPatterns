package org.formation.pattern.composite;

public class LeafNodeButton implements CompositeNode{

	@Override
	public void draw() {
		System.out.println("Draw button.");
	}
}
