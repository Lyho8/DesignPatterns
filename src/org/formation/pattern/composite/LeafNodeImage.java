package org.formation.pattern.composite;

public class LeafNodeImage implements CompositeNode{

	@Override
	public void draw() {
		System.out.println("Draw image.");
	}

}
